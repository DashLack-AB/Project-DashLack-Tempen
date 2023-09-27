package com.example.DashLack.Tempen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Conttest {

    @GetMapping("/hästsmärtstillandetabletter") //Här kommer API ändpunkten
    String get_mapping(Model arduino_temp) {
        arduino_temp.addAttribute("test", "Test av text");
        arduino_temp.addAttribute("test2", "Test av text2");

        return "frontend"; // "frontend" // kör html filen
    }

}
