package com.sirius.generic.controller;

import com.sirius.generic.Entity.FormScreenElement;
import com.sirius.generic.Services.FormScreenElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/form-screen-elements")
public class FormScreenElementController {
    @Autowired
    private final FormScreenElementService formScreenElementService;

    public FormScreenElementController(FormScreenElementService formScreenElementService) {
        this.formScreenElementService = formScreenElementService;
    }

    @PostMapping
    public ResponseEntity<FormScreenElement> createFormElement(@RequestBody FormScreenElement formScreenElement) {
        FormScreenElement savedFormScreenElement = formScreenElementService.saveFormScreenElement(formScreenElement);
        return ResponseEntity.ok(savedFormScreenElement);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormScreenElement> getFormScreenElementById(@PathVariable Long id) {
        FormScreenElement formScreenElement = formScreenElementService.getFormScreenElementById(id);
        if (formScreenElement != null) {
            return ResponseEntity.ok(formScreenElement);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<FormScreenElement>> getAllFormElements() {
        List<FormScreenElement> formScreenElements = formScreenElementService.getAllFormScreenElements();
        return ResponseEntity.ok(formScreenElements);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFormScreenElement(@PathVariable Long id) {
        formScreenElementService.deleteFormScreenElement(id);
        return ResponseEntity.noContent().build();
    }

}
