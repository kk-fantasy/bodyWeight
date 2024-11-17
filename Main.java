package bodyWeight;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calculation bmi = new Calculation();
		
		System.out.println("身長を入力してください(メートル:");
		double height = scanner.nextDouble();
		bmi.setHeight(height);
		
		System.out.println("体重を入力してください(キログラム):");
		double bodyweight = scanner.nextDouble();
		bmi.setBodyweight(bodyweight);
		
		bmi.weightcalculation();
		
		scanner.close();
	}

}
