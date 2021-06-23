package vn.plusplus.javacore.lesson8;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // Bao, Khang, Hieu, Lam, Nhi
        //Data: ten, tuoi, ngay sinh

        //Xac dinh cac ban nam trong 1 lop

        // Bao (nextSvien = Khang)

        // Khang (nextSvien = Hieu)
        // Khang (prevousSvien = Bao)

        // Hieu (nextSvien = Kiem)
        // Hieu (prevousSvien = Khang)

        // Kiem (nextSvien = Lam)
        // Kiem (preveousSvien = Hieu)

        // Lam (nextSvien = Nhi)
        // Lam (preveousSvien = Kiem)

        // Nhi (preveouseSvien = Lam)
        // Nhi (nextSvien = null)

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(2);
        nums.add(10);
        nums.add(5);

        System.out.println("So phan tu: " + nums.size());
        nums.remove(0);
        System.out.println("So phan tu: " + nums.size());

    }
}
