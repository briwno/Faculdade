package swing;

import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        
        // Painel principal
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new BorderLayout());

        // Campo de texto
        JTextField textField = new JTextField();
        panel.add(textField, BorderLayout.NORTH);

        // Painel de botões
        JPanel buttonPanel = new JPanel();
        panel.add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Adicionar botões
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
        }

        frame.setVisible(true);
    }
}

