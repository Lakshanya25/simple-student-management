
import java.util.ArrayList;
import java.util.Scanner;

public class Organiser {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Std> students = new ArrayList<>();

    public void add(Std student){
        students.add(student);
    }

    public void display(){
        for(Std student : students){
            System.out.println(student);
        }
    }

    public void delete(int index){
        if(index>= 0 && index<students.size()){
            students.remove(index);
        } else{
            System.out.println("Invalid");
        }
    }

    public void update(int index, String name){
        if(index>= 0 && index<students.size()){
            Std student = students.get(index);
            student.setName(name);
        } else{
            System.out.println("Invalid");
        }
    }

    public void  search(){
        System.out.println("Enter id to search: ");
       
        int searchId = sc.nextInt();
        boolean found = false;

        for(Std student: students){
            if(student.getId() == searchId){
                System.out.println("Student found: " +student.getName());
                return;
            } 
            }
            System.out.println("not found");
    }

    public static void main(String ar[]){
        Organiser org = new Organiser();

        org.add(new Std("Taylor Swift", 13, "A", 89));
        org.add(new Std("Chloe",13,"B",88));
        org.add(new Std("Sam",13,"B",78));

        org.display();

        org.search();
        org.update(1, "Sophia");
        org.display();
        org.delete(2);
        org.display();

    }
    
}
