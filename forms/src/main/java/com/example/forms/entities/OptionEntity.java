package com.example.forms.entities;

import com.example.forms.models.OptionModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "option_entity")
public class OptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("option")
    @Column(name = "option")
    private String option;

    @JsonProperty("trueAnswerFlag")
    @Column(name = "trueAnswerFlag")
    private boolean trueAnswerFlag;

    @ManyToOne
    @Column(name = "question_id", nullable = false)
    private QuestionEntity question;

    public OptionEntity(OptionModel optionModel, QuestionEntity questionEntity) {
        this.option = optionModel.getOption();
        this.trueAnswerFlag = optionModel.isTrueAnswerFlag();
        this.question = questionEntity;
    }

}
