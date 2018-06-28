package org.jungdev.controllers;

import org.jungdev.models.Company;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class RestController {
    private static final String heading = "Currently Display %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/company")
    public Company getcurrentCompanyHeading(@RequestParam(value="name", defaultValue="no company") String name){
        return new Company((int) counter.incrementAndGet(),String.format(heading, name));
    }

}
