package com.sirius.generic.dao;

import com.sirius.generic.Entity.FormScreen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormScreenRepository extends JpaRepository<FormScreen,Long> {
}
