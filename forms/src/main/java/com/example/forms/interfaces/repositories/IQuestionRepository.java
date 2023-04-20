package com.example.forms.interfaces.repositories;

import com.example.forms.entities.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionRepository extends JpaRepository<QuestionEntity, Integer> {

}
