package EjerciciosP2.EjercicioStrategy;

public class EstrategiaBuquedaEspecifica implements IEstrategiaDeBusqueda{
    int cont = 1;

    @Override
    public void buscar(ListaCelulares cellPhoneList, Integer value) {
        System.out.println("*********************************************");
        System.out.println("**** BUSQUEDA ESPECIFICA ****\n");
        if (cellPhoneList.getSearchType().toUpperCase().equals("PRECIO Y MODELO")){
            if (value > cellPhoneList.getPhoneList().size()){
                System.out.println("** POCOS DATOS **\n");
                linearSearch(cellPhoneList, cellPhoneList.getSearchFilter(), cellPhoneList.getSearchFilterString());
            } else {
                System.out.println("** MUCHOS DATOS **\n");
                binarySearch(cellPhoneList, cellPhoneList.getSearchFilter(), cellPhoneList.getSearchFilterString());
            }
        }
    }

    public void linearSearch (ListaCelulares phoneList, int x, String y){
        int n = phoneList.getPhoneList().size();
        for (int i = 0 ; i < n ; i++){
            if (phoneList.getPhoneList().get(i).getPhonePrice() == x && phoneList.getPhoneList().get(i).getPhoneModel().equals(y)){
                System.out.println("Celular " + cont++);
                phoneList.getPhoneList().get(i).showInfo();
                System.out.println();
            }
        }
    }

    // BUSQUEDA BINARIA PARA GRAN CANTIDAD DE DATOS
    public void binarySearch (ListaCelulares phoneList, int x, String y){
        int l = 0;
        int r = phoneList.getPhoneList().size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (phoneList.getPhoneList().get(m).getPhonePrice() == x && phoneList.getPhoneList().get(m).getPhoneModel().equals(y)) {
                System.out.println("Celular " + cont++);
                phoneList.getPhoneList().get(m).showInfo();
                phoneList.getPhoneList().remove(m);
                System.out.println();
                this.binarySearch(phoneList, x, y);
            } else if (phoneList.getPhoneList().get(m).getPhonePrice() < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
    }
}
