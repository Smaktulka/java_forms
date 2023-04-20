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
public class AnswerQuestionIdModel {

    @JsonProperty("modelId")
    private Integer modelId;

    @JsonProperty("answerModelCollection")
    private AnswerModelCollection answerModelCollection;

}
