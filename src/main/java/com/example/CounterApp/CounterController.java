package com.example.CounterApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CounterController {

    Integer presentCounter=0;

    @ModelAttribute("count")
    public Integer setUpCount(){
        return 0;
    }

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("count",presentCounter);
        return mv;
    }

    @RequestMapping("/increment")
    public ModelAndView increment(@RequestParam("count") int count){
        ModelAndView mv=new ModelAndView("index");
        count++;
        presentCounter=count;
        mv.addObject("count",presentCounter);
        return mv;
    }
    @RequestMapping("/decrement")
    public ModelAndView decrement(@RequestParam("count") int count ){
        ModelAndView mv=new ModelAndView("index");
        count--;
        presentCounter=count;
        mv.addObject("count",presentCounter);
        return mv;
    }
}
