package com.developersview.cars;

import com.developersview.interfaces.Car;

/**
 * @author pranoy.chakraborty
 * @Date 27/07/22
 */
public class Audi implements Car {
    @Override
    public String specs() {
        return "Hatchback from Audi";
    }
}
