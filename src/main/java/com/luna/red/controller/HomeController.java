package com.luna.red.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String home(
            HttpServletResponse httpServletResponse,
            HttpServletRequest httpServletRequest,
            @RequestParam(name = "name", required = false) String name,
            Model model) throws Exception{

        model.addAttribute("name", "spring");
        return "greeting";
    }
}
