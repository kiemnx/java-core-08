package vn.plusplus.javacore.lesson5;


public class MainTest {
    private String a = "";

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        mainTest.a = "Hello";

        //Sx tu lanh model A
        Refrigerator tuLanh1 =
                new Refrigerator(12, 50, "Black", "MODEL_A_001", 10000000);
        /*tuLanh1.setEggNumber(12);
        tuLanh1.setLitter(50);
        tuLanh1.setColor("Black");
        tuLanh1.setSerialNumber("MODEL_A_001");
        tuLanh1.setPrice(10000000);*/



       Refrigerator tuLanh2 = new Refrigerator();
       tuLanh1.setEggNumber(12);
       /*  tuLanh2.eggNumber = 12;
        tuLanh2.litter = 50;
        tuLanh2.color = "Grey";
        tuLanh2.serialNumber = "MODEL_A_002";
        tuLanh2.price = 10000000;

        //Model B
        Refrigerator tuLanh3 = new Refrigerator();
        tuLanh3.eggNumber = 18;
        tuLanh3.litter = 130;
        tuLanh3.color = "Black";
        tuLanh3.serialNumber = "MODEL_B_001";
        tuLanh3.price = 15000000;*/

        tuLanh1.printInfo();

        tuLanh1.setEggNumber(-1);
        System.out.println(tuLanh1.getEggNumber());

        tuLanh1.printInfo();

    }


  /* private static void printRefrigeratorInfo(Refrigerator input){
        System.out.println("Egg number: " + input.eggNumber);
        System.out.println("Litter: " + input.litter);
        System.out.println("Color: " + input.color);
        System.out.println("Serial: " + input.serialNumber);

    }*/
}
