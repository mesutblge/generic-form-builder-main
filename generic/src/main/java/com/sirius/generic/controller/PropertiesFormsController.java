package com.sirius.generic.controller;


import com.sirius.generic.Entity.FormScreenElement;
import com.sirius.generic.Entity.PropertiesForms;
import com.sirius.generic.Services.PropertiesFormsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("properties-forms")
public class PropertiesFormsController {

    @Autowired
    private final PropertiesFormsService propertiesFormsService;

    public PropertiesFormsController(PropertiesFormsService propertiesFormsService) {
        this.propertiesFormsService = propertiesFormsService;
    }

    @PostMapping
    public ResponseEntity<PropertiesForms> createFormProperties(@RequestBody PropertiesForms propertiesForms) {
        PropertiesForms savedpropertiesForms = propertiesFormsService.savePropertiesForms(propertiesForms);
        return ResponseEntity.ok(savedpropertiesForms);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PropertiesForms> getFormPropertiesElementById(@PathVariable Long id) {
        PropertiesForms formProperties = propertiesFormsService.getPropertiesFormsById(id);
        if (formProperties != null) {
            return ResponseEntity.ok(formProperties);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<PropertiesForms>> getAllPropertiesForms() {
        List<PropertiesForms> formProperties = propertiesFormsService.getAllPropertiesForms();
        return ResponseEntity.ok(formProperties);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProperties(@PathVariable Long id) {
        propertiesFormsService.deletePropertiesForms(id);
        return ResponseEntity.noContent().build();
    }


}
