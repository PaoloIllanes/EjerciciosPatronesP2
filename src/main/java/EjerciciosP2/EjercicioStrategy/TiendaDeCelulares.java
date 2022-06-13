package EjerciciosP2.EjercicioStrategy;

public class TiendaDeCelulares {
    private IEstrategiaDeBusqueda searchStrategy;
    private ListaCelulares cellPhoneList;
    private String storeName;
    private int deviceQuantity;

    public TiendaDeCelulares() {
    }

    public void buscarConEstrategia() {
        searchStrategy.buscar(this.cellPhoneList, deviceQuantity);
    }

    public IEstrategiaDeBusqueda getSearchStrategy() {
        return searchStrategy;
    }

    public void setSearchStrategy(IEstrategiaDeBusqueda search_strategy) {
        this.searchStrategy = search_strategy;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String store_name) {
        this.storeName = store_name;
    }

    public int getDeviceQuantity() {
        return deviceQuantity;
    }

    public void setDeviceQuantity(int device_quantity) {
        this.deviceQuantity = device_quantity;
    }

    public ListaCelulares getCellPhoneList() {
        return cellPhoneList;
    }

    public void setCellPhoneList(ListaCelulares cell_phone_list) {
        this.cellPhoneList = cell_phone_list;
    }
}
