import java.util.Scanner;
public class Test3 {
	public static int charToNum(char ch) {
		int num=0;
		if(ch=='A' || ch=='a')
			num=10;
		if(ch=='B' || ch=='b')
			num=11;
		if(ch=='C' || ch=='c')
			num=12;
		if(ch=='D' || ch=='d')
			num=13;
		if(ch=='E' || ch=='e')
			num=14;
		if(ch=='F' || ch=='f')
			num=15;
		if(Character.isDigit(ch))
			num=(int)(ch-'1'+1);
		return num;
	}
	
	public static int calc(int a,int b,char op){
		int res=0;
		if(op=='+')
			res=a+b;
		else if (op=='-') {
			res=a-b;
		}else if (op=='*') {
			res=a*b;
		}
//		System.out.println(op+" "+res);
		return res;
	}
	
	
	public static int postfixCalc(char[] input){
		int a=charToNum(input[0]);
//		System.out.println(a);
		int b=0;
		for(int i=1;i<input.length;){
			if(i+2<input.length && i+3<input.length && input[i+3]!='*' && input[i+2]!='*'){
				b=charToNum(input[i++]);
//				System.out.println(b);
				a=calc(a,b,input[i++]);
			}else{
				char tmp_op=input[i+1];
				do {
					b=charToNum(input[i]);
					if(i+2<input.length){
						int c=charToNum(input[i+2]);
						b=calc(b,c,input[i+3]);
					}
//					System.out.println("先算*："+b);
					i=i+4;
				} while (i+2<input.length && i+3<input.length && input[i+3]!='*');
				
				a=calc(a,b,tmp_op);
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		while(scanner.hasNext()){
			char[] ch_arr=scanner.next().toCharArray();
			int ans=postfixCalc(ch_arr);
			System.out.println(ans);
		}
	}
}
