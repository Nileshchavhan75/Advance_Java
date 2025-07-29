package com.example.demo;

import jika.OutsideJika;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Application {

    @Autowired
    private OutsideJika outsideJika;

    @GetMapping("/jika")
    public String callOutsideJika() {
        return outsideJika.printMessage();
    }
}
