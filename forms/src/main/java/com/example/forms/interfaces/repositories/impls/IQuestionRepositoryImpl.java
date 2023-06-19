package com.example.forms.interfaces.repositories.impls;

import com.example.forms.entities.QuestionEntity;
import com.example.forms.entities.TestEntity;
import com.example.forms.models.QuestionEntityCollection;
import com.example.forms.models.QuestionModel;
import com.example.forms.models.QuestionModelCollection;
import com.example.forms.models.TestModel;
import org.modelmapper.ModelMapper;

public interface IQuestionRepositoryImpl {

    ModelMapper mapper = new ModelMapper();

    QuestionEntity create(QuestionModel questionModel, TestEntity testEntity);

    QuestionEntity addToTest(QuestionModel questionModel, Integer testId);

    QuestionEntityCollection createCollection(QuestionModelCollection questionModelCollection, TestEntity testEntity);

    QuestionEntity get(Integer id);

    QuestionEntityCollection getAllByTest(Integer Id);

    QuestionEntityCollection getAll();

    void delete(Integer id);
}
