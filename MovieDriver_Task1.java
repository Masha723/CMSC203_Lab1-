/**Class: CMSC203 CRN 30338
	Program: Laboratory 1, Task 1
	Instructor: Ahmed Tarek
	Summary of Description: Program creates the movie object based the user's input data. 
							At the end of the program the object's data is displayed
	Due Date: 02/19/2024
	Integrity Pledge: I pledge that I have completed the programming assignment independently.
					  I have not copied the code from a student or any source.
	Student’s Name: Mariia Leskovets
*
*/
import java.util.Scanner;

public class MovieDriver_Task1 {
	public static void main(String[]args) {
		Scanner stdin=new Scanner(System.in);
		Movie movie=new Movie();
		System.out.println("Enter the name of movie");
		String name=stdin.nextLine();
		movie.setTitle(name);
		System.out.println("Enter the movie's rating");
		String rating=stdin.nextLine();
		movie.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie");
		int tickets=stdin.nextInt();
		movie.setSoldTickets(tickets);
		System.out.println(movie.toString());
		System.out.println("Goodbye");
	}

}
