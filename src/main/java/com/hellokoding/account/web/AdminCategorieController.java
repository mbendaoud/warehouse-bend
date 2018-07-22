package com.hellokoding.account.web;

import com.hellokoding.account.model.Categorie;
import com.hellokoding.account.service.IBoutiqueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/adminCat")
public class AdminCategorieController {

    @Autowired
    IBoutiqueDao iBoutiqueDao;

    @RequestMapping (value = "/index")
    public String index(Model model){
model.addAttribute("categorie",new Categorie());
model.addAttribute("categories",iBoutiqueDao.listCategories());

        return "categories";
    }

}
