package MatrixApplet.Dialogs;


public class TestingClass {

    int x, y;

    public TestingClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("The position is:");
        System.out.println("x: " + x + " | y: " + y);
    }
}
