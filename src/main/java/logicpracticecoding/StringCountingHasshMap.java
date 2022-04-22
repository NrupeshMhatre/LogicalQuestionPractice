package logicpracticecoding;
import java.util.HashMap;
import java.util.Map;
public class StringCountingHasshMap {

	public static void main(String[] args) {
        String str = "Alice is girl and Bob is boy";
        Map<String, Integer> m =new HashMap();
        String[] words=str.split(" ");
        for(String word:words) {
        	Integer i=m.get(word);
        	if(i==null) {
        		m.put(word, 1);
        	}else {
        		m.put(word, i+1);
        	}
        }
        System.out.print(m);
    }
}
