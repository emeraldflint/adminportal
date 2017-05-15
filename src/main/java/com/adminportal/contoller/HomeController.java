package com.adminportal.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by z-dus on 16.05.2017.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
