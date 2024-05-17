
/**
 * Write a description of class Gallina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gallina extends Animal {
    private int numHuevos;
    
    public Gallina(int id, String nombre, double peso,Tipo tipo, Fecha fechaNacimiento, int numHuevos) {
        super(id, nombre, peso,tipo,fechaNacimiento);
        this.numHuevos = numHuevos;
    }

    public int getNumHuevos() {
        return numHuevos;
    }
}