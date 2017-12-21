/**
  * ------------------------------------------------------------------------------------------------------------
  * File name: Project5Honors.java
  * Project name: Project 5
  * -----------------------------------------------------------------------------------------------------------
  * Initially create by: 1250 instructors
  * Modified by: Dakota Cowell    cowelld@goldmail.etsu.edu
  * Course-Section: CSCI 1250
  * Creation Date: 11/18/15
  * Date of Last Modification: 11/18/15
  * -----------------------------------------------------------------------------------------------------------
  */

import java.io.*;
import javax.swing.JOptionPane;


/**
  * Class Name: Project5Honors <br>
  * Class Purpose: This class will perform various operations on student records.
  *
  * <hr>
  * Date created: 11/18/15
  * Date last modified: 11/18/15
  * @author 1250 instructors & Dakota Cowell
  */

public class Project5Honors
{
	/**
	  * Method Name: 	main <br>
	  * Method Purpose: Displays a menu allowing the user to add student records to the
	  * 				system, to compare student records and to view all records.
	  *					The program will end when the users selects the Exit option
	  *					from the menu. <br>
	  *
	  * <hr>
	  * Date created: 11/18/15 <br>
	  * Date last modified: 11/18/15 <br>
	  *
	  * <hr>
	  * Notes of specifications, special algorithms, and assumptions:
	  *
	  * <hr>
	  *	@param String[] args not used in this program
	  */

	public static void main(String[] args)
	{

		final int MAX_STUDENTS = 3; //the max number of students the array will hold

		//TO DO: create the an array of student objects, it should hold the max number of students
		Student[] students = new Student[MAX_STUDENTS];

		int choice; 	//the user's main menu selection
		int choice2;	//the user's selection from the subMenu
		int numStudents = 0; //the number of students currently in the array

		//TO DO: display a welcome screen with your information
		JOptionPane.showMessageDialog(null,"Welcome to the Student Records Manager!\n"
									  +  "--------Created by Dakota Cowell--------");

		//display a menu of options, continue until the user chooses to exit
		do
		{
			//TO DO: display the main menu and get the user's selection
			choice = displayMainMenu();
			//process the user's selection from the main menu
			switch(choice)
			{
				case 1: //TO DO: create a new student
						students[numStudents] = new Student(getStudentInfo());
						numStudents++;
						break;
				case 2: //TO DO: create a student to be a copy of the first student
						students[numStudents] = new Student(students[0]);
						numStudents++;
						break;
				case 3: //TO DO: check to see if student1 and student2 are the same
						if(students[0].equals(students[1]))
						{
							JOptionPane.showMessageDialog(null, "The students are the same.");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "The students are different.");
						}
						break;

				case 4: //TO DO: check to see if student 2 and student 3 are the same
						if(students[1].equals(students[2]))
						{
							JOptionPane.showMessageDialog(null, "The students are the same.");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "The students are different.");
						}
						break;

				case 5: //TO DO: display a student's record - allow the user to select
						//the student from a menu which will display the student names,
						//based on which student is selected from the menu it should
						//display that student's information
						choice2 = displaySubMenu(students, numStudents);
						if(choice2 == 1)
						{
							JOptionPane.showMessageDialog(null,students[0]);
						}
						else if(choice2 == 2)
						{
							JOptionPane.showMessageDialog(null,students[1]);
						}
						else if(choice2 == 3)
						{
							JOptionPane.showMessageDialog(null,students[2]);
						}
						break;

				case 6: //TO DO: display all student records
				JOptionPane.showMessageDialog(null,students);
						break;
				case 7: //exiting the program, display an EXIT message
						JOptionPane.showMessageDialog(null,"Have a nice day!");
						break;

				default: //invalid option, display an ERROR message
						JOptionPane.showMessageDialog(null,"That is not a valid option.");
						break;
			}//end switch
		} while (choice != 7);

		//exit the program - this is necessary when using JOptionPane
		System.exit(0);
	}//end main


	/**
	  * Method Name: 	displayMenu<br>
	  * Method Purpose: displays a menu of options to the user and returns the user's
	  *					selection <br>
	  *
	  * <hr>
	  * Date created: 11/18/15 <br>
	  * Date last modified: 11/18/15 <br>
	  *
	  * <hr>
	  * Notes of specifications, special algorithms, and assumptions:
	  *
	  * <hr>
	  *	@return int the user's menu selection
	  */

	public static int displayMainMenu()
	{
		//build the menu
		String menu = 	  " ~~ Please make a selection from the menu below ~~ \n\n"
						+ "    1. Create a new student\n"
						+ "    2. Create a new student as a copy of student 1\n"
						+ "    3. Check to see if student 1 & 2 are the same\n"
						+ "    4. Check to see if student 2 & 3 are the same\n"
						+ "    5. Display a student's record \n"
						+ "    6. Display all student records \n"
						+ "    7. Exit \n"
						+ "\n\n What is your selection? ";

		//return the user's selection (the integer returned by the JOptionPane)
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}//end displayMainMenu

	/**
	  * Method Name: 	displaySubMenu<br>
	  * Method Purpose: displays a menu of studen namesto the user and returns
	  *					the user's selection <br>
	  *
	  * <hr>
	  * Date created: 11/18/15 <br>
	  * Date last modified: 11/18/15 <br>
	  *
	  * <hr>
	  * Notes of specifications, special algorithms, and assumptions:
	  *
	  * <hr>
	  * @param students Student[] - the list of students to be displayed
	  *	@return int the user's menu selection
	  */

	public static int displaySubMenu(Student[] students, int numStudents)
	{
		//build the menu
		String menu = 	  " ~~ Please select a student to display ~~ \n\n";

		for (int i = 0; i < numStudents; i++)
			menu += "\n    " + (i+1) + ". " + students[i].getName() ;

		menu += "\n    " + (numStudents+1) + ". Return to main menu\n"
			 + "\n\n What is your selection? ";

		//return the user's selection (the integer returned by the JOptionPane)
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}//end displaySubMenu



	/**
	  * Method Name: 	getStudentInfo<br>
	  * Method Purpose: prompts the user for the student information, creates a new
	  *					student object populating it with the student information,
	  *					and returns the object. <br>
	  *
	  * <hr>
	  * Date created: 11/18/15 <br>
	  * Date last modified: 11/18/15 <br>
	  *
	  * <hr>
	  * Notes of specifications, special algorithms, and assumptions:  n/a
	  *
	  * <hr>
	  *	@return Student the newly created Student object
	  */

	public static Student getStudentInfo()
	{
		Student stud; //temporary student object

		//request the student information from the user
		String name = JOptionPane.showInputDialog("What is the student's name?");
		String id =  JOptionPane.showInputDialog("What is the student's id?");
		String major =  JOptionPane.showInputDialog("What is the student's major?");
		char studentType = JOptionPane.showInputDialog("Is the student a grad (G) or undergrad (U)?").charAt(0);
		int completedHours =
			Integer.parseInt(JOptionPane.showInputDialog("How many hours has the student completed?"));
		int currentHours =
			Integer.parseInt(JOptionPane.showInputDialog("How many hours is the student currently taking?"));

		//TO DO: create the student object with information entered by the user
		stud = new Student(name, id, major, studentType, completedHours, currentHours);

		//return the newly created student object
		return stud;
	}//end getStudentInfo

}//end Project5Honors
