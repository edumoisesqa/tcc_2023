package io.github.tcc_2023.clientes.model.entity.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Arrays;
import java.util.List;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApiErros {

@Getter
    private List<String> erros;

    public ApiErros(List<String> erros){
        this.erros = erros;
    }

    public ApiErros(String message){
        this.erros = Arrays.asList(message);
    }
}
