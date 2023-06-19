package com.example.forms.entities;

import com.example.forms.models.TestModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "test_entity")
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("testName")
    @Column(name = "test_name")
    private String testName;



    public TestEntity(TestModel testModel) {
        this.testName = testModel.getTestName();
    }
}
