package week3;

public class Triangle {
    public int base;
    public int height;

public Triangle (int a, int t) {
    base = a;
    height = t;
}

double countArea() {
 return 0.5 * base * height;
}

double countPerimeter() {
    double hypotenusa = Math.sqrt(((0.5 * base) * (0.5 * base) + height * height));
 return 2 * hypotenusa + base;
}
}
