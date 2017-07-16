import java.util.Scanner;


public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[50];
		int[] y=new int[50];
		for(int i=0;i<n;i++)
			x[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			y[i]=sc.nextInt();
		int gx,gy;
		gx=sc.nextInt();
		gy=sc.nextInt();
		int walTime,taxiTime;
		walTime=sc.nextInt();
		taxiTime=sc.nextInt();
		
		int sumWalk=(Math.abs(gx)+Math.abs(gy))*walTime;
		int min=sumWalk;
		for(int i=0;i<n;i++){
			int walk=(Math.abs(x[i])+Math.abs(y[i]))*walTime;
			int taxi=(Math.abs(x[i]-gx)+Math.abs(y[i]-gy))*taxiTime;
			if(walk+taxi<min)
				min=walk+taxi;
		}
		System.out.println(min);
	}
}

//Scanner in = new Scanner(System.in);
//while (in.hasNextInt()) {//注意while处理多个case
//    int a = in.nextInt();
//    int b = in.nextInt();
//    System.out.println(a + b);
//}
//
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//int ans = 0, x;
//for(int i = 0; i < n; i++){
//    for(int j = 0; j < n; j++){
//        x = sc.nextInt();
//        ans += x;
//    }
//} 
//System.out.println(ans);