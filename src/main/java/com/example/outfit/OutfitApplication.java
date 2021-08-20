package com.example.outfit;

import com.example.test.NestedObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OutfitApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OutfitApplication.class, args);

        GirlFriend girlFriend = context.getBean(GirlFriend.class);

        girlFriend.outfit.wear();
        girlFriend.hairStyle.hairStyle();
        girlFriend.accessories.accessories();

        NestedObject nestedObject = context.getBean(NestedObject.class);
        nestedObject.display();


    }

}
