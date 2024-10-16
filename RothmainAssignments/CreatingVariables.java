public class CreatingVariables{
    public static void main(String[] args){
        int x, y, age;
        double seconds, e, checking;
        String firstName, lastName, title;

        x=10;
        y=400;
        age=39;

        seconds=4.71;
        e=2.71828182845904523536;
        checking=1.89;

        firstName="Graham";
        lastName="Mitchell";
        title="Mr.";

        System.out.println("The variable x contains " +x);
        System.out.println("The value " + y + "is stored in the variable y.");
        System.out.println("The experiment took " + seconds + "seconds.");
        System.out.println("A favourite irrational # is Euler's number: " + e);
        System.out.println("Hopefully you have more than $" + checking + "!");
        System.out.println( "My name's " + title + " " + firstName + lastName);
        int pi = 3; //and so does e :)
        double oneSeventh = 1/7;
        String theCoolestTeacher, theSecondCoolestStudent;
        theCoolestTeacher= "Mr. Rothmain";
        theSecondCoolestStudent = "Kallem";
        System.out.println( "Engineers believe that pi is equal to " + pi);
        System.out.println( "1/7 in decimal form repeats the same sequence of numbers over and over again, like this: " + oneSeventh);
        System.out.println( theSecondCoolestStudent + "is a student in " + theCoolestTeacher +"'s computer science class");
    }
}