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
        System.out.println("Type 1 to create a new schedule, 2 to print the schedule and 0 to end");
        System.out.println("Type 3 to add classes to schedule");
        cmd = scn.nextLine();

        Schedule schedule = new Schedule();

        while (!cmd.equals("0")) {
           if (cmd.equals("1")){schedule = new Schedule();}
            if (cmd.equals("2")){schedule.printSched();}
            if (cmd.equals("3")){schedule.addSlots();}
            }


        System.out.println("Thank you for scheduling, have a good day!");
    }
}
