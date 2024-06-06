package parcial2;

public class Motocicleta extends Vehiculo{
    private TipoMotocicleta tipoMotocicleta;
    private TipoCombustible combustible;
    
    //Complejidad constante O(1)
    public Motocicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    public Motocicleta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Complejidad constante O(1)
    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", " + this.tipoMotocicleta + ", combustion a " + this.combustible;
    }
    
    //Complejidad constante O(1) para los métodos setters & getters
    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }
}
