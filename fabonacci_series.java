import java.util.Scanner;
public class fabonacci_series {
    static int fab(int n){
        if(n==2 || n==1){
            return n-1;
        }
        else{
            return fab(n-1) +fab(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fab(a));
    }
}
