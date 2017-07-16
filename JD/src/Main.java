import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		TreeSet<Integer> set=new TreeSet<Integer>();
		while(scanner.hasNext()){
			int n=scanner.nextInt();
			String s=scanner.next();
//			System.out.println(s);
			char[] arr=s.toCharArray();
			for(int i=0;i<arr.length;i++){
				if(Character.isDigit(arr[i])){
					int dt=arr[i]-'0';
					int j=i-dt>=0?i-dt:0;
					int M=i+dt>=arr.length?arr.length-1:i+dt;
					for(;j<=M;j++){
						if(arr[j]=='X')
							set.add(j);
					}
				}
			}
			System.out.println(set.size());
		}
	}
}