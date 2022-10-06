package com.example.Springbootapijwtactivemq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springbootapijwtactivemq.entity.Token;


public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
