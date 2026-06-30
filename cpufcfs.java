package simulation;

public class cpufcfs {
    private int[] burstTime;
    private int[] waitingTime;
    private double averageWaitingTime;
    private int n;

    public cpufcfs(int na, int[] burst) {
        this.burstTime = new int[na];
        this.waitingTime = new int[na];
        int i = 0;
        while (i < na) {
            this.burstTime[i] = burst[i];
            ++i;
        }
        this.n = na;
    }

    public double printWaitingTime() {
        double s = 0.0;
        int i = 0;
        while (i < this.n) {
            s += (double)this.waitingTime[i];
            ++i;
        }
        this.averageWaitingTime = s / (double)this.n;
        return this.averageWaitingTime;
    }

    public double averageWaitingTimeCalc() {
        this.waitingTime[0] = 0;
        int i = 1;
        while (i < this.n) {
            this.waitingTime[i] = this.burstTime[i - 1] + this.waitingTime[i - 1];
            ++i;
        }
        return this.printWaitingTime();
    }
}
