package EjerciciosP2.EjercicioChain;

public class Coronel implements IHandler {
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
        String s1 = "DESBLOQUEOS";
        String s2 = "MANIFESTACIONES";
        if (order.getCommandOrderOrder().toUpperCase().equals(s1)) {
            System.out.println("INFO >> Orden de " + s1 + " a cargo del Coronel.");
        } else if (order.getCommandOrderOrder().toUpperCase().equals(s2)) {
            System.out.println("INFO >> Orden de " + s2 + " a cargo del Coronel.");
        } else {
            this.next.atenderOrden(order);
        }
    }
}
