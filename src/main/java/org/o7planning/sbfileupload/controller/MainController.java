package org.o7planning.sbfileupload.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class MainController {
 
    @GetMapping("/")
    public String index() {
    	
    	System.out.println("here./.....");
        return "upload";
    }
 
}