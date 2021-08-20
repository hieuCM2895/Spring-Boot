package com.example.outfit;

import org.springframework.stereotype.Component;

@Component
public class AccessoriesImpl implements Accessories{

    @Override
    public void accessories() {
        System.out.println("Gucci accessories");
    }
}
