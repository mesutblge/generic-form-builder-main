package com.sirius.generic.Services;

import com.sirius.generic.Entity.StylesForms;
import java.util.List;

public interface StylesFormsService {

    StylesForms saveStylesForm(StylesForms form);
    StylesForms getStylesFormsById(Long id);
    List<StylesForms> getAllStylesForms();
    void deleteStylesForms(Long id);

}
