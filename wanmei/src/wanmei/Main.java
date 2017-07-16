package wanmei;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int kind=sc.nextInt();
//		System.out.println(kind);
		int[] v=new int[kind+1];
		int[] w=new int[kind+1];
		int M;
		for(int i=1;i<=kind;i++)
			v[i]=sc.nextInt();
		for(int i=1;i<=kind;i++)
			w[i]=sc.nextInt();
		M=sc.nextInt();
//		System.out.println(M);
		int[][] f=new int[M+1][kind+1];
		for(int ww=0;ww<=M;ww++){
			for(int i=1;i<=kind;i++)
				if(ww-w[i]>=0)
					f[ww][i]=Math.max(f[ww][i-1], f[ww-w[i]][i-1]+v[i]);
		}
		
		int ans=0;
		for(int i=0;i<=M;i++)
			for(int j=0;j<=kind;j++)
				ans=f[i][j]>=ans?f[i][j]:ans;
		
		System.out.println(ans);
	}

}
