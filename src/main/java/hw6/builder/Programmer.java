package hw6.builder;

import lombok.Setter;

@Setter
public class Programmer extends Worker {
    String mainLanguage;

    public Programmer() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "Programmer{" +
                "mainLanguage='" + mainLanguage + '\'' +
                '}';
    }
}
