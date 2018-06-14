import java.util.*;
public class Tabulation{

public static int fab(int n){

int[] store = new int[n+1];
store[0]=0;
store[1]=1;
for(int i=2;i<n+1;i++)
   store[i]= store[i-1]+store[i-2];
return store[n];
}


public static void main(String[] args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(fab(n));
}


}
