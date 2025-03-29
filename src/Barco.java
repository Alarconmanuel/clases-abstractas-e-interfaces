public class Barco extends Vehiculo implements Acuatico{

    public Barco(String marca) {
        super(marca);
    }

    @Override
    public String toString() {
        return super.toString()+"Barco{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Barco de marca: " + marca);
    }

    @Override
    public void navegar() {
        System.out.println("El barco " + marca + " está navegando en el mar.");
    }
}
