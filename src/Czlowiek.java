public abstract class Czlowiek {
    private String ulubionyKolor;
    private int wiek;
    private String ulubionaZabawa;
    private String imie;
    public Czlowiek() {
        this.ulubionyKolor = "czerwony";
        this.wiek = 1;
        this.ulubionaZabawa = "skok";
        this.imie = "bezimienny";
    }
    public Czlowiek(String ulubionyKolor, int wiek, String ulubionaZabawa, String imie) {
        this.ulubionyKolor = ulubionyKolor;
        this.wiek = wiek;
        this.ulubionaZabawa = ulubionaZabawa;
        this.imie = imie;
    }
    // set-ery i get-ery --------------------------
    public String getUlubionyKolor() { return ulubionyKolor; }
    public void setUlubionyKolor(String kolor) { ulubionyKolor = kolor; }
    public int getWiek() { return wiek; }
    public void setWiek(int nowyWiek) { wiek = nowyWiek; }
    public String getUlubionaZabawa() { return ulubionaZabawa; }
    public void setUlubionaZabawa(String zabawa) { ulubionaZabawa = zabawa; }
    public void setImie(String imie) { this.imie = imie;}
    public String getImie() {return imie;}

    // koniec set-erów i get-erów ------------------

    public void zabawa() {
        System.out.println(this.ulubionaZabawa);
    }
    public abstract void turlanie();
    public abstract boolean getInfekcja();
    public abstract void setInfekcja(boolean infekcja);
    public abstract Ubranko getUbranie();
}