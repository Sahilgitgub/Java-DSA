import java.util.Scanner;

public class Main {
     public static void printIncreasing(int n)
     {
         if(n==1){
             System.out.println(n);
             return;  //return ks matlab yhi prr code rok do aur sbbb return krrd do..
         }
         System.out.println(n);
         printIncreasing(n-1);
     }
    public static void main(String[] args) {
//        the recursion spell
//                1. identify the smaller problem ->let recurssion solve it
//                2.self work-> do your work
//                3. identify the base case/haltingcondition  -> smallest problem for which the answer is obvious
//        we have call stack in which our methods or functions get stored one by one .
//        if we cant use return then stack overflow happens.
//        subproblem-->recursive work
//                self work
//                        base case
//        heap-array,stack and all premetive data types.

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
    }
}

//bigger problem
//        smaller problem
//                self work

//                        |                               |
//                        |                               |
//                        |                               |
//                        |                               |
//                        |                               |
//                        |                               |
//                        |                               |
//                        |                               |
//                        |                               |
//                        |                               |
//                        |    function stack             |
//                        |_______________________________|
//                        |_main_____________________________ |
//                                    call stack


//2 parts m divide krr lo.
//fir second part ko smaller problem samajke usme kaam krna h.