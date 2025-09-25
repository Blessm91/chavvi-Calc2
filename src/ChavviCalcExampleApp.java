package com.chavviCalcExample;

import java.util.*;

/*
 * chavvi calc calculator
 */
public class ChavviCalcExampleApp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Character command = '_';

    // loop until user quits
    while (command != 'q') {
      printMenu();
      System.out.print("Enter a command: ");
      command = menuGetCommand(scan);

      executeCommand(scan, command);
    }

    scan.close();
  }

  //
  // menu functions
  //
  private static void printMenuLine() {
    System.out.println(
      "----------------------------------------------------------"
    );
  }

  private static void printMenuCommand(Character command, String desc) {
    System.out.printf("%s\t%s\n", command, desc);
  }

  // prints the menu
   private static void printMenu(float a, float b) {
        System.out.println(LINE);
        System.out.println("Chavvi Calc");
        System.out.println(LINE);
        System.out.printf("A = %.3f\tB = %.3f%n", (double) a, (double) b);
        System.out.println(LINE);
        System.out.println("a   Enter a value for A");
        System.out.println("b   Enter a value for B");
        System.out.println("+   Add (A = A + B)");
        System.out.println("-   Subtract (A = A - B)");
        System.out.println("*   Multiply (A = A * B)");
        System.out.println("/   Divide (A = A / B)");
        System.out.println("=   Show current A and B");
        System.out.println("c   Clear (A = 0, B = 0)");
        System.out.println("q   Quit");
        System.out.println(LINE);
    }

  // get first character from input
  private static Character menuGetCommand(Scanner scan) {
    Character command = '_';

    String rawInput = scan.nextLine();

    if (rawInput.length() > 0) {
      rawInput = rawInput.toLowerCase();
      command = rawInput.charAt(0);
    }

    return command;
  }

  // calculator functions
  private static Boolean executeCommand(Scanner scan, Character command) {
    Boolean success = true;

    switch (command) {
      case 'q':
        System.out.println("Thank you for using Chavvi Calc");
        break;
      default:
        System.out.println("ERROR: Unknown commmand");
        success = false;
    }

    return success;
  }
}
