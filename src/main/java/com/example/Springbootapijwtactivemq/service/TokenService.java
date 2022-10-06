package com.example.Springbootapijwtactivemq.service;

import com.example.Springbootapijwtactivemq.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
    
}
