package com.example.forms.controllers;

import com.example.forms.entities.TestEntity;
import com.example.forms.interfaces.repositories.impls.ITestRepositoryImpl;
import com.example.forms.models.TestEntityCollection;
import com.example.forms.models.TestModel;
import com.example.forms.models.TestQuestionsModel;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/test")
public class TestController {

    ITestRepositoryImpl testRepositoryImpl;

    @PostMapping(value = "/create")
    public ResponseEntity<TestEntity> createTest(@RequestBody TestModel testModel) {
        var result = testRepositoryImpl.create(testModel);
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<TestQuestionsModel> getTest(@PathVariable int id) {
        var result = testRepositoryImpl.get(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<TestEntityCollection> getAllTests() {
        var result = testRepositoryImpl.getAll();
        return ResponseEntity.ok(result);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteTestById(@PathVariable Integer id) {
        testRepositoryImpl.delete(id);
        return ResponseEntity.ok("Test with id - " + id.toString() + " is deleted.");
    }
}
