package cz.vsb.ekf.klu.Produkty;

public class VlastProduktu {

    private Integer id;
    private String nazev;
    private VycetProdukty typProduktu;
    private Integer cena;
    private Integer gramaz;
    private Integer kcal;
    private Integer tuky;
    private Integer sacharidy;
    private Integer bilkoviny;

    public VlastProduktu(Integer id, String nazev, Integer cena, Integer kcal, Integer tuky, Integer sacharidy, Integer bilkoviny, Integer gramaz, VycetProdukty typProduktu) {
        this.id = id;
        this.nazev = nazev;
        this.cena = cena;
        this.kcal = kcal;
        this.tuky = tuky;
        this.sacharidy = sacharidy;
        this.bilkoviny = bilkoviny;
        this.gramaz = gramaz;
        this.typProduktu = typProduktu;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public Integer getKcal() {
        return kcal;
    }

    public void setKcal(Integer kcal) {
        this.kcal = kcal;
    }

    public Integer getTuky() {
        return tuky;
    }

    public void setTuky(Integer tuky) {
        this.tuky = tuky;
    }

    public Integer getSacharidy() {
        return sacharidy;
    }

    public void setSacharidy(Integer sacharidy) {
        this.sacharidy = sacharidy;
    }

    public Integer getBilkoviny() {
        return bilkoviny;
    }

    public void setBilkoviny(Integer bilkoviny) {
        this.bilkoviny = bilkoviny;
    }

    public Integer getGramaz() {
        return gramaz;
    }

    public void setGramaz(Integer gramaz) {
        this.gramaz = gramaz;
    }
    @Override
    public String toString() {
        return "Produkt = "
                + "Název: " + nazev
                + ", Cena: " + cena + " Kč"
                + ", Kalorie: " + kcal + " kJ"
                + ", Tuky: " + tuky + " g"
                + ", Sacharidy: " + sacharidy + " g"
                + ", Bílkoviny: " + bilkoviny + " g"
                + ", Gramáž: " + gramaz + " g"
                + " ";
    }
}

