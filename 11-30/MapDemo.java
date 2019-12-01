import java.util.HashMap;
import java.util.Map;
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("作者","鲁迅");
        map.put("题目","狂人日记");
        map.put("时间","1910");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
        map.put("时间","1900");
        map.put("页数","300");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("标题"));
        System.out.println(map.get("作者"));
    }
}
