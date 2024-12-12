package uf1.p3;

import java.util.ArrayList;
import java.util.Objects;

public class Alumne {
    private String nom;
    private String cognom;
    private String cicle;
    private Double nota;
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

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public ArrayList<String> getModuls() {
        return moduls;
    }

    public void setModuls(ArrayList<String> moduls) {
        this.moduls = moduls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumne alumne = (Alumne) o;
        return Objects.equals(nom, alumne.nom) && Objects.equals(cognom, alumne.cognom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, cognom);
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
