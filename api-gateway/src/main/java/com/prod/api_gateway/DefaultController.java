package com.prod.api_gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/default-msg")
    public String defaultMessage() {
        return "Patient service is not available";
    }
}