package simulation;

public class priority {
    private double averageWaitingTime;
    private int[] burstTime;
    private int[] waitingTime;
    private int[] Priority;
    private int num;
    private int[] pid1;
    private int[] test;

    public priority(int n, int[] prior, int[] burst) {
        this.test = new int[n];
        this.pid1 = new int[n];
        this.num = n;
        this.burstTime = new int[n];
        this.waitingTime = new int[n];
        this.Priority = new int[n];
        int i = 0;
        while (i < this.num) {
            this.waitingTime[i] = 0;
            this.Priority[i] = prior[i];
            this.burstTime[i] = burst[i];
            ++i;
        }
    }

    public double printWaitingTime() {
        int i = 0;
        while (i < this.num) {
            this.averageWaitingTime += (double)this.waitingTime[i];
            ++i;
        }
        int sum = 0;
        int i2 = 0;
        while (i2 < this.num) {
            this.waitingTime[this.pid1[i2]] = (sum += this.burstTime[this.pid1[i2]]) - this.burstTime[this.pid1[i2]];
            ++i2;
        }
        double sum1 = 0.0;
        int i3 = 0;
        while (i3 < this.num) {
            sum1 += (double)this.waitingTime[i3];
            ++i3;
        }
        this.averageWaitingTime = sum1 / (double)this.num;
        return this.averageWaitingTime;
    }

    public double calcAverageWaitingTime() {
        boolean sum = false;
        int x = 0;
        int i = 0;
        while (i < this.num) {
            this.test[i] = this.Priority[i];
            ++i;
        }
        int max = this.test[0];
        int i2 = 0;
        while (i2 < this.num) {
            if (this.test[i2] > max) {
                max = this.test[i2];
            }
            ++i2;
        }
        ++max;
        i2 = 0;
        while (i2 < this.num) {
            int min = max;
            int j = 0;
            while (j < this.num) {
                if (this.test[j] != -1 && this.test[j] < min) {
                    min = this.test[j];
                    x = j;
                } else if (this.test[j] != -1 && this.test[j] == min && this.burstTime[j] < this.burstTime[x]) {
                    min = this.test[j];
                    x = j;
                }
                ++j;
            }
            this.pid1[i2] = x;
            this.test[x] = -1;
            ++i2;
        }
        return this.printWaitingTime();
    }
}
