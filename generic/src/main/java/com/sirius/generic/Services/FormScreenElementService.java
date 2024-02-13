package com.sirius.generic.Services;

import com.sirius.generic.Entity.FormScreenElement;
import java.util.List;

public interface FormScreenElementService {
    FormScreenElement saveFormScreenElement(FormScreenElement form);
    FormScreenElement getFormScreenElementById(Long id);
    List<FormScreenElement> getAllFormScreenElements();
    void deleteFormScreenElement(Long id);
}
