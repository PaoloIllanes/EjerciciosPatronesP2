package EjerciciosP2.EjercicioChain;

public class CuerpoDelEjercito implements IHandler {
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
        General general = new General();
        this.setNext(general);

        Teniente lieutenant = new Teniente();
        general.setNext(lieutenant);

        Coronel coronel = new Coronel();
        lieutenant.setNext(coronel);

        Cabo corporal = new Cabo();
        coronel.setNext(corporal);

        this.next.atenderOrden(order);
    }
}

