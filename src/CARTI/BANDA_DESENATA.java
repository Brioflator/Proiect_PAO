package CARTI;

import CARTI.CARTE;

public class BANDA_DESENATA extends CARTE
{
    private String genre;
    private boolean paginiLucioase;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public BANDA_DESENATA() {
        super();
        this.genre = "N/A";
        this.paginiLucioase = false;
    }

    public BANDA_DESENATA(String editura, String titlu, String autor, int pret, String genre, boolean paginiLucioase) {
        super(editura, titlu, autor, pret);
        this.genre = genre;
        this.paginiLucioase = paginiLucioase;
    }

    @Override
    public String toString() {
        return "CARTI.BANDA_DESENATA{" +
                "genre='" + genre + '\'' +
                ", paginiLucioase=" + paginiLucioase +
                ", editura='" + editura + '\'' +
                ", titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", pret=" + pret +
                '}';
    }
}
