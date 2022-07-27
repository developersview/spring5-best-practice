package com.developersview.cars;

import com.developersview.interfaces.Car;
import org.springframework.stereotype.Component;

/**
 * @author pranoy.chakraborty
 * @Date 27/07/22
 */
@Component("audi")
public class Audi implements Car {
    @Override
    public String specs() {
        return "Hatchback from Audi";
    }
}
