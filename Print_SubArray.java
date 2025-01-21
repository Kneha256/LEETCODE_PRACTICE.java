import java.util.*;

public class Main {
  public static void pairs(int number[]){
    int ts=0;
    for(int i=0;i<number.length;i++){
      for(int j=i;j<number.length;j++){
        for(int k=i;k<=j;k++){
          System.out.print(number[k]+",");
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total number of pairs : "+ts);
  }
    public static void main(String[] args) {
      int number[]={2,4,6,8,10};
      pairs(number);
  }
}
