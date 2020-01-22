import java.util.Scanner;
public class TowerOfHanoi {
    public static void t1(int n,char s,char a,char d){ //when method is static then do not create object.
        if(n == 1){
            System.out.println(s +" "+ d);// s-source,a - intermediate,d = destination
        }
        else{
            t1(n-1,s,d,a);
            System.out.println(s +" "+d);
            t1(n-1,a,s,d);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        t1(n,'a','b','c');
    }
}
