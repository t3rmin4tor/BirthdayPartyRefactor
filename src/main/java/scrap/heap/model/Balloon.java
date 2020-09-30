package scrap.heap.model;

public class Balloon implements Product {
    private final Color color;
    private final String material;

    public Balloon(Color color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Balloon[" + color + ", " + material + "]";
    }

    public static class Builder {

        private Color color;
        private String material;

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder material(String material) {
            this.material = material;
            return this;
        }

        public Balloon build() {
            return new Balloon(color, material);
        }
    }
}
