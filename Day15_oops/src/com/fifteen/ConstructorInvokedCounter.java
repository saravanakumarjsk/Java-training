package com.fifteen;

public class ConstructorInvokedCounter {

    public static void main(String[] args) 
    {
        Employee d = new Employee(100, "sk", 3456);
        System.out.println(Employee.getEmployeeCount());

        Employee m = new Employee(219, "sk", 7656);
        System.out.println(Employee.getEmployeeCount());

        System.out.println("d salary is "+ d.computeSalary());
        System.out.println("m salary is "+ m.computeSalary());
        
        Employee.changeMinSalary(2000);
        System.gc();
        
        System.out.println("d salary is "+ d.computeSalary());
        System.out.println("m salary is "+ m.computeSalary());
    } 
}

class Employee {

    int empno;
    String name;
    float salary;
    static int min_sal = 5000;
    static int no_of_emp = 0;
    
    static 
    {
        min_sal = 5000;
        no_of_emp = 0;
    }
    
    Employee(int empno, String name, float salary)
    {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
        no_of_emp++;
    }
    
    float computeSalary()
    {
        if(salary > min_sal)
            return salary;
        else
            return min_sal;
        
    }
    static void changeMinSalary(int increment)
    {
        min_sal = min_sal + increment;
    }

    static int getEmployeeCount()
    {
        return no_of_emp;
    }
    

}
