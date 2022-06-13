package EjerciciosP2.EjercicioChain;

public class Teniente implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void atenderOrden(OrdenDeMando order) {
        String s = "DISCIPLINA";
        if (order.getCommandOrderOrder().toUpperCase().equals(s)) {
            System.out.println("INFO >> Orden de " + s + " a cargo del Teniente.");
        } else {
            this.next.atenderOrden(order);
        }
    }
}
