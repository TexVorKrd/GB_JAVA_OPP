package hw1.prodproterty;

/**
 * Список объемов напитков
 */
public enum DrinkVoluveSize {
    SMALL(0.5), MEDIUM(1.0), LARGE(1.5), EXTRA_LARGE(2.0);

    double volue;

    DrinkVoluveSize(double volue) {
        this.volue = volue;
    }

    public double getVolue() {
        return volue;
    }
}
