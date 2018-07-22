package com.warehouse.manager.service;

import com.warehouse.manager.model.Categorie;
import com.warehouse.manager.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieServiceImpl implements CategorieService {


    @Autowired
    CategorieRepository categorieRepository;
    @Override
    public void save (Categorie c) {
       categorieRepository.save(c);
    }

    @Override
    public Categorie findByNomCategorie (String nomCat) {

       return categorieRepository.findByNomCategorie(nomCat);
    }


}
