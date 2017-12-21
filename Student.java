/**************************************************************************************
 * ------------------------------------------------------------------------------------
 * File name: Student.java
 * Project name: CSCI 1250 Project 5
 * ------------------------------------------------------------------------------------
 * Author Name: Dakota Cowell
 * Author E-mail: cowelld@goldmail.etsu.edu
 * Course-Section: CSCI-1250-201
 * Creation Date: 11/16/2015
 * Date of Last Modification: 11/16/2015
 * -----------------------------------------------------------------------------
 */


 /*******************************************************************************
  * Class Name: Student <br>
  * Class Purpose: Project 5  <br>
  *
  * <hr>
  * Date created: 11/16/2015 <br>
  * Date last modified: 11/16/2015
  * @author Dakota Cowell
  */
  public class Student
{
  private String studentName; //Student's name input by user
  private String studentID; //Student's ID input by user
  private String major; //Student's major input by user
  private char studentType; //Student type (Graduate or Undergraduate)
  private int hoursCompleted; //Hours the student has taken entered by user
  private int hoursEnrolled; //Hours the student is currently taken

  /**
  * Method Name: Student <br>
  * Method Purpose: create an object of the Student class<br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  */
  public Student()
  {
    setName("XXX XXXXX"); //setting Student's  name to default value
    setStudentID("XXXXXXXX"); //setting Student's id to default value
    setMajor("XXXX"); //setting Student's major to default value
    setStudentType('X'); //setting Student's  name to default value
    setHoursCompleted(0); //setting Student's hours completed to default value
    setHoursEnrolled(0);//setting Student's hours enrolled to default value
  }

  /**
  * Method Name: Student <br>
  * Method Purpose: create an object of the Student class and pass their name in
  * to set the attribute name to<br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param name is the student's name
  */
  public Student(String name)
  {
    setName(name); //setting Student's name to the name passed in
    setStudentID("XXXXXXXX"); //setting Student's id to default value
    setMajor("XXXX"); //setting Student's major to default value
    setStudentType('X'); //setting Student's  type to default value
    setHoursCompleted(0); //setting Student's hours completed to default value
    setHoursEnrolled(0); //setting Student's hours enrolled to default value
  }

  /**
  * Method Name: Student <br>
  * Method Purpose: create an object of the Student class and pass values in
  * to set the attributes to<br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param name is the student's name
  *   @param id is the student's id
  *   @param studentMajor is the student's major
  *   @param type is the type of student (U or G)
  */
  public Student(String name, String id, String studentMajor, char type)
  {
    setName(name); //setting Student's name to the name passed in
    setStudentID(id); //setting Student's id to the id passed in
    setMajor(studentMajor); //setting Student's major to the major passed in
    setStudentType(type); //setting Student's type to the type passed in
    setHoursCompleted(0); //setting Student's hours completed to default value
    setHoursEnrolled(0); //setting Student's hours enrolled to default value
  }

  /**
  * Method Name: Student <br>
  * Method Purpose: create an object of the Student class and pass values in
  * to set the attributes to<br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param name is the student's name
  *   @param id is the student's id
  *   @param studentMajor is the student's major
  *   @param type is the type of student (U or G)
  *   @param completed is the number of hours completed by the student
  *   @param current is the number of hours the student is currently enrolled
  */
  public Student(String name, String id, String studentMajor, char type,
  int completed, int current)
  {
    setName(name); //setting Student's name to the name passed in
    setStudentID(id); //setting Student's id to the id passed in
    setMajor(studentMajor); //setting Student's major to the major passed in
    setStudentType(type); //setting Student's type to the type passed in
    setHoursCompleted(completed); //set Student's hours completed to hours passed in
    setHoursEnrolled(current); //setting Student's hours enrolled to hours passed in
  }

  /**
  * Method Name: Student <br>
  * Method Purpose: copy an object of the Student class<br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param original is the object that is passed in to be copied
  */
  public Student(Student original)
  {
    setName(original.studentName); //set student's name equal to original name
    setStudentID(original.studentID); //set student's id equal to original id
    setMajor(original.major); //set student's major equal to original major
    setStudentType(original.studentType); //set student's type equal to original type
    setHoursCompleted(original.hoursCompleted);//set student's completed = original hours
    setHoursEnrolled(original.hoursEnrolled);//set student's current = original hours
  }//end copy constructor

  /**
  * Method Name: setName <br>
  * Method Purpose: set the student's type <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param name is the name of the student passed in by the user.
  */
  public void setName(String name)
  {
    studentName = name; //Set studentName equal to the name passed in
  }//end setName

  /**
  * Method Name: setStudentID <br>
  * Method Purpose: set the student's ID <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  * <hr>
  *   @param id the student's ID passed in by the user
  */
  public void setStudentID(String id)
  {
    studentID = id; //Set studentID equal to the id passed in
  }//end setStudentID

  /**
  * Method Name: setMajor <br>
  * Method Purpose: set the student's major <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * The only possible majors are CSCI, ENTC, or DIGM. If it is anything else,
  * set the major to XXXX
  * <hr>
  *   @param studentMajor is the String passed in by the user
  */
  public void setMajor(String studentMajor)
  {
    //validate the major entered by the user, then set it equal to what was entered
    if(studentMajor.equalsIgnoreCase("CSCI"))
    {
      major = "CSCI";
    }
    else if(studentMajor.equalsIgnoreCase("ENTC"))
    {
      major = "ENTC";
    }
    else if(studentMajor.equalsIgnoreCase("DIGM"))
    {
      major = "DIGM";
    }
    else
      major = "XXXX";
  }//end setMajor

  /**
  * Method Name: setStudentType <br>
  * Method Purpose: set the student's type <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/18/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * Assign G (for graduate) and U for undergraduate. If something other than these
  * values is sent to the mutator, it should be assigned X instead.
  * <hr>
  *   @param type the type of student (G or U)
  */
  public void setStudentType(char type)
  {
    if(type == 'U' || type == 'u')
    studentType = 'U';
    else if(type == 'G' || type == 'g')
    studentType = 'G';
    else
    studentType = 'X';
  }//end setStudentType

  /**
  * Method Name: setHoursCompleted <br>
  * Method Purpose: set the hours that the student has completed<br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  * <hr>
  *   @param completed the number of hours completed passed in by user
  */
  public void setHoursCompleted(int completed)
  {
    hoursCompleted = completed;
  }//end setHoursCompleted

  /**
  * Method Name: setHoursEnrolled <br>
  * Method Purpose: set the hours that the student is currently enrolled <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  * <hr>
  *   @param enrolled the number of hours currently enrolled passed in by user
  */
  public void setHoursEnrolled(int enrolled)
  {
    hoursEnrolled = enrolled;
  }//end setHoursEnrolled

  /**
  * Method Name: getName <br>
  * Method Purpose: get the student's name <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return String returns the student's name
  */
  public String getName()
  {
    return studentName;
  }//end getName

  /**
  * Method Name: getStudentID <br>
  * Method Purpose: get the student's ID <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return String returns the student's ID
  */
  public String getStudentID()
  {
    return studentID;
  }//end getStudentID

  /**
  * Method Name: getMajor <br>
  * Method Purpose: get the student's major <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return String returns the student's major
  */
  public String getMajor()
  {
    return major;
  }//end getMajor

  /**
  * Method Name: getStudentType <br>
  * Method Purpose: get the student's type <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return char returns the student's Type
  */
  public char getStudentType()
  {
    return studentType;
  }//end getStudentType

  /**
  * Method Name: getHoursCompleted <br>
  * Method Purpose: get the student's number of hours they have completed <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  *
  * <hr>
  *   @return int returns the student's hours that they have completed
  */
  public int getHoursCompleted()
  {
    return hoursCompleted;
  }//end getHoursCompleted

  /**
  * Method Name: getHoursEnrolled <br>
  * Method Purpose: get the student's hours currently enrolled <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  * <hr>
  *   @return int returns the student's hours enrolled
  */
  public int getHoursEnrolled()
  {
    return hoursEnrolled;
  }//end getHoursEnrolled

  /**
  * Method Name: addCompletedHours <br>
  * Method Purpose: add the students hours enrolled to completed hours and reset
  * the hours enrolled to 0 <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * should add the current hours to the completed hours and reset the current
  * hours to 0
  * <hr>
  */
  public void addCompletedHours()
  {
    hoursCompleted = hoursCompleted + hoursEnrolled;
    setHoursEnrolled(0);
  }//end addCompletedHours

  /**
  * Method Name: getClassification <br>
  * Method Purpose: get the student's classification <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * For an undergraduate: Freshman: &lt; 30 hours, Sophomore: 30-59 hours,
  * Junior: 60-89, Senior: 90 and up
  * For a graduate: the only classification is “Graduate student”
  * For an invalid student type (something other than G or U): the
  * classification should be “Invalid student type”
  *
  * <hr>
  *   @return String returns the student's classification
  */
  public String getClassification()
  {
    String classification = " ";

    if(studentType == 'U' && hoursCompleted < 30)
    {
      classification = "Freshman";
    }
    else if(studentType == 'U' && hoursCompleted >= 30 && hoursCompleted <= 59)
    {
      classification = "Sophomore";
    }
    else if(studentType == 'U' && hoursCompleted >= 60 && hoursCompleted <= 89)
    {
      classification = "Junior";
    }
    else if(studentType == 'U' && hoursCompleted >= 90)
    {
      classification = "Senior";
    }
    else if(studentType == 'G')
    {
      classification = "Graduate Student";
    }
    else if(studentType != 'U' && studentType != 'G')
    {
      classification = "Invalid student type";
    }

    return classification;
  }//end getClassification

  /**
  * Method Name: toString <br>
  * Method Purpose: converts the student information to a String<br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  * <hr>
  *   @return String returns the student information
  */
  public String toString()
  {
    String info = "";
    info = "\nStudent Information for "+ studentName +"\n"
        +  "------------------------------------\n"
        +  "Id: " + studentID + "\n"
        +  "Major: " + major + "\n"
        +  "Current Hours: " + hoursEnrolled + "\n"
        +  "Completed Hours: " + hoursCompleted + "\n"
        +  "Classification: " + getClassification();

    return info;
  }//end toString

  /**
  * Method Name: equals <br>
  * Method Purpose: check to see if 2 objects are the same <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  * <hr>
  *   @param original The original object is passed in
  *   @return boolean
  */
  public boolean equals(Student original)
  {
    boolean same = false;
    if(studentName.equals(original.studentName) &&
        studentID.equals(original.studentID) && major.equals(original.major) &&
        hoursEnrolled == original.hoursEnrolled)
    {
      same = true;
    }
    return same;
  }//end equals
}//end Student
