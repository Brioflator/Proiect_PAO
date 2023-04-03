package CARTI;

import java.util.Objects;

public class BANDA_DESENATA extends CARTE
{
    private String genre;
    private boolean paginiLucioase;

    public String getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BANDA_DESENATA that = (BANDA_DESENATA) o;
        return paginiLucioase == that.paginiLucioase && Objects.equals(getGenre(), that.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGenre(), paginiLucioase);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public BANDA_DESENATA() {
        super();
        this.genre = "N/A";
        this.paginiLucioase = true;
    }

    public BANDA_DESENATA(Integer cantitate, String editura, String titlu, String autor, int pret, String genre, boolean paginiLucioase) {
        super(cantitate, editura, titlu, autor, pret);
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
