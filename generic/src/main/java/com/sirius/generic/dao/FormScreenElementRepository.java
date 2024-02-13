package com.sirius.generic.dao;

import com.sirius.generic.Entity.FormScreenElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormScreenElementRepository extends JpaRepository<FormScreenElement,Long> {
}
