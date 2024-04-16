package com.umg.dibujorectanguloyovalos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Diibujorectanguloyovalos {

  public static void main(String[] args) {
    String entrada =
        JOptionPane.showInputDialog(
            "Escriba 1 para dibujar los 12 circulos\n"
                + "Escriba 2 para dibujar el grafico de barras");
    int option = Integer.parseInt(entrada);
    Figuras panel = new Figuras(option);

    JFrame aplicacion = new JFrame(); // crea un nuevo objeto JFrame

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(1000, 1000);
    aplicacion.setVisible(true);
  }
}
