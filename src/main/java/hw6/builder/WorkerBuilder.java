package hw6.builder;

public class WorkerBuilder {
    private static WorkerBuilder instanse;

    Worker worker;

    public WorkerBuilder() {
    }

    public static WorkerBuilder creteWorker() {
        if (instanse == null) {
            instanse = new WorkerBuilder();
            instanse.worker = new Worker();
        }
        return instanse;
    }

    public WorkerBuilder age(Integer age) {
        worker.setAge(age);
        return this;
    }

    public WorkerBuilder name(String name) {
        worker.setName(name);
        return this;
    }

    public WorkerBuilder sex(WorkerSex sex) {
        worker.setSex(sex);
        return this;
    }

    public WorkerBuilder salary(Integer salary) {
        worker.setSalary(salary);
        return this;
    }

    public ProgrammerBuilder createProgrammer() {
        return new ProgrammerBuilder(worker);
    }

    public DriverBuilder createDriver() {
        return new DriverBuilder(worker);
    }

}
