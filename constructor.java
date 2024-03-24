class Employee {
    String name;
    int id;
    int age;
    int no_of_working_days;
    long per_day_salary;
    long monthly_salary;

    Employee(String name, int id, int age, int no_of_working_days, long per_day_salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.no_of_working_days = no_of_working_days;
        this.per_day_salary = per_day_salary;
        System.out.println( calculate(no_of_working_days, per_day_salary));
    }

    long calculate(long no_of_working_days, long per_day_salary) {
        return no_of_working_days * per_day_salary;
    }
}

public class constructor {

    public static void main(String[] args){
        Employee employee = new Employee("kiruthik",123,21,20,500);
        


        
    }
}