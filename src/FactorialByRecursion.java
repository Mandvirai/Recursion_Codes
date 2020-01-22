import java.util.Scanner;
public class FactorialByRecursion {
    int Fact(int n){
        if(n == 0 | n == 1){
            return 1;
        }
        else{
            return n * Fact(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        FactorialByRecursion obj = new FactorialByRecursion();
        System.out.println(obj.Fact(n));
    }

}
