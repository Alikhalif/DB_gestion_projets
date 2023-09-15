package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Phase {
    private String code;
    private String libelle;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private double pourcentageAPayer;
    private boolean etatRealisation;
    private boolean etatFacturation;
    private boolean etatPaiement;
    private List<Livrable> livrables;


    public void modifierPhase(Phase phase) {
    // modifier une phase

    }

    public void modifierEtats(Phase phase, boolean etatFacturation, boolean etatPaiement) {

    }

    public void facturerPhase(Phase phase) {
        // facturer une phase terminée
    }

    public List<Phase> recherchesParPeriode(Date dateDebut, Date dateFin) {
        List<Phase> phasesInPeriod = new ArrayList<>();
        return phasesInPeriod;
    }



}
