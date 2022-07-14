package csci1011.lab6;

import java.util.Scanner;

/**
 *CSCI 1011
 * @author James Dupras
 * Arithmetic calculator quiz
 */
public class DuprasLab6 {

    public static void main(String[] args) {
      boolean userCon = true;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Welcome to James Dupras's quiz calculator");
      do {
          System.out.println("Please choose from the following options");
          System.out.println("1. Addition Quiz");
          System.out.println("2. Multiplication Quiz");
          System.out.println("3. Addition Table");
          System.out.println("4. Multiplication Table");
          System.out.println("5. Exit the program");
          int userOp = keyboard.nextInt();
          int MAX_VALUE = 12;
      switch(userOp){
          case 1: {
              int number = 0;
              do{
                  System.out.println("Please choose a number between 1 and 12");
                  number = keyboard.nextInt();               
              }
              while(number < 1 || number > MAX_VALUE); 
              int rightCo = 0;       
              for(int counter = 1; counter <= MAX_VALUE; counter++);{
                  System.out.println(number + "+" + counter + "=");
                  int readAn = keyboard.nextInt();
                  if((number + counter) == readAn){
                    rightCo++;
                }
                }
                  System.out.println("You got " + rightCo +
                        " out of " + MAX_VALUE);
                  break;}
          case 2: {
              int number = 0;
              do{
                  System.out.println("Please choose a number between 1 and 12");
                  number = keyboard.nextInt();    
              } while (number < 1 || number > MAX_VALUE);
              int rightCo = 0;
              for (int counter = 1; counter < MAX_VALUE; counter++){
                  System.out.println(number + '*' + counter + '=');
                  int readAn = keyboard.nextInt();
                  if ((number * counter) == readAn){
                      rightCo++;
                    } 
                    }
              System.out.println("You got " + rightCo + " out of " + MAX_VALUE);
                break;
                  }
          case 3: {
              System.out.print("    |");
              for(int a = 1; a <= MAX_VALUE; a++){
              System.out.print(a+" ");
              }
              System.out.print("\n\t----+");
              for (int b = 0; b < MAX_VALUE; b++){
              System.out.print("----");
              } 
              System.out.println();
              for (int index = 1; index <= MAX_VALUE; index++){
                  System.out.printf("%4s", index + "|");
                  for (int innerIndex = 1; innerIndex <= MAX_VALUE;
                          innerIndex++){
                      System.out.print((index + innerIndex)+ " ");
                }
                  System.out.println();
                }
                break;
                }
          case 4: {
              System.out.print(" |");
              for(int c = 1; c <= MAX_VALUE; c++){
                  System.out.print(c + " ");
                } 
                  System.out.print("\n\t----+");
              for (int d = 0; d < MAX_VALUE; d++){
                  System.out.print("----");
                  }
              for (int index = 1; index <= MAX_VALUE; index++){
                  System.out.printf("%4s", index + "|");
              for (int innerIndex = 1; innerIndex <= MAX_VALUE;
                  innerIndex++){
                  System.out.print((index * innerIndex) + " ");
                  }
                  System.out.println();
                  }
                break;
                  }
          case 5: { 
              userCon = false;
              System.out.println("Thank you for using James Dupras's "
                    + "arithmetic qiuz program");
              System.exit(0);
                }
            default:
                   System.out.println("Invalid choice");
            }
            System.out.println();
            } while (5 != userOp);
            }
        }
      
            
            
            
            
