package com.hellokoding.account.service;

import com.hellokoding.account.model.Categorie;
import com.hellokoding.account.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;

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
