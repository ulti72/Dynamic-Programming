import java.util.*;

public class LCseq{


//FUnction to calculate longest common subsequence
    public static void lcs(String a , String b){
       String ans ="";
       char[] s1 = a.toCharArray();
       char[] s2 = b.toCharArray();
       int[][] l = new int[s1.length+1][s2.length+1];
      int s1ind= s1.length-1;
      int s2ind= s2.length-1 ;


//calculating length of common subsequence using 2d array l[][]
           for(int i=1;i<s1.length+1;i++){
             for(int j=1;j<s2.length+1;j++){

                 if(s1[i-1]==s2[j-1]){
                 l[i][j]=1+l[i-1][j-1]; }
                 else{
                 l[i][j]=Math.max(l[i][j-1], l[i-1][j]);
             }
           }
             }
//Printing length of common subsequnce
 System.out.println("LENGTH "+l[s1ind+1][s2ind+1]);

//Caluclating the longest common subsequence using length, obtained from l[][[]
                while(s1ind>=0&&s2ind>=0){

     if(l[s1ind+1][s2ind+1]!=Math.max(l[s1ind+1][s2ind],l[s1ind][s2ind+1])){
         ans=ans+s2[s2ind];
        s1ind= s1ind-1;
        s2ind=s2ind-1 ;
    }
    else{
          s1ind=s1ind-1;
    }
}

//longest common subsequence obtained in ans varible, but in reverse order so
//reversing ans, to get longest common subsequence
StringBuilder input1 = new StringBuilder(ans);
        input1 = input1.reverse();
       System.out.println(input1);   //printing longest common subsequence


    }

//Ending FUnciton to calculate longest common subsequence
    public static void main(String[] args){

      Scanner in = new Scanner(System.in);
      String a = in.nextLine();
      String b = in.nextLine();
      lcs(a,b);
    }
}
