package hw6.builder;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = WorkerBuilder.creteWorker()
                .name("Василий")
                .age(25)
                .salary(25000)
                .sex(WorkerSex.MALE)
                .createProgrammer()
                .mainLanguage("JAVA")
                .build();

        Driver driver = WorkerBuilder.creteWorker()
                .age(40)
                .name("Larisa")
                .sex(WorkerSex.FEMALE)
                .salary(50000)
                .createDriver()
                .id("QR125-17")
                .stage("15")
                .build();

        System.out.println(programmer);
        System.out.println(driver);
    }
}
