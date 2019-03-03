package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        Car car = new Car();

        List<Car> cars = Arrays.asList(

                Car.builder()
                        .brand("Volvo")
                        .model("S60")
                        .power("190")
                        .build(),

                Car.builder()
                        .brand("Volvo")
                        .model("V60")
                        .power("220")
                        .build(),

                Car.builder()
                        .brand("Fiat")
                        .model("Punto")
                        .power("80")
                        .build()
        );

        //example1
        cars.forEach(car::getBrand);

        //example2


    }


}
