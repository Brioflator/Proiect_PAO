import ADMIN.PROVIDER;
import CARTI.CARTE;

import java.util.*;

public class ACTIONS {
    //CRUD pentru carti
    public static CARTE[] inventarCarti = new CARTE[0];
    List<PROVIDER> providers = new ArrayList<PROVIDER>();


    public static int nrCarti = 0;
    public static void addCarte(CARTE carte) {
        CARTE[] newCarti = new CARTE[ACTIONS.nrCarti + 1];
        for (int i = 0; i < ACTIONS.nrCarti; i++) {
            newCarti[i] = ACTIONS.inventarCarti[i];
        }
        newCarti[ACTIONS.nrCarti] = carte;
        ACTIONS.nrCarti++;
        ACTIONS.inventarCarti = newCarti;
    }

    public static void removeCarte(CARTE carte) {
        CARTE[] newCarti = new CARTE[ACTIONS.nrCarti - 1];
        int j = 0;
        for (int i = 0; i < ACTIONS.nrCarti; i++) {
            if (ACTIONS.inventarCarti[i] != carte) {
                newCarti[j] = ACTIONS.inventarCarti[i];
                j++;
            }
        }
        ACTIONS.nrCarti--;
        ACTIONS.inventarCarti = newCarti;
    }

    public static void updateCarte(CARTE carte, CARTE newCarte) {
        for (int i = 0; i < ACTIONS.nrCarti; i++) {
            if (ACTIONS.inventarCarti[i] == carte) {
                ACTIONS.inventarCarti[i] = newCarte;
            }
        }
    }


}
