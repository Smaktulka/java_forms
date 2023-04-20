package com.example.forms.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping(value = "/newSurvey")
    public ResponseEntity<SurveyModel> createNewSurvey(@RequestBody SurveyModel surveyModel) {


        return ResponseEntity.ok().body(new SurveyModel());
    }

}
