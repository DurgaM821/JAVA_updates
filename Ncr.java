//input  n=10,r=6
//output 210


import java.util.Scanner;
public class Main{
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
             fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        int factn=factorial(n);
         int factr=factorial(r);
          int factnr=factorial(n-r);
          int val=factn/(factr*(factnr));
          System.out.print(val);
        
    }
}
