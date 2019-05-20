
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.Graphics;
import java.util.Scanner;
import static javafx.application.Application.launch;

/**
 * A program to show randomly placed stars in the night sky
 * the user has to enter variousj legal x and y values where
 * the stars will appear in a sky of width 800 and height 700
 *
 * @author Aninyang, Mitchell. 000796709
 */
public class constellations extends Application {

    /**
     * Start method.
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    public static final int canvasWidth = 800;
    public static final int canvasHeight = 700;
    public static final int starWidth = 10;
    public static final int starHeight = 10;
    //public static final int canvasWidth = 800;
    //public static final int canvasWidth = 800;
    //public static final int canvasWidth = 800;
    //public static final int canvasWidth = 800;
    //public static final int canvasWidth = 800;

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(800, 700); // Set canvas Size in Pixels
        stage.setTitle("Assignment 1 - Constellations"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        //Declaring my constant variables

        // YOUR CODE STARTS HERE
        //canvas background
        gc.setFill(Color.rgb(2, 3, 33));
        gc.fillRect(0, 0, canvasWidth, canvasHeight);

        /**
         * Dialogue with user
         */
        Scanner in = new Scanner(System.in);              // Scanner variable declared as "in"
        System.out.println("How many stars would you want to create?");  //user number of stars
        int numberOfStars = in.nextInt();
        int counter = 0;

        //while loop for drawing the stars as the user enters the x and y values

        /**
        while (counter != numberOfStars) {
            System.out.println("Enter your X and Y values: ");
            int xStars = in.nextInt();
            int yStars = in.nextInt();

            gc.setFill(Color.rgb(239, 239, 40));
            gc.fillOval(xStars, yStars, starWidth, starHeight);
            gc.strokeLine();
            counter++;
        }
         */
        while (counter != numberOfStars) {
            if (counter != 2 || counter != 3) {
                System.out.println("Enter your X and Y values: ");
                int xStars = in.nextInt();
                int yStars = in.nextInt();
                while (xStars > canvasWidth || yStars > canvasHeight) {
                    System.out.println("Out of Canvas size!");
                    xStars = in.nextInt();
                    yStars = in.nextInt();
                }
                gc.setFill(Color.rgb(239, 239, 40));
                gc.fillOval(xStars, yStars, starWidth, starHeight);

            } else if (counter == 2) {
                int xStars2 = in.nextInt();
                int yStars2 = in.nextInt();

                gc.setFill(Color.rgb(239, 239, 40));
                gc.fillOval(xStars2, yStars2, starWidth, starHeight);

              //  gc.strokeLine(xStars);

            }
            counter++;
        }


        /**
         * this is where i will make my stars
         */
        gc.setFill(Color.WHITE);                          //set color for the stars
        int i = 0;                                        //Counter for the loop
        while (i < 200) {
            gc.fillOval(Math.random()*canvasWidth,Math.random()*canvasHeight, Math.random()*starWidth, Math.random()*starHeight );
            i++;
        }

        // YOUR CODE STOPS HERE
        stage.show();
    }


    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
