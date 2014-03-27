package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlgorithmGui extends JFrame
{
    public AlgorithmGui()
    {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);
        /******************QUIT BUTTON******************/
        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(400, 20, 80, 30);
        quitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        panel.add(quitButton);
        /******************QUIT BUTTON*******************/


        setTitle("Algorithms");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AlgorithmGui ex = new AlgorithmGui();
                ex.setVisible(true);
            }
        });
    }
}
