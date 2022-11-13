package com.lambda;
import java.util.ArrayList;
import java.util.function.Predicate;
/*import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;*/
//interface RemoveDup
interface removeDump{
    public int removeDup(String str);
}
public class Assignment {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        ArrayList<String> list = new ArrayList<>();

        Predicate<String> filterEmp = (p)-> {
            if(Math.floorMod(p.length(),2)==0)
                return  true;
            else
                return false;
        };

        employeeList.stream()
                .filter(filterEmp)
                .forEach(p->list.add(p));

        return  list;
    }
    public static void main(String[] args) {
        // TomJones, Harry, EthanHardy, NancySmith, Deborah
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("Sravani");
        employeeList.add("Harika");
        employeeList.add("Tanuja");
        employeeList.add("Bhagya");
        employeeList.add("Vani");

        Assignment assignment = new Assignment();
        System.out.println(assignment.removeOddLength(employeeList));

    }
}

