package com.warehouse.manager.service.categorie;

import com.warehouse.manager.model.Categorie;

public interface CategorieService {
   void  save(Categorie c);
   Categorie findByNomCategorie(String nomCat);


}
