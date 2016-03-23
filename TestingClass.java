package MatrixApplet.Dialogs;


public class TestingClass {

    Sting name;
    int x, y;

    public TestingClass(int x, int y) {
        this.x = x;
        this.y = y;

        name = "Unnamed";
    }

    public void print() {
        System.out.println("The position is:");
        System.out.println("x: " + x + " | y: " + y);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
