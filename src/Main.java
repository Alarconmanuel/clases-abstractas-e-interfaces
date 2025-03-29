public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Chevrolet");
        Barco barco = new Barco("Titanic");
        Avion avion = new Avion("Avianca");

        carro.mostrarInfo();
        carro.conducir();

        barco.mostrarInfo();
        barco.navegar();

        avion.mostrarInfo();
        avion.volar();

        }
    }
