package rs.aleph.android.example12.activities.model;

/**
 * Created by user on 1.2.2017..
 */

public class Jelo {
    private int id;
    private String slika;
    private String ime;
    private String opis;
    private String kategorija;
    private String sastojci;
    private int kalorije;
    private float cena;

    private void  Jelo(){

    }

    public Jelo(String slika, String ime, String opis, String kategorija, String sastojci, int kalorije, float cena){
        this.slika = slika;
        this.ime = ime;
        this.opis = opis;
        this.kategorija = kategorija;
        this.sastojci = sastojci;
        this.kalorije = kalorije;
        this.cena = cena;

    }

    public int getId() {
        return id;
    }

    public String getSlika() {
        return slika;
    }

    public String getIme() {
        return ime;
    }

    public String getOpis() {
        return opis;
    }

    public String getKategorija() {
        return kategorija;
    }

    public String getSastojci() {
        return sastojci;
    }

    public int getKalorije() {
        return kalorije;
    }

    public float getCena() {
        return cena;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public void setSastojci(String sastojci) {
        this.sastojci = sastojci;
    }

    public void setKalorije(int kalorije) {
        this.kalorije = kalorije;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
}
