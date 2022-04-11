package com.neo4j.poc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    String movieId;
    String movieName;
    String movieRating;

}
