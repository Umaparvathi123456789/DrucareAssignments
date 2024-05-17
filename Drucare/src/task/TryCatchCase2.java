package task;

public class TryCatchCase2 
{
    public static void main(String[] args) {
        int caseNumber = 2; // Change the case number to test different scenarios

        try {
            s1();
            s2(); // Potential exception here
            s3();

            try {
                s4();
                s5();
                s6();
            } catch (X e) {
                s7();
            } finally {
                s8();
            }

            s9();
        } catch (Y e) {
            s10();
        } finally {
            s11();
        }

        s12();
    }

    static void s1() {
        System.out.println("Executing s1");
    }

    static void s2() throws Y {
        System.out.println("Executing s2");
        // Simulating an exception occurring at s2
        throw new Y();
    }

    static void s3() {
        System.out.println("Executing s3");
    }

    static void s4() {
        System.out.println("Executing s4");
    }

    static void s5() {
        System.out.println("Executing s5");
    }

    static void s6() {
        System.out.println("Executing s6");
    }

    static void s7() {
        System.out.println("Executing s7");
    }

    static void s8() {
        System.out.println("Executing s8");
    }

    static void s9() {
        System.out.println("Executing s9");
    }

    static void s10() {
        System.out.println("Executing s10");
    }

    static void s11() {
        System.out.println("Executing s11");
    }

    static void s12() {
        System.out.println("Executing s12");
    }

    // Custom Exception classes
    static class X extends Exception {
    }

    static class Y extends Exception {
    }
}


}
