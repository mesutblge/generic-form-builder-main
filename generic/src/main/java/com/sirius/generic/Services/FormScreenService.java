package com.sirius.generic.Services;

import com.sirius.generic.Entity.FormScreen;
import java.util.List;

public interface FormScreenService {
    FormScreen saveFormScreen(FormScreen form);
    FormScreen getFormScreenById(Long id);
    List<FormScreen> getAllFormScreens();
    void deleteFormScreen(Long id);
}
