import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student myStudent = new Student();
        String name = myStudent.getName();
        System.out.println(name);
        String id = myStudent.getId();
        System.out.println(id);
        String years = myStudent.getYears();
        System.out.println(years);

        StarTriangle small = new StarTriangle();
        System.out.println(small.toString());

        Temperature temperature = new Temperature();
        temperature.getC();
        temperature.getF();
        System.out.println(temperature.getC());
        System.out.println(temperature.getF());


        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        int area = a * a;
        System.out.print("Square area = ");
        System.out.println(area);

//        Temperature temperature1 = new Temperature(42, 'C');
//        System.out.println("\t" + temperature1.getInC() + "°C");
//        System.out.println("\t" + temperature1.getInF() + "°F");
//
//
//        temperature1 = new Temperature(42, 'F');
//        System.out.println("\t" + temperature1.getInC() + "°C");
//        System.out.println("\t" + temperature1.getInF() + "°F");
    }
}