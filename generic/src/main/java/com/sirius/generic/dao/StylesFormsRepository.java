package com.sirius.generic.dao;

import com.sirius.generic.Entity.StylesForms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StylesFormsRepository extends JpaRepository<StylesForms,Long> {
}
