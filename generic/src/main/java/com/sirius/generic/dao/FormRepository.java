package com.sirius.generic.dao;

import com.sirius.generic.Entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FormRepository extends JpaRepository<Form, Long> {
}
