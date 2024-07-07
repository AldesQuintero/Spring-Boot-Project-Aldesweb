package com.aldesquintero.aldesweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {


    @GetMapping("/index")
    public String index() {
        return "index";
    }


    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/about-me")
    public String aboutme() {
        return "about-me";
    }
}
