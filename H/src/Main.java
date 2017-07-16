import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] num=new int[51];
		for(int i=0;i<n;i++)
			num[i]=sc.nextInt();
		
		for(int i=0;i<k;i++){
			int num0=num[0];
			for(int j=0;j<n-1;j++){
				num[j]=num[j]+num[j+1];
			}
			num[n-1]=num[n-1]+num0;
		}
		
		System.out.println(num[0]);
		for(int i=0;i<n;i++)
			System.out.println(" "+num[i]);
	}
}

