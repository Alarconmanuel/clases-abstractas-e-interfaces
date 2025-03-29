abstract public class Vehiculo {
    protected String marca;

    public Vehiculo() {
    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                '}';
    }

    public abstract void mostrarInfo();
}
