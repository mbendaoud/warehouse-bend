package com.warehouse.manager.web.controller;


import com.warehouse.manager.model.Produit;
import com.warehouse.manager.service.boutique.IBoutiqueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/products")

public class ProductController {
    @Autowired
    IBoutiqueDao iBoutiqueDao;

    @RequestMapping (value = "/list")
    public String listProducts(Model model){
        model.addAttribute("produit", new Produit());
        model.addAttribute("products",iBoutiqueDao.listProduits());
        return "products";
    }

    @RequestMapping(value = "/produit", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("products", "produit", new Produit());
    }

}
