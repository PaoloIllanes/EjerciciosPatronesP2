package EjerciciosP2.EjercicioChain;

public class Cabo implements IHandler {
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
        String s = "LIMPIEZAS";
        if (order.getCommandOrderOrder().toUpperCase().equals(s)) {
            System.out.println("INFO >> Orden de " + s + " a cargo del Cabo.");
        } else {
            System.out.println("     >> HUBO UN ERROR AL PROCESAR LA ORDEN");
        }
    }
}

