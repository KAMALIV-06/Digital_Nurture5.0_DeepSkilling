public class EmployeeManagement{
 static Employee[] employees=new Employee[10]; static int count=0;
 static void add(Employee e){employees[count++]=e;}
 static int search(int id){for(int i=0;i<count;i++) if(employees[i].employeeId==id) return i; return -1;}
 public static void main(String[] args){ add(new Employee(1,"John","Dev",50000)); System.out.println("Employee Added");}
}