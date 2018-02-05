package ua.immutables.demo.sample2;

public class Builders {
    void buildCar(CarBuilder builder, int move, boolean stop) {
        Car car = builder.build();
    }
}
