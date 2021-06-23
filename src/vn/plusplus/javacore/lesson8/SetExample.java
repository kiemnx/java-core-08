package vn.plusplus.javacore.lesson8;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create set
        Set<String> items = new HashSet<>();
        items.add("A02"); // Add new item
        items.add("D03");
        items.add("D03"); // item is ignored
        items.add("01");
        items.add("04");

        for (String item: items) {
            System.out.print(item + " ");
        }
    }

}
