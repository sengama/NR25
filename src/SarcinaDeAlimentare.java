public class SarcinaDeAlimentare implements Runnable {
    private Animal animal;

    public SarcinaDeAlimentare(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        System.out.println("Se alimentează " + animal.toString());
    }
}

