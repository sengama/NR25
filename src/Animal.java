public abstract class Animal {

    protected String tip;
    protected int cantitateHrana;

    public Animal(String tip, int cantitateHrana) {
        this.tip = tip;
        this.cantitateHrana = cantitateHrana;
    }


    public abstract String toString();
}
