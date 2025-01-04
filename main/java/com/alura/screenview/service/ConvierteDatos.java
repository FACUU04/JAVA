package com.alura.screenview.service;

import com.alura.screenview.modelos.DataSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos{

    //Tratamos los datos que vienen de omdb
    private ObjectMapper objectMapper = new ObjectMapper();

//Este obtener datos nos retorna datos genericos
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json,clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
