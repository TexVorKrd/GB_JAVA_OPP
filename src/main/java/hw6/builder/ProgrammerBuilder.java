package hw6.builder;

public class ProgrammerBuilder {

    Programmer programmer;

    public ProgrammerBuilder(Worker worker) {
        programmer = new Programmer();
        this.programmer.setAge(worker.getAge());
        this.programmer.setName(worker.getName());
        this.programmer.setSex(worker.getSex());
        this.programmer.setSalary(worker.getSalary());
    }


    public ProgrammerBuilder mainLanguage(String language) {
        programmer.setMainLanguage(language);
        return this;
    }

    public Programmer build() {
        return programmer;
    }
}
