package EjerciciosP2.EjercicioChain;

public class OrdenDeMando {
    private String cd_id;
    private String cd_order;

    public OrdenDeMando(String cd_id, String cd_order) {
        this.cd_id = cd_id;
        this.cd_order = cd_order;
    }

    public String getCommandOrderID() {
        return cd_id;
    }

    public void setCommandOrderID(String cd_id) {
        this.cd_id = cd_id;
    }

    public String getCommandOrderOrder() {
        return cd_order;
    }

    public void setCommandOrderOrder(String cd_order) {
        this.cd_order = cd_order;
    }
}
