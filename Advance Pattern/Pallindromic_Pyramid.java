import java.util.Scanner;

public class Pallindromic_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            int count =i;
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count--;
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
