//Given a matrix where each cells associted with a weight, we need to find minimum cost to reach a position of (m,n)in cost
//matrix from (0,0)
import java.util.*;
public class MinCost{

//For calculating minimum of three numbers
public static int min(int a , int b , int c){

    return Math.min(a,Math.min(b,c));
}

public static int MinC(int[][] ar, int m, int n){

//Storing Cost by tabulation method
 int[][] c = new int[m+1][n+1];

//cost to reach first element is equal to cost of first element
 c[0][0] = ar[0][0] ;

//filling first column of cost matrix
 for(int q=1;q<m;q++)
    c[q][0]= ar[q][0]+c[q-1][0] ;
//filling first row of cost matrix
 for(int l=1;l<n;l++)
    c[0][l] = ar[0][l] + c[0][l-1] ;

 for(int i=1;i<m;i++){
    for(int j=1;j<n;j++){

     c[i][j]= min(c[i-1][j],c[i][j-1],c[i-1][j-1])+ ar[i][j] ; //filling rest cost matrix

    }
 }

 return c[m-1][n-1];

}

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] ar = new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                ar[i][j]= in.nextInt();

        System.out.println(MinC(ar,m,n));

    }
}
