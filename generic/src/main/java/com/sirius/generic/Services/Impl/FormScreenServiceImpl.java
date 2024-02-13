package com.sirius.generic.Services.Impl;

import com.sirius.generic.Entity.FormScreen;
import com.sirius.generic.Services.FormScreenService;
import com.sirius.generic.dao.FormScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FormScreenServiceImpl implements FormScreenService {

    @Autowired
    private final FormScreenRepository formScreenRepository;

    public FormScreenServiceImpl(FormScreenRepository formScreenRepository) {
        this.formScreenRepository = formScreenRepository;
    }

    @Override
    public FormScreen saveFormScreen(FormScreen form) {
        return formScreenRepository.save(form);
    }

    @Override
    public FormScreen getFormScreenById(Long id) {
        return formScreenRepository.getReferenceById(id);
    }

    @Override
    public List<FormScreen> getAllFormScreens() {
        return formScreenRepository.findAll();
    }

    @Override
    public void deleteFormScreen(Long id) {
        formScreenRepository.deleteById(id);
    }
}
