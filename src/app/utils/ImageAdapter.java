package app.utils;

import app.viewers.AdvancedImageViewer;
import app.viewers.ImageViewer;
import app.viewers.PngViewer;
import app.viewers.TiffViewer;

public class ImageAdapter implements ImageViewer {

    AdvancedImageViewer advancedImageViewer;

    public ImageAdapter(String imageType) {

        if (imageType.equalsIgnoreCase(FileExtension.PNG.toString())) {
            advancedImageViewer = new PngViewer();
        } else if (imageType.equalsIgnoreCase(FileExtension.TIFF.toString())) {
            advancedImageViewer = new TiffViewer();
        }
    }

    @Override
    public void display(String fileName, String imageType) {

        if (imageType.equalsIgnoreCase(FileExtension.PNG.toString())) {
            advancedImageViewer.displayPng(fileName);
        } else if (imageType.equalsIgnoreCase(FileExtension.TIFF.toString())) {
            advancedImageViewer.displayTiff(fileName);
        }
    }
}
