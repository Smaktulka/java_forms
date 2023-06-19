package com.example.forms.interfaces.repositories;

import com.example.forms.entities.QuestionEntity;
import com.example.forms.entities.TestEntity;
import com.example.forms.enums.QuestionType;
import com.example.forms.models.QuestionEntityCollection;
import com.example.forms.models.QuestionModelCollection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionRepository extends JpaRepository<QuestionEntity, Integer> {
    QuestionEntityCollection getAllByTest(TestEntity testEntity);

    QuestionEntity getByQuestionAndQuestionType(String question, QuestionType questionType);
}
