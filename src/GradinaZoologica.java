import java.util.ArrayList;
import java.util.List;

public class GradinaZoologica {

    private List<Animal> animale;

    public GradinaZoologica() {
        this.animale = new ArrayList<>();
    }

    public void adaugaAnimal(Animal animal) {
        animale.add(animal);
    }

    public void hraneșteAnimalele() {
        for (Animal animal : animale) {
            new Thread(new SarcinaDeAlimentare(animal)).start();
        }
    }

}