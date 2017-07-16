import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        int res = MaxGrade(n, k);
        System.out.println(res);
    }

    public static int MaxGrade(int n, int k){
        int r = n % k;
        int m = n / k;
      
      if (k == 1){
      	return 2*(n/3) + Math.min(n%3, 1);
      }

       while (r < m/2) {
            r = k + r;
            m = m - 1;
        }

        return m;
    }

}