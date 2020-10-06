public class ClassNameTest {
    public static String validClassName = "C0318G";
    public static String[] invalidClassName = {"M0318G", "P0323A"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        System.out.println(className.validate(validClassName));
        for (int i = 0; i < invalidClassName.length; i++) {
            boolean isValid = className.validate(invalidClassName[i]);
            System.out.println(isValid);
        }
    }
}
