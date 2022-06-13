package EjerciciosP2.EjercicioMemento;

public class ReversionOriginator {
    private ConcreteTesis state;
    public ReversionOriginator(){}

    public void setState(ConcreteTesis state) {
        System.out.println("**** Set State *****\n");
        state.showInfo();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("\n**** Create State *****\n");
        state.showVersion();
        System.out.println();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****\n");
        this.state.showInfo();
        System.out.println();
    }
}
