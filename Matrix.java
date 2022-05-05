import java.util.Scanner;
class MatrixThread extends Thread{
	int i,m,n,sum=0;
	int[][] matrix;
	public MatrixThread(int m,int n,int [][]array,int i){
		this.m=m;
		this.n=n;
		this.i=i;
		matrix = new int[m][n];
		for(int j=0;j<m;j++){
			for(int k=0;k<n;k++){
				matrix[j][k]=array[j][k];
			}
		}
	}
	public void run(){		
		try{
			sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		for(int k=0; k<n; k++){
			sum = sum + matrix[i][k];
		}
		System.out.println("Sum of elements of row no. "+(i+1)+" is : "+sum);	
		
	}
}
public class Matrix{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int m=sc.nextInt();
		System.out.print("Enter no. of column : ");
		int n=sc.nextInt();
		int[][] array = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print("Enter array element of row "+i+" and column "+j+" : ");
				array[i][j]=sc.nextInt();
			}
		}
		MatrixThread obj[] = new MatrixThread[m];
		for(int i=0 ;i<m; i++){
			obj[i]=new MatrixThread(m,n,array,i);
			obj[i].start();
			obj[i].join();
		}
	}
}
