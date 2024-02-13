package com.sirius.generic.controller;

import com.sirius.generic.Entity.StylesForms;
import com.sirius.generic.Services.StylesFormsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/styles-forms")
public class StylesFormsController {
    @Autowired
    private final StylesFormsService stylesFormsService;
    public StylesFormsController(StylesFormsService stylesFormsService) {
        this.stylesFormsService = stylesFormsService;
    }

    @PostMapping
    public ResponseEntity<StylesForms> createStyles(@RequestBody StylesForms stylesForms) {
        StylesForms savedPropertiesForms = stylesFormsService.saveStylesForm(stylesForms);
        return ResponseEntity.ok(savedPropertiesForms);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StylesForms> getStylesElementById(@PathVariable Long id) {
        StylesForms formStyles = stylesFormsService.getStylesFormsById(id);
        if (formStyles != null) {
            return ResponseEntity.ok(formStyles);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<StylesForms>> getAllStyles() {
        List<StylesForms> formProperties = stylesFormsService.getAllStylesForms();
        return ResponseEntity.ok(formProperties);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStyles(@PathVariable Long id) {
        stylesFormsService.deleteStylesForms(id);
        return ResponseEntity.noContent().build();
    }

}
