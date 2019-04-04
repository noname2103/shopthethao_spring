/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author DELL
 */
@Controller
@RequestMapping (value = "/home")
public class HomeController {
    
    @RequestMapping (value = "/index2")
    public String index2()
    {
        return "jsp/index";
    }
}
