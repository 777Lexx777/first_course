package Lesson_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{
    public Form(String title) {
        this.setTitle("Calculator");
        this.setBounds(10, 10, 300, 400);
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(165, 35, 51));
        this.setLayout(new GridLayout(2, 0));
        JTextField inputField = new JTextField();
        inputField.setEditable(false);
        ButtonListener buttonListener = new ButtonListener(inputField);
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        JButton minus;
        for(int i = 9; i >= 0; --i) {
            minus = new JButton(String.valueOf(i));
            minus.setForeground(new Color(29, 49, 227, 255));
            minus.addActionListener(buttonListener);
            buttonPanel.add(minus);
        }

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        minus = new JButton("-");
        minus.addActionListener(buttonListener);
        JButton multiple = new JButton("*");
        multiple.addActionListener(buttonListener);
        JButton division = new JButton("/");
        division.addActionListener(buttonListener);
        JButton clear = new JButton("C");
        clear.setForeground(new Color(248, 16, 4, 255));

        clear.addActionListener(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });

        buttonPanel.add(plus);
        buttonPanel.add(minus);
        buttonPanel.add(multiple);
        buttonPanel.add(division);
        buttonPanel.add(clear);

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(inputField, "Center");
        JButton submit = new JButton("=");
        submit.setForeground(new Color(101, 243, 15, 255));
        buttonPanel.add(submit);
        submit.addActionListener(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = inputField.getText();
                if (expression.contains("+")){
                    String[] splitted = inputField.getText().split("");
                    Integer val1 = Integer.parseInt(splitted[0]);
                    Integer val2 = Integer.parseInt(splitted[2]);
                    Integer result = val1 + val2;
                    inputField.setText("= " + result.toString());
                }
                if (expression.contains("-")){
                    String[] splitted = inputField.getText().split("");
                    Integer val1 = Integer.parseInt(splitted[0]);
                    Integer val2 = Integer.parseInt(splitted[2]);
                    Integer result = val1 - val2;
                    inputField.setText("= " + result.toString());
                }
                if (expression.contains("/")){
                    String[] splitted = inputField.getText().split("");
                    Integer val1 = Integer.parseInt(splitted[0]);
                    Integer val2 = Integer.parseInt(splitted[2]);
                    Integer result = val1 / val2;
                    inputField.setText("= " + result.toString());
                }
                if (expression.contains("*")){
                    String[] splitted = inputField.getText().split("");
                    Integer val1 = Integer.parseInt(splitted[0]);
                    Integer val2 = Integer.parseInt(splitted[2]);
                    Integer result = val1 * val2;
                    inputField.setText("= " + result.toString());
                }


            }
        });


        this.add(inputPanel);
        buttonPanel.setBackground(new Color(248, 16, 4, 255));
        this.add(buttonPanel);
        this.setVisible(true);
    }
}
