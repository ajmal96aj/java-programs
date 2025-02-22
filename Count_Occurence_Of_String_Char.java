import java.util.HashMap;

public class Count_Occurence_Of_String_Char {
    public static void main (String[]args){
        String str ="gopal_krishnan";
        HashMap<String,Integer> map = new HashMap<>();
        String[] split =str.split("_");

        for (String c: split){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
    
}
