// ProxyImage.java
package com.proxypattern;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    private boolean isImageLoaded;

    public ProxyImage(String filename) {
        this.filename = filename;
        this.isImageLoaded = false;
    }

    @Override
    public void display() {
        if (!isImageLoaded) {
            realImage = new RealImage(filename);
            isImageLoaded = true;
        }
        realImage.display();
    }
}
