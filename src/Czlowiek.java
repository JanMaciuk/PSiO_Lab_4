public abstract class Czlowiek {
    private String ulubionyKolor;
    private int wiek;
    private String ulubionaZabawa;
    public Czlowiek() {
        this.ulubionyKolor = "czerwony";
        this.wiek = 1;
        this.ulubionaZabawa = "skok";
    }
    public Czlowiek(String ulubionyKolor, int wiek, String ulubionaZabawa) {
        this.ulubionyKolor = ulubionyKolor;
        this.wiek = wiek;
        this.ulubionaZabawa = ulubionaZabawa;
    }
    // set-ery i get-ery --------------------------
    public String getUlubionyKolor() { return ulubionyKolor; }
    public void setUlubionyKolor(String kolor) { ulubionyKolor = kolor; }
    public int getWiek() { return wiek; }
    public void setWiek(int nowyWiek) { wiek = nowyWiek; }
    public String getUlubionaZabawa() { return ulubionaZabawa; }
    public void setUlubionaZabawa(String zabawa) { ulubionaZabawa = zabawa; }
    // koniec set-erów i get-erów ------------------

    public void zabawa() {
        System.out.println(this.ulubionaZabawa);
    }
    public abstract void turlanie();
    public abstract boolean getRak();
    public abstract void setRak(boolean rak);
    public abstract Ubranko getUbranie();
}