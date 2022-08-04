import java.util.ArrayList;

public class Carros implements CarrosIterator{
    private ArrayList<Carro> carros = new ArrayList();
    public int posicion = 0;

    public void crear(Carro carro){
        carros.add(carro);
    }
    @Override
    public Carro next() {
        Carro carro = carros.get(posicion);
        posicion++;
        return carro;
    }

    @Override
    public void reset() {
        posicion = 0;
    }

    @Override
    public boolean hasMore() {
        return posicion < carros.size();
    }
}
