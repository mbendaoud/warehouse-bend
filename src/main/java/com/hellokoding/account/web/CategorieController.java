package com.hellokoding.account.web;

import com.hellokoding.account.model.Produit;
import com.hellokoding.account.service.IBoutiqueDao;
import com.hellokoding.account.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.ManyToOne;
import java.util.List;

@RestController

public class CategorieController {
    @Autowired
    private IBoutiqueDao iBoutiqueDao;
    @RequestMapping("/Categories")
    public Iterable<Produit> getProduits(){

        return iBoutiqueDao.listProduits();
    }
}
