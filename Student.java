import java.util.*;
public class Student{
    public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             int count=0;
        for (int i=1;i<=5;i++){

            System.out.print("Enter Students Name: ");
            String name=sc.next();
            int marks;
            while (true) {
                System.out.print("Enter Marks(0-100): ");
                     marks=sc.nextInt(); 
                if(marks>0 && marks<=100){                    
                     break;
                }else{
                    System.out.println("Invalid Marks!");
                    
                }
            }           
            System.out.print("Family Monthly Income: ");
            double income=sc.nextDouble();
               
            String categary;            
             
            if(marks>=85 && marks<=100 && income<100000 ){                
                categary="Full Scholarship...!";
                count++;
            }else if(marks>=70 && marks<=84 && income<150000){
                categary="Half Scholarship...!";
                count++;
            }else if(marks>=55 && marks<=69 ){
                categary="Partial Scholarship...!";
                count++;
            }else{
                categary="Not Eligible...!";
            }
            System.out.println("Student Name: "+name);
            System.out.println("Student Marks: "+marks);
            System.out.println("Monthly Income : "+"Rs. "+income);
            System.out.println("Scolarship Categary : "+categary);   
    }
    System.out.println("Total Count of Students Selected for Scholarship : "+count);
    
}
}
