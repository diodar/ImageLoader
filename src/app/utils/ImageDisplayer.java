package app.utils;

import app.viewers.ImageViewer;

public class ImageDisplayer implements ImageViewer {

    ImageAdapter imageAdapter;

    @Override
    public void display(String fileName, String imageType) {

        if (imageType.equalsIgnoreCase(FileExtension.JPG.toString())) {
            System.out.println("Opening JPG file: " + fileName + FileExtension.JPG);
        }

            else if (imageType.equalsIgnoreCase(FileExtension.PNG.toString()) ||
                imageType.equalsIgnoreCase(FileExtension.TIFF.toString())
        ) {
            imageAdapter = new ImageAdapter(imageType);
            imageAdapter.display(fileName, imageType);
        } else {
            System.out.println("Invalid media! " + imageType + " format not supported. File " + fileName + " was not opened.");
        }
    }
}
