import java.util.*;
public class Main
{
	public static void Matrixaddition(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter dimensions of the 2d array(rows column):");
		int rows=obj.nextInt();
		int col=obj.nextInt();
		
		int[][] a=input(obj,rows,col);
		int[][] b=input(obj,rows,col);
	    int[][] Sum=sum(a,b);
	System.out.println("Sum:");
		printing(Sum);
	}
	
	public static int[][] input(Scanner obj,int row,int col){
	    int[][] array= new int [row][col];
	    System.out.println("Enter the elements of the array 1 by 1:");
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            array[i][j]=obj.nextInt();
	        }
	    }
	    return array;
	    
	}
	
	public static int[][] sum(int[][] a,int [][] b){
	    int row=a.length;
	    int col=a[0].length;
	    int[][] sum= new int [row][col];
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            sum[i][j]=a[i][j]+b[i][j];
	        }
	    }
	    return sum;
	}
	public static void printing(int[][] array){
	    for(int[] row:array){
	        for(int ele:row){
	           System.out.print(ele+" ");
	        }
	        System.out.print("\n");
	    }
	    
	}
}
