package ExceptionAndDebug;

public class Triagle extends TriagleException{
    private int sizeA;
    private int sizeB;
    private int sizeC;

    public Triagle(int sizeA, int sizeB, int sizeC) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    @Override
    public String toString() {
        return String.format("Size A: %s, Size B: %s, Size C: %s", sizeA, sizeB, sizeC);
    }
}
