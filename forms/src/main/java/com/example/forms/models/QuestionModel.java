package com.example.forms.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.annotation.Nullable;
import lombok.*;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionModel {

    @JsonProperty("question")
    private String question;

    @JsonProperty("options")
    private OptionModelCollection options;

    @Nullable
    @JsonProperty("answers")
    private AnswerModelCollection answers;

}
