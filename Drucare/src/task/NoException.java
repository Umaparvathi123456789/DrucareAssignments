package task;

public class NoException {
	 public static void main(String[] args) {
	        try {
	            s1();
	            s2();
	            s3();

	            try {
	                s4();
	                s5();
	                s6();
	            } catch (Exception e) {
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

	    static class X extends Exception {
	    }

	    static class Y extends Exception {
	    }
}
