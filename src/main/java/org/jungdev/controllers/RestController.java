package org.jungdev.controllers;

import org.jungdev.models.Company;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
    @GetMapping(value = "/company/{companyId}")
    public @ResponseBody Company getCompanyData(@PathVariable Integer companyId){
        return new Company();
    }

}
