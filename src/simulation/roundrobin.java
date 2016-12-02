package simulation;

public class roundrobin {
    private double averageWaitingTime;
    private int[] pid;
    private int[] burstTime;
    private int[] waitingTime;
    private int num;
    private int[] pid1;
    private int[] test;
    private int timeQuantam;

    public roundrobin(int n, int q, int[] burst) {
        this.num = n;
        this.timeQuantam = q;
        this.pid = new int[n];
        this.burstTime = new int[n];
        this.waitingTime = new int[n];
        int i = 0;
        while (i < this.num) {
            this.waitingTime[i] = 0;
            this.burstTime[i] = burst[i];
            ++i;
        }
    }

    public double calcAverageWaitingTime() {
        int count = 0;
        int i = 0;
        while (i < this.num) {
            if (this.burstTime[i] % this.timeQuantam != 0) {
                ++count;
            }
            count += this.burstTime[i] / this.timeQuantam;
            ++i;
        }
        this.test = new int[count];
        this.pid1 = new int[count];
        int j = 0;
        int i2 = 0;
        do {
            if (this.burstTime[i2 %= this.num] != -1) {
                if (this.burstTime[i2] > this.timeQuantam) {
                    this.pid1[j] = i2;
                    this.test[j] = this.timeQuantam;
                    this.burstTime[i2] = this.burstTime[i2] - this.timeQuantam;
                } else if (this.burstTime[i2] <= this.timeQuantam) {
                    this.pid1[j] = i2;
                    this.test[j] = this.burstTime[i2];
                    this.burstTime[i2] = -1;
                }
                ++j;
            }
            if (j == count) break;
            ++i2;
        } while (true);
        int[] k = new int[this.num];
        int i3 = this.num - 1;
        while (i3 >= 0) {
            k[i3] = 0;
            --i3;
        }
        i3 = count - 1;
        while (i3 >= 0) {
            if (k[this.pid1[i3]] != 1) {
                j = i3 - 1;
                while (j >= 0) {
                    if (this.pid1[j] != this.pid1[i3]) {
                        this.waitingTime[this.pid1[i3]] = this.waitingTime[this.pid1[i3]] + this.test[j];
                    }
                    --j;
                }
                k[this.pid1[i3]] = 1;
            }
            --i3;
        }
        i3 = 0;
        while (i3 < this.num) {
            this.averageWaitingTime += (double)this.waitingTime[i3];
            ++i3;
        }
        this.averageWaitingTime /= (double)this.num;
        return this.averageWaitingTime;
    }
}