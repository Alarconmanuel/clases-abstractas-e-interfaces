public class Carro extends Vehiculo implements Terrestre{

    public Carro(String marca) {
        super(marca);
    }

    @Override
    public String toString() {
        return super.toString()+"Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Carro de marca: " + marca);
    }

    @Override
    public void conducir() {
        System.out.println("El carro " + marca + " está conduciendo en la carretera.");
    }
}
