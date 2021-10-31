import java.util.*;
import java.io.*;

class Solution1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
          
           
            for(int j=0;j<n;j++){
                String space =" ";
                int value2=0;
                if(j==0){
                    value2 = 1*b;
                }
                if(j>0){
               
                int value=1;
                
                for(int k=0;k<=j;k++){
                    
                    value2=value2+(value*b);
                    value=value*2;
                }
                }
                int out =a + value2  ;
                
                
                System.out.print(out + " ");
                
            }
            System.out.println("");
            
        }
        in.close();
    }
}



//sample input
/*
3
3 3 3
0 0 5
6 6 10
*/

//sample output
/*
6 12 24 
0 0 0 0 0 
12 24 48 96 192 384 768 1536 3072 6144 
*/ 
