package thirdProblem;
import java.util.*;
public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getValue() {
        return this.value;
    }

    public char getScale() {
        return this.scale;
    }

    public double getCelsius() {
        if (scale == 'F') {
            return (this.value - 32) * 5 / 9;
        } else {
            return this.value;
        }
    }

    public double getFahrenheit() {
        if (scale == 'C') {
            return (this.value * 9 / 5) + 32;
        } else {
            return this.value;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getTemperatureScale() {
        return this.scale;
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please, write your temperature value: ");
    	Double value = input.nextDouble();
    	input.close();
        Temperature temp1 = new Temperature(value, 'F');
        System.out.println("Temperature 1: " + temp1.getValue() + " " + temp1.getScale());
        System.out.println("Temperature 1 in Celsius: " + temp1.getCelsius());
        System.out.println("Temperature 1 in Fahrenheit: " + temp1.getFahrenheit());


    }
}
