package com.neo4j.poc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.neo4j.core.schema.Id;

import java.util.List;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    String userId;
    String userName;
    String userEmail;
    String userMobile;
    @Relationship
    List<Movie> movies;


}
