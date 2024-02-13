package com.sirius.generic.Services;

import com.sirius.generic.Entity.Form;
import java.util.List;

public interface FormService {
    Form saveForm(Form form);
    Form getFormById(Long id);
    List<Form> getAllForms();
    void deleteForm(Long id);
}
