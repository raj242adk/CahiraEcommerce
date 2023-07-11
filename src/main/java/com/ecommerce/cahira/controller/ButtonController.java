package com.ecommerce.cahira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ButtonController {
    @GetMapping("/paynow")
    public String stripeHome(Model model){
        return "forindex/stripe";
    }
}
