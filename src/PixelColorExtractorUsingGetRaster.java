import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PixelColorExtractorUsingGetRaster {
    public static void main(String[] args) {
        String imagePath = "image.png"; // Replace with the actual path to your image file

        try {
            // Read the image file
            BufferedImage image = ImageIO.read(new File(imagePath));

            // Specify the coordinates of the pixel you want to get the color for
            int x = 100; // X-coordinate
            int y = 50;  // Y-coordinate

            // Get the raster of the image
            int[] pixelData = image.getRaster().getPixel(x, y, new int[4]);

            // Extract individual RGB components
            int red = pixelData[0];
            int green = pixelData[1];
            int blue = pixelData[2];

            // Print the RGB values
            System.out.println("Pixel color at (" + x + ", " + y + ")");
            System.out.println("Red: " + red);
            System.out.println("Green: " + green);
            System.out.println("Blue: " + blue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
