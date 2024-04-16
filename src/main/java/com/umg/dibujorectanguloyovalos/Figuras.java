package com.umg.dibujorectanguloyovalos;

import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Figuras extends JPanel {
  private int option;

  private int[] numbers = new int[5];

  public Figuras(int option) {
    int number = 0;
    if (option == 2) {
      for (int i = 0; i < 5; i++) {
        String data = JOptionPane.showInputDialog("Dato No. " + (i + 1) + " entre el 1 - 30 ");
        try {
          number = Integer.parseInt(data);
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Solo se aceptan valores del 1 - 30");
          i--;
          continue;
        }
        if ((number <= 0) || (number > 30)) {
          JOptionPane.showMessageDialog(null, "Solo se aceptan valores del 1 - 30");
          i--;
          continue;
        }
        numbers[i] = number;
      }
    }
    this.option = option;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    paintCircles(g);
  }

  private void paintCircles(Graphics g) {
    int radius = 10;
    int diameter = 20;
    if (option == 1) {
      for (int i = 1; i <= 12; i++) {
        g.drawOval(
            getWidth() / 2 - i * radius, getHeight() / 2 - i * radius, diameter * i, diameter * i);
      }
    } else if (option == 2) {
      paintGraphicBar(g);
    }
  }

  private void paintGraphicBar(Graphics g) {
    int factor = getWidth() / 30;
    int move = getHeight() / 5;
    for (int i = 0; i < 5; i++) {
      g.drawRect(0, move * i, factor * numbers[i], move);
    }
  }
}
