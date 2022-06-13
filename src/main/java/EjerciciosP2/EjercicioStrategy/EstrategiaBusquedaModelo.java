package EjerciciosP2.EjercicioStrategy;

public class EstrategiaBusquedaModelo implements IEstrategiaDeBusqueda{
    int cont = 1;

    @Override
    public void buscar(ListaCelulares cellPhoneList, Integer value) {
        System.out.println("*********************************************");
        System.out.println("**** BUSQUEDA POR MODELO ****\n");
        if (cellPhoneList.getSearchType().toUpperCase().equals("MODELO")){
            if (value > cellPhoneList.getPhoneList().size()){
                System.out.println("** POCOS DATOS **\n");
                linearSearch(cellPhoneList, cellPhoneList.getSearchFilterString());
            } else {
                System.out.println("** MUCHOS DATOS **\n");
                linearSearch(cellPhoneList, cellPhoneList.getSearchFilterString());
            }
        }
    }

    // BUSQUEDA LINEAL PARA POCOS DATOS
    // Y
    // BUSQUEDA LINEAL PARA GRAN CANTIDAD DE DATOS AL TRATARSE DE UNA BUSQUEDA BASADA EN STRINGS
    public void linearSearch (ListaCelulares phoneList, String x){
        int n = phoneList.getPhoneList().size();
        for (int i = 0 ; i < n ; i++){
            if (phoneList.getPhoneList().get(i).getPhoneModel().equals(x)){
                System.out.println("Celular " + cont++);
                phoneList.getPhoneList().get(i).showInfo();
                System.out.println();
            }
        }
    }

}
