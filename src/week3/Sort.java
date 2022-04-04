package src.week3;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class Sort {

  public static void main(String[] args) {
    System.out.println("===========SELECTION SORT===========");
    analyze("selection");
    System.out.println();
    
    System.out.println("===========BUBBLE SORT===========");
    analyze("bubble");
    System.out.println();
    
    System.out.println("===========INSERTION SORT===========");
    analyze("insertion");
    System.out.println();

    System.out.println("===========MERGE SORT===========");
    analyze("merge");
    System.out.println();
  }
  public static void analyze(String method) {

    int TIMES = 12;
    int SIZE = 5000;
    int sum = 0;
    int time = 0;
    for(int i=0; i< TIMES; i++) {
        BigData s = new BigData(SIZE, method);
        for(int j = 0; j<s.getData().size(); j++) {
            // To see data, uncomment next line
            // System.out.println(s.getData());
            sum += s.getData().get(j);
        }
        System.out.println("Average random: " + sum / ((i+1)*SIZE));
        System.out.println("Nanoseconds: " + s.getTimeElapsed()+"\n");
        time += s.getTimeElapsed();
    }
    System.out.println("Average random: " + sum / (TIMES*SIZE));
    System.out.println("Total Nanoseconds: " + time );
    System.out.println("Total Seconds: " + time /1000000000.0);
  
   
  
  
    
  }
}
