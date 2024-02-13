package com.sirius.generic.Services.Impl;

import com.sirius.generic.Entity.Form;
import com.sirius.generic.Services.FormService;
import com.sirius.generic.dao.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FormServiceImpl implements FormService {

    @Autowired
    private final FormRepository formRepository;

    public FormServiceImpl(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @Override
    public Form saveForm(Form form) {
        return formRepository.save(form);
    }

    @Override
    public Form getFormById(Long id) {
        return formRepository.getReferenceById(id);
    }



    @Override
    public List<Form> getAllForms() {
        return formRepository.findAll();
    }
    @Override
    public void deleteForm(Long id) {
        formRepository.deleteById(id);
    }
}
