package EjerciciosP2.EjercicioStrategy;

public class Celular {
    private Integer phoneId;
    private String phoneCode;
    private String phoneTrademark;
    private String phoneModel;
    private String phoneRange;
    private Integer phonePrice;

    public Celular() {
    }

    public Celular(Integer phoneId, String phoneCode, String phoneTrademark, String phoneModel, String phoneRange, Integer phonePrice) {
        this.phoneId = phoneId;
        this.phoneCode = phoneCode;
        this.phoneTrademark = phoneTrademark;
        this.phoneModel = phoneModel;
        this.phoneRange = phoneRange;
        this.phonePrice = phonePrice;
    }

    public void showInfo() {
        System.out.println("ID    : " + phoneId);
        System.out.println("Código: " + phoneCode);
        System.out.println("Marca : " + phoneTrademark);
        System.out.println("Modelo: " + phoneModel);
        System.out.println("Gama  : " + phoneRange);
        System.out.println("Precio: " + phonePrice + " $us");
    }

    public Integer getPhoneID() {
        return phoneId;
    }

    public void setPhoneID(Integer phone_id) {
        this.phoneId = phone_id;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phone_code) {
        this.phoneCode = phone_code;
    }

    public String getPhoneTrademark() {
        return phoneTrademark;
    }

    public void setPhoneTrademark(String phone_trademark) {
        this.phoneTrademark = phone_trademark;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phone_model) {
        this.phoneModel = phone_model;
    }

    public Integer getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(Integer phone_price) {
        this.phonePrice = phone_price;
    }

    public String getPhoneRange() {
        return phoneRange;
    }

    public void setPhoneRange(String phone_range) {
        this.phoneRange = phone_range;
    }
}
