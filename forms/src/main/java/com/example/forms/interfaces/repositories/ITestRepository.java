package com.example.forms.interfaces.repositories;

import com.example.forms.entities.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITestRepository extends JpaRepository<TestEntity, Integer> {

}
