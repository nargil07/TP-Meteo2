package com.example.antony.tp_meteo.metier;

/**
 * Created by antony on 19/11/2015.
 */
public class Station {
    String identifiant;
    String libelle;

    public Station() {
    }

    public Station(String libelle, String identifiant) {
        this.libelle = libelle;
        this.identifiant = identifiant;
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
}
