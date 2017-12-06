/**************************************************************************
* The class name JavaFiddle is used to allow it to be recognized at https://javafiddle.leaningtech.com/
* This will be the main driving class to test all the other classes
***************************************************************************/
public class JavaFiddle {

    public static void main(String[] args) {
        Student bob = new Student("bobisdabest");
        Student george = new Student("gijoe25");

        Student jill = new Student("upthehill234", "Junior");

        // Add your own Teacher class for this code to work!
        //Teacher profSnape = new Teacher("snapesbackintown");

        //Users array can hold any classes derrived from User.
        //Create a Teacher class and give it a try!
        User[] users = new User[] {bob, george, jill};


        for(int i = 0; i < users.length; i++) {
            displayUserType(users[i]);
        }

    }

    public static void displayUserType(User user) {
        //instanceof is a keyword that lets us know what type of
        //object 'user' is. This is a handy way to custimize functionality
        //based off of the type of object.
        if(user instanceof Teacher) {
            System.out.println(user.getUsername() + " is a teacher.");
        }
    }

}

/***************************************************************
 * This is the User abstract class.
 ***************************************************************/

public abstract class User{
    private String username;

    User() {
        username = "unknown";
    }

    User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

}

/***************************************************************
 * This is the Student class, which inherits from User
 ***************************************************************/
public class Student extends User {
    //inherits username variable from user

    //create a variable unique to Student
    private String currentClass;

    Student(String username) {
        super(username);
        //calls user's constructor, and passes it the username
    }

    Student(String username, String currentClass) {
        super(username);
        //The "this" keyword refers to the member variable called currentClass inside of this class.
        //Because I am using the same name for the variable I am passing into the constructor,
        //I need to use the "this" keyword to differentiate between the two.
        this.currentClass = currentClass;
    }

    //inherits the getUsername method from User

    //add a method just to Student called getCurrentClass
    public String getCurrentClass() {
        return currentClass;
    }
}

/*****************************************************
* To-Do: Practice Inheritance
*        Create a new class called Teacher, that inherits
*        from User, and adds its own unique data and methods.
* Hint:  Examine how the Student class inherits from User,
*        and use that as an example.
******************************************************/
