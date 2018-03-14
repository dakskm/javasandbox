package completereference.part2.stringhandling.stringoveride;


public class Box {
    double width;
    double height;
    double depth;

    /**
     *
     * @param width
     * @param height
     * @param depth
     */
    Box(double width, double height, double depth) {
        width = width;
        height = height;
        depth = depth;
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "width: " + width + " height: " + height + " depth: " + depth;
    }
}
