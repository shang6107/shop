public class MainTest {
    public static void main(String[] args) throws Exception {
        Class<MainTest> mainTestClass = MainTest.class;
        int available = mainTestClass.getClassLoader().getResourceAsStream("/jdbc.properties").available();
        System.out.println("available = " + available);
//        System.out.println(.getResource("/META-INF/jdbc.properties"));
    }
}
