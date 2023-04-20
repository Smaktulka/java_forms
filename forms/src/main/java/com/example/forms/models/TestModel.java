package com.example.forms.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TestModel {

    @JsonProperty("testName")
    String testName;

    @Nullable
    @JsonProperty("questionAnswerCollection")
    private QuestionModelCollection questions;

}
