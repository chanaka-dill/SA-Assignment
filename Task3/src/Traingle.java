public class Traingle implements Shape {

    @Override
    public void draw() {
        int height = 8;
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < height - x - 1; y++) {
                System.out.println(" ");
            }
            for (int i = 0; i <= x; i++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
