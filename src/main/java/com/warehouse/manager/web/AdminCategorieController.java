package com.warehouse.manager.web;

import com.warehouse.manager.model.Categorie;
import com.warehouse.manager.service.boutique.IBoutiqueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/categories")
public class AdminCategorieController {

    @Autowired
    IBoutiqueDao iBoutiqueDao;

    @RequestMapping (value = "/list")
    public String index(Model model){
        model.addAttribute("categorie",new Categorie());
        model.addAttribute("categories",iBoutiqueDao.listCategories());
        return "categories";
    }

    @RequestMapping(value = "/categorie", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("categories", "categorie", new Categorie());
    }


    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("categorie") Categorie category,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        iBoutiqueDao.ajouterCategorie(category);
        return "redirect:/categories/list";
    }

    @RequestMapping(value = "/deleteCategory", method = RequestMethod.GET)
    public String delete(@RequestParam("id") long idCat) {

        iBoutiqueDao.supprimerCategorie(idCat);

        return "redirect:/categories/list";
    }

}
