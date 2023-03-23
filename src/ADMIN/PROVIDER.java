package ADMIN;

public class PROVIDER {
    private String editura;
    private String[] carti;
    private String[] numarCarti;

    public PROVIDER() {
        this.editura = "N/A";
        this.carti = new String[0];
        this.numarCarti = new String[0];
    }

    public PROVIDER(String editura, String[] carti, String[] numarCarti) {
        this.editura = editura;
        this.carti = carti;
        this.numarCarti = numarCarti;
    }

    public String getEditura() {
        return editura;
    }
    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String[] getCarti() {
        return carti;
    }
    public void setCarti(String[] carti) {
        this.carti = carti;
    }

    public String[] getNumarCarti() {
        return numarCarti;
    }

    public void setNumarCarti(String[] numarCarti) {
        this.numarCarti = numarCarti;
    }

    @Override
    public String toString() {
        return "PROVIDER{" +
                "editura='" + editura + '\'' +
                ", carti=" + carti +
                ", numarCarti=" + numarCarti +
                '}';
    }
}
