import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickiecashwell on 3/23/17.
 */

public class MapShare {

    /*Modify and return the given map as follows:
    if the key "a" has a value, set the key "b" to have that same value.
    In all cases remove the key "c", leaving the rest of the map unchanged.
     */
    public HashMap<String, String> mapShare(HashMap<String, String> map) {
        boolean AKey = false;
        for(String key : map.keySet()) {
            String value = map.get(key);
            if (key == "a") {
                map.put("b", value);
                AKey = true;
            }
            if(key == "b" && AKey){
                map.put(key, map.get("a"));
            }
        }
        map.remove("c");
        return map;
    }
}
/*alternate method to iterate maps
for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals("a")) {
                map.remove("b");
                map.put("b", value);
            }

           }

                map.remove("c");
                return map
        }
        */
