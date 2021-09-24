
package fibonacci;

/**
 *
 * @author Mohamed amin
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

 int initial_population_size;
 int Num_days;

 
 int Total_population = 0;
 
        System.out.println(" Enter the current size of the Population :- ");
        initial_population_size = input.nextInt();
 
        System.out.println(" Enter the number of days :- ");
        Num_days = input.nextInt();
 
for(int i=0; i<Num_days; i++){

  if(Num_days < 4){
  
      Total_population = initial_population_size;
  }
 
  else if(Num_days % 5 == 0){
  
   Total_population = initial_population_size + Num_days;
  
  }
 
  else{
  
      System.exit(0);
      
  }
 
  

}
 
    
    System.out.println(Total_population+" pounds ");




    }
    
}
