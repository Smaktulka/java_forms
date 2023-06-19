package com.example.forms.interfaces.repositories.impls;

import com.example.forms.entities.TestEntity;
import com.example.forms.models.TestEntityCollection;
import com.example.forms.models.TestModel;
import com.example.forms.models.TestQuestionsModel;
import org.modelmapper.ModelMapper;

public interface ITestRepositoryImpl {

    ModelMapper mapper = new ModelMapper();

    TestEntity create(TestModel testModel);

    TestQuestionsModel get(Integer id);

    TestEntityCollection getAll();


    void delete(Integer id);
}

