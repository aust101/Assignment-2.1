import java.util.Scanner;

public class Main {

    private boolean running = true;
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        System.out.println("ACO-Grader has been started! You may use the key word \"exit\", to stop this application at any time!");
        while (running) {
            System.out.println("Please enter a grade to format into letter format!");
            String input = scanner.nextLine();
            try {
                double grade = Double.valueOf(input);
                if(grade >= 0) {
                    String letterGrade = getLetterGrade(grade);
                    System.out.println(grade + " = " +letterGrade);
                }
                else {
                    System.out.println("Please enter a number greater than or equal to 0!");
                }
            }
            catch (NumberFormatException exception) {
                if(input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("stop")) {
                    shutdown();
                }
                else {
                    System.out.println("You have entered an invalid input! Please enter either a decimal grade, or use \"exit\" to stop this application!");
                }
            }
        }
        System.out.println("ACO-Grader has been shutdown! Have a nice day!");
    }

    private String getLetterGrade(double grade) {
        if(grade >= 93) {
            return "A";
        }
        else if(grade >= 90) {
            return "A-";
        }
        else if(grade >= 86) {
            return "B+";
        }
        else if(grade >= 83) {
            return "B";
        }
        else if(grade >= 80) {
            return "B-";
        }
        else if(grade >= 76) {
            return "C+";
        }
        else if(grade >= 70) {
            return "C";
        }
        else if(grade >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }

    private void shutdown() {
        running = false;
    }
}
