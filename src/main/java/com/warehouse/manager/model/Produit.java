package com.warehouse.manager.model;



import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
@Table( name = "produit")
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   idProduit;
    private String  codeBare;
    @NotEmpty
    @Size(min = 4,max = 16)
    private String designation;
    @NotEmpty
    private double prix;
    private boolean selected;
    private int quantite;
    private String photo;
    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;
    //constructeur sans parametres
    public Produit() { }


    //constructeur avec parametes
    public Produit(String codeBare, String designation, double prix, boolean selected, int quantite, String photo) {
        this.codeBare = codeBare;
        this.designation = designation;
        this.prix = prix;
        this.selected = selected;
        this.quantite = quantite;
        this.photo = photo;

    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getCodeBare() {
        return codeBare;
    }

    public void setCodeBare(String codeBare) {
        this.codeBare = codeBare;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}

