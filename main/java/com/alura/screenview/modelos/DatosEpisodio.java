package com.alura.screenview.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosEpisodio(
         @JsonAlias("Season") Integer temporada,
        @JsonAlias("Episode") Integer numeroEpisodio,
        @JsonAlias("Title") String titulo,
        @JsonAlias("imdbRating") String evaluacion,
        @JsonAlias("Released") String fechaLanzamiento
) {
}
