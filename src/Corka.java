public class Corka extends Czlowiek {
    private boolean infekcja;
    private Ubranko ubranie;

    // konstruktory
    public Corka() {
        super("niebieski", 1, "skakanie","Marysia");
        this.infekcja = true;
        this.ubranie = new Ubranko();
    }
    public Corka(String ulubionyKolor, int wiek, String ulubionaZabawa, boolean infekcja, String imie) {
        super(ulubionyKolor, wiek, ulubionaZabawa,imie);
        this.infekcja = infekcja;
        this.ubranie = new Ubranko();
    }


    // set i get
    public boolean getInfekcja() { return infekcja; }
    public void setInfekcja(boolean infekcja) { this.infekcja = infekcja; }
    public Ubranko getUbranie() { return ubranie; }

    public void zabawa() {
        System.out.println("ulubiona zabawa córki to " + this.getUlubionaZabawa());
    }
    public void turlanie() {
        if (this.getWiek() > 1) {
        System.out.println("Turu Turlu");
    }
    else {System.out.println(this.getImie()+ " jest za mała żeby się turlać");}
    }
}
