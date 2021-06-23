package vn.plusplus.javacore.lesson8;

import vn.plusplus.javacore.lesson5.activity53.Question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArrayListTest {
    public static void main(String[] args) {
        /*int[] nums = new int[10];

        int[] nums2 = new int[11];
        nums2[10] = 10;*/

        ArrayList<Integer> numbers = new ArrayList<>();

        List<Integer> number2 = new ArrayList<>();

        List<Integer> number3 = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(10);
        numbers.add(5);

        System.out.println("So luong phan tu: " + numbers.size());

        numbers.add(6);
        System.out.println("So luong phan tu: " + numbers.size());

        numbers.remove(0);
        System.out.println("So luong phan tu: " + numbers.size());

        ArrayList<Question> questions = new ArrayList<>();
        Question ques1 = new Question();
        //Setter

        questions.add(ques1);

        for(Question qu : questions){

        }
        for(int i= 0; i<questions.size(); i++){
            questions.get(i); // questions[i]
        }

    }
}
