package CARTI;

public class CARTE {

    protected String editura;
    protected String titlu;
    protected String autor;
    protected int pret;

    public CARTE() {
        this.editura = "N/A";
        this.titlu = "N/A";
        this.autor = "N/A";
        this.pret = 0;
    }
    public CARTE(String editura, String titlu, String autor, int pret) {
        this.editura = editura;
        this.titlu = titlu;
        this.autor = autor;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "CARTI.CARTE{" +
                "editura='" + editura + '\'' +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", pret=" + pret +
                '}';
    }
}
