package com.sirius.generic.Services.Impl;

import com.sirius.generic.Entity.PropertiesForms;
import com.sirius.generic.Services.PropertiesFormsService;
import com.sirius.generic.dao.PropertiesFormsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PropertiesFormsServiceImpl implements PropertiesFormsService {

    @Autowired
    private final PropertiesFormsRepository propertiesFormsRepository;


    public PropertiesFormsServiceImpl(PropertiesFormsRepository propertiesFormsRepository) {
        this.propertiesFormsRepository = propertiesFormsRepository;
    }

    @Override
    public PropertiesForms savePropertiesForms(PropertiesForms form) {
        return propertiesFormsRepository.save(form);
    }

    @Override
    public PropertiesForms getPropertiesFormsById(Long id) {
        return propertiesFormsRepository.getReferenceById(id);
    }

    @Override
    public List<PropertiesForms> getAllPropertiesForms() {
        return propertiesFormsRepository.findAll();
    }

    @Override
    public void deletePropertiesForms(Long id) {
        propertiesFormsRepository.deleteById(id);
    }
}
