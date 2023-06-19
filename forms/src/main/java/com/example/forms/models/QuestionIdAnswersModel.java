package com.example.forms.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionIdAnswersModel {

    @JsonProperty("questionId")
    private Integer questionId;

    @JsonProperty("answerModelCollection")
    private AnswerModelCollection answerModelCollection;


}
