package hw6.builder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Worker {
    private String name;
    private int age;
    private WorkerSex sex;
    private int salary;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", salary=" + salary +
                '}';
    }
}
