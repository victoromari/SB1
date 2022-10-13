import java.util.Scanner;

/**
 * Skill Builder 3
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight = input.nextDouble();
        double wallWidth = input.nextDouble();
        double wallArea;
        wallArea = wallHeight * wallWidth;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;


        gallonsPaintNeeded = wallArea / squareFeetPerGallons;



        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");


        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");



        System.out.println("Wall area: %.0f square feet\n" + wallArea);

        System.out.println("Paint needed: %.2f gallons\n" + gallonsPaintNeeded);

        double paint = gallonsPaintNeeded + gallonsPerCan;
        cansNeeded = (int)paint;
        System.out.println("Cans needed: "+cansNeeded+ "cans");





    }
}
