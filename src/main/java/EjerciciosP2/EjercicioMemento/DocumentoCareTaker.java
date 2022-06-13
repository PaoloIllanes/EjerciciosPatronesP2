package EjerciciosP2.EjercicioMemento;

import java.util.HashMap;
import java.util.Map;

public class DocumentoCareTaker {
    private Map<Integer,Memento> stateSaved= new HashMap<>();

    public void createVersion(Integer version, Memento memento){
        stateSaved.put(version,memento);
    }

    public Memento getMemento(Integer version){
        return stateSaved.get(version);
    }
}
