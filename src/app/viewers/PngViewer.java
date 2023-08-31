package app.viewers;

import app.utils.FileExtension;

public class PngViewer implements AdvancedImageViewer{

    @Override
    public void displayPng(String fileName) {
        System.out.println("Opening PNG file: " + fileName + FileExtension.PNG);
    }

    @Override
    public void displayTiff(String fileName) {
    }
}
