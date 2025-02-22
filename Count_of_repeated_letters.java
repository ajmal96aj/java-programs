import java.util.HashMap;

public class Count_of_repeated_letters {
    /**
     * @param args
     */
    public static void main (String[]args){
        String str="momoma";

        char[] arr=str.toCharArray();
        Integer count=1;
        HashMap<Character,Integer> map =new HashMap<Character,Integer> ();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }else{
                map.put(arr[i],count+1);
            }
        }
        for(char x : map.keySet()) {
            System.out.println("Count_of_repeated_letters-> "+x+"="+map.get(x));
        }
    }
    
}
