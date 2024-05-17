
/**
 * Write a description of class Vaca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vaca extends Animal {
    private double litrosLeche;
    
    public Vaca(int id, String nombre, double peso,Tipo tipo, Fecha fechaNacimiento, double litrosLeche) {
        super(id, nombre, peso, tipo, fechaNacimiento);
        this.litrosLeche = litrosLeche;
    }

    public double getLitrosLeche() {
        return litrosLeche;
    }
}
