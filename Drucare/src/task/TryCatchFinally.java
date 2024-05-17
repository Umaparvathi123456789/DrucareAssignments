package task;

import java.io.IOException;
import java.sql.SQLException;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            // s1
            // s2
            // s3
            System.out.println("Executing s1");
            System.out.println("Executing s2");
            System.out.println("Executing s3");

            try {
                // s4
                // s5
                // s6
                System.out.println("Executing s4");
                System.out.println("Executing s5");
                System.out.println("Executing s6");
            } catch (Exception e) {
                // s7
                System.out.println("Executing s7");
            } finally {
                // s8
                System.out.println("Executing s8");
            }

            // s9
            System.out.println("Executing s9");
        } catch (Exception e) {
            // s10
            System.out.println("Executing s10");
        } finally {
            // s11
            System.out.println("Executing s11");
        }

        // s12
        System.out.println("Executing s12");
    }
}
