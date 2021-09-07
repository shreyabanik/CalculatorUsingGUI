package calculator;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calculator implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea(2,10);

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button0 = new JButton();

    JButton buttonadd = new JButton();
    JButton buttonsub = new JButton();
    JButton buttonmul = new JButton();
    JButton buttondiv = new JButton();
    JButton buttonclr = new JButton();
    JButton buttondot = new JButton();
    JButton buttoneql = new JButton();

    static double  num1=0, num2=0, result=0;
    static int operator=0;

    public calculator() {
        frame.setSize(340,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("CALCULATOR");
        frame.setResizable(true);
        frame.add(panel);
        panel.setBackground(Color.PINK);
        Border border = BorderFactory.createLineBorder(Color.PINK);
        panel.add(textarea);
        textarea.setBackground(Color.DARK_GRAY);
        Border borderoftextarea = BorderFactory.createLineBorder(Color.white,5);
        textarea.setBorder(borderoftextarea);
        Font font = new Font(("arial"), Font.BOLD, 20);
        textarea.setFont(font);
        textarea.setForeground(Color.CYAN);
        textarea.setPreferredSize(new Dimension(2,10));
        textarea.setLineWrap(true);

        button1.setPreferredSize(new Dimension(90,30));
        button1.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button1.png"));

        button2.setPreferredSize(new Dimension(90,30));
        button2.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button2.png"));

        button3.setPreferredSize(new Dimension(90,30));
        button3.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button3.png"));

        button4.setPreferredSize(new Dimension(90,30));
        button4.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button4.png"));

        button5.setPreferredSize(new Dimension(90,30));
        button5.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button5.png"));

        button6.setPreferredSize(new Dimension(90,30));
        button6.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button6.png"));

        button7.setPreferredSize(new Dimension(90,30));
        button7.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button7.png"));

        button8.setPreferredSize(new Dimension(90,30));
        button8.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button8.png"));

        button9.setPreferredSize(new Dimension(90,30));
        button9.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button9.png"));

        button0.setPreferredSize(new Dimension(90,30));
        button0.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\button0.png"));

        buttonadd.setPreferredSize(new Dimension(90,30));
        buttonadd.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\buttonadd.png"));

        buttonsub.setPreferredSize(new Dimension(90,30));
        buttonsub.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\buttonsub.png"));

        buttonmul.setPreferredSize(new Dimension(90,30));
        buttonmul.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\buttonmul.png"));

        buttondiv.setPreferredSize(new Dimension(90,30));
        buttondiv.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\buttondiv.png"));

        buttonclr.setPreferredSize(new Dimension(90,30));
        buttonclr.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\buttonclear.png"));

        buttondot.setPreferredSize(new Dimension(90,30));
        buttondot.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\buttondot.png"));

        buttoneql.setPreferredSize(new Dimension(90,30));
        buttoneql.setIcon(new ImageIcon("C:\\Users\\Shreya Banik\\Downloads\\buttoneql.png"));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonadd);
        panel.add(buttonsub);
        panel.add(buttonmul);
        panel.add(buttondiv);
        panel.add(buttondot);
        panel.add(buttonclr);
        panel.add(buttoneql);

        button1.addActionListener((ActionListener) this);
        button2.addActionListener((ActionListener) this);
        button3.addActionListener((ActionListener) this);
        button4.addActionListener((ActionListener) this);
        button5.addActionListener((ActionListener) this);
        button6.addActionListener((ActionListener) this);
        button7.addActionListener((ActionListener) this);
        button8.addActionListener((ActionListener) this);
        button9.addActionListener((ActionListener) this);
        button0.addActionListener((ActionListener) this);
        buttonadd.addActionListener((ActionListener) this);
        buttonsub.addActionListener((ActionListener) this);
        buttonmul.addActionListener((ActionListener) this);
        buttondiv.addActionListener((ActionListener) this);
        buttondot.addActionListener((ActionListener) this);
        buttonclr.addActionListener((ActionListener) this);
        buttoneql.addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==buttonclr) {
            textarea.setText("");
        }
        if(e.getSource()==button1) {
            textarea.setText(textarea.getText().concat("1"));
        }
        if(e.getSource()==button2) {
            textarea.setText(textarea.getText().concat("2"));
        }
        if(e.getSource()==button3) {
            textarea.setText(textarea.getText().concat("3"));
        }
        if(e.getSource()==button4) {
            textarea.setText(textarea.getText().concat("4"));
        }
        if(e.getSource()==button5) {
            textarea.setText(textarea.getText().concat("5"));
        }
        if(e.getSource()==button6) {
            textarea.setText(textarea.getText().concat("6"));
        }
        if(e.getSource()==button7) {
            textarea.setText(textarea.getText().concat("7"));
        }
        if(e.getSource()==button8) {
            textarea.setText(textarea.getText().concat("8"));
        }
        if(e.getSource()==button9) {
            textarea.setText(textarea.getText().concat("9"));
        }
        if(e.getSource()==button0) {
            textarea.setText(textarea.getText().concat("0"));
        }
        if(e.getSource()==buttondot) {
            textarea.setText(textarea.getText().concat("."));
        }
        if(e.getSource()==buttonadd) {
            num1=Double.parseDouble(textarea.getText());
            operator=1;
            textarea.setText("");
        }
        if(e.getSource()==buttonsub) {
            num1=Double.parseDouble(textarea.getText());
            operator=2;
            textarea.setText("");
        }
        if(e.getSource()==buttonmul) {
            num1=Double.parseDouble(textarea.getText());
            operator=3;
            textarea.setText("");
        }
        if(e.getSource()==buttondiv) {
            num1=Double.parseDouble(textarea.getText());
            operator=4;
            textarea.setText("");
        }
        if(e.getSource()==buttoneql) {
            num2=Double.parseDouble(textarea.getText());
            switch(operator)
            {
                case 1:result=num1+num2;
                break;
                case 2:result=num1-num2;
                break;
                case 3:result=num1*num2;
                break;
                case 4:result=num1/num2;
                break;

            }
            textarea.setText(""+result);
        }

    }
    public double number_reader() {
        double num;
        String s;
        s=textarea.getText();
        num=Double.valueOf(s);
        return  num;
    }

}
