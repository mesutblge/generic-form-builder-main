package com.sirius.generic.Services.Impl;

import com.sirius.generic.Entity.FormScreenElement;
import com.sirius.generic.Services.FormScreenElementService;
import com.sirius.generic.dao.FormScreenElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FormScreenElementServiceImpl implements FormScreenElementService {

    @Autowired
    private final FormScreenElementRepository formScreenElementRepository;

    public FormScreenElementServiceImpl(FormScreenElementRepository formScreenElementRepository) {
        this.formScreenElementRepository = formScreenElementRepository;
    }

    @Override
    public FormScreenElement saveFormScreenElement(FormScreenElement form) {
        return formScreenElementRepository.save(form);
    }

    @Override
    public FormScreenElement getFormScreenElementById(Long id) {
        return formScreenElementRepository.getReferenceById(id);
    }

    @Override
    public List<FormScreenElement> getAllFormScreenElements() {
        return formScreenElementRepository.findAll();
    }

    @Override
    public void deleteFormScreenElement(Long id) {
        formScreenElementRepository.deleteById(id);
    }
}
