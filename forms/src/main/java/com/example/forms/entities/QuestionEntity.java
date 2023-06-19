package com.example.forms.entities;

import com.example.forms.enums.QuestionType;
import com.example.forms.models.AnswerModelCollection;
import com.example.forms.models.OptionModelCollection;
import com.example.forms.models.QuestionModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Check;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question_entity")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("question")
    @Column(name = "question")
    private String question;

    @JsonProperty("questionType")
    @Column(name = "question_type")
    private QuestionType questionType;

    @ManyToOne
    @Column(name = "test_id")
    private TestEntity test;

    public QuestionEntity(QuestionModel questionModel, TestEntity testEntity) {
        this.question = questionModel.getQuestion();
        this.questionType = questionModel.getQuestionType();
        this.test = testEntity;
    }
}
