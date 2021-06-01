package mycaptain_java;
import java.util.Scanner;
public class Matrix {
public static void main(String args[])
{
	int r,c,i,j;
	int mat[][]=new int[10][10];
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the rows : ");
	r=sc.nextInt();
	System.out.print("Enter the columns : ");
	c=sc.nextInt();
	System.out.println("Enter the matrix elements : ");
	for(i=0;i<r;i++)
		for(j=0;j<c;j++)
			mat[i][j]=sc.nextInt();
	System.out.println("The matrixs : ");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
			System.out.print(mat[i][j]+"  ");
		System.out.println();
	}
}
}
