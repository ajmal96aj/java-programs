import java.util.HashMap;

public class map {
    public static void main (String[]args){
        HashMap <String,Integer> empIds = new HashMap<>();
        //hashmap is used to store and get the conteb=nt through comments ,it acts like a map to find the stored values inside it
        //string=word integer=numbers
        empIds.put("aju",12345);
        empIds.put("tom",12135);
        empIds.put("mohan",17273);
        empIds.put("peter",18233);

        System.out.println(empIds); //to call emp ids in the default order

        System.out.println(empIds.get("aju")); //if i call aju in the get, i will recieve its id number

        System.out.println(empIds.containsKey("tom")); //containskey means to find a persons details through words

        System.out.println(empIds.containsValue(12345));

        empIds.put("tom",100200);
        System.out.println(empIds);




         
    }
}
