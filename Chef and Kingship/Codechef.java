import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
                 Scanner sc= new Scanner(System.in);
                 int T= sc.nextInt();
                 for ( int i= 0; i < T; i++) {
                         int  noVertex= sc.nextInt();
                         long []vertex= new long[noVertex];
                         for (int j= 0; j< vertex.length; j++){
                                 vertex[j]= sc.nextInt();
                         }
                         System.out.println(minCost(vertex));
                }
                sc.close();
	}
        public static long minCost( long []vertex){
                long miniP= Integer.MAX_VALUE;
                long cost= 0;
                for ( int i= 0; i< vertex.length; i++){
                      miniP= Math.min(miniP, vertex[i]);
                }
                for ( long p: vertex){
                    cost+= miniP*p;
                }
                return cost- miniP*miniP;
        }
}