package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class InfoController {
    @GetMapping("/info")
    public String Info(){
        return "Descibing information";
    }

}
