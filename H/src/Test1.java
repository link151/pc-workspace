import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] num=new int[60];
		for(int i=0;i<n;i++)
			num[i]=sc.nextInt();
		
		for(int i=0;i<k;i++){
			int num0=num[0];
			for(int j=0;j<n-1;j++){
				num[j]=num[j]+num[j+1];
				if(num[j]>=100)
					num[j]-=100;
			}
			num[n-1]=num[n-1]+num0;
			if(num[n-1]>=100)
				num[n-1]-=100;
		}
		
		System.out.print(num[0]);
		for(int i=1;i<n;i++)
			System.out.print(" "+num[i]);
	}
}

/*Scanner scanner= new Scanner(System.in);
String str=scanner.next();
char[] char_arr=str.toCharArray();
StringBuffer sbBuffer=new StringBuffer();
for(int i=0;i<char_arr.length;i++){
	if(!Character.isAlphabetic((int)char_arr[i]))
		continue;
	if(Character.isUpperCase((int)char_arr[i])){
		sbBuffer.append(Character.toLowerCase(char_arr[i]));
	}else {
		sbBuffer.append(char_arr[i]);
	}
}
System.out.println(sbBuffer.toString());*/

/*int n=sc.nextInt();
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
System.out.println(min);*/

/*Scanner sc = new Scanner(System.in);
String s=sc.next();
char[] arr=s.toCharArray();
int gCnt=0,bCnt=0;
for(int i=0;i<arr.length;i++)
	if(arr[i]=='G')
		gCnt++;
bCnt=arr.length-gCnt;
int num1=0;
int num2=0;
for(int i=0;i<arr.length;i++){
	if(arr[i]=='G')
		num1=num1+i+1;
	else if(arr[i]=='B')
		num2=num2+i+1;
}
int g=(1+gCnt)*gCnt/2;
int gg=Math.abs(num1-g);
int b=(1+bCnt)*bCnt/2;
int bb=Math.abs(num2-b);
System.out.println(gg>bb?bb:gg);*/