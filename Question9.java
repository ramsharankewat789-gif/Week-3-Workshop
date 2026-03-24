package Workshop;
class Box {
    private int width, height, depth;
    Box(int length) {
        width = height = depth = length;
    }
    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box() {
        width = 10;
        height = 8;
        depth = 12;
    }
    public void getVolume() {
        System.out.println("Volume = " + (width * height * depth));
    }
}
public class Question9 {
    public static void main(String[] args) {
        Box cube   = new Box(5);        
        Box cuboid = new Box(2, 3, 4);  
        Box def    = new Box();         
        cube.getVolume();
        cuboid.getVolume();
        def.getVolume();
    }
}