import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class CalculatorModel {
    private int calculationValue;
    private char op;
    public void calculate(int firstNumber, int secondNumber){

        if(op=='+')
            calculationValue = firstNumber + secondNumber;
        else if(op=='-')
            calculationValue = firstNumber - secondNumber;
        else if(op=='*')
            calculationValue = firstNumber * secondNumber;
        else if(op=='/')
            calculationValue = firstNumber / secondNumber;
    }
    public int getCalculationValue(){
        return calculationValue;
    }
    public void setop(char op) {
        this.op = op;
    }
    public void writetofile(int firstNumber,int secondNumber) {
        try {
            FileWriter myWriter = new FileWriter("store.txt",true);
            myWriter.write(Integer.toString(firstNumber));
            myWriter.write(op);
            myWriter.write(Integer.toString(secondNumber));
            myWriter.write("=");
            myWriter.write(Integer.toString(calculationValue));
            myWriter.write("\n");
            myWriter.close();
            } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public String history() {
        try {
        Path fileName = Path.of("store.txt");
        String actual = Files.readString(fileName);
        return actual;
        }
        catch(IOException e) {
            System.out.println("An error Occurred");
            e.printStackTrace();
        }
        return "";
    }
}