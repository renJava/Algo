package fundamental.immutable_interface;

public class ImmInterfacePoint implements ImmInterface {
    private final double x;
    private final double y;

    public ImmInterfacePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

