package model;

public class Lap {

    private String szin, ertek;

    public Lap(String szin, String ertek) {
        this.szin = szin;
        this.ertek = ertek;
    }

    public String getSzin() {
        return szin;
    }

    public String getErtek() {
        return ertek;
    }

    /**
     * Sajat metodus
     */
    public String megjelenit() {
        return szin + "_" + ertek;
    }
}
