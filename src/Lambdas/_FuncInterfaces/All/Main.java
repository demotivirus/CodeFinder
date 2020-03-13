package Lambdas._FuncInterfaces.All;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>(){{
            add(new Employee("Smith", 32, 64500));
            add(new Employee("Akon", 48, 83120));
            add(new Employee("Ling", 23, 77500));
        }};

        System.out.println(findMatch(list, employee -> employee.getSalary() > 80000));
        System.out.println("Total salary " + calcSalaryOrAge(list, employee -> employee.getSalary()));
        System.out.println("Total age " + calcSalaryOrAge(list, Employee::getAge));

        BinaryOperator<Integer> combiner = Math::max;
        System.out.println(combine(list, 0, Employee::getSalary, combiner));

        list.forEach(employee -> employee.setSalary(employee.getSalary() * 11/10)); //CONSUMER
        list.forEach(System.out::println); //CONSUMER
        System.out.println(list);

        System.out.println("Total salary now: " + calcSalaryOrAge(list, Employee::getSalary));
    }

    private static <T> T findMatch(List<T> find, Predicate<T> predicate){
        for (T t : find){
            if (predicate.test(t))
                return t;
        }
        return null;
    }

    private static <T> int calcSalaryOrAge(List<T> list, Function<T, Integer> function){
        int sum = 0;
        for (T t : list)
            sum += function.apply(t);
        return sum;
    }

    private static <T, R> R combine(List<T> list, R zeroElement, Function<T, R> function, BinaryOperator<R> combiner){
        for (T t : list)
            zeroElement = combiner.apply(zeroElement, function.apply(t));
        return zeroElement;
    }
}
