package com.cad.ws.cnpj.controller;

import com.cad.ws.cnpj.models.Activity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
@CrossOrigin(origins = "http://localhost:4200")
public class ActivityController {

//    @GetMapping(produces = "application/json")
//    public Activity getActivity() {
//        Activity ac = new Activity();
//        ac.setCode(58L);
//        ac.setDescription("Teste");
//
//        return ac;
//    }
}
