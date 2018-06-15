import java.util.*;
//Ways of forming n using sum of numbers, 1,3 and 5 these numbers can be rearranged and repeat.

//using tabulation method
public class FormN{

public static int ways(int n){

int[] Table = new int[n+1];
Table[0]=1;
Table[1]=1;
Table[2]= 1;
Table[3]= 2;
Table[4]= 2;
for(int i=5;i<n+1;i++){
    Table[i]= Table[i-1]+Table[i-3]+Table[i-5];
}

return Table[n];
}


public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(ways(n));
}

}
