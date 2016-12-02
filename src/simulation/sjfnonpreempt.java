package simulation;

public class sjfnonpreempt {
    public int value;
    public int[] arrivalTime;
    public int[] burstTime;
    public int[] waitingTime;
    public double averageWaitingTime;
    public int s = 0;

    sjfnonpreempt(int n, int[] a, int[] b) {
        this.burstTime = new int[n];
        this.waitingTime = new int[n];
        this.value = n;
        int i = 0;
        while (i < this.value) {
            this.burstTime[i] = b[i];
            ++i;
        }
        this.sort();
    }

    public void sort() {
        int c = 0;
        while (c < this.value - 1) {
            int d = 0;
            while (d < this.value - c - 1) {
                if (this.burstTime[d] > this.burstTime[d + 1]) {
                    int swap = this.burstTime[d];
                    this.burstTime[d] = this.burstTime[d + 1];
                    this.burstTime[d + 1] = swap;
                }
                ++d;
            }
            ++c;
        }
    }

    public void averageWaitingTimeCalc() {
        this.waitingTime[0] = 0;
        int i = 1;
        while (i < this.value) {
            this.s += this.burstTime[i - 1];
            this.waitingTime[i] = this.s;
            ++i;
        }
    }

    public double printWaitingTime() {
        this.s = 0;
        int i = 0;
        while (i < this.value) {
            this.s += this.waitingTime[i];
            ++i;
        }
        this.averageWaitingTime = (double)this.s * 1.0 / (double)this.value;
        return this.averageWaitingTime;
    }
}
