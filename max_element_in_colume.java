package jan12;

import java.util.Scanner;

public class max_element_in_colume {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimention of matrix : ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int[][] arr=new int[r][c];
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[0].length;j++) {
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
		
		 for(int i=0;i<arr.length;i++){
	            int max=0;
	            for(int j=0;j< arr[0].length;j++){
	                if(max<arr[j][i])
	                    max=arr[j][i];
	            }
	            System.out.println(max);
	        }

	}

}
