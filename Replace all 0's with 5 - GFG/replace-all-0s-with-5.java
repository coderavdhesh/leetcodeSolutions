// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int n) {
        // Your code here
        
    int start =0;
    int i =1;
    while(n>0)
    {
        int temp = n%10;
        if(temp == 0)
             temp = 5;
        
        start += temp*i;
        
        i*=10;
        n /=10;
    }
    
    return start;
  }
}