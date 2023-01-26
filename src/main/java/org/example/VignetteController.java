package org.example;

import org.example.interfaces.VignetteRequestInterface;

public class VignetteController {
    VignetteRequestInterface vignetteRequestInterface;

    public void getVignette(String inputData) {

    }

    public VignetteRequestInterface getVignetteRequestInterface() {
        return vignetteRequestInterface;
    }

    public void setVignetteRequestInterface(VignetteRequestInterface vignetteRequestInterface) {
        this.vignetteRequestInterface = vignetteRequestInterface;
    }
}
