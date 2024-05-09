package patterns.patternBridge;

public class Solution {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(new Red());
        rectangle.draw();
    }
}
