package firstProblem;
import java.util.*;
class Data{
	private double sum;
	private double max;
	private int cnt;
	
	public Data() {
		sum = 0;
		max = -9999999999.9;
		cnt = 0;
	}
	public void Value(double value) {
		sum +=value;
		if (value > max) {
			max = value;
		}
		cnt++;
	}
	public double Avarage() {
		return sum / cnt;
	}
	public double Max() {
		return max;
		
	}
}

class Analyzer{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Data data  = new Data();
		boolean run = true;
		while (run) {
			System.out.print("Enter number (Q to quit): ");
			String number = input.next();
			
			if (number.equals("Q")) {
				break;
			}
			double value = Double.parseDouble(number);
			data.Value(value);
		}
		
		System.out.println("Average = " + data.Avarage());
	    System.out.println("Maximum = " + data.Max());
	    
	    input.close();
	}
	
}