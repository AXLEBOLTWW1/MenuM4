package com.nov.catordogm4;

import java.util.ArrayList;
import java.util.List;

public class CatOrDogExpeert {
    List<String> getPorody(String color) {
        List<String> porody = new ArrayList<>();
        if (color.equals("Кошки")) {
            porody.add("Британские");
            porody.add("Дворовые");
        } else {
            porody.add("Корги");
            porody.add("Таксы");
        }
        return porody;
    }
}
