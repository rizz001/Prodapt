package pjava;

public class assignmentd5 {
    public static void main(String[] args) {
        String initialString = "able was i ere i saw elba.";
        StringBuffer sb = new StringBuffer(initialString);

      
        System.out.println("Initial capacity of String is " + sb.capacity());
        String hannah = "Did Hannah see bees? Hannah did.";
    	System.out.println(hannah.length());
    	System.out.println(hannah.charAt(12));
    	System.out.println(hannah.indexOf("b"));
    	
    	String car= "Was it a car or a cat I saw?";
    	System.out.println(car.substring(9,12));
   

    		String original = "software";

    		StringBuffer result = new StringBuffer("hi");

    		int index = original.indexOf('a');

    		/*1*/ result.setCharAt(0, original.charAt(0));

    		/*2*/ result.setCharAt(1, original.charAt(original.length()-1));

    		/*3*/ result.insert(1, original.charAt(4));

    		/*4*/ result.append(original.substring(1,4));

    		/*5*/ result.insert(3, (original.substring(index, index+2) + " "));

    		System.out.println(result);
    		
    		String one= "hi,";
    		String two="mom";
    		System.out.println(one.concat(two));
    		 
    		
    		int f=0;
			for(int i=0;i<S1.length();i++) {
				f=0;
				for(int j=0;j<S2.length();j++) {
				if(S2.charAt(i)==' ');                                                                                                                                                                                                                                                                                  				}
				}
			
					
					if(f==0) {
						System.out.println("not anagram");
						break;
					}
					
					else {
						System.out.println("anagram");
						break;
					}
			}    		
    		String name= "Rishidhar MSR";
    				

    }
}



