import java.util.*;
/*
Track Classes for each respective day of the school week
 */
public class Schedule {
    public LinkedList monday;
    public LinkedList tuesday;
    public LinkedList wednesday;
    public LinkedList thursday;
    public LinkedList friday;



    public Schedule(){

    }

    public void addSlots(){
        Scanner scn = new Scanner(System.in);
        System.out.println("How many Timeslots do you want to add?");
        int slots = scn.nextInt();
        for (int a = 0; a < slots; a++ ){
            System.out.println("What day do you want to add the slot too? (Monday, Tuesday, Wednesday, etc...)");
            String day = scn.nextLine();
            switch (day) {
                case "Monday":

                    break;
                case "Tuesday":

                    break;
                case "Wednesday":

                    break;
                case "Thursday":

                    break;
                case "Friday":

                    break;
                default:
                    System.out.println("Not a valid day. Try again...");
                    a--;
            }
        }


    }

    //print the schedule for viewing
    public void printSched(){
        System.out.println("|____|____|____|____|____|");
    //print class numbers
        System.out.println("|____|____|____|____|____|");
    }
}
