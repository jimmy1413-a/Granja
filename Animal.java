
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal {
    private int id;
    private String nombre;
    private double peso;
    protected Tipo tipo;
    private Fecha fechaNacimiento;
    
    public Animal(int id, String nombre, double peso, Tipo tipo, Fecha fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        return fechaNacimiento.calcularEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }
}