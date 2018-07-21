package com.hellokoding.account.service;

import com.hellokoding.account.model.Produit;
import com.hellokoding.account.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProduitService {



    void Ajouer(Produit p);
    List<Produit> getProduit(Long id);

}
