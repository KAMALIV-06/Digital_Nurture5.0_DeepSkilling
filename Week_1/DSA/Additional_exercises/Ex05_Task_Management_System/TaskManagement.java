public class TaskManagement{
 Task head;
 void add(int id,String n,String s){ Task t=new Task(id,n,s); t.next=head; head=t; }
 void traverse(){ for(Task c=head;c!=null;c=c.next) System.out.println(c.taskName); }
 public static void main(String[] args){
  TaskManagement tm=new TaskManagement(); tm.add(1,"Design","Pending"); tm.traverse();
 }
}