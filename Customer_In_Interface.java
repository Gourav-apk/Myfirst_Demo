import java.util.Scanner;
interface Details{
   String []age = new String[10];
   String [] name = new String[10];
   String [] gmail = new String[10];
   String [] address = new String[10];
}

class Customer_In_Interface implements Details{
    static int id =999;
    static int count =0;
    static int n=1;
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String Age;
    String Name , Gmail, Address;
    int choice;
 
    for(int h =0;h<4;h++){
       System.out.println("......1 Insert and 2 Fatch Information......");
    System.out.println("Enter your choice");
    choice =sc.nextInt();
      switch(choice){
       case 1:       
        for(count=0;count<1;count++){
        System.out.println("Enter your name");
        Name=sc.nextLine();
        Name=sc.nextLine();
        name[count] =Name;

        System.out.println("Enter your age");
        Age =sc.next();
        age[count] = Age;

        System.out.println("Enter your address");
        Address =sc.nextLine();
        Address =sc.nextLine();
        address[count] = Address;

        System.out.println("Enter your Gmail");
        Gmail =sc.nextLine();
        gmail[count] = Gmail;
       }  
     break;
     case 2:
         System.out.println("Enter your id number");
         int id =sc.nextInt();
        for(int j =0;j<1;j++){
       System.out.println(".......Customer details ...........");
       System.out.println("\n");
       
       System.out.println(" Name: " + name[id]);
        System.out.println(" Age: " + age[id]);
       System.out.println(" Gmail: " + gmail[id]);
       System.out.println(" Address: " + address[id]);
       }
     break;
     
   }
   }                
  }
}
       
   
        
   
    
     
    