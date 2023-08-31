package app.utils;

public enum FileExtension {

    JPG(".jpg"),
    PNG(".png"),
    TIFF(".tiff");

    private final String extension;

    FileExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return extension;
    }
}