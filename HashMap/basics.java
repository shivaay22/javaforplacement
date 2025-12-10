import java.util.*;

public class basics {

    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        // insert
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);

        System.out.println(map);

        // get
        int population = map.get("India");
        System.out.println(population);

        // containsKey
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Indones"));

        //changing the value Put => Insertion and Updation
        map.put("china", 75); 

        // Remove
        System.out.println(map.remove("China"));

        System.out.println(map);

        //get all the keys
        System.out.println(map.keySet());

        //get all the values
        System.out.println(map.values());

        //get all entries
        System.out.println(map.entrySet());
        // iteration
        // Set<String> keys = map.keySet();
        
        // for(String k: keys)
        // {
        //     System.out.println("Key="+k+" , values"+map.get(k));
        // }

        for(var e : map.entrySet())
        {
            System.out.print(e.getKey() + " => " + e.getValue());
        }
        System.out.println();

        for(String key : map.keySet()){
            System.out.println("Key => " + key + "value =>" + map.get(key));
        }

    }
    
}
