package _6;

/**
 * 分解临时变量
 * */
public class Split_Temporary_Variable {

    private double height = 1, width = 2;

    private double primaryForce = 3, mass = 4, secondaryForce = 5;
    int delay = 6;

    public void test() {
        final double perimeter = 2 * (height * width);
        System.out.println(perimeter);
        final double area = height * width;
        System.out.println(area);
    }

    //范例2
    double getDistanceTravelled(int time) {
        double result;
        double acc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - delay;
        if(secondaryTime > 0) {
            double primaryVel = acc * delay;
            acc = (primaryForce + secondaryForce) / mass;
            result += primaryVel + secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
    }
}