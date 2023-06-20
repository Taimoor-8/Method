public class symbols {

    static void Pattern_1(int n){
        //Representing symbols in ascending order
        for(int i=0; i<n; i+=2){
            for(int j=1; j<=i+1; j+=1){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern_2(int n){
        //Representing symbol in descending order
        for(int i=0; i<n; i+=2){
            for(int j=n-2; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        int a=8;
        int b=6;
        Pattern_1(a);
        Pattern_2(b);

    }
}
