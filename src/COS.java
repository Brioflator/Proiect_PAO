import CARTI.CARTE;

public class COS {
    private CARTE[] carti;
    private int nrCarti;

    public COS() {
        this.carti = new CARTE[0];
        this.nrCarti = 0;
    }

    public COS(CARTE[] carti, int nrCarti) {
        this.carti = carti;
        this.nrCarti = nrCarti;
    }

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
}
