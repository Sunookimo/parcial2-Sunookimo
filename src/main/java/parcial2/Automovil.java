package parcial2;

public class Automovil extends Vehiculo{

    private int numeroPuertas;
    private TipoCombustible tipoCombustible;

    //Complejidad constante O(1)
    public Automovil(int numeroPuertas, TipoCombustible tipoCombustible, String marca, String modelo, int año) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public Automovil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Complejidad constante O(1)
    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", " + this.numeroPuertas + ", combustión a " + this.tipoCombustible; 
    }
    
    //Complejidad constante O(1) para los métodos setters & getters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
