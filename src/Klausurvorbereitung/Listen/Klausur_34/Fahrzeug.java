package Klausurvorbereitung.Listen.Klausur_34;

public class Fahrzeug<T extends Kraftstoff> {
    private String name;
    private T kraftstoff;

    public Fahrzeug(String name) {
        this.name = name;
    }

    public void betanken(T kraftstoff) {
        this.kraftstoff = kraftstoff;
        System.out.println(name + " has been refueled with " + kraftstoff.type);
    }

    public static void main(String[] args) {
        Fahrzeug<Diesel> traktor = new Fahrzeug<>("Traktor");
        traktor.betanken(new Diesel());

        Fahrzeug<Benzin> auto = new Fahrzeug<>("Auto");
        auto.betanken(new Benzin());

        Fahrzeug<JetA1> flugzeug = new Fahrzeug<>("Flugzeug");
        flugzeug.betanken(new JetA1());
    }
}
