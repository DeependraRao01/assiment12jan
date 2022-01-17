package jan12;
import java.util.*;

public class Assiment_sparse_matrix {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimention of matrix : ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int[][] arr=new int[r][c];
		
		int zerocount=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println("Enter value : ");
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==0) {
					zerocount++;
				}
			}
		}
		
		if(zerocount>r*c/2) {
			System.out.println("This is a sparse matrix");
		}
		else {
			System.out.println("This is not sparse matrix");
		}
		
	}

}
