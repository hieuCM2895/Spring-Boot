package com.example.outfit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GirlConfig {

    @Bean("Shirt")
    public Outfit defaultOutfit() {
        return new Shirt();
    }
}
