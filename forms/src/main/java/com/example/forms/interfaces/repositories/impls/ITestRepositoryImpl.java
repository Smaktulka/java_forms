package com.example.forms.interfaces.repositories.impls;

import com.example.forms.entities.TestEntity;
import com.example.forms.models.TestModel;

public interface ITestRepositoryImpl {

    TestEntity create(TestModel testModel);

    TestEntity get(Integer id);

}
