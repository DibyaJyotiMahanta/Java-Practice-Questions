class Employee{
    int salary;
    String name;
    void getName(){
        System.out.println("Name is "+name);
    }
    void getSalary(){
        System.out.println("Salary is "+salary);
    }
    void setName(String name){
        this.name=name;
        System.out.println("Name is updated");
    }
}
public class function {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary=2000;
        e.name = "Ramu Kaka";
        e.getName();
        e.getSalary();
        e.setName("Raju kaka");
        e.getName();

    }
}
