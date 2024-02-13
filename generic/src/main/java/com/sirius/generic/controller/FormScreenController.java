package com.sirius.generic.controller;

import com.sirius.generic.Entity.FormScreen;
import com.sirius.generic.Services.FormScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/form-screens")
public class FormScreenController {

    @Autowired
    private final FormScreenService formScreenService;

    public FormScreenController(FormScreenService formScreenService) {
        this.formScreenService = formScreenService;
    }

    @PostMapping
    public ResponseEntity<FormScreen> createFormScreen(@RequestBody FormScreen formScreen) {
        FormScreen savedFormScreen = formScreenService.saveFormScreen(formScreen);
        return ResponseEntity.ok(savedFormScreen);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormScreen> getFormScreenById(@PathVariable Long id) {
        FormScreen formScreen = formScreenService.getFormScreenById(id);
        if (formScreen != null) {
            return ResponseEntity.ok(formScreen);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<FormScreen>> getAllFormScreens() {
        List<FormScreen> formScreens = formScreenService.getAllFormScreens();
        return ResponseEntity.ok(formScreens);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFormScreen(@PathVariable Long id) {
        formScreenService.deleteFormScreen(id);
        return ResponseEntity.noContent().build();
    }


}
