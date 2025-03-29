public class Avion extends Vehiculo implements Aereo{

    public Avion(String marca) {
        super(marca);
    }

    @Override
    public String toString() {
        return super.toString()+"Avion{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Avión de marca: " + marca);
    }

    @Override
    public void volar() {
        System.out.println("El avión " + marca + " está volando en el cielo.");
    }
}
