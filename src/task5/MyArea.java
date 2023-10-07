package task5;

public class MyArea {
    public static final float PI = 3.14f;
    public static float areaOfCircle(float radius){
        return radius * PI;
    }

    public static void main(String[] args) {
        float result = areaOfCircle(3.4f);

        System.out.println(result);
    }
}
