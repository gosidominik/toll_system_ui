package org.example;

import java.util.Scanner;

public class View {
    Scanner sc;
    VignetteController vignetteController;

    public View(VignetteController vignetteController) {
        this.vignetteController = vignetteController;
        this.sc = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Add meg a rendszámot!");
        String input = sc.nextLine();
    }
}
