package sol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Courses {
    public Courses() {}

    public static String findCourseCodes(String input) {
        String courseCodes = new String();
        courseCodes = RegexMatcher.regexifier(input, "[A-Z]{3,4}[0-9]{4}([A-Z]{1})?");
        return courseCodes;

    }

    public static void run() {

        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
            String type = r.readLine();
            while (type != null) {
                System.out.println(findCourseCodes(type));
                type = r.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        run();
    }
}
