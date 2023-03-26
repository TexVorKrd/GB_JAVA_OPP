package hw6.builder;

public class DriverBuilder {

    Driver driver;

    public DriverBuilder(Worker worker) {
        driver = new Driver();
        this.driver.setAge(worker.getAge());
        this.driver.setName(worker.getName());
        this.driver.setSex(worker.getSex());
        this.driver.setSalary(worker.getSalary());
    }

    public DriverBuilder id(String driverId) {
        driver.setDriverId(driverId);
        return this;
    }

    public DriverBuilder stage(String stage) {
        driver.setDrivingStage(stage);
        return this;
    }


    public Driver build() {
        return driver;
    }

    @Override
    public String toString() {
        return "DriverBuilder{" +
                "driver=" + driver +
                '}';
    }
}
