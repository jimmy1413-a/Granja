import java.util.ArrayList;


public class Control {
    public static void main(String[] args) {
        Granja granja = new Granja();
        
        // Crear objetos de animales y agregarlos a la granja
        Fecha fechaNacimiento = new Fecha(1, 1, 2023);
        Gallina gallina = new Gallina(1, "Maria", 2.5,Tipo.GALLINA, new Fecha(7, 7, 2011), 100);
        Vaca vaca = new Vaca(2, "Lola", 350.0,Tipo.VACA,new Fecha(7, 8, 2014), 10.5);
        Cerdo cerdo = new Cerdo(3, "Ibai", 120.0,Tipo.CERDO,new Fecha(7, 9, 2021), 15);
        Gallina nuevaGallina = new Gallina(4, "Ana", 2.8,Tipo.GALLINA, new Fecha(5, 5, 2021), 90);

        granja.agregarAnimal(gallina);
        granja.agregarAnimal(vaca);
        granja.agregarAnimal(cerdo);
        granja.agregarAnimal(nuevaGallina);

        // Mostrar la información de los animales en la granja
        granja.mostrarInformacionAnimales(granja);
    }

    
    
}