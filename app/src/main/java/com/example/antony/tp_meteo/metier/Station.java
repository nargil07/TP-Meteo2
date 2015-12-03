package com.example.antony.tp_meteo.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by antony on 19/11/2015.
 */
public class Station implements Serializable{
    String identifiant;
    String libelle;
    ArrayList<Mesure> mesureList;

    public Station() {
    }

    public Station(String libelle, String identifiant, ArrayList<Mesure> mesureList) {
        this.libelle = libelle;
        this.identifiant = identifiant;
        this.mesureList = mesureList;
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

    public ArrayList<Mesure> getMesureList() {
        return mesureList;
    }

    public void setMesureList(ArrayList<Mesure> mesureList) {
        this.mesureList = mesureList;
    }
}
