public class CardMovement {
    public int[] moveCard(int rows, int cols, int startX, int startY, String[] moves) {
        int x = startX;
        int y = startY;
        
        for (String move : moves) {
            switch (move) {
                case "UP":
                    if (x > 0) x--;
                    break;
                case "DOWN":
                    if (x < rows - 1) x++;
                    break;
                case "LEFT":
                    if (y > 0) y--;
                    break;
                case "RIGHT":
                    if (y < cols - 1) y++;
                    break;
            }
        }
        
        return new int[] {x, y};
    }

    public static void main(String[] args) {
        CardMovement solution = new CardMovement();
        String[] moves = {"RIGHT", "DOWN", "LEFT", "UP"};
        int[] finalPosition = solution.moveCard(3, 3, 0, 0, moves);
        System.out.println("Final position: (" + finalPosition[0] + ", " + finalPosition[1] + ")");
    }
}