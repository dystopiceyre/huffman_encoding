package greenriver.dev;

public class HuffmanNode implements Comparable<HuffmanNode> {
    private char data;
    private double frequency;
    private HuffmanNode left;
    private HuffmanNode right;

    HuffmanNode(char data, double frequency) {
        this.data = data;
        this.frequency = frequency;
        left = null;
        right = null;
    }

    HuffmanNode(char data, double frequency, HuffmanNode left, HuffmanNode right) {
        this.data = data;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(HuffmanNode comparison) {
        return 0;
    }

    @Override
    public String toString() {
        return "{data=" + data +
                ", frequency=" + frequency +
                '}';
    }
}
