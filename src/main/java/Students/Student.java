package Students;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private Long rollNo;
    private Integer age;
    private LocalDate dob;
    private String email;

    public Student(){

    }

    public Student(Long id,String name,Long rollNo, Integer age, LocalDate dob,String email ){
         this.id = id;
         this.name = name;
         this.rollNo = rollNo;
         this.age = age;
         this.dob = dob;
         this.email = email;

    }

    public Student(String name,Long rollNo, Integer age, LocalDate dob,String email ){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.dob = dob;
        this.email = email;
        
   }

   public Long getId(){
    return id;
   }

   public void setId(Long id){
    this.id = id;
   }
   public String getName(){
    return name;
   }

   public void setName(String name){
    this.name = name;
   }
   public Long getRollNo(){
    return rollNo;
   }

   public void setRollNo(Long rollNo){
    this.rollNo = rollNo;
   }
   public Integer getAge(){
    return age;
   }

   public void setAge(Integer age){
    this.age = age;
   }
   public LocalDate getDOB(){
    return dob;
   }

   public void setDOB(LocalDate dob){
    this.dob = dob;
   }
   public String getEmail(){
    return email;
   }

   public void setEmail(String email){
    this.email = email;
   }
   @Override
   public String toString(){
     return "Student Details:{ ID is " +id +" \nName is " +name +"\nAge of the Student is " +age +"\nEmail of the Student is "+email;
   }


}

