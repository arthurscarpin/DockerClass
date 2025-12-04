package com.github.arthurscarpin.DockerClass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/docker")
    public String message() {
        return "This is a DOCKER application.";
    }
}
