package com.sirius.generic.Services;

import com.sirius.generic.Entity.PropertiesForms;
import java.util.List;

public interface PropertiesFormsService {
    PropertiesForms savePropertiesForms(PropertiesForms form);
    PropertiesForms getPropertiesFormsById(Long id);
    List<PropertiesForms> getAllPropertiesForms();
    void deletePropertiesForms(Long id);
}
