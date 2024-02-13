package com.sirius.generic.dao;

import com.sirius.generic.Entity.PropertiesForms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertiesFormsRepository extends JpaRepository<PropertiesForms,Long> {
}
