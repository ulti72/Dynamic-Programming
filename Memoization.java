import java.util.*;
public class Memoization{

static int  NIL= -1;
static int  MAX=100;
public static int fib(int n){

int[] lookup = new int[MAX];
for(int i=2;i<MAX;i++)
 lookup[i]=NIL;
lookup[0]=0;
lookup[1]=1;
if(lookup[n]==NIL){
  lookup[n]= fib(n-1)+fib(n-2);
}
return lookup[n];

}

public static void main(String[] args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(fib(n));


   }


   }
