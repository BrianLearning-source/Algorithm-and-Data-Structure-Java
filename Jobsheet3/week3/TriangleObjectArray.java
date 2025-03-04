package week3;

public class TriangleObjectArray {
    public static void main(String[] args) {
        Triangle triangleObject[] = new Triangle[4];

        triangleObject[0] = new Triangle(10, 4);
        triangleObject[1] = new Triangle(20, 10);
        triangleObject[2] = new Triangle(15, 6);
        triangleObject[3] = new Triangle(25, 10);
    
        for (int i = 0; i < triangleObject.length; i++) {
        System.out.println("Base : " + triangleObject[i].base + " and height : " + triangleObject[i].height 
        + " have count Area : " + triangleObject[i].countArea() + " and count Perimeter : " + triangleObject[i].countPerimeter());
        }
    }
    }

