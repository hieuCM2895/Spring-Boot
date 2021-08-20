package com.example.outfit;

import org.springframework.stereotype.Component;

@Component
public class HairStyleImpl implements HairStyle{

    @Override
    public void hairStyle() {
        System.out.println("Korea Hair style");
    }
}
