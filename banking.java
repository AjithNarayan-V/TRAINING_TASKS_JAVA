abstract class salary {
    int salary;
    String name;
    int id;
    String department;
    int no_of_days;

    salary(String name, int id, String department, int no_of_days) {

        this.name = name;   
        this.id = id;
        this.department = department;
        this.no_of_days = no_of_days;
    }

    abstract void getsalary();

    abstract String getCompanyName();

    void getprofile() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("No of days: " + no_of_days);
        getsalary();
        System.out.println("Company Name: " + getCompanyName());
        System.out.println("Object reference: " +getClass().getName());


    }

    protected int getWorkingDays() {
        return no_of_days;
    }
}

class DepartmentStaff extends salary {
    DepartmentStaff(String name, int id, String description, int no_of_days) {
        super(name, id, description, no_of_days);
    }

    @Override
    void getsalary() {
        super.salary = super.no_of_days * 1000;
        System.out.println("Salary of Department Staff: " + super.salary);
    }

    @Override
    String getCompanyName() {
        return "KCG";
    }

}

class NonTechStaff extends salary {

    NonTechStaff(String name, int id, String department, int no_of_days) {
        super(name, id, department, no_of_days);
    }

    @Override
    void getsalary() {
        super.salary = super.no_of_days * 800;
        System.out.println("Salary of Non Teaching Staff: " + super.salary);
    }

    @Override
    String getCompanyName() {
        return "KCG";
    }
}

class office extends salary {

    office(String name, int id, String department, int no_of_days) {
        super(name, id, department, no_of_days);

    }

    @Override
    void getsalary() {
        super.salary = super.no_of_days * 700;
        System.out.println("Salary of Office Staff: " + super.salary);
    }

    @Override
    String getCompanyName() {
        return "KCG";
    }

}

class StoreManager extends salary {

    StoreManager(String name, int id, String department, int no_of_days) {
        super(name, id, department, no_of_days);

    }

    @Override
    void getsalary() {
        super.salary = super.no_of_days * 500;
        System.out.println("Salary of Store Managing Staff: " + super.salary);
    }

    @Override
    String getCompanyName() {
        return "KCG";   
    }

}

public class banking {
    public static void main(String[] args) {
        System.out.println("=================================Details================================");
        DepartmentStaff departmentStaff = new DepartmentStaff("kiruthik", 123456, "CSE", 30);
        departmentStaff.getprofile();
        System.out.println("----------------------------------------------------------------");
        NonTechStaff nonTechStaff = new NonTechStaff("divyan", 123456, "IT", 30);
        nonTechStaff.getprofile();
        System.out.println("----------------------------------------------------------------");

        office officeStaff = new office("ravi", 123456, "CSE", 30);
        officeStaff.getprofile();
        System.out.println("----------------------------------------------------------------");

        StoreManager storeManager=new StoreManager("ram",12443,"store",30);
        storeManager.getprofile();
        System.out.println("================================================================");

    }

}
