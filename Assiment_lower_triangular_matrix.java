package jan12;
import java.util.*;


public class Assiment_lower_triangular_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of row in matrix : ");
		int r=sc.nextInt();
		System.out.println("Enter no of colume in matrix : ");
		int c=sc.nextInt();
		
		int[][] arr=new int[r][c];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter value : ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");		
			}
			System.out.println();
		}
		
		if(r==c) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(i<j) {
						arr[i][j]=0;
						System.out.print(arr[i][j]);
					}
					else {
						System.out.print(arr[i][j]);
					}
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("matrix is not squre matrix");
		}
		
		

	}

}
