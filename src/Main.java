public class Main {
    public static void main(String[] args) {
        Carros carros = new Carros();
        carros.crear(new Carro("chevrolet", 0, 2022, "rojo", "coupe", "JWS13H", "ASDFA44f"));
        carros.crear(new Carro("Ferrary", 210, 2020, "Negro", "2020A21", "JFS13H", "AASDDFA44f"));
        carros.crear(new Carro("Audi", 5000, 2014, "Blanco", "2014B45", "LYT13H", "AHWDFA44f"));
        carros.crear(new Carro("Renoult", 2130, 2018, "Naranja", "2018N41", "DAF13H", "GPWAA44f"));

        while (carros.hasMore()){
            Carro carro = carros.next();
            System.out.println("Usuario es: " + carro.getMarca() + " " + carro.getModelo() + " " + carro.getPlaca() + " " + carro.getMotor() + " " + carro.getAnio() + " " + carro.getKilometraje() + " " + carro.getColor());
        }

        carros.crear(new Carro("BMW", 5000, 2014, "Blanco", "2014B45", "LYT13H", "AHWDFA44f"));
        Carro carro = carros.next();
        System.out.println("Usuario es: " + carro.getMarca() + " " + carro.getModelo() + " " + carro.getPlaca() + " " + carro.getMotor() + " " + carro.getAnio() + " " + carro.getKilometraje() + " " + carro.getColor());

        carros.reset();
        while (carros.hasMore()){
            carro = carros.next();
            System.out.println("Usuario es: " + carro.getMarca() + " " + carro.getModelo() + " " + carro.getPlaca() + " " + carro.getMotor() + " " + carro.getAnio() + " " + carro.getKilometraje() + " " + carro.getColor());
        }
    }

    //He escogido el patron iterator porque es el mas sencillo y facil de entender ademas de es el que mas funcionamiento le veo en un proyecto real por lo cual queria
    //practicar y entender mas el patron.
}