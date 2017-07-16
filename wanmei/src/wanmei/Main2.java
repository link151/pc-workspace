package wanmei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		while(sc.hasNext())
			list.add(sc.nextInt());
		int M=list.get(list.size()-1);
		int[] v=new int[list.size()];
		for(int i=1;i<list.size();i++){
			v[i]=list.get(i-1);
		}
		
//		int M=20;
//		int[] v={5,2,3};
		int[][] f=new int[M+3][v.length];
		int[] cnt=new int[M+3];
		
		cnt[0] = 0;
		for(int i=1;i<cnt.length;i++)
			cnt[i]=Integer.MAX_VALUE;
		for(int m=0;m<=M;m++){
			
			for(int i=1;i<v.length;i++)
				
				for(int k=0;k<=m/v[i];k++){
					if(m-k*v[i]>=0){
						f[m][i]=Math.max(f[m][i-1], f[m-k*v[i]][i-1]+k*v[i]);
						cnt[m]=cnt[m-k*v[i]]+k;
					}
				}
		}
		
		for(int i=0;i<v.length;i++){
			
			for(int k=0;k<M/v[i];k++){
				
//				if()
			}
		}

		if(cnt[M]!=0)
			System.out.println(cnt[M]);
		else
			System.out.println("-1");
		
	}

}
