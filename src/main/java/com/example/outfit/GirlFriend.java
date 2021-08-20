package com.example.outfit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {

    public Outfit outfit;
    public Accessories accessories;
    public HairStyle hairStyle;

    @Autowired
    public GirlFriend(@Qualifier("Shirt") Outfit outfit, Accessories accessories, HairStyle hairStyle) {
        this.outfit = outfit;
        this.accessories = accessories;
        this.hairStyle = hairStyle;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public Accessories getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessories accessories) {
        this.accessories = accessories;
    }

    public HairStyle getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(HairStyle hairStyle) {
        this.hairStyle = hairStyle;
    }
}
