import java.util.Scanner;

class temp {
    int id,salary;
    String name;
    int no_of_days;
    Scanner sc =new Scanner(System.in);
    temp(int id,String name,int no_of_days){   
        this.id=id;
        this.name=name;
        this.no_of_days=no_of_days;
        // this.salary=salary; 
    }
     int getsalary(){
       
        return salary*no_of_days;
     }
   

    
}
class staff extends temp{
    String role;
    String deptname;
    int experience;
    Scanner sc =new Scanner(System.in);
    staff(int id,String name,String role,String deptname,int salary, int workdays){
        super( id, name, workdays);
        this.salary=salary;
        this.deptname=deptname;
        this.id=id;
        this.name=name;
       this.role=role;
    }
    void getdetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("department: "+deptname);
        System.out.println("role: "+role);
        System.out.println("Salary: "+getsalary());
    }
   
}
class Employee{
    public static void main(String[] args) {
        staff obj=new staff(1,"ajith","SDE","CSE",1000,20);
        obj.getdetails();
        
    }
}
