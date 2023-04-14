package me.ujjawal.learning_java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1, 1);
        System.out.println(arrayList.contains(1));

        Collections.sort(arrayList, Collections.reverseOrder());
        for (int number: arrayList){
            System.out.println(number);
        }

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Dhruv", "SDE1", 10000));
        employees.add(new Employee(4, "Anubhav", "SDE1", 15000));
        employees.add(new Employee(2, "Prashanth", "SSDE", 20000));
        Collections.sort(employees);
        for(Employee employee: employees){
            System.out.println(employee);
        }

        Collections.sort(employees, new SalaryComparator());
        for(Employee employee: employees){
            System.out.println(employee);
        }

    }
}
