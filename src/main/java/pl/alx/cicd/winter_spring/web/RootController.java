package pl.alx.cicd.winter_spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping(path="/", produces ="text/html")
    public String index() {

            return "<strong> Hello world</strong>";
    }
}
