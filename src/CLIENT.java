import java.util.Objects;

public class CLIENT {

    //ar trebui sa facem si o parola dar nu stiu daca e bine
    protected static int idCounter = 0;
    protected String nume;
    protected Integer id;
    protected Integer buget;
    protected String card_fidelitate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CLIENT client = (CLIENT) o;
        return Objects.equals(getNume(), client.getNume()) && Objects.equals(id, client.id) && Objects.equals(getBuget(), client.getBuget()) && Objects.equals(getCard_fidelitate(), client.getCard_fidelitate()) && Objects.equals(getCos(), client.getCos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNume(), id, getBuget(), getCard_fidelitate(), getCos());
    }

    protected COS cos;

    public CLIENT() {
        this.nume = "N/A";
        this.id = idCounter++;
        this.buget = 0;
        this.card_fidelitate = "N/A";
        this.cos = new COS();
        this.cos.setId(this.id);

    }

    public CLIENT(String nume, Integer buget, String card_fidelitate) {
        this.nume = nume;
        this.id = idCounter++;
        this.buget = buget;
        this.card_fidelitate = card_fidelitate;
        this.cos = new COS();
        this.cos.setId(this.id);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getBuget() {
        return buget;
    }

    public void setBuget(Integer buget) {
        this.buget = buget;
    }

    public String getCard_fidelitate() {
        return card_fidelitate;
    }

    public void setCard_fidelitate(String card_fidelitate) {
        this.card_fidelitate = card_fidelitate;
    }

    public COS getCos() {
        return cos;
    }

    public void setCos(COS cos) {
        this.cos = cos;
    }

    @Override
    public String toString() {
        return "CLIENT{" +
                "nume='" + nume + '\'' +
                ", id=" + id +
                ", buget=" + buget +
                ", card_fidelitate='" + card_fidelitate + '\'' +
                ", cos=" + cos +
                '}';
    }
}
