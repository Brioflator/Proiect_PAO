import CARTI.CARTE;

import java.util.Arrays;
import java.util.Objects;

public class COS {
    protected Integer id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        COS cos = (COS) o;
        return getNrCarti() == cos.getNrCarti() && Objects.equals(getId(), cos.getId()) && Arrays.equals(getCarti(), cos.getCarti());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getId(), getNrCarti());
        result = 31 * result + Arrays.hashCode(getCarti());
        return result;
    }

    private CARTE[] carti;
    private int nrCarti;

    public COS() {
        this.id = 0;
        this.carti = new CARTE[0];
        this.nrCarti = 0;
    }

    public COS(int id, CARTE[] carti, int nrCarti) {
        this.id = id;
        this.carti = carti;
        this.nrCarti = nrCarti;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public CARTE[] getCarti() {
        return carti;
    }

    public void setCarti(CARTE[] carti) {
        this.carti = carti;
    }

    public int getNrCarti() {
        return nrCarti;
    }

    public void setNrCarti(int nrCarti) {
        this.nrCarti = nrCarti;
    }

    public void addCarte(CARTE carte) {
        CARTE[] newCarti = new CARTE[this.nrCarti + 1];
        for (int i = 0; i < this.nrCarti; i++) {
            newCarti[i] = this.carti[i];
        }
        newCarti[this.nrCarti] = carte;
        this.nrCarti++;
        this.carti = newCarti;
    }

    public void removeCarte(CARTE carte) {
        CARTE[] newCarti = new CARTE[this.nrCarti - 1];
        int j = 0;
        for (int i = 0; i < this.nrCarti; i++) {
            if (this.carti[i] != carte) {
                newCarti[j] = this.carti[i];
                j++;
            }
        }
        this.nrCarti--;
        this.carti = newCarti;
    }

    public void clearCarti() {
        this.carti = new CARTE[0];
        this.nrCarti = 0;
    }

    public void printCarti() {
        for (int i = 0; i < this.nrCarti; i++) {
            System.out.println(this.carti[i]);
        }
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < this.nrCarti; i++) {
            total += this.carti[i].getPret();
        }
        return total;
    }
}
