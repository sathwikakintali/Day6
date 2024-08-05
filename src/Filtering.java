import java.util.stream.*;
import java.util.*;
public class Filtering {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("amm","bkk","ahji","jlnh","atuibg","kdb");
        List<String> filterlist = l.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
        System.out.println(filterlist);
    }
}
