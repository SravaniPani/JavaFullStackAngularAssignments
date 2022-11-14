package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class SimpleInterestController {
    
    @RequestMapping(value="/hi")
    public String simpleInterest() {
        return "simpleInterest";        
    }
    
    @RequestMapping(value = "/calculation" , method =RequestMethod.POST)
    public ModelAndView calculation (
            @RequestParam ("principalAmount") int principalAmount,
            @RequestParam ("year") int year,
            @RequestParam("ROI") int ROI
            ) {
        ModelAndView mv = new ModelAndView();
        double msg = principalAmount*ROI*year/100;
        mv.addObject("message", msg);
        mv.setViewName("simpleInterest");
        return mv;
    }    
    }
