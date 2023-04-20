package com.example.forms.interfaces.repositories.impls;

import com.example.forms.entities.QuestionEntity;
import com.example.forms.entities.TestEntity;
import com.example.forms.models.QuestionModel;
import com.example.forms.models.QuestionModelCollection;
import com.example.forms.models.TestModel;

public interface IQuestionRepositoryImpl {

    QuestionEntity create(QuestionModel questionModel, TestEntity testEntity);

    QuestionModelCollection get(TestEntity testEntity);

}
