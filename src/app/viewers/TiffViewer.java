package app.viewers;

import app.utils.FileExtension;

public class TiffViewer implements AdvancedImageViewer {

    @Override
    public void displayPng(String fileName) {
    }

    @Override
    public void displayTiff(String fileName) {
        System.out.println("Opening TIFF file: " + fileName + FileExtension.TIFF);
    }
}
