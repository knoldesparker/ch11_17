import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map1.put("Smith","940-1504");
        map1.put("Marty","206-9024");
        map2.put("Marty","206-9024");
        map2.put("Hawking","123-4567");
        map2.put("Smith","949-0504");
        map2.put("Newton","123-4567");


        System.out.println(submap(map1,map2));
    }
    public static boolean submap(Map<String,String> mapA,Map<String,String> mapB){

        for (Map.Entry<String,String> m : mapB.entrySet()){
            if (mapA.containsValue(m.getValue())&& mapB.containsValue(m.getValue())){
                System.out.println("is a Submap");
                return true;
            }
        }
        return false;
    }
}
