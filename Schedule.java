import java.util.*;
/*
Track Classes for each respective day of the school week
 */
public class Schedule {
    public LinkedList<Class> monday = new LinkedList<>();
    public LinkedList<Class> tuesday = new LinkedList<>();
    public LinkedList<Class> wednesday = new LinkedList<>();
    public LinkedList<Class> thursday = new LinkedList<>();
    public LinkedList<Class> friday = new LinkedList<>();

    public Schedule(){

    }

    public void addSlots(){
        //intialize
        Scanner scn = new Scanner(System.in);
        String day = "";

        //track amount of slots being added in order to loop over adding them
        System.out.println("How many Timeslots do you want to add?");
        int slots = scn.nextInt();
        scn.nextLine();

        //loop over adding slots, specify the day for the slot
        for (int a = 0; a < slots; a++ ){
            System.out.println("What day do you want to add a slot to? (Monday, Tuesday, Wednesday, etc...)");
            day = scn.nextLine();
            System.out.println("");
            switch (day) {
                case "Monday":
                    monday = createClass();
                    break;
                case "Tuesday":
                    tuesday = createClass();
                    break;
                case "Wednesday":
                    wednesday = createClass();
                    break;
                case "Thursday":
                    thursday = createClass();
                    break;
                case "Friday":
                    friday = createClass();
                    break;
                default:
                    System.out.println("Not a valid day. Try again...");
                    a--;
            }
        }


    }

    //Retrieve class information and store info into the Class class and into each days respective Linked List
    public LinkedList<Class> createClass(){
        LinkedList<Class> classDays = new LinkedList<>();
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
        //print monday
        System.out.print("Monday    | ");
        if (!monday.isEmpty()){
            for (Class curr : monday) {
                System.out.print(curr.print() + " ");
            }
        }
        System.out.println("");

        //print tuesday
        System.out.print("Tuesday   | ");
        if (!tuesday.isEmpty()){
            for (Class curr : tuesday) {
                System.out.print(curr.print() + " ");
            }
        }
        System.out.println("");

        //print wednesday
        System.out.print("Wednesday | ");
        if (!wednesday.isEmpty()){
            for (Class curr : wednesday) {
                System.out.print(curr.print() + " ");
            }
        }
        System.out.println("");

        //print thursday
        System.out.print("Thursday  | ");
        if (!thursday.isEmpty()){
            for (Class curr : thursday) {
                System.out.print(curr.print() + " ");
            }
        }
        System.out.println("");

        //print friday
        System.out.print("Friday    | ");
        if (!friday.isEmpty()){
            for (Class curr : friday) {
                System.out.print(curr.print() + " ");
            }
        }
        System.out.println("");


    }
}
