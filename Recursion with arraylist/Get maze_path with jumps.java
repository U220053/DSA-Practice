import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
ArrayList<String>ans=getMazePaths(1, 1, n, m);
System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
         ArrayList<String> base=new ArrayList<>();
         base.add("");
         return base;
     }
      ArrayList<String> path=new ArrayList<>();
     for(int i=1;i<=dc-sc;i++)
     {
         ArrayList<String> hpath=getMazePaths(sr,sc+i,dr,dc);
         for(String j:hpath)
         path.add("h"+i+j);
     }
     for(int i=1;i<=dr-sr;i++)
     {
         ArrayList<String> vpath=getMazePaths(sr+i,sc,dr,dc);
         for(String j:vpath)
         path.add("v"+i+j);
     }
     for(int i=1;i<=dr-sr;i++)
     {
         ArrayList<String> dpath=getMazePaths(sr+i,sc+i,dr,dc);
         for(String j:dpath)
         path.add("d"+i+j);
     }
     return path;
    }

}