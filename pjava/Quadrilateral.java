package pjava;

public class Quadrilateral {
     public static void main(String []agrs) {
    	 //input age
    	 int age=17;//Declaration
    	 //declaration and initialization of variable eligible age
    	 int eligibleAge=18;
    	 boolean isEligibleToVote=false;
    	 //Conditional Statement
    	 if(age>= eligibleAge) {
    		 isEligibleToVote=true;
    		 System.out.println("You are eligible to vote");
    		 
    	 }
    	 else {
    		 System.out.println("Better grow up!!"+isEligibleToVote);
    	 }
     }
}
