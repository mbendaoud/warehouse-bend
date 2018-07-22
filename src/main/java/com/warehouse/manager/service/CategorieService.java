package com.warehouse.manager.service;

import com.warehouse.manager.model.Categorie;

public interface CategorieService {
   void  save(Categorie c);
   Categorie findByNomCategorie(String nomCat);


}
