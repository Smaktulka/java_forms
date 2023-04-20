package com.example.forms.interfaces.repositories;

import com.example.forms.entities.OptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;

public interface IOptionRepository extends JpaRepository<OptionEntity, Integer> {
}
