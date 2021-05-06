package javalab3;
public class Student {
   String ID;
   String stdName;
   double cgpa;
   public void completeReg(String ID, String name){
     this.ID=ID;
     stdName=name;
     cgpa=0.0;
   }
 public void display(){
      System.out.println("\nId:   "+ID);
      System.out.println("\nName: "+stdName);
      System.out.println("\nCGPA: "+cgpa);
  } 
public void getMarks(double algo, double db, double java){
   double algoGPA=0.0;
    double javaGPA=0.0;
    double dbGPA=0.0;
       if(algo>=80)
          algoGPA=4.0;
       else if(algo>=70)
           algoGPA=3.0;
       if(java>=80)
           javaGPA=4.0;
       else if(java>=70)
           javaGPA=3.0;
        if(db>=80)
           dbGPA=4.0;
         else if(db>=70)
           dbGPA=3.0;
 
      cgpa=(algoGPA+dbGPA+javaGPA)/3;  
   }
}