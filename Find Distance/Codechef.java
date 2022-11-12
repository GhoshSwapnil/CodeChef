/* package codechef; // don't place package name! */

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
        for ( int tc= 1; tc<= T; tc++){

            int noVertex= sc.nextInt();
            int findDistVertedNo= sc.nextInt();

            ArrayList<ArrayList<Integer>> adjacencyList= new ArrayList<>();
            for ( int j= 0; j< noVertex; j++ ){
                adjacencyList.add(new ArrayList<Integer>());
            }
            for ( int i= 0; i< noVertex; i++){
                for( int j= 0; j< noVertex; j++ ){
                     if( sc.nextInt() == 1)
                         adjacencyList.get(i).add(j);
                     else
                         continue;
                }
            }
            //System.out.println(adjacencyList.toString());

            System.out.println(findDistanceFromRoot(adjacencyList, noVertex, findDistVertedNo));
        }
	}
    public static int findDistanceFromRoot(ArrayList<ArrayList<Integer>> adjacencyList, int noVertex, int findDistVertedNo){
        //we are considering directed acyclic graph 
        Queue<Integer> q= new LinkedList<>();
        int dist= 0;
        q.offer(0);
        while ( !q.isEmpty()){
            int size= q.size();
            while ( size -- > 0){
                int temp= q.poll();
                if ( temp == findDistVertedNo ){
                    return dist;
                }
                for ( int vertex: adjacencyList.get(temp) ){
                    q.offer(vertex);
                }
            }
            dist+= 1;
        }
        return dist;
    }
}