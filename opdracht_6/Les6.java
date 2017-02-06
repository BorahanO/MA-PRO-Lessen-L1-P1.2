import java.util.Scanner;
public class Les6{
  public static void main(String[] args) {
      Les6 les6 = new Les6();
  }
  public Les6(){
    System.out.println("Showing Problem:");
    showProblem();
    System.out.println("Fixing Problem:");
    solveProblem();
  }

  private void showProblem(){
    //Met de onderstaande code kun je een appel eten.
    //Wat nu als je meer appels wil kunnen eten?
    //Moet ik dan de complete code kopieren?

    //Opdracht 1 -- Check
    //Lees de onderstaande code regel voor regel door en zet per regel, in een comment erachter, wat de code doet
    //Als je een regel niet begrijpt zet je er een vraagteken achter.
    //Stel in de les vragen over regels die je niet begrijpt.

    //Opdracht 2 -- Check
    //Pas de onderstaande code aan zodat je 3 appels tegelijk kunt eten.
    //Je hoeft nog niet te switchen tussen de appels met het "next" commando.

    Apple apple1 = new Apple(); // Instatiate a new object Apple called apple1
    Apple[] apples = new Apple[3];
    for (int i = 0; i < apples.length ; i++) {
      apples[i] = new Apple();
    }

    Scanner scanner = new Scanner(System.in); // Instatiate the scanner class

    while(true){ // *Shaking head* Creating an infinite loop
      System.out.println("eat, look, next or exit?"); // Print to the console "eat, look, next or exit?"
      String input = scanner.next(); // Retieve what teh user entered

      if(input.equals("eat")){ // If what the user entered is eat then execute the code below\
        for (int i = 0; i < apples.length; i++) { // Loop through all apples
          System.out.print("Eating apple #"+ i +": "); // Printing something to the console to keep trach of which apple yous eatin
          apples[i].takeBite(); // Take bite of the apple that is assoiated with the position in the array (aka number stored in variable i)
        }
        //apple1.takeBite(); // Call the function takeBite() on apple1
      }
      else if(input.equals("look")){ // If the user did not enter eat then check wether it was look if so execute the code below
        apple1.printAppleStatus(); // Call the function printAppleStatus() on apple1
      }
      else if(input.equals("exit")){ // If it was neither the above 2 check if it is exit if so execute code below
        break; // Break out of this while loop
      }else if(input.equals("next")){ // It was neither and of the above check if it was next if so execute code below
        //ga naar de volgende appel
        System.out.println("there is only one apple!"); // Print text to the console
      }else{ // User entered nothing that could match the above if statements so this is our last resort
        System.out.println("i don't understand."); // Say ye didn't understand
      }
    }

    //Opdracht 3 -- Check
    //Maak een nieuwe functie aan met de naam solveProblem.
    //Plak de code voor het eten van de 3 appels erin.
    //Pas de code aan zodat je met behulp van een array 20 appels kunt eten met het "eat" commando.

    //Opdracht 4 -- Check
    //Pas de code zo aan dat je ook 20 appels kunt bekijken met het "look" commando.

    //Extra opdracht 5 -- Check
    //Verzin een manier om te switchen tussen de appels,
    //zodat je niet alle appels tegelijk eet maar dat je ze 1 voor 1 kunt eten en bekijken.
    //Gebruik hiervoor het "next" commando.

  }

  private void solveProblem() {
    // Instantiate a certain veriable
    int currentApple = 0;

    // Grap the apples
    Apple[] apples = new Apple[20];
    for (int i = 0; i < apples.length; i++) {
      apples[i] = new Apple();
    }

    Scanner scanner = new Scanner(System.in); // Instatiate the scanner class

    while(true){ // *Shaking head* Creating an infinite loop
      System.out.println("eat, look, next or exit?"); // Print to the console "eat, look, next or exit?"
      String input = scanner.next(); // Retieve what teh user entered

      if(input.equals("eat")){ // If what the user entered is eat then execute the code below\
        if ( !(currentApple < 0) && !(currentApple > apples.length - 1) ) { // Check wether the selected apple is still in bounds etc (fool proof)
          // Continue
          apples[currentApple].takeBite(); // Taking bite of selected apple
        } else {
          // Out of bounds bruh
          System.out.println("Out of bounds, How'd you get here? resetting selected apple to 0"); // Printing stuff to console
          currentApple = 0; // Setting the variable back to 0 and continue said loop
        }
      }
      else if(input.equals("look")){ // If the user did not enter eat then check wether it was look if so execute the code below
        if ( !(currentApple < 0) && !(currentApple > apples.length - 1) ) { // Check wether the selected apple is still in bounds etc (fool proof)
          // Continue
          apples[currentApple].printAppleStatus(); // Print status of selected apple
        } else {
          // Out of bounds bruh
          System.out.println("Out of bounds, How'd you get here? resetting selected apple to 0"); // Print stuff to console
          currentApple = 0; // Setting the variable back to 0 and continue said loop
        }
      }
      else if(input.equals("exit")){ // If it was neither the above 2 check if it is exit if so execute code below
        break; // Break out of this while loop
      }else if(input.equals("next")){ // It was neither and of the above check if it was next if so execute code below
        //ga naar de volgende appel
        if (currentApple + 1 > apples.length - 1) {
          System.out.println("You have already selected the top most apple. Going back to the first for you!");
          currentApple = 0;
        } else {
          currentApple++;
          System.out.println("You have selected apple: #"+  currentApple);
        }
      }else{ // User entered nothing that could match the above if statements so this is our last resort
        System.out.println("i don't understand."); // Say ye didn't understand
      }
    }



  }
}
