import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Какое имя файла?");
        Scanner nameFile = new Scanner(System.in);
        String name = nameFile.nextLine();
        double massiv[]=task4(name);
        System.out.println("содержит" + Arrays.toString(massiv));
        double result=Massiv.median(massiv);
        System.out.println(result);
    }
    public static double[] task4(String f) {
        double[] massiv = new double[0];
        try {
            Scanner sc = new Scanner(new File(f));

            int n = sc.nextInt();
            massiv = new double[n];
            for (int i = 0; i < n; i++)
                massiv[i] = sc.nextDouble();

        } catch (IOException e) {
            System.out.println("нет");
        }

        return massiv;

    }
}
class Massiv {
    public static double median(double[] massiv) {
        Arrays.sort(massiv);
        int middle = massiv.length / 2;
        if (massiv.length % 2 == 0) {
            double left = massiv[middle - 1];
            double right = massiv[middle];
            return (left + right) / 2;
        } else {
            return (double) massiv[massiv.length/2];


                   }
    }
}