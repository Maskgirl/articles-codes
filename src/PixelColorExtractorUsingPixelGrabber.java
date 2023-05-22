import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PixelColorExtractorUsingPixelGrabber {
    public static void main(String[] args) {
        String imagePath = "image.png"; // Replace with the actual path to your image file

        try {
            // Read the image file
            BufferedImage image = ImageIO.read(new File(imagePath));

            // Specify the coordinates of the pixel you want to get the color for
            int x = 100; // X-coordinate
            int y = 50;  // Y-coordinate

            // Create a PixelGrabber to grab the pixel at the specified coordinates
            int[] pixelData = new int[1];
            PixelGrabber pixelGrabber = new PixelGrabber(image, x, y, 1, 1, pixelData, 0, 1);

            // Grab the pixel color
            pixelGrabber.grabPixels();

            // Get the color of the specified pixel
            Color pixelColor = new Color(pixelData[0]);

            // Extract individual RGB components
            int red = pixelColor.getRed();
            int green = pixelColor.getGreen();
            int blue = pixelColor.getBlue();

            // Print the RGB values
            System.out.println("Pixel color at (" + x + ", " + y + ")");
            System.out.println("Red: " + red);
            System.out.println("Green: " + green);
            System.out.println("Blue: " + blue);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
