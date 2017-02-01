import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Christian on 1/31/2017.
 */
public class main {
    public static void main(String[]args) throws IOException{

        File inputFile = new File("TestFile1.txt");
        Scanner data = new Scanner(inputFile);
        int Student = data.nextInt();
        int avgGrades = data.nextInt();
        double gradebook[][] = new double [Student + 1][avgGrades + 1];

        for (int i = 0; i< Student; i++) {
            for (int j=0; j<avgGrades; j++) {
                gradebook[i][j] = data.nextDouble();
            }
        }
        for (int i = 0; i< Student; i++) {
            double studentTotal = 0;
            for (int j=0; j<avgGrades; j++) {
                studentTotal = studentTotal + gradebook[i][j];
            }
            gradebook[i][avgGrades] = studentTotal/avgGrades;
        }
        for (int j=0; j<avgGrades; j++) {
            double avgGradesTotal = 0;
            for (int i = 0; i< Student; i++) {
                avgGradesTotal = avgGradesTotal + gradebook[i][j];
            }
            gradebook[Student][j] = avgGradesTotal/ Student;
        }
        /*try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }*/
    }
}
