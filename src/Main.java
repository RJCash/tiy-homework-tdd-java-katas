import java.util.HashMap;

/**
 * Created by rickiecashwell on 3/23/17.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("a","horse");
        map.put("b","cat");
        map.put("c","man");
        map.put("d","dog");
        MapShare mapSharing = new MapShare();
        System.out.println(mapSharing.mapShare(map));
    }



}
