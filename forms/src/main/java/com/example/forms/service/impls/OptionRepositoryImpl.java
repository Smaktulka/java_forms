package com.example.forms.service.impls;

import com.example.forms.entities.OptionEntity;
import com.example.forms.entities.QuestionEntity;
import com.example.forms.interfaces.repositories.IOptionRepository;
import com.example.forms.interfaces.repositories.impls.IOptionRepositoryImpl;
import com.example.forms.models.OptionEntityCollection;
import com.example.forms.models.OptionModel;
import com.example.forms.models.OptionModelCollection;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import javax.swing.text.html.Option;
import java.util.Optional;


@AllArgsConstructor
public class OptionRepositoryImpl implements IOptionRepositoryImpl{

    IOptionRepository optionRepository;

    private Optional<OptionEntity> isExists(OptionModel optionModel) {

    }
    @Override
    public OptionEntity create(OptionModel optionModel, QuestionEntity questionEntity) {

        var entity = new OptionEntity(optionModel, questionEntity);
        return optionRepository.save(entity);
    }

    @Override
    public OptionEntityCollection createCollection(OptionModelCollection options, QuestionEntity questionEntity) {
        var optionEntityArray = options.getOptionModelCollection().stream().map(option -> {

        })
    }

    @Override
    public OptionModelCollection get(QuestionEntity questionEntity) {
        return optionRepository.getAllByQuestion(questionEntity);
    }
}
