package com.example.forms.repositories;

import com.example.forms.entities.AnswerEntity;
import com.example.forms.entities.QuestionEntity;
import com.example.forms.interfaces.repositories.IAnswerRepository;
import com.example.forms.interfaces.repositories.impls.IAnswerRepositoryImpl;
import com.example.forms.models.AnswerModel;
import com.example.forms.models.AnswerModelCollection;

public class AnswerRepositoryImpl implements IAnswerRepositoryImpl {

    private IAnswerRepository answerRepository;

    @Override
    public AnswerEntity create(AnswerModel answerModel, QuestionEntity questionEntity) {
        var entity = new AnswerEntity(answerModel, questionEntity);
        return answerRepository.save(entity);
    }

    @Override
    public AnswerModelCollection get(QuestionEntity questionEntity) {
        return answerRepository.getAllByQuestion(questionEntity);
    }
}
