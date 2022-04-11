package com.neo4j.poc.repository;

import com.neo4j.poc.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User, String> {
}
