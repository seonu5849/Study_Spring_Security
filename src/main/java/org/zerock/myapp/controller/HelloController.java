package org.zerock.myapp.controller;


import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@NoArgsConstructor

@Controller
public class HelloController {

    @GetMapping("/hello")
    String hello(Model model) {
        log.trace("hello() invoked.");

        model.addAttribute("greeting","Hello, World!!!");

        return "hello";
    } // hello

} // end class