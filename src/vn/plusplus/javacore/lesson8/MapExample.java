package vn.plusplus.javacore.lesson8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){
        Map<String, String> hashMap = new HashMap<>();
        // Thêm value vào trong hashMap với key tương ứng
        // sử dụng phương thức put()
        hashMap.put("Thu nhat", "Nhi");
        hashMap.put("Thu hai", "Lam");
        hashMap.put("Thu ba", "Hieu");
        hashMap.put("Thu bon", "Khang");
        hashMap.put("Thu nam", "Nhi");
        // Get by key
        String numberStr = hashMap.get("Nhi");
        System.out.println(numberStr);
    }

}
