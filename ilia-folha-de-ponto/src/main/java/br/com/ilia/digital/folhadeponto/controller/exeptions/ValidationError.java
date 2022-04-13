package br.com.ilia.digital.folhadeponto.controller.exeptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends Message {
    private static final long serialVersionUID = 1L;
    
    private List<FieldMessage> erros = new ArrayList<>();
    
    public ValidationError(String msg) {
        super(msg);
    }

    public List<FieldMessage> getErrors() {
        return erros;
    }

    public void addError(String fieldName, String message) {
        erros.add(new FieldMessage(fieldName, message));
    }

}