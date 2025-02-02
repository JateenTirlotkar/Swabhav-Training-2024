package Builder.test;

import Builder.model.Car;
import Builder.model.CarBuilder;
import Builder.model.CarDirector;

public class CarTest {
    public static void main(String[] args) {
    	CarDirector director = new CarDirector();
    	CarBuilder builder = new CarBuilder();
    	director.buildBuggati(builder);
    	Car car = builder.build();
    	System.out.println(car);
    	
    	director.buildFord(builder);
    	Car car1=builder.build();
    	System.out.println(car1);
    	
    	
    	//Without Director   	
//        Car car = new CarBuilder()
//        		.brand("Ford")
//                .color("Red")
//                .year(2020)
//                .engine("V8")
//                .isAutomatic(true)
//                .build();
//
//        System.out.println(car);
    }
}

