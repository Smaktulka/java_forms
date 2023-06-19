package com.example.forms.service.impls;

import com.example.forms.entities.QuestionEntity;
import com.example.forms.entities.TestEntity;
import com.example.forms.interfaces.repositories.IOptionRepository;
import com.example.forms.interfaces.repositories.IQuestionRepository;
import com.example.forms.interfaces.repositories.ITestRepository;
import com.example.forms.interfaces.repositories.impls.IOptionRepositoryImpl;
import com.example.forms.interfaces.repositories.impls.IQuestionRepositoryImpl;
import com.example.forms.interfaces.repositories.impls.ITestRepositoryImpl;
import com.example.forms.models.QuestionEntityCollection;
import com.example.forms.models.QuestionModel;
import com.example.forms.models.QuestionModelCollection;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class QuestionRepositoryImpl implements IQuestionRepositoryImpl {

    IQuestionRepository questionRepository;

    ITestRepository testRepository;

    IOptionRepositoryImpl optionRepositoryImpl;

    private Optional<QuestionEntity> isExists(QuestionModel question) {
        var entity = questionRepository
                .getByQuestionAndQuestionType(question.getQuestion(), question.getQuestionType());
        return Optional.ofNullable(entity);
    }
    @Override
    public QuestionEntity create(QuestionModel questionModel, TestEntity testEntity) {
        var oldEntity = isExists(questionModel);
        if (oldEntity.isPresent()) {
            return oldEntity.get();
        }

        var newEntity = new QuestionEntity(questionModel, testEntity);
        return questionRepository.save(newEntity);
    }

    @Override
    public QuestionEntity addToTest(QuestionModel questionModel, Integer testId) {
        var oldEntity = isExists(questionModel);
        if (oldEntity.isPresent()) {
            return oldEntity.get();
        }

        var test = testRepository.findById(testId);
        if (test.isEmpty()) {
            throw new IllegalArgumentException("Invalid test id: " + testId);
        }

        var newEntity = new QuestionEntity(questionModel, test.get());
        return questionRepository.save(newEntity);
    }

    @Override
    public QuestionEntityCollection createCollection(QuestionModelCollection questionModelCollection, TestEntity testEntity) {
        var questionEntityArray = questionModelCollection.getQuestionCollection().stream().map(question -> {
            var questionEntity = create(question, testEntity);
            var options = question.getOptions();
            if (options != null) {
                optionRepositoryImpl.createCollection(options, questionEntity);
            }

            return questionEntity;
        }).collect(Collectors.toCollection(ArrayList::new));

        return new QuestionEntityCollection(questionEntityArray);
    }

    @Override
    public QuestionEntity get(Integer id) {
        var entity = questionRepository.getById(id);
        return entity;
    }

    @Override
    public QuestionEntityCollection getAllByTest(Integer testId) {
        var testEntity = testRepository.getById(testId);
        if (testEntity == null) {
            throw new IllegalArgumentException("Invalid id: " + testId);
        }

        return questionRepository.getAllByTest(testEntity);
    }

    @Override
    public QuestionEntityCollection getAll() {
        var iterable = questionRepository.findAll();
        return new QuestionEntityCollection(mapper.map(iterable, Collection.class));
    }

    @Override
    public void delete(Integer id) {
        if (questionRepository.findById(id).isEmpty()) {
            throw new IllegalArgumentException("Invalid question id: " + id);
        }

        questionRepository.deleteById(id);
    }
}
