package com.example.antony.tp_meteo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by antony on 19/11/2015.
 */
public class Station implements Serializable {
    String identifiant;
    String libelle;
    long dateModif;

    public Station() {
    }

    public Station(String libelle, String identifiant, long dateModif) {
        this.libelle = libelle;
        this.identifiant = identifiant;
        this.dateModif = dateModif;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public long getDateModif() {
        return dateModif;
    }

    public void setDateModif(long dateModif) {
        this.dateModif = dateModif;
    }
}
