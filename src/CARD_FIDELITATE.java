import java.util.Objects;

public class CARD_FIDELITATE {
    private String categorie;
    private int reducere;

    public CARD_FIDELITATE() {
        this.categorie = "N/A";
        this.reducere = 0;
    }

    public CARD_FIDELITATE(String categorie, int reducere) {
        this.categorie = categorie;
        this.reducere = reducere;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getReducere() {
        return reducere;
    }

    public void setReducere(int reducere) {
        this.reducere = reducere;
    }

    @Override
    public String toString() {
        return "CARD_FIDELITATE{" +
                "categorie='" + categorie + '\'' +
                ", reducere=" + reducere +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CARD_FIDELITATE that = (CARD_FIDELITATE) o;
        return reducere == that.reducere && Objects.equals(categorie, that.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categorie, reducere);
    }
}
