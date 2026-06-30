package simulation;

import simulation.RandomInput;

public class random {
    public int[] b = new int[5];
    public int[] a = new int[5];
    public int[] p = new int[5];
    public int t;
    public int m = 10;
    public int n = 5;

    random() {
    }

    public static void main(String[] args) {
    }

    public void generate() {
        RandomInput e = new RandomInput(this.n, this.m);
        this.b = e.randomGeneration();
        RandomInput ee = new RandomInput(this.n, this.m);
        this.a = ee.randomGeneration();
        RandomInput eee = new RandomInput(this.n, this.m);
        this.p = eee.randomGeneration();
        this.t = 4;
    }
}
