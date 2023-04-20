package com.example.forms.interfaces.repositories.impls;

import com.example.forms.entities.AnswerEntity;
import com.example.forms.entities.QuestionEntity;
import com.example.forms.models.AnswerModel;
import com.example.forms.models.AnswerModelCollection;
import com.example.forms.models.QuestionModel;

public interface IAnswerRepositoryImpl {
    AnswerEntity create(AnswerModel answerModel, QuestionEntity questionEntity);

    AnswerModelCollection get(QuestionEntity questionEntity);
}
