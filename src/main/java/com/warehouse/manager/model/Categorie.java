package com.warehouse.manager.model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@Table( name = "categorie")
public class Categorie implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCategorie;

    @NotEmpty
    private String nomCategorie;

    private String description;
    private String photo;
    private String nomPhoto;

    @OneToMany(mappedBy = "categorie",fetch = FetchType.EAGER)
    private Collection<Produit> produits;

    public long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "idCategorie=" + idCategorie +
                ", nomCategorie='" + nomCategorie + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Categorie(long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Categorie(String nomCategorie, String description, String nomPhoto) {
        this.nomCategorie = nomCategorie;
        this.description = description;
        this.nomPhoto = nomPhoto;
    }

    public Categorie () {
    }
}

