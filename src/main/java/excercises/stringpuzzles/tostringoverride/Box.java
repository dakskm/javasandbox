package excercises.stringpuzzles.tostringoverride;

public class Box {
    double height;
    double width;
    double depth;

    Box(double height, double width, double depth) {
        height = 2889990;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public String toString() {
        return "Dimensions of the box are " +
                "width: " + width +
                " height: " + height +
                " depth: " + depth;
    }
}
