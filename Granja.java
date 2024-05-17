import java.util.ArrayList;

/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja {
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public int contarAnimalesPorTipo(Tipo tipo) {
        int count = 0;
        for (Animal animal : animales) {
            
                count++;
            
        }
        return count;
    }
    
    public  void mostrarInformacionAnimales(Granja granja) {
        ArrayList<Animal> animales = granja.getAnimales();
        System.out.println("Información de los animales en la granja:");

        // Iterar sobre cada animal en la granja
        for (Animal animal : animales) {
            // Mostrar información básica del animal
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Tipo: " + animal.getTipo());
            System.out.println("Edad: " + animal.calcularEdad() + " años");

            // Mostrar información específica según el tipo de animal
            if (animal instanceof Gallina) {
                Gallina gallina = (Gallina) animal;
                System.out.println("Número de huevos: " + gallina.getNumHuevos());
            } else if (animal instanceof Vaca) {
                Vaca vaca = (Vaca) animal;
                System.out.println("Litros de leche: " + vaca.getLitrosLeche());
            } else if (animal instanceof Cerdo) {
                Cerdo cerdo = (Cerdo) animal;
                System.out.println("Grasa: " + cerdo.getGrasa() + " kg");
            }

            System.out.println();
        }

        // Contar y mostrar el número de animales por tipo en la granja
        int numGallinas = granja.contarAnimalesPorTipo(Tipo.GALLINA);
        int numVacas = granja.contarAnimalesPorTipo(Tipo.VACA);
        int numCerdos = granja.contarAnimalesPorTipo(Tipo.CERDO);

        System.out.println("Número de gallinas en la granja: " + numGallinas);
        System.out.println("Número de vacas en la granja: " + numVacas);
        System.out.println("Número de cerdos en la granja: " + numCerdos);
    }
}
