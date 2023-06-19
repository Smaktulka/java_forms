package com.example.forms.interfaces.repositories;

import com.example.forms.entities.OptionEntity;
import com.example.forms.entities.QuestionEntity;
import com.example.forms.models.OptionModelCollection;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;

public interface IOptionRepository extends JpaRepository<OptionEntity, Integer> {
    OptionModelCollection getAllByQuestion(QuestionEntity questionEntity);

    OptionModelCollection getAllByQuestionIdAndTrueAnswerFlagIsTrue(Integer questionId);
}
