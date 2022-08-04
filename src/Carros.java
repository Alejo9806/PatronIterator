import java.util.ArrayList;

public class Carros implements CarrosIterator{
    /** Lista de carros */
    private ArrayList<Carro> carros = new ArrayList();
    /** Posicion actual del iterador */
    public int posicion = 0;

    /**
     * Crea un nuevo carro
     * @param carro
     */
    public void crear(Carro carro){
        carros.add(carro);
    }

    /**
     * Obtiene el siguiente carro a iterar y lo devuelve
     * @return carro
     */
    @Override
    public Carro next() {
        Carro carro = carros.get(posicion);
        posicion++;
        return carro;
    }

    /**
     * Resetea el iterador a la posicion 0
     */
    @Override
    public void reset() {
        posicion = 0;
    }

    /**
     * Indica si hay mas usuarios para iterar
     * @return boolean
     */
    @Override
    public boolean hasMore() {
        return posicion < carros.size();
    }
}
