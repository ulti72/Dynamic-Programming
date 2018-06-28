import java.util.*;
public class LIseq{


public static int ls(int[] ar, int n){

    int[] l = new int[n];

    for(int i=1;i<n;i++){
        for(int j=0; j<i;j++){
           if(ar[i]>ar[j])
               l[i]= Math.max(l[j]+1, l[i]);
        }
    }

  return l[n-1]+1;

}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
            ar[i] = in.nextInt();

        System.out.println(ls(ar,n));
    }
}
