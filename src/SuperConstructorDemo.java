class Person {
    // TODO: Create a constructor Person()
    Person() {
        // Print "Person class"
        System.out.println("Person class");
    }
}

class Student extends Person {
    // TODO: Create a constructor Student()
    Student() {
        // Call super() first (this is implicit, but explicit is good practice)
        super();
        // Print "Student class"
        System.out.println("Student class");
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        // TODO: Create an object of Student class
        // Creating the object will automatically invoke constructors
        Student s = new Student();
    }
}
