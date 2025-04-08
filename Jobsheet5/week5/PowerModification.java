package week5;

public class PowerModification {
    int basis, expo;

    PowerModification(int n, int e) {
        basis = n;
        expo = e;
    }

    int powerModifBF() {
        int result = 1;
        for (int i = 0; i < this.expo; i++) {
            result = result * this.basis;
        }
        return result;
    }

    int powerModifDC(int n, int e) {
        if (e == 1) {
            return n;
        } else {
            if(e % 2 == 1) {
                return (powerModifDC(n, e/2) * powerModifDC(n, e/2) * n);
            } else {
                return (powerModifDC(n, e/2) * powerModifDC(n, e/2));
            }
        }
    }
}
