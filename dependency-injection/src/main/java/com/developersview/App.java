package com.developersview;

import com.developersview.cars.Audi;
import com.developersview.cars.Innova;
import com.developersview.interfaces.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* Car newAudi = new Audi();
        Car newInnova=new Innova();
        System.out.println(newAudi.specs());
        System.out.println(newInnova.specs());*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car myCar = context.getBean("audi",Car.class);
        System.out.println(myCar.specs());
        context.close();

    }
}
