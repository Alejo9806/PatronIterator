public interface CarrosIterator {
    /**
     * Obtiene el siguiente carro a iterar.
     * @return
     */
    Carro next();

    /**
     * Resetea el iterador a la posicion 0
     */
    void reset();

    /**
     * Indica si hay mas usuarios para iterar
     * @return
     */
    boolean hasMore();
}
