package com.example.forms.interfaces.repositories.impls;

import com.example.forms.entities.OptionEntity;
import com.example.forms.entities.QuestionEntity;
import com.example.forms.models.OptionModel;
import com.example.forms.models.OptionModelCollection;
import com.example.forms.models.QuestionModel;

public interface IOptionRepositoryImpl {
    OptionEntity create(OptionModel optionModel, QuestionEntity questionEntity);

    OptionModelCollection get(QuestionEntity questionEntity);
}
