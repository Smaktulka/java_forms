package com.example.forms.entities;

import com.example.forms.models.AnswerModelCollection;
import com.example.forms.models.OptionModelCollection;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question_entity")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("question")
    @Column(name = "question")
    private String question;

    @ManyToOne
    @Column(name = "test_entity_id")
    private TestEntity test;
}
