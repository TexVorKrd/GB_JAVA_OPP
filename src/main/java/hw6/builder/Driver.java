package hw6.builder;

import lombok.Setter;

@Setter
public class Driver extends Worker {

    private String driverId;
    private String drivingStage;

    public Driver() {

    }

    @Override
    public String toString() {
        return super.toString() +
                "Driver{" +
                "driverId='" + driverId + '\'' +
                ", drivingStage='" + drivingStage + '\'' +
                '}';
    }
}
