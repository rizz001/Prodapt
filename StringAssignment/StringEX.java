package pjava;
public class StringEX {

	public static void main(String[] args) {

        String string = "4323dweda3d";
       
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric) {
        	System.out.println(string + " is a number");
        }
        else {
        	System.out.println(string + " is not a number");
        }
            
    }
}