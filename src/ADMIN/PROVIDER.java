package ADMIN;

import java.util.*;

public class PROVIDER {
    private List<String> edituri_available = Arrays.asList("Humanitas", "Litera", "Polirom", "Corint", "N/A");
    private String editura;
    private String[] carti;
    private Integer[] numarCarti;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PROVIDER provider = (PROVIDER) o;
        return Objects.equals(getEditura(), provider.getEditura()) && Arrays.equals(getCarti(), provider.getCarti()) && Arrays.equals(getNumarCarti(), provider.getNumarCarti());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getEditura());
        result = 31 * result + Arrays.hashCode(getCarti());
        result = 31 * result + Arrays.hashCode(getNumarCarti());
        return result;
    }

    public PROVIDER() {
        this.editura = "N/A";
        this.carti = new String[0];
        this.numarCarti = new Integer[0];
    }

    public void PROVIDER(String editura, String[] carti, Integer[] numarCarti) {
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

    public Integer[] getNumarCarti() {
        return numarCarti;
    }

    public void setNumarCarti(Integer[] numarCarti) {
        this.numarCarti = numarCarti;
    }

    public boolean check_editura(String editura) {
        if (edituri_available.contains(editura)) {
            return true;
        } else {
            return false;
        }
    }

    public void sort_ediura()
    {
        Collections.sort(edituri_available);
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
