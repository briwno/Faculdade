import java.util.*;
import javax.swing.*;

public class tela {


    public void tela() {
        JFrame frame = new JFrame("Lotofácil");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);


        JLabel label = new JLabel("Nome:");
        label.setBounds(10, 10, 100, 30);
        frame.add(label);

        JTextField nome = new JTextField();
        nome.setBounds(100, 10, 100, 30);
        frame.add(nome);

        
        JButton cadastrar = new JButton("Cadastrar");
        cadastrar.setBounds(100, 100, 100, 30);
        frame.add(cadastrar);
    }

    public static void main(String[] args) {
        tela t = new tela();
        t.tela();

    }

}
