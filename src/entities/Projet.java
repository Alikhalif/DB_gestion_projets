package entities;

import java.util.Date;
import java.util.List;

public class Projet {
    private String code;
    private String nom;
    private String description;
    private Organisme organismeClient;
    private Date dateDebut;
    private Date dateFin;
    private double montant;
    private List<Livrable> documentsTechniques;
    private Employe employe;
    private List<Phase> phases;

    //getters setters

    public void createProjet(Projet projet){

    }

    public void updateProjet(String code){

    }

    public void recherchProjet(String code){

    }

    public void afficherInformationsModifiables(Projet projet) {
       //afficher les informations modifiables du projet
    }
}
