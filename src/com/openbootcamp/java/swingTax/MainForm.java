package com.openbootcamp.java.swingTax;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane ivaPane;
    private JTextPane totalPane;
    private JButton buttonCalculate;
    private JPanel taxPane;

    public ActionListener botonPulsado() {
        return e -> {
            double p = Double.parseDouble(pricePane.getText());
            double t = Double.parseDouble(ivaPane.getText());

            double result = p + (p / 100 * t);
            totalPane.setText(Double.toString(result));
        };
    }

    public MainForm() {
        buttonCalculate.addActionListener(botonPulsado());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPane);
        frame.setVisible(true);
    }
}
