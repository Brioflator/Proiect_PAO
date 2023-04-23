package CARTI;

import java.util.Objects;

public class DICTIONAR extends CARTE {
    private int nrCuvinte;
    private String limba1, limba2;
    
    public DICTIONAR() {
        super();
        this.nrCuvinte = 0;
        this.limba1 = "";
        this.limba2 = "";
    }

    public DICTIONAR(int cantitate, String editura, String titlu, String autor, int pret, int nrCuvinte, String limba1, String limba2) {
        super(cantitate, editura, titlu, autor, pret);
        this.nrCuvinte = nrCuvinte;
        this.limba1 = limba1;
        this.limba2 = limba2;
    }

    public String getLimba1() {
        return this.limba1;
    }

    public String getLimba2() {
        return this.limba2;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass()) 
            return false;
        if(!super.equals(o))
            return false;
        DICTIONAR that = (DICTIONAR) o;
        return this.nrCuvinte == that.nrCuvinte && Objects.equals(this.getLimba1(), that.getLimba1()) && Objects.equals(this.getLimba2(), that.getLimba2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.nrCuvinte, this.limba1, this.limba2);
    }

    @Override
    public String toString() {
        return "CARTI.DICTIONAR{" +
                "limba1= " + this.limba1 +
                ", limba2= " + this.limba2 +
                ", nr cuvinte= " + this.nrCuvinte;
    }
}