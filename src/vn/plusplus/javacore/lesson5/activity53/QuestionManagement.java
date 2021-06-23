package vn.plusplus.javacore.lesson5.activity53;

public class QuestionManagement {
    // Danh sách các câu hỏi
    private Question[] questions;
    // Khởi tạo không tham số và có tham số
    public QuestionManagement(){
    }
    public QuestionManagement(Question[] questions) {
        this.questions = questions;
    }
    // Tính điểm
    public String score(int k, int j){
        return  "Bạn trả lời được: "+k+"/"+j+" câu ở cấp độ này!";
    }
    // Kiểm tra độ khó
    public int find(int dokho){
        System.out.println("Độ khó "+dokho+" có các câu hỏi: ");
        int j=0;
        int totalQuestion = 0;
        for(int i=0;i<questions.length;i++) {
            if (dokho == questions[i].getLevel()) {
                System.out.println(" - Question" + (i + 1) + ": " + questions[i].getContent());
                System.out.println("            A. " + questions[i].getAnswer1());
                System.out.println("            B. " + questions[i].getAnswer2());
                System.out.println("            C. " + questions[i].getAnswer3());
                System.out.println("            D. " + questions[i].getAnswer4());
                totalQuestion = totalQuestion + 1;
            }else j++;
        }
        if (j == questions.length){
            System.out.println("+ Rất tiếc. Độ khó bạn chọn không có trong câu hỏi nào!");
            System.out.println("Muốn tiếp tục hãy run lại chương trình!");
            System.exit(0);
        }
        return totalQuestion;
    }

    public int tinhDiem(String answer, int dokho){
        //A,B,C,D
        String[] answers = answer.split(",");
        int index = 0;
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (dokho == questions[i].getLevel()) {
                String cauTraLoi = answers[index];
                boolean check = questions[i].answerCorrect(cauTraLoi);
                if(check){
                    score = score + 1;
                }
                index ++;
            }
        }
        return score;
    }
}
