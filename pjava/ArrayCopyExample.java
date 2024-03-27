package pjava;
 
public class ArrayCopyExample{
 
	public static void main(String[] args) {
		int source[]= {1,2,3,4,5,6};
		int destination[]=new int[6];
		System.arraycopy(source,0,destination,0,source.length);
		for(int i=0;i<destination.length;i++) {
			System.out.println(destination[i]);
		}
		System.out.println("*****************************");
		int src[]= {7,8,9};
		int dest[]=new int[5];
		for(int i=0;i<src.length;i++) {
			dest[i]=src[i];
		}
		for(int num:dest) {
			System.out.println(num);
		}
	}
}
 