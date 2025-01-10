import java.util.*;
/*

 */
public class Schedule {
    public LinkedList classes;
    public LinkedList labs[];
    public LinkedList timeSlots[];
   public LinkedList startTime[];
   public LinkedList endTime[];

    public Schedule(){

        LinkedList classes;
        LinkedList labs;
        LinkedList timeSlots;
        LinkedList startTime;
        LinkedList endTime;
    }

    public void addClasses(){
        Scanner scn = new Scanner(System.in);

        System.out.println("");
        String newClass = scn.nextLine();
        //classes.add(newClass);
        System.out.println("");
        String newClassTime = scn.nextLine();
        //timeSlots.add(newClassTime);
        System.out.println("");
        String newLab = scn.nextLine();
        //labs.add(newLab);
        System.out.println("");
        String newLabTime = scn.nextLine();
        //timeSlots.add(newLabTime);
    }


    public void printSched(){
        System.out.print("");
    }
}
