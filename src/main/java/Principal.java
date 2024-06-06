import java.util.Scanner;
import parcial2.TipoCombustible;
import parcial2.Automovil;
import parcial2.Motocicleta;
import parcial2.TipoCombustible;
import parcial2.TipoMotocicleta;
import parcial2.Vehiculo;

//Complejidad constante O(1)
public class Principal {
    public static void main(String[] args) {
       Scanner pc = new Scanner(System.in);
        
        Vehiculo vehiculo = new Vehiculo();
        Automovil automovil = new Automovil();
        Motocicleta motocicleta = new Motocicleta();
        
        System.out.print("marca=");
        String marca = pc.nextLine();
        System.out.print("modelo=");
        String modelo = pc.nextLine();
        System.out.print("año=");
        int año = pc.nextInt();
        System.out.print("numeroPuertas=");
        int numeroPuertas = pc.nextInt();
        System.out.print("tipoCombustible=");
        automovil.setTipoCombustible(TipoCombustible.HIBRIDO);
        automovil.setTipoCombustible(TipoCombustible.GASOLINA);
        automovil.setTipoCombustible(TipoCombustible.ELECTRICO);
        System.out.println("tipoMotocicleta=");
        
        
        vehiculo.setAnio(año);
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        automovil.setNumeroPuertas(numeroPuertas);
        automovil.setTipoCombustible(TipoCombustible.HIBRIDO);
        automovil.setTipoCombustible(TipoCombustible.GASOLINA);
        automovil.setTipoCombustible(TipoCombustible.ELECTRICO);
        motocicleta.setTipoMotocicleta(TipoMotocicleta.DEPORTIVA);
    
    }
}

