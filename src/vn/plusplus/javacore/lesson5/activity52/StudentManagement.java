package vn.plusplus.javacore.lesson5.activity52;

public class StudentManagement {
    private int n;
    private Student[] students;

    public StudentManagement(Student[] students) {
        this.students = students;
    }

    public int demSVDo(){
        int counter = 0;
        for(Student st : students){
            boolean check = st.checkGPA();
            if(check == true){
                counter = counter + 1;
            }
        }
        return counter;
    }

    public int demSVTruot(){
        int counter = 0;
        for(Student st : students){
            boolean check = st.checkGPA();
            if(check == false){
                counter = counter + 1;
            }
        }
        return counter;
    }

    public Student timSVGPACaoNhat(){
        Student maxStudent = students[0];

        for(Student st: students){
            if(st.getGpa() > maxStudent.getGpa()){
                maxStudent = st;
            }
        }
        return maxStudent;
    }

    public Student timSVGPAThapNhat(){
        Student minStudent = students[0];
        for(Student st : students){
            if(st.getGpa() < minStudent.getGpa()){
                minStudent = st;
            }
        }
        return minStudent;
    }

    // 3,1,4,5,2,6
    /*
    *   max = 6
    *
    * */
}
