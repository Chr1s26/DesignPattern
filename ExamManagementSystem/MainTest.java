package ExamManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] questionArrayList = new String[1000];
		String[][] choiceArrayList = new String[1000][4];
		int[] answerArrayList = new int[1000];
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of question ");
		int number = Integer.parseInt(bReader.readLine());
		
		for(int index = 0; index < number; index ++) {
			
			System.out.printf("Enter question %d ",index+1);
			questionArrayList[index] = bReader.readLine();
		
			for(int i = 0; i < 4; i++) {
				
				System.out.printf("Enter choice %d ",i);
				choiceArrayList[index][i] = bReader.readLine();
		}
			System.out.println("Enter the correct answer number (1-4) ");
			int answer = Integer.parseInt(bReader.readLine());
			answerArrayList[index] = answer;
		}
		
			System.out.println("The questions are :");
			for(int index = 0; index < number; index ++) {
				System.out.printf("\nQuestion %d: %s\n ",index+1,questionArrayList[index]);
				
				for(int i = 0; i < 4; i++) {
					System.out.printf("	%d. %s ",i+1,choiceArrayList[index][i]);
					
		}
				System.out.println("\n Correct answer is "+answerArrayList[index]);
				System.out.println("");
				}}
}
