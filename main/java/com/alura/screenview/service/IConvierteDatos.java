package com.alura.screenview.service;

public interface IConvierteDatos {
    //Las doble T, indican a java que estamos trabajando con datos genericos, esto
    //para no tener que crear metodos para cada dato

    <T> T obtenerDatos(String json, Class<T> clase);
}
