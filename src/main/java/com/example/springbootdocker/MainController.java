/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootdocker;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Admin
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String main(Model model) {

        return "/index";
    }
    
    /*
    Mock Rest APIs 
    */
    
    @GetMapping("/data/config")
    @ResponseBody
    public String getConfig(){
    
        return "some configs";
    
    }
    
    @GetMapping("/data/status")
    @ResponseBody
    public String getStatus(){
    
        return "some status";
    
    }
}
