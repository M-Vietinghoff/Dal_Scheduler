import java.util.*;
/*
Track Classes for each respective day of the school week
 */
public class Schedule {
    public LinkedList<Class> monday;
    public LinkedList<Class> tuesday;
    public LinkedList<Class> wednesday;
    public LinkedList<Class> thursday;
    public LinkedList<Class> friday;

    public Schedule(){

    }

    public void addSlots(){
        Scanner scn = new Scanner(System.in);
        String day = "";
        System.out.println("How many Timeslots do you want to add?");
        int slots = scn.nextInt();
        scn.nextLine();
        for (int a = 0; a < slots; a++ ){
            System.out.println("What day do you want to add a slot to? (Monday, Tuesday, Wednesday, etc...)");
            day = scn.nextLine();
            System.out.println("");
            switch (day) {
                case "Monday":
                    monday = createClass(monday);
                    break;
                case "Tuesday":
                    tuesday = createClass(tuesday);
                    break;
                case "Wednesday":
                    wednesday = createClass(wednesday);
                    break;
                case "Thursday":
                    thursday = createClass(thursday);
                    break;
                case "Friday":
                    friday = createClass(friday);
                    break;
                default:
                    System.out.println("Not a valid day. Try again...");
                    a--;
            }
        }


    }

    //Retrieve class information and store info into the Class class and into each days respective Linked List
    public LinkedList<Class> createClass(LinkedList<Class> classDays ){
        Scanner scn = new Scanner(System.in);
        System.out.println("What is the class Name? Ex. CSCI-1234");
        String classNumb = scn.nextLine();
        System.out.println("What is the class Start Time on the 24 hours clock? Ex. 13:30");
        String classStart = scn.nextLine();
        System.out.println("What is the class End Time on the 24 hours clock? Ex. 19:30");
        String classEnd = scn.nextLine();
        System.out.println("What is the class Type? Type L for lecture, T for tutorial and L for Lab");
        String classType = scn.nextLine();

        Class newClass = new Class(classNumb, classStart, classEnd, classType);
        classDays.add(newClass);
        return classDays;
    }

    //print the schedule for viewing
    public void printSched(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n","Monday", "Tuesday", "Wednesday", "Thursday", "Friday");


    }
}
