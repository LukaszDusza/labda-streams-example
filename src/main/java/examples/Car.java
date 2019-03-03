package examples;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {

    private String brand;
    private String model;
    private int power;

    public String getBrand(Car car) {
        System.out.println(car.getBrand());
        return car.getBrand();
    }

}
