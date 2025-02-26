/*
Create a Class with four pieces of info.
 1) Class Numb (ex. CSCI-1234)
 2) Class Start Time (ex. 13:05)
 3) Class End Time (ex. 14:05)
 4) Class Type (ex. Lec, Tut, etc...)
 */

//initialize
public class Class {
    String classNumb;
    String classStart;
    String classEnd;
    String classType;

    public Class(String classNumb, String classStart, String classEnd, String classType) {
        this.classNumb = classNumb;
        this.classStart = classStart;
        this.classEnd = classEnd;
        this.classType = classType;
    }

    //Return all four pieces of info
    public String getStartTime(){
        return classStart;
    }

    public String getEndTime(){
        return classEnd;
    }
    public String getClassType(){
        return classType;
    }

    public String getClassNumb() {
        return classNumb;
    }

    public String print(){
        if (classNumb == null || classStart== null || classEnd == null || classType == null){ return "Class does not exist...";}
        return "|| " + classNumb + " |" + classStart + "-" + classEnd + "| " + classType + " ||" ;
    }
}