package ru.mirea.gibo0119.pr13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame {
         JTextField sum1 = new JTextField(10);
         JTextField sum2 = new JTextField(10);
         JTextField min1 = new JTextField(10);
         JTextField min2 = new JTextField(10);
         JTextField mult1 = new JTextField(10);
         JTextField mult2 = new JTextField(10);
         JTextField div1 = new JTextField(10);
         JTextField div2 = new JTextField(10);
         JButton button = new JButton("Посчитать");
         Font fnt = new Font("Times new roman", Font.BOLD,20);

         // Начало конструктора класса

         Calculator() {
         super("Калькулятор");
         setLayout(new FlowLayout());
         setSize(250, 150);

// Создаём надпись 1

         add(new JLabel("Сум1"));

// Добавляем текстовое поле sum1

         add(sum1);

// Создаём надпись 2

         add(new JLabel("Сум2"));

// Добавляем текстовое поле sum2

         add(sum2);

// Создаём надпись 3 (для вычитания)

         add(new JLabel("Мин1"));

// Добавляем текстовое поле min1

         add(min1);

// Создаём надпись 4 (для вычитания)

         add(new JLabel("Мин2"));

// Добавляем текстовое поле min2

         add(min2);

// Создаём надпись 5 умножь1

         add(new JLabel("Умножь1"));

// Добавляем текстовое поле mult1

         add(mult1);

// Создаём надпись 6

         add(new JLabel("Умножь2"));

// Добавляем текстовое поле mult2

         add(mult2);

// Создаём надпись 7

         add(new JLabel("Дел1"));

// Добавляем текстовое поле div1

         add(div1);

// Создаём надпись 8

         add(new JLabel("22"));

// Добавляем текстовое поле div2

         add(div2);

// Добавляем кнопку

         add(button);

         Font font = new Font("Verdana", Font.PLAIN, 18);
         String[] items = {
         "Australia",
         "China",
         "England",
         "Russia"
         };

         Container content = getContentPane();

         content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

final JLabel label = new JLabel(" ");
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setFont(font);
        content.add(label);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        JComboBox box = (JComboBox) e.getSource();
        String item = (String) box.getSelectedItem();
        label.setText(item);
        }
        };

        JComboBox comboBox = new JComboBox(items);
        comboBox.setFont(font);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        comboBox.addActionListener(actionListener);
        content.add(comboBox);

        setPreferredSize(new Dimension(240, 130));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

// Добавляем слушателя к кнопке

        button.addActionListener(new ActionListener() {
            @Override

            // Добавляем реализацию actionPerformed

            public void actionPerformed(ActionEvent e) {
        try {
        double x1 = Double.parseDouble(sum1.getText().trim());
        double x2 = Double.parseDouble(sum2.getText().trim());
        JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception b) {
        JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        try {
        double x3 = Double.parseDouble(min1.getText().trim());
        double x4 = Double.parseDouble(min2.getText().trim());
        JOptionPane.showMessageDialog(null, "Result = " + (x3 - x4), "Alert", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception b) {
        JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        try {
        double x3 = Double.parseDouble(mult1.getText().trim());
        double x4 = Double.parseDouble(mult2.getText().trim());
        JOptionPane.showMessageDialog(null, "Result = " + (x3 * x4), "Alert", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception b) {
        JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        try {
        double x3 = Double.parseDouble(div1.getText().trim());
        double x4 = Double.parseDouble(div2.getText().trim());
        JOptionPane.showMessageDialog(null, "Result = " + (x3 / x4), "Alert", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception b) {
        JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        }
        });

        setVisible(true);

        }

public static void main(String[] args) {
        new Calculator();
        }
        }
