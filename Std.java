public class Std {
   private String name;
   private int age;
   private String grade;
   private int id;

   Std(String name, int age, String grade, int id){
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.id = id;
   }

   public String getName(){
    return name;
   }
   public void setName(String name){
    this.name = name;
   }

   public String getGrade(){
    return grade;
   }
   public void setGrade(String grade){
    this.grade = grade;
   }

   public int getAge(){
    return age;
   }
   public void setAge(int age){
    this.age = age;
   }

   public int getId(){
    return id;
   }
   public void setId(int id){
    this.id = id;
   }
   @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Grade: " + grade + ", Age: " + age;
    }
}
