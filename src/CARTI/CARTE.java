package CARTI;

import java.util.Objects;

public class CARTE {
    protected Integer cantitate;
    protected String editura;
    protected String titlu;
    protected String autor;
    protected int pret;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CARTE carte = (CARTE) o;
        return getPret() == carte.getPret() && Objects.equals(getCantitate(), carte.getCantitate()) && Objects.equals(getEditura(), carte.getEditura()) && Objects.equals(getTitlu(), carte.getTitlu()) && Objects.equals(getAutor(), carte.getAutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCantitate(), getEditura(), getTitlu(), getAutor(), getPret());
    }

    public CARTE() {
        this.cantitate = 0;
        this.editura = "N/A";
        this.titlu = "N/A";
        this.autor = "N/A";
        this.pret = 0;
    }
    public CARTE(int cantitate, String editura, String titlu, String autor, int pret) {
        this.cantitate = cantitate;
        this.editura = editura;
        this.titlu = titlu;
        this.autor = autor;
        this.pret = pret;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "CARTI.CARTE{" +
                "cantitate=" + cantitate + '\'' +
                ", editura='" + editura + '\'' +
                ", titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", pret=" + pret +
                '}';
    }
}
