package scrap.heap.model;

public class Balloon {
    private final Color color;
    private final String material;
    private final String number;

    public Balloon(Color color, String material, String number) {
        this.color = color;
        this.material = material;
        this.number = number;
    }

    public static class Builder {

        private Color color;
        private String material;
        private String number;

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder material(String material) {
            this.material = material;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Balloon build() {
            return new Balloon(color, material, number);
        }
    }
}
