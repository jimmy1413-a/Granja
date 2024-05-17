
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int calcularEdad() {
        int añoActual = 2024; // Puedes cambiar esto al año actual
        int edad = añoActual - año;
        return edad;
    }
}