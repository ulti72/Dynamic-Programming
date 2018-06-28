import java.util.*;
public class EditDist{

public static int min(int a , int b, int c){
    int min =a ;
    if(b<min)
        min = b;
    if(c<min)
        min = c;
    return min ;

}
public static int ed(String a , String b,int m , int n){

int[][] sol = new int[m+1][n+1];

for(int i=0;i<=m;i++){
    for(int j=0; j<=n;j++){

        if(i==0)
            sol[i][j]=j;
        else if(j==0)
            sol[i][j]=i;
        else {
             int x = (a.charAt(i-1)== b.charAt(j-1))?0:1 ;
                sol[i][j] = min(sol[i-1][j]+1,sol[i][j-1]+1,sol[i-1][j-1]+x);
        }


    }
}

return sol[m][n];

}

public static void main(String[] args){

Scanner in = new Scanner(System.in);
String a = in.nextLine();
String b = in.nextLine();

System.out.println(ed(a,b, a.length(),b.length()));
}

}
