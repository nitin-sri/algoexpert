import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SubstringUnderscorifierTest {

    private SubstringUnderscorifier substringUnderscorifier = new SubstringUnderscorifier();
    private String str = "testthis is a testtest to see if testestest it works";
    private String substr = "test";

    @BeforeAll
    public static void setup(){

    }

    @Test
    public void testUnderscorifySubstring(){
        String underscorifiedString  = substringUnderscorifier.underscorifySubstring(str, substr);
    }

    @Test
    public void testGetLocations(){
        List<Integer[]> locations = substringUnderscorifier.getLocations(str, substr);
        for (Integer[] location : locations) {
            System.out.println(location[0]+","+location[1]);
        }

    }
}
