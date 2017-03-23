import org.junit.Test;
import java.util.HashMap;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
/**
 * Created by rickiecashwell on 3/23/17.
 */
public class MapShareTest {
    @Test
    public void doesMapRemoveCKey(){
        HashMap<String, String> map = new HashMap<>();
        MapShare mapSharing = new MapShare();
        map.put("a","horse");
        map.put("b","cat");
        map.put("c","man");
        map.put("d","dog");
        map = mapSharing.mapShare(map);
        assertThat(null, equalTo(map.get("c")));
    }
    @Test
    public void doesAKeyMatchBKey(){
        HashMap<String, String> map = new HashMap<>();
        MapShare mapSharing = new MapShare();
        map.put("a","horse");
        map.put("b","tiger");
        map.put("c","man");
        map.put("d","fast");
        map = mapSharing.mapShare(map);
        assertThat(map.get("a"), equalTo(map.get("b")));
    }
    @Test
    public void IstTheRestOfTheValuesUnchanged(){
        HashMap<String, String> map = new HashMap<>();
        MapShare mapSharing = new MapShare();
        map.put("a","horse");
        map.put("b","shark");
        map.put("c","man");
        map.put("d","track");
        map.put("e","extra");
        map.remove("c");
        map = mapSharing.mapShare(map);
        assertThat("extra", equalTo(map.get("e")));
        assertThat("track", equalTo(map.get("d")));
    }
}
