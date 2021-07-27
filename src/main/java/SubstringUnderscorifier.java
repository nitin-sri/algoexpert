import java.util.ArrayList;
import java.util.List;

public class SubstringUnderscorifier {
    public String underscorifySubstring(String str, String substring){
        List<Integer[]> locations = getLocations(str,substring);

        return null;
    }

    public List<Integer[]> getLocations(String str, String substring){
        List<Integer[]> locations = new ArrayList<>();
        int length = str.length();
        int startIdx = 0;
        int location = 0;
        while(location != -1) {
            location = str.indexOf(substring, startIdx);
            if(location != -1){
                locations.add(new Integer[]{location, location+4});
                startIdx = location+1;
            }
        }

        return locations;
    }

    public List<Integer[]> collapse(List<Integer[]> locations){
        return null;
    }

    public String underscorify(String str, List<Integer[]> locations ){
        return null;
    }
}
