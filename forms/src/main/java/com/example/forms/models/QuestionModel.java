package com.example.forms.models;


import com.example.forms.enums.QuestionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionModel {

    @JsonProperty("question")
    private String question;

    @JsonProperty("questionType")
    private QuestionType questionType;

    @JsonProperty("options")
    private OptionModelCollection options;

}
