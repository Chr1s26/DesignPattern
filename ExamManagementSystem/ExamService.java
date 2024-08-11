package ExamManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamService {
    static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    Exam exam = new Exam();
    
    public void createExam() throws IOException {
        System.out.println("Enter the number of questions for the exam:");
        int numberOfQuestions = Integer.parseInt(bReader.readLine());
        
        Question[] questions = new Question[numberOfQuestions];
        
        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.printf("Creating question %d\n", i + 1);
            QuestionService questionService = new QuestionService();
            
            questionService.createQuestion();
            
            questionService.createMultipleChoice();
            
            questionService.createAnswer();
            
            questions[i] = questionService.getQuestionObject(); 
        }
        
        exam.setQuestions(questions);
    }
    
    public void displayExam() {
        Question[] questions = exam.getQuestions();
        for (int i = 0; i < questions.length; i++) {
            System.out.printf("\nQuestion %d: %s\n", i + 1, questions[i].getQuestion());
            String[] choices = questions[i].getMultipleChoices();
            for (int j = 0; j < choices.length; j++) {
                System.out.printf("    %d. %s\n", j + 1, choices[j]);
            }
            System.out.printf("Answer: %s\n", questions[i].getanswer());
        }
    }
}
