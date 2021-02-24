
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //asking user for input
    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What is your favorite class?");
    String favoriteClass = scan.next();
    System.out.println("Who is the teacher of that class?");
    String teacherClass = scan.next();
    System.out.println("How many people are in your period " + periodClass(favoriteClass, teacherClass));
    int students = scan.nextInt();
    System.out.println("How many elearners are there in your class?");
    int elearners = scan.nextInt();
    System.out.println("Number of students in class are " + inClass(students, elearners));
    //taking input and from methods and printing statement
  }

  static int periodClass(String favoriteClass, String teacherClass) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Your favorite class is " + favoriteClass + " and " + teacherClass + "teaches that class.");
    if (favoriteClass.equals("art") && teacherClass.equals("Flavio")) {
      return 5;
    } else if (favoriteClass.equals("programming") && teacherClass.equals( "Gaber")) {
      return 7;
    } else {
      System.out.print("Unable to find class with that teacher.");
      System.out.println("What is your other favorite class?");
      favoriteClass = scan.next();
      System.out.println("Who is the teacher of that class?");
      teacherClass = scan.next();
      return periodClass(favoriteClass, teacherClass);
    }
  }
    //returning input from the method
  static int inClass(int students, int elearners)
  {
    return students - elearners; 
  }
    //returning number of elearners
}