package Strings;

public class ShortestPathUsingDirections {

    public static void findShortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }
        double shortPath = Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
        System.out.println(shortPath);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        findShortestPath(str);
    }
}