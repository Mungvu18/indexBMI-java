import java.util.Scanner;

public class IndexBmi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("moi ban nhap can nang dv kg");
        double weight = s.nextDouble();
        System.out.println("moi ban nhao chieu cao dv m");
        double height = s.nextDouble();
        double bmi = weight/Math.pow(height,2);
        if(bmi<18.5){
            System.out.println("Underweight");
        } else if(bmi<25.0){
            System.out.println("Normal");
        } else if(bmi<30){
            System.out.println("Overweight");
        } else if(30<= bmi){
            System.out.println("Obese");
        } else {
            System.out.println("Moi ban nhap lai");
        }
    }
}
