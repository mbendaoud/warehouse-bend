package com.warehouse.manager.model;



import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table( name = "ligneCommande")
public class LigneCommande implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "idProduit")
    private Produit produit;
    private int quantite;
    private  double prix;
    @ManyToOne
    @JoinColumn(name = "idCommande")
    private Commande commande;
    public LigneCommande(){}

    public LigneCommande (int quantite, double prix) {
        this.quantite = quantite;
        this.prix = prix;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
