import java.util.Scanner;


public class Main1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] res=new int[100];
		int cnt=0;
		for(int i=100;i<=999;i++){
			int sum=0;
			int num=i;
			while(num!=0){
				sum+=Math.pow(num%10, 3);
				num/=10;
			}
			if(sum==i)
				res[cnt++]=i;
		}
		
		while(scanner.hasNext()){
			int m=scanner.nextInt();
			int n=scanner.nextInt();
			int cntFlag=0;
			for(int i=0;i<cnt;i++){
				if(res[i]>=m && res[i]<=n){
					cntFlag++;
					if(cntFlag==1)
						System.out.print(res[i]);
					else
						System.out.print(" "+res[i]);
				}
			}
			if(cntFlag==0)
				System.out.println("no");
		}
	}

}
