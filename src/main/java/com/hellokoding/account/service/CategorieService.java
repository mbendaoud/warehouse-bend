package com.hellokoding.account.service;

import com.hellokoding.account.model.Categorie;

public interface CategorieService {
   void  save(Categorie c);
   Categorie findByNomCategorie(String nomCat);


}
