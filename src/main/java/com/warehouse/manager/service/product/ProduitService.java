package com.warehouse.manager.service.product;

import com.warehouse.manager.model.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProduitService {



    void Ajouer(Produit p);
    List<Produit> getProduit(Long id);

}
