package MatrixApplet.Dialogs;


public class TestingClass {
    private TestingClass tester;

    public static void main(String[] args) {
        tester = new TestingClass(10, 10);

        doIt();
    }

    static void doIt() {
        tester.getName();
    }
}
