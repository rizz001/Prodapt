package pjava;

public class TwoDArrayExample {
	public static void main(String[] args) {
		int mat[][]=new int[3][3];
		mat[0][0]=1;
		mat[0][1]=2;
		mat[0][2]=3;
		mat[1][0]=4;
		mat[1][1]=5;
		mat[1][2]=6;
		mat[2][0]=7;
		mat[2][1]=8;
		mat[2][2]=9;
		for(int rowInd=0;rowInd<3;rowInd++) {
			for(int col=0;col<3;col++) {
				System.out.println(mat[rowInd][col]);
			}
		}
		System.out.println("--------Add two matrix--------");
		int newMat[][]=new int[3][3];
		for(int rowInd=0;rowInd<3;rowInd++) {
			for(int col=0;col<3;col++) {
				newMat[rowInd][col]=mat[rowInd][col]+mat[rowInd][col];
				System.out.println(newMat[rowInd][col]);
			}
		}
	}
 
}



