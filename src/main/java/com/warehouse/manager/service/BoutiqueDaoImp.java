package com.warehouse.manager.service;

import com.warehouse.manager.repository.CategorieRepository;
import com.warehouse.manager.repository.CommandeRepository;
import com.warehouse.manager.repository.ProduitRepository;
import com.warehouse.manager.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoutiqueDaoImp implements IBoutiqueDao {
    @Autowired
    ProduitRepository   produitRepository;

    @Autowired
    CategorieRepository categorieRepository;

    @Autowired
    CommandeRepository commandeRepository;

    @Override
    public Long ajouterCategorie (Categorie c) {
        categorieRepository.save(c);
        return c.getIdCategorie();

    }

    @Override
    public List<Categorie> listCategories () {

        return categorieRepository.findAll();

    }

    @Override
    public Categorie getCategorie (Long idCat) {
       return   categorieRepository.getOne(idCat);
    }

    @Override
    public void supprimerCategorie (Long idCat) {
          categorieRepository.delete(idCat);
    }

    @Override
    public void modifierCategorie (Categorie c) {
 categorieRepository.save(c);
    }

    @Override
    public Long ajouterProduit (Produit p, Long idCat) {
        Categorie c= categorieRepository.getOne(idCat);
        p.setCategorie(c);
        produitRepository.save(p);
        return  p.getIdProduit();
    }

    @Override
    public List<Produit> listProduits () {
        return produitRepository.findAll();


    }

    @Override
    public List<Produit> produitsParMotCle (String mc) {


        return produitRepository.findAllByDesignationIgnoreCase(mc);
    }

    @Override
    public List<Produit> produitSelectionnes () {
        return null;
    }

    @Override
    public Produit getProduit (Long idP) {
        return produitRepository.getOne(idP);
    }

    @Override
    public void supprimerProduit (Long idP) {

    }

    @Override
    public void modifierProduit (Produit p) {

    }

    @Override
    public Commande enregistrerCommande (Panier p, Client c) {
        return null;
    }
}
