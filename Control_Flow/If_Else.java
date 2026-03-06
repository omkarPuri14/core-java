package program.control_flow;

public class If_Else {
	
    public static void main(String[] args){ 
    	
        System.out.println("check the giving no is odd or even ");
        int num=10;
        if(num%2==0){
            System.out.println("number "+num+" is Even");
            }else if (num%2!=0){
                System.out.println("number is odd "+num);
        }else{
                    System.out.println("input is not valid ");
                }
        
    
                System.out.println("check the users age is valid for voting  ");
                int age=121;
                if(age>=18&&age<=120){
                    System.out.println(" eligible for voting");
                    }else if (age<=18){
                        System.out.println(" not eligible for voting");
                }else{
                            System.out.println("invalid input ");
                        }
                
                System.out.println("cheaking the greatest no");
                int num1= 20;
                int num2= 46;
                if (num1 > num2) {
                            System.out.println("The greater number is: " + num1);
                        } else if (num2 > num1) {
                            System.out.println("The greater number is: " + num2);
                        } else {
                            System.out.println("Both numbers are equal.");
                        }
                System.out.println("cheking the no is positive or negative or zero");
                int num3 =7; 
                
                if (num3 > 0) {
                    System.out.println("The given number " + num3 + " is Positive");
                } else if (num3 < 0) {
                    System.out.println("The given number " + num3 + " is Negative");
                } else {
                    System.out.println("The given number " + num3 + " is Zero (neither positive nor negative)");
                }
                
                System.out.println("No is Divisible By Five");  
                        int num4 = 25;

                        if (num4 % 5 == 0) {
                            System.out.println("Number is divisible by 5");
                        } else {
                            System.out.println("Number is not divisible by 5");
                        }
                         System.out.println("cheak the year is leap or not");
                                int year = 2024;

                                if (year % 4 == 0) {
                                    System.out.println("Leap Year");
                                } else {
                                    System.out.println("Not a Leap Year");
                                }
                            }
                        
                    }
    
                
                
               
            
        
    
