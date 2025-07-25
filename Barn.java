
import java.util.ArrayList;
import java.util.Scanner;

import animal.*;

public class Barn {
  private static Scanner input = new Scanner(System.in);
  private static Scanner Sinput = new Scanner(System.in);
  private static ArrayList<Goat> goats = new ArrayList<Goat>();
  private static ArrayList<Duck> ducks = new ArrayList<Duck>();
  private static int mpd = input.nextInt();
  private static int total;
  

  public static void main(String[] args) {
    System.out.println("\n--------Welcome to you Barn genarator------\n");
    System.out.print("How many animals in the barn? ");
    int numAnimal = input.nextInt();
    

    for(int i = 0; i < numAnimal; i++) {
     
      System.out.printf("%nEnter animal #%d type (goat / duck) ", i+1 );
      String type = Sinput.nextLine();
      
      
      if(type.equals("goat") ) { 
        Goat goat = new Goat("Goat"); 
        goats.add(goat);
        System.out.print("What is the Milk per day? : ");
        int mpd = input.nextInt();
        goat.setmilkPerDay(mpd);
        total+=mpd; 
        
      
      }

      else{
        Duck duck = new Duck("Duck"); 
        ducks.add(duck);
        System.out.print("What is the egg colour? : ");
        String colour = Sinput.nextLine();
        duck.seteggColor(colour);

        System.out.print("What is the Name of that Duck? : ");
        String dName = Sinput.nextLine();
        duck.setduckName(dName);
      }

    } 
     System.out.print("\n---------- All goats ----------\n\n");
      for(int i = 0; i < goats.size(); i++) {
      System.out.printf("Type: %s Milk per day: %dL %n",
      goats.get(i).getType(), goats.get(i).getmilkPerDay());
    } 
      System.out.printf("---%n  Total milk per day is: %dL   ---", total);
    System.out.print("\n---------- All ducks ----------\n\n");

    for(int i = 0; i < ducks.size(); i++) {
      System.out.printf("Type: %s, Egg Color is : %s and Name is:  %s%n",
        ducks.get(i).getType(), ducks.get(i).geteggColor(), ducks.get(i).getduckName());
    }
    System.out.println("\n-------- See you later in the Barn ------\n");
    input.close();
    Sinput.close();
    
  } 

} 
