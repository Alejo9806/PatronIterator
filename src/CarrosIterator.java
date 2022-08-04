public interface CarrosIterator {
    //Obtiene el siguiente usuario
    Carro next();

    //Reinicia el contador (el iterador)
    void reset();

    //Hay mas usuarios iterando?
    boolean hasMore();
}
