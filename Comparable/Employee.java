package Java.Comparable;

public class Employee implements Comparable<Employee>{
    private String name;
    private String phoneNo;
    private int empId;

    Employee(String name, String phoneNo, int empId){
        this.name = name;
        this.phoneNo = phoneNo;
        this.empId = empId;
    }

    @Override
    public int compareTo(Employee e) {
        // TODO Auto-generated method stub
        return this.empId  - e.empId;
    }
    public String getName(){
        return name;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public int empId(){
        return empId;
    }

    public String toString(){
        return "Employee{" +
            "name : " + name + " phoneNo : " + phoneNo + " empId : " + empId + "}\n";
    }
 
}
