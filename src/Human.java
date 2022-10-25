public class Human {
    String firstName;
    String lastName;

    Animal pet;
    Integer yearOfBirth;
    Car car;

    private double salary = 100;

    public double getSalary() {
        System.out.println(salary);
        return this.salary;

    }

    public double setSalary(double salary) {
        this.salary = salary;
        if (salary < 0) {
            System.out.println("Yeah sure... steal from me, u cant do this");
        }
        else{
            System.out.println("Thats good");
        }

        System.out.println("New data was sent to the bookkeeping");
        System.out.println("Hot Mrs 'Jadzia' wants to give you... (drumssss) annex to the contract");
        System.out.println("Zus and US already khows yours salary dont be an idiot");
        return this.salary;
    }


}
