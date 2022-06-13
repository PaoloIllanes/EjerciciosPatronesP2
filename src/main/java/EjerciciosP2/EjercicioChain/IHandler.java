package EjerciciosP2.EjercicioChain;

public interface IHandler {
        void setNext(IHandler handler);
        IHandler next();
        void atenderOrden(OrdenDeMando orden);
}
