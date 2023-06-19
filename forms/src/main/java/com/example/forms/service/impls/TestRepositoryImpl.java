package com.example.forms.service.impls;

import com.example.forms.entities.TestEntity;
import com.example.forms.interfaces.repositories.ITestRepository;
import com.example.forms.interfaces.repositories.impls.IQuestionRepositoryImpl;
import com.example.forms.interfaces.repositories.impls.ITestRepositoryImpl;
import com.example.forms.models.TestEntityCollection;
import com.example.forms.models.TestModel;
import com.example.forms.models.TestQuestionsModel;
import lombok.AllArgsConstructor;

import java.util.Collection;

@AllArgsConstructor
public class TestRepositoryImpl implements ITestRepositoryImpl {

    ITestRepository testRepository;

    IQuestionRepositoryImpl questionRepositoryImpl;

    @Override
    public TestEntity create(TestModel testModel) {
        var testEntity = new TestEntity(testModel);
        if (testModel.getQuestions() != null) {
           questionRepositoryImpl.createCollection(testModel.getQuestions(), testEntity);
        }

        return testRepository.save(testEntity);
    }

    @Override
    public TestQuestionsModel get(Integer id) {
        var test = testRepository.getById(id);
        var questions = questionRepositoryImpl.getAllByTest(id);
        return new TestQuestionsModel(test, questions);
    }

    @Override
    public TestEntityCollection getAll() {
        var iterable = testRepository.findAll();
        return new TestEntityCollection(mapper.map(iterable, Collection.class));
    }

    @Override
    public void delete(Integer id) {
        if (testRepository.findById(id).isEmpty()) {
            throw new IllegalArgumentException("Invalid id value.");
        }

        testRepository.deleteById(id);
    }
}
