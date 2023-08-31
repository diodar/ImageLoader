package app;

import app.utils.ImageDisplayer;

public class MainImageLoader {

    public static void main(String[] args) {

        ImageDisplayer imageDisplayer = new ImageDisplayer();

        imageDisplayer.display("little_cat", ".jpg");
        imageDisplayer.display("red_car", ".png");
        imageDisplayer.display("blue_sky", ".tiff");
        imageDisplayer.display("yellow_submarine", ".gif");
    }
}
