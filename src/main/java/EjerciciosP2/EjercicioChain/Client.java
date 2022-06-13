package EjerciciosP2.EjercicioChain;

public class Client {
    public static void main (String[] args){
        CuerpoDelEjercito cuerpoDelEjercito =  new CuerpoDelEjercito();

        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("524","Entrevistas"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("525","Disciplina"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("526","Manifestaciones"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("527","Desbloqueos"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("528","Limpiezas"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("529","Otro"));
    }
}
