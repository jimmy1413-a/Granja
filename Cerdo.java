
/**
 * Write a description of class Cerdo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerdo extends Animal {
    private int grasa;
    
    public Cerdo(int id, String nombre, double peso,Tipo tipo, Fecha fechaNacimiento, int grasa) {
        super(id, nombre, peso, tipo, fechaNacimiento);
        this.grasa = grasa;
    }

    public int getGrasa() {
        return grasa;
    }
}
