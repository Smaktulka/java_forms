package com.example.forms.interfaces.repositories;

import com.example.forms.entities.AnswerEntity;
import com.example.forms.entities.QuestionEntity;
import com.example.forms.models.AnswerModelCollection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnswerRepository extends JpaRepository<AnswerEntity, Integer> {

    AnswerModelCollection getAllByQuestion(QuestionEntity questionEntity);

}
