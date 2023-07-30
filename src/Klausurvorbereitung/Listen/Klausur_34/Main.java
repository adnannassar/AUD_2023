package Klausurvorbereitung.Listen.Klausur_34;

public class Main {
    public static void main(String[] args) {
        Fahrzeug<Diesel> traktor = new Fahrzeug<>("Traktor");
        traktor.betanken(new Diesel());

        Fahrzeug<Benzin> auto = new Fahrzeug<>("Auto");
        auto.betanken(new Benzin());

        Fahrzeug<JetA1> flugzeug = new Fahrzeug<>("Flugzeug");
        flugzeug.betanken(new JetA1());
    }

}
