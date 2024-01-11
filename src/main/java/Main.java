import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Integer rollingSum = 0;
        try {
            File myObj = new File("src/main/resources/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String wholeData = myReader.nextLine();
//                Swap out the next line depending on if you're doing part 1 or 2

//                rollingSum += getIDifValid(wholeData);
                rollingSum += getPowerCubes(wholeData);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.print(rollingSum);
    }

    public static Integer getPowerCubes(String wholeData) {
        String[] headerAndData = wholeData.split(":");
        String ID = headerAndData[0].split(" ")[1];
        return calculatePowerCubes(headerAndData[1]);
    }

//    Set max number of cubes of each colour in here
    private static Integer calculatePowerCubes(String data) {
        String[] cubesData = data.split(" ");
        int minRed = 0;
        int minGreen = 0;
        int minBlue = 0;
        for (int i = 1; i < cubesData.length; i+=2) {
            if (cubesData[i+1].charAt(0) == 'r'){
                if (Integer.parseInt(cubesData[i]) > minRed) {
                    minRed = Integer.parseInt(cubesData[i]);
                }
            } else if (cubesData[i+1].charAt(0) == 'g'){
                if (Integer.parseInt(cubesData[i]) > minGreen) {
                    minGreen = Integer.parseInt(cubesData[i]);
                }
            } else if (cubesData[i+1].charAt(0) == 'b'){
                if (Integer.parseInt(cubesData[i]) > minBlue) {
                    minBlue = Integer.parseInt(cubesData[i]);
                }
            } else {
                System.out.println("Warning, colour not recognised");
            }
        }
        return minRed*minGreen*minBlue;
    }

    public static Integer getIDifValid(String wholeData) {
        String[] headerAndData = wholeData.split(":");
        String ID = headerAndData[0].split(" ")[1];
        if (validateCubes(headerAndData[1])){
            return Integer.parseInt(ID);
        } else {
            return 0;
        }
    }

    //    Set max number of cubes of each colour in here
    private static boolean validateCubes(String data) {
        String[] cubesData = data.split(" ");
        boolean isValid = true;
        for (int i = 1; i < cubesData.length; i+=2) {
            if (cubesData[i+1].charAt(0) == 'r'){
                if (Integer.parseInt(cubesData[i]) > 12) {
                    return false;
                }
            } else if (cubesData[i+1].charAt(0) == 'g'){
                if (Integer.parseInt(cubesData[i]) > 13) {
                    isValid = false;
                }
            } else if (cubesData[i+1].charAt(0) == 'b'){
                if (Integer.parseInt(cubesData[i]) > 14) {
                    isValid = false;
                }
            } else {
                System.out.println("Warning, colour not recognised");
                isValid = false;
            }
        }
        return isValid;
    }
}
