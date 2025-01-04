package com.alura.screenview.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//Esta propiedad ignora todos los campos que no hayan sido mapeados en la clase
@JsonIgnoreProperties(ignoreUnknown = true)
public record DataSerie(
        //Alias solo permite leer
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String evaluacion
        //Property permite leer y escribir@JsonProperty("")
) {

}
