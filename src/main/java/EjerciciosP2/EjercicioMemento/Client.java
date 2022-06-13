package EjerciciosP2.EjercicioMemento;

public class Client {
    public static void main (String []args){
        DocumentoCareTaker document = new DocumentoCareTaker();
        ReversionOriginator originator = new ReversionOriginator();
        Estudiante student = new Estudiante("24415","Gabriel De La Riva");
        student.showInfo();

        // Versión 1:
        ConcreteTesis tesis;
        String title = "         Titulo1 ";
        String body =  "Body1";
        tesis = new ConcreteTesis(title,body,1);
        originator.setState(tesis);
        document.createVersion(1, originator.createMemento());


        // Versión 2:
        title = "         Titulo2 ";;
        body =  "Body2";
        tesis = new ConcreteTesis(title,body,2);
        originator.setState(tesis);
        document.createVersion(2, originator.createMemento());


        // Versión 3:
        title = " Titulo3";
        body =  "body3";
        tesis = new ConcreteTesis(title,body,3);
        originator.setState(tesis);
        document.createVersion(3, originator.createMemento());


        // Versión 4:
        title = "Titulo4";
        body =  "body4";
        tesis = new ConcreteTesis(title,body,4);
        originator.setState(tesis);
        document.createVersion(4, originator.createMemento());




        //Retornar a la Tercera Versión
        originator.restoreFromMemento(document.getMemento(3));
    }
}
