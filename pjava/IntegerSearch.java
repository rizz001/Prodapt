package pjava;

public class IntegerSearch extends AbstractSearch {

	@Override
	public boolean search(Object[] obj_list, Object obj) {
		//use loop to access every item in array referred by variable obj_list 
		//Inside the loop you have to compare obj object with item or object present in obj_list array
		//If above object is found print eureka eureka(element or object  is present )
		
		
		for(int index=0; index<obj_list.length;index++) {
			int objFromList=(int) obj_list[index];
			Integer objFromListAsIntger  = (Integer) obj_list[index];
			//if(obj_list[index].equals(obj)) {
			if(objFromList == (int)obj ) {	
			System.out.println("Eureka Eureka !!!");
				return true;
			}else {
				System.out.println("OMG where is the obj");
			}
		}
		// TODO Auto-generated method stub
		return false;
	}
	

}
