import java.util.*;
public class ElecBill {    
    public static void main(String args[]){
        
        System.out.println("======Electricity Bill======");
        int highestbill=0;
       
        Scanner sc=new Scanner(System.in);
         int cost=0;        
         
        for(int i=1;i<=3;i++){ 
           
         
        System.out.print("\nCustomer Name "+ i+":");
        String name=sc.next();
        int pmeter;
        while(true){
        System.out.print("Previous Meter Reading: ");
        pmeter=sc.nextInt();
         if(pmeter>0){
            break;
        }else{
            System.out.println("Invalid Unit!(Can't add negative number)");
        }
    }
        int cmeter;
                    
        System.out.print("Current Meter Reading: ");
        cmeter=sc.nextInt();
        while(true){
        if(cmeter>pmeter && cmeter>0&& pmeter>0){
            break;
        }else{
            System.out.println("Invalid Unit!(Should be Current Meter > Previous Meter and Can't add negative number)");
        }
    }
        
        int unitused=(cmeter-pmeter);
        if (unitused<=50){
            cost=50*unitused+500;
    }else if(unitused>50 && unitused<100){
            cost=50*50+unitused*60+500;
    }else{
            cost=50*50+50*60+unitused*80+500;            
    }
    
    if(cost>highestbill){        
      highestbill=cost;
    }

  
    System.out.println("\n----Bill Details----");
    System.out.println("Unit Consumed: "+unitused);
    System.out.println("Total Bill Amount: "+cost);
}
   System.out.println(highestbill+" is a Highest Bill...!");

}
}




