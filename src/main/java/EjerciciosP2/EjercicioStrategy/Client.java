package EjerciciosP2.EjercicioStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main (String []args) {
        TiendaDeCelulares phone_store = new TiendaDeCelulares();
        List<Celular> device_list =  new ArrayList<>();
        device_list.add(new Celular(1540, "SM-205", "Samsung", "Galaxy S9 Plus", "Alta", 1280));
        device_list.add(new Celular(1541, "SM-205", "Samsung", "Galaxy S9 Plus", "Alta", 1100));
        device_list.add(new Celular(1542, "SM-943", "Samsung", "Galaxy Note S20", "Alta", 1500));
        device_list.add(new Celular(1543, "SM-305", "Samsung", "Galaxy S10 Mini", "Alta", 1280));
        device_list.add(new Celular(1544, "HW-54", "Huawei", "P30", "Alta", 1100));
        device_list.add(new Celular(1545, "HW-54", "Huawei", "P30", "Alta", 1100));
        device_list.add(new Celular(1546, "HW-54", "Huawei", "P30", "Alta", 1050));
        device_list.add(new Celular(1547, "HW-93", "Huawei", "Y9", "Media", 950));
        device_list.add(new Celular(1548, "IP-15C", "IPhone", "IPhone 5", "Media-Alta", 850));
        device_list.add(new Celular(1549, "IP-15C", "Apple", "IPhone 5", "Media-Alta", 900));
        device_list.add(new Celular(1550, "IP-10A", "Apple", "IPhone S10", "Alta", 1280));
        device_list.add(new Celular(1551, "IP-20A", "Apple", "IPhone S20", "Alta", 1500));
        device_list.add(new Celular(1552, "IP-18B", "Apple", "IPhone 6", "Alta", 900));
        ListaCelulares list_to_search = new ListaCelulares("Precio", 1280, "---", device_list);
        Collections.sort(device_list, new Comparator<Celular>() {
            @Override
            public int compare(Celular o1, Celular o2) {
                return o1.getPhonePrice().compareTo(o2.getPhonePrice());
            }
        });

        // BUSQUEDA POR PRECIO
        // Con Cantidad de Celulares menor a "value"
        phone_store.setDeviceQuantity(40);
        phone_store.setCellPhoneList(list_to_search);
        phone_store.setSearchStrategy(new EstrategiaBusquedaPrecio());
        phone_store.buscarConEstrategia();

        // Con Cantidad de Celulares mayor a "value"
        phone_store.setDeviceQuantity(5);
        phone_store.setCellPhoneList(list_to_search);
        phone_store.setSearchStrategy(new EstrategiaBusquedaPrecio());
        phone_store.buscarConEstrategia();


        // BUSQUEDA POR MODELO
        list_to_search.setSearchType("Modelo");
        list_to_search.setSearchFilter(0);
        list_to_search.setSearchFilterString("P30");
        // Con Cantidad de Celulares menor a "value"
        phone_store.setDeviceQuantity(30);
        phone_store.setCellPhoneList(list_to_search);
        phone_store.setSearchStrategy(new EstrategiaBusquedaModelo());
        phone_store.buscarConEstrategia();

        // Con Cantidad de Celulares mayor a "value"
        phone_store.setDeviceQuantity(8);
        phone_store.setCellPhoneList(list_to_search);
        phone_store.setSearchStrategy(new EstrategiaBusquedaModelo());
        phone_store.buscarConEstrategia();


        // BUSQUEDA ESPECIFICA (POR PRECIO Y MODELO)
        list_to_search.setSearchType("Precio Y Modelo");
        list_to_search.setSearchFilter(1100);
        list_to_search.setSearchFilterString("P30");
        // Con Cantidad de Celulares menor a "value"
        phone_store.setDeviceQuantity(25);
        phone_store.setCellPhoneList(list_to_search);
        phone_store.setSearchStrategy(new EstrategiaBuquedaEspecifica());
        phone_store.buscarConEstrategia();

        // Con Cantidad de Celulares mayor a "value"
        phone_store.setDeviceQuantity(10);
        phone_store.setCellPhoneList(list_to_search);
        phone_store.setSearchStrategy(new EstrategiaBuquedaEspecifica());
        phone_store.buscarConEstrategia();
    }
}
