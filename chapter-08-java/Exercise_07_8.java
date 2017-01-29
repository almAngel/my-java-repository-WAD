
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_07_8 {
  
  static final int EMPTY = 0;
  static final int BOMB = 1;
  static final int TREASURE = 2;
  static final int ATTEMPT = 3;
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    int width= 5;
    int height= 4;
    int[][] grid = new int[5][4];

    
    //###### FILL GRID ######
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 3; j++) {
        grid[i][j] = EMPTY;
      }
    }
    //-----------------------
    int bombXPos = (int)(Math.random()*4);
    int bombYPos = (int)(Math.random()*3);
    grid[bombXPos][bombYPos] = BOMB;
    
    int treasureXPos;
    int treasureYPos;
    do {
      treasureXPos = (int)(Math.random()*4);
      treasureYPos = (int)(Math.random()*3);
    } while ((bombXPos == treasureXPos) && (bombYPos == treasureYPos));

    grid[treasureXPos][treasureYPos] = TREASURE;

    System.out.println("Try to find the treasure");
    boolean exit = false;
    String c = "";
    do {

    for(int i = 3; i >= 0; i--) {
      System.out.print(i + "|");
      for(int j = 0; j < 5; j++) {
        if (grid[j][i] == ATTEMPT){
          System.out.print("X ");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println(" ----------\n  0 1 2 3 4\n");
    
    System.out.print("Coord. X: ");
    width = Integer.parseInt(s.nextLine());
    System.out.print("Coord. Y: ");
    height = Integer.parseInt(s.nextLine());

    switch(grid[width][height]) {
      case EMPTY:
        grid[width][height] = ATTEMPT;
        if ((Math.abs(width - bombXPos) < 2) && (Math.abs(height - bombYPos) < 2)) {
            System.out.println("Be careful, you are probably close to a bomb");
          }
          
        break;
      case BOMB:
        System.out.println("-You are dead-");
        exit = true;
        break;
      case TREASURE:
        System.out.println("-You Win!-");
        exit = true;
        break;
      default:
    }
  } 
    while (!exit);
      for(int i = 3; i >= 0; i--) {
        System.out.print(i + " ");
        for(int j = 0; j < 5; j++) {
          switch(grid[j][i]) {
            case EMPTY:
              c = " ";
              break;
            case BOMB:
              c = "* ";
              break;
            case TREASURE:
              c = "€ ";
              break;
            case ATTEMPT:
              c = "X ";
              break;
            default:
          }
        System.out.print(c);
      }
      System.out.println();
    }  
    System.out.println("  ----------\n  0 1 2 3 4\n");
  }
}

