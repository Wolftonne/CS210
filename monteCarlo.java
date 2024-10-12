import java.util.Random;

public class monteCarlo
{
    public static void main(String[]args)
    {
        int totalPoints = 1000000;
        int pointsInsideCircle = 0;

        Random random = new Random();

        for(int i = 0; i < totalPoints; i++)
        {
            double x = random.nextDouble();
            double y = random.nextDouble();

            if(x*x + y*y <= 1)
            {
                pointsInsideCircle++;
            }
        }

        double piEstimate = 4.0 * pointsInsideCircle / totalPoints;

        System.out.println("Estimated value of Pi: " + piEstimate);
    }
}
