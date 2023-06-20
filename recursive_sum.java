import java.util.Scanner;
public class recursive_sum {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of natural numbers you want to add");
        int a = sc.nextInt();
         sum(a);
        System.out.println(sum(a));
    }
}
