package br.com.ilia.digital.folhadeponto.service.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.ilia.digital.folhadeponto.controller.exeptions.FieldMessage;
import br.com.ilia.digital.folhadeponto.models.dto.MomentoDTO;


public class MomentoInsertValidator implements ConstraintValidator<MomentoInsert, MomentoDTO> {

    @Override
    public void initialize(MomentoInsert ann) {
    }

    @Override
    public boolean isValid(MomentoDTO objDto, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();
        

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }
        return list.isEmpty();
    }
}