/* Author: James Warner */

/* The class name JavaFiddle is used to allow it to be recognized at https://javafiddle.leaningtech.com/
*  This will be the main driving class to test all the other classes
*  */
public class JavaFiddle {

    public static void main(String[] args) {
        User bob = new User("bobdabest");
        User george = new User("gijoe25");

        System.out.println(bob.getUsername());
        System.out.println(george.getUsername());


    }

}

/* This is the User abstract class. */

class User {
    private String username;

    User() {
        username = "Unknown";
    }

    User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

/* This is the Student class, which inherits from User */
class Student extends User {
    //inherits username variable from User

    //add a variable just to Student called currentClass (freshman, junior, etc)
    String currentClass;

    Student(String username) {
        super(username);
    }

    Student(String username, String currentClass) {
        super(username);
        this.currentClass = currentClass;
    }

    //inherits the getUsername method

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
