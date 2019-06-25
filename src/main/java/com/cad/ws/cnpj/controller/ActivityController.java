package com.cad.ws.cnpj.controller;

import com.cad.ws.cnpj.models.Activity;
import com.cad.ws.cnpj.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activity")
@CrossOrigin(origins = "*")
public class ActivityController {

    @Autowired
    private ActivityRepository repository;

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Activity addActivity(@RequestBody Activity activity) {
        return repository.save(activity);
    }

    @GetMapping(produces = "application/json")
    public List<Activity> getActivities(){
        return repository.findAll();
    }
}
