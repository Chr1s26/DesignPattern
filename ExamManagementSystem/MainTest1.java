package ExamManagementSystem;



import java.io.IOException;

public class MainTest1 {
    public static void main(String[] args) throws IOException {
        ExamService examService = new ExamService();
        
        examService.createExam();
        examService.displayExam();
    }
}

