import com.allstate.builder.*;

public class Main {
    public  static void main(String[] args){
        Room r1 = new Room("Kitchen", FloorType.Tile, 3.25, PaintType.Matte, 0.51, 10,10, 10);
        Room r2 = new Room("Bedroom", FloorType.Brick, 2.00, PaintType.Gloss, 0.75, 10, 10, 10);

        House h1 = new House();
        h1.addRoom(r1);
        h1.addRoom(r2);
        h1.addRoom(r1);
        System.out.println("Total Floor Cost of the House: " + h1.floorCost());
        System.out.println("Total Paint Cost of the House: " + h1.paintCost());
        System.out.println("Total House Cost: " + h1.totalCost());
    }
}
