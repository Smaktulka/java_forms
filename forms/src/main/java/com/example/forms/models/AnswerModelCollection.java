package com.example.forms.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerModelCollection {

    @JsonProperty("answerModelCollection")
    private Collection<AnswerModel> answerModelCollection;

}
