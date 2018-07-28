package com.warehouse.manager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "welcome";
    }

    @RequestMapping(value = { "/products"}, method = RequestMethod.GET)
    public String productsPage(ModelMap model) {
        return "products";
    }

    @RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "contactus";
    }
}