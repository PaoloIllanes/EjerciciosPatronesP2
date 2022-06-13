package EjerciciosP2.EjercicioMemento;

public class Memento {
    private ConcreteTesis state;

    public Memento(ConcreteTesis stateSaved){
        this.state=stateSaved;
    }

    public ConcreteTesis getState() {
        return state;
    }
}
