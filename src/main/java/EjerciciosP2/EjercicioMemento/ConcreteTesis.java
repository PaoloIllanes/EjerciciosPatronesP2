package EjerciciosP2.EjercicioMemento;

public class ConcreteTesis {
    private String tesisTitle;
    private String tesisBody;
    private Integer tesisVersion;

    public ConcreteTesis() {
    }

    public ConcreteTesis(String tesisTitle, String tesisBody, Integer tesisVersion) {
        this.tesisTitle = tesisTitle;
        this.tesisBody = tesisBody;
        this.tesisVersion = tesisVersion;
    }

    public void showInfo() {
        System.out.println("TITULO : " + tesisTitle);
        System.out.println("VERSION: " + tesisVersion);
        System.out.println("\n" + tesisBody);
    }

    public void showVersion() {
        System.out.println("VERSION: " + tesisVersion + "\n");
    }

    public String getTesisTitle() {
        return tesisTitle;
    }

    public void setTesisTitle(String tesisTitle) {
        this.tesisTitle = tesisTitle;
    }

    public String getTesisBody() {
        return tesisBody;
    }

    public void setTesisBody(String tesisBody) {
        this.tesisBody = tesisBody;
    }

    public Integer getTesisVersion() {
        return tesisVersion;
    }

    public void setTesisVersion(Integer tesisVersion) {
        this.tesisVersion = tesisVersion;
    }
}
