import java.util.*;
/*
Dal scheduler provides a variety of options on hop to manage a schedule for Dalhousie University
@Author Michaela V
 */

public class ScheduleController {
    public static void main(String[] args) {

        //initialize variables
        String cmd = " ";

        //Start Program
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to Dal Scheduler!");
        System.out.println("Type 1 to create a new schedule");
        System.out.println("Type 2 to add classes to schedule");
        System.out.println("Type 3 to print the schedule");
        System.out.println("Type 0 to end");
        cmd = scn.nextLine();

        Schedule schedule = new Schedule();

        while (!cmd.equals("0")) {
           if (cmd.equals("1")){
               schedule = new Schedule();
               System.out.println("Schedule created! Enter a new Command!");
               cmd = scn.nextLine();
           } else if (cmd.equals("3")){
                schedule.printSched();
                System.out.println("Enter a new Command!");
                cmd = scn.nextLine();
            } else if (
                    cmd.equals("2")){schedule.addSlots();
                    System.out.println("Enter a new Command!");
                    cmd = scn.nextLine();
            }
            //if cmd is 0, stop controlling
            }


        System.out.println("Thank you for scheduling, have a good day!");
    }
}
