public class Coche extends Vehiculo{
    private int num_puertas;
    private String tipo_combustible;

    public Coche(String marca, String modelo, int año, double precio_base, 
                 int num_puertas, String tipo_combustible) {
        super(marca, modelo, año, precio_base);
        this.num_puertas = num_puertas;
        this.tipo_combustible = tipo_combustible;
    }
    
    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Numero de puertas: " + num_puertas);
        System.out.println("Tipo de combustible: " + tipo_combustible);
    }

    public int getNumPuertas() {
        return num_puertas;
    }

    public void setNumPuertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public String getTipoCombustible() {
        return tipo_combustible;
    }

    public void setTipoCombustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }
}
