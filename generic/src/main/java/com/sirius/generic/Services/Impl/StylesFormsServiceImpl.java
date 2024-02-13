package com.sirius.generic.Services.Impl;

import com.sirius.generic.Entity.StylesForms;
import com.sirius.generic.Services.StylesFormsService;
import com.sirius.generic.dao.StylesFormsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StylesFormsServiceImpl implements StylesFormsService {

    @Autowired
    private final StylesFormsRepository stylesFormsRepository;


    public StylesFormsServiceImpl(StylesFormsRepository stylesFormsRepository) {
        this.stylesFormsRepository = stylesFormsRepository;
    }

    @Override
    public StylesForms saveStylesForm(StylesForms form) {
        return stylesFormsRepository.save(form);
    }

    @Override
    public StylesForms getStylesFormsById(Long id) {
        return stylesFormsRepository.getReferenceById(id);
    }

    @Override
    public List<StylesForms> getAllStylesForms() {
        return stylesFormsRepository.findAll();
    }

    @Override
    public void deleteStylesForms(Long id) {
        stylesFormsRepository.deleteById(id);
    }
}
