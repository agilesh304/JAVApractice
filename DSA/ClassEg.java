class Employee{
    int id;
    String name;
    double salary;
    static int count;
    static int getcount(){
        return count;
    }
    

    Employee(){
        id = 0;
        name = "XXXX";
        salary = 0000;
        count++;
    }
    Employee(int i , String n, double s){
        id = i;
        name = n;
        salary = s;
        count++;
    }

    void setdata(int i, String n,double s ){
        id = i;
        name = n;
        salary = s;

    }
    void incsal(double inc){
        salary+= inc;
    }
    void putdata(){
        // System.out.println(id);
        // System.out.println(name);
        // System.out.println(salary);
        
        System.out.println(id + " " + name + " " + salary);
    }
}



public class ClassEg {
    public static void main(String[] args) {

        System.out.println("ID"+ " " + "Name" + " " + "Salary");
        Employee e = new Employee();
        e.setdata(4,"Raja",80000);
        //Employee.getcount();
        e.putdata();

        Employee e2 = new Employee(10,"Rajini",100000);
        //Employee.getcount();
        e2.putdata();
        System.out.println("\n");
        System.out.println("Number of Employees : "+ Employee.getcount());

        //System.out.println(e.id + " " + e.name + " " + e.salary);
        // e.setdata(4,"Raja",80000);
        // e.putdata();
        // e.incsal(2000);
        // e.putdata();
        // e.id = 3;
        // e.name = "Agilesh";
        // e.salary = 70000.00;
        // System.out.println("ID"+ " " + "Name" + " " + "Salary");
        // System.out.println(e.id + " " + e.name + " " + e.salary);
      
    }
    
}
 