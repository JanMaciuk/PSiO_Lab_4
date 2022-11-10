public class Ubranko {
    private Boolean Naklejka;
    private String Kolor;

    //konstruktory
    public Ubranko() {
        this.Naklejka = false;
        this.Kolor = "granatowy";
    }
    public Ubranko(Boolean Naklejka, String Kolor) {
        this.Naklejka = Naklejka;
        this.Kolor = Kolor;
    }
    // set-ery i get-ery ---------------------
    public Boolean getNaklejka() { return Naklejka; }
    public void setNaklejka(Boolean Naklejka) { this.Naklejka = Naklejka; }
    public String getKolor() { return Kolor; }
    public void setKolor(String Kolor) { this.Kolor = Kolor; }
    // koniec set-erów i get-erów -------------
}
