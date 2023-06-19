package com.example.forms.entities;

import com.example.forms.models.AnswerModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "answer_entity")
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("option")
    @Column(name = "option")
    private String option;

    @ManyToOne
    @Column(name = "user_id")
    private UserEntity user_id;

    @ManyToOne
    @Column(name = "question_id", nullable = false)
    private QuestionEntity question;

    public AnswerEntity(AnswerModel answerModel, QuestionEntity questionEntity) {
        this.option = answerModel.getAnswer();
        this.question = questionEntity;
    }

}
