public class Carro {
    /** Marca del carro */
    private String marca;
    /** Kilometraaje del carro */
    private int kilometraje;
    /** Año del carro */
    private int anio;
    private String color;
    /** Modelo del carro */
    private String modelo;
    /** Placa del carro */
    private String placa;
    /** Motor del carro */
    private String motor;

    private Carro(){}

    /**
     * Constructor de la clase Carro
     * @param marca
     * @param kilometraje
     * @param anio
     * @param color
     * @param modelo
     * @param placa
     * @param motor
     */
    public Carro(String marca, int kilometraje, int anio, String color, String modelo, String placa, String motor) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.color = color;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMotor() {
        return motor;
    }
}
