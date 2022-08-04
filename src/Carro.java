public class Carro {
    private String marca;
    private int kilometraje;
    private int anio;
    private String color;
    private String modelo;
    private String placa;
    private String motor;

    private Carro(){}

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
