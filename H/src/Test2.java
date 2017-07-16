import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int[] cnt={0,0,0,0,0};
		do{
			String str=scanner.next();
			char[] char_arr=str.toCharArray();
			for(int i=0;i<str.length();i++){
//				System.out.println("ch:"+(char_arr[i]=='1'));
				if(char_arr[i]=='1')
					cnt[i]++;
			}
		}while(scanner.hasNext());
		int min=cnt[1];
		for(int i=1;i<5;i++)
			min=cnt[i]<min?cnt[i]:min;
		System.out.println(min);
	}

}
