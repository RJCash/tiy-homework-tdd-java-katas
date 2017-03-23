import org.junit.Test;
import java.util.HashMap;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by rickiecashwell on 3/23/17.
 */
public class String3Test {
@Test
    public void isStringCounted(){
    String3 string = new String3();
    int count = string.countTriple("kkkuuui");
    assertThat(2, equalTo(count));
}   @Test
    public void doesOrderMatter1(){
        String3 string = new String3();
        int count = string.countTriple("abYYYabXXXXXab");
        assertThat(4, equalTo(count));
    }
    @Test
    public void doesOrderMatterWithNumbers(){
        String3 string = new String3();
        int count = string.countTriple("222abyyycdXXX");
        assertThat(3, equalTo(count));
    }
    @Test
    public void NoString(){
        String3 string = new String3();
        int count = string.countTriple("");
        assertThat(0, equalTo(count));
    }
    @Test
    public void onlyOneCharacterString(){
        String3 string = new String3();
        int count = string.countTriple("a");
        assertThat(0, equalTo(count));
    }
    @Test
    public void overlappingTripleTest(){
        String3 string = new String3();
        int count = string.countTriple("XXXXXabc");
        assertThat(3, equalTo(count));
    }
}
