package scrap.heap.model;

public class Cake implements Product {
    private final String flavor;
    private final String frostingFlavor;
    private final String shape;
    private final String size;
    private final String color;

    public Cake(String flavor, String frostingFlavor, String shape, String size, String color) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cake[" + flavor + ", " + frostingFlavor + ", " + shape + ", " + size + ", " + color + "]";
    }

    public static class Builder {

        private String flavor;
        private String frostingFlovor;
        private String shape;
        private String size;
        private String color;

        public Builder flavor(String flavor) {
            this.flavor = flavor;
            return this;
        }

        public Builder frostingFlovor(String frostingFlovor) {
            this.frostingFlovor = frostingFlovor;
            return this;
        }

        public Builder shape(String shape) {
            this.shape = shape;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Cake build() {
            return new Cake(flavor, frostingFlovor, shape, size, color);
        }
    }
}
