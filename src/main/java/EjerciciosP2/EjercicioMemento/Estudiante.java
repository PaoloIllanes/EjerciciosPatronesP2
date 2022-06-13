package EjerciciosP2.EjercicioMemento;

public class Estudiante {
    private String stdntId;
    private String stdntName;

    public Estudiante(String stdntId, String stdntName) {
        this.stdntId = stdntId;
        this.stdntName = stdntName;
    }

    public void showInfo(){
        System.out.println("******************************");
        System.out.println("**  I.D.      : " + stdntId);
        System.out.println("**  ESTUDIANTE: " + stdntName);
        System.out.println("******************************\n");
    }

    public String getStdntId() {
        return stdntId;
    }

    public void setStdntId(String stdntId) {
        this.stdntId = stdntId;
    }

    public String getStdntName() {
        return stdntName;
    }

    public void setStdntName(String stdntName) {
        this.stdntName = stdntName;
    }
}
