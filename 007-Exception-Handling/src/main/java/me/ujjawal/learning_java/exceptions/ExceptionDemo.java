package me.ujjawal.learning_java.exceptions;

import java.sql.SQLException;

public class ExceptionDemo {

    public static void main(String[] args){

        try {
            Employee employee = new Employee(1, "Prashanth", "SSDE");
            System.out.println(employee.getName());
            System.out.println(employee.getSalary() / 1);
            String value = doSomething(employee);
            try {
                ////
            } catch (Exception e) {
                //
            }
            ///
            ///
            ///
            //
            // }
        }catch (NullPointerException|ArithmeticException e){
            System.out.println("Please initilize employee");
        } catch (Exception e){
            ////
        }
        finally {
            System.out.println("This will be executed all the time");
        }


    }

    private static String doSomething(Employee employee) throws EmployeeAlreadyExistException {
        if(employee==null){
            throw new EmployeeAlreadyExistException();
        }
        return employee.getName();
    }
}
