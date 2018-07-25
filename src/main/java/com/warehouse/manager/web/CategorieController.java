package com.warehouse.manager.web;

import com.warehouse.manager.model.Produit;
import com.warehouse.manager.service.boutique.IBoutiqueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CategorieController {
    @Autowired
    private IBoutiqueDao iBoutiqueDao;
    @RequestMapping("/Categories")
    public Iterable<Produit> getProduits(){
        return iBoutiqueDao.listProduits();
    }
}
