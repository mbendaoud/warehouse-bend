package com.warehouse.manager.service;

import com.warehouse.manager.model.*;

import java.util.List;

public interface IBoutiqueDao {
    public Long ajouterCategorie(Categorie c);
    public List<Categorie> listCategories();
    public Categorie getCategorie(Long idCat);
    public void supprimerCategorie(Long idCat);
    public void modifierCategorie(Categorie c);

    public Long ajouterProduit(Produit p, Long idCat);
    public List<Produit> listProduits();
    public List<Produit> produitsParMotCle(String mc);
    public List<Produit> produitSelectionnes();
    public Produit getProduit(Long idP);
    public void supprimerProduit(Long idP);
    public void modifierProduit(Produit p);

   public Commande enregistrerCommande(Panier p, Client c);

}
