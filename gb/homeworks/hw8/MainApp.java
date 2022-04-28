package homeworks.hw8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        // task #1
        String[] strings = {"Hi", "Buy", "Ok", "Good", "Bad", "Good", "Ok", "Hi", "Ok"};
        Arrays.stream(strings)
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .values().stream().max(Comparator.comparingInt(Long::intValue)).ifPresent(System.out::println);

        // task #2
        Employee[] employees = {new Employee("Ivan", 39, 8200.0),
                new Employee("Igor", 39, 8200.0),
                new Employee("Elsa", 28, 4500.0),
                new Employee("Egor", 19, 6300.0),
                new Employee("Ilya", 76, 2300.0),
                new Employee("Lisa", 43, 2500.0),
                new Employee("Emma", 32, 6300.0),
                new Employee("Efim", 52, 4700.0),
                new Employee("Olga", 27, 2300.0),
                new Employee("Petr", 36, 8100.0)};
        double averageSalary = Arrays.stream(employees)
                .mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println("Average salary: " + averageSalary);

        // task #3
        int count = 3;
        String old = Arrays.stream(employees).sorted((e1, e2) -> e2.getAge() - e1.getAge())
                .limit(3)
                .map(Employee::getName)
                .collect(Collectors.joining(", ", "The oldest employees: ", "."));
        System.out.println(old);
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }
}
