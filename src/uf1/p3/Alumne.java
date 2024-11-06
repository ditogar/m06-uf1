package uf1.p3;

import java.util.ArrayList;

public class Alumne {
    private String nom;
    private String cognom;
    private String cicle;
    private ArrayList<String> moduls;

    public Alumne(String nom, String cognom, String cicle, ArrayList<String> moduls) {
        this.nom = nom;
        this.cognom = cognom;
        this.cicle = cicle;
        this.moduls = moduls;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public ArrayList<String> getModuls() {
        return moduls;
    }

    public void setModuls(ArrayList<String> moduls) {
        this.moduls = moduls;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", cicle='" + cicle + '\'' +
                ", moduls=" + moduls +
                '}';
    }
}
