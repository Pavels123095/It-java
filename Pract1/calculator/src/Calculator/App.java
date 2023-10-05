package Calculator;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.*;

public class App {

    /**
     * @param args
     * @throws Exception
     */
    JPanel CalculateContent, ControlCalc;
    FlowLayout ManagerCalculator;
    JLabel FirstLabel;
    JButton Btn1, Btn2, Btn3, Btn4, Btn5, Btn6, Btn7, Btn8, Btn9, Btn0, BtnPlus,
            BtnMinus, BtnPoint, BtnEqual, BtnClear, BtnDel;
    JTextField InputCalc;
    JLabel SummLabel;
    ActionsCalculator ActionEvents;

    /**
     * 
     */
    App() {

        CalculateContent = new JPanel();
        BorderLayout borderCalc = new BorderLayout();
        CalculateContent.setLayout(borderCalc);
        InputCalc = new JTextField(30);
        CalculateContent.add("North", InputCalc);

        InputCalc.setFont(Font.getFont(Font.SERIF));

        this.BtnNumberInit(); // initialize this button numbers
        this.BtnInitActions(); // initialize this button actions

        ControlCalc = new JPanel();
        GridLayout GridControl = new GridLayout(4, 3);
        ControlCalc.setLayout(GridControl);

        this.ControlAddBtns(); // add this buttons for control panel

        CalculateContent.add("Center", ControlCalc);

        JFrame CalculateFrame = new JFrame("Calculator");
        CalculateFrame.setContentPane(CalculateContent);
        CalculateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CalculateFrame.pack();

        CalculateFrame.setVisible(true);

        ActionEvents = new ActionsCalculator(this);
    }

    public static void main(String[] args) throws Exception {
        App CalculatorsApp = new App();
    }

    public void BtnNumberInit() {
        Btn0 = new JButton("0");
        Btn1 = new JButton("1");
        Btn2 = new JButton("2");
        Btn3 = new JButton("3");
        Btn4 = new JButton("4");
        Btn5 = new JButton("5");
        Btn6 = new JButton("6");
        Btn7 = new JButton("7");
        Btn8 = new JButton("8");
        Btn9 = new JButton("9");
        Btn0 = new JButton("0");
    }

    public void BtnInitActions() {
        BtnMinus = new JButton("-");
        BtnPlus = new JButton("+");
        BtnPoint = new JButton("*");
        BtnDel = new JButton("/");
        BtnEqual = new JButton("=");
        BtnClear = new JButton("CE");
    }

    public void ControlAddBtns() {
        ControlCalc.add(Btn1);
        ControlCalc.add(Btn2);
        ControlCalc.add(Btn3);
        ControlCalc.add(Btn4);
        ControlCalc.add(Btn5);
        ControlCalc.add(Btn6);
        ControlCalc.add(Btn7);
        ControlCalc.add(Btn8);
        ControlCalc.add(Btn9);
        ControlCalc.add(Btn0);
        ControlCalc.add(BtnPlus);
        ControlCalc.add(BtnMinus);
        ControlCalc.add(BtnPoint);
        ControlCalc.add(BtnDel);
        ControlCalc.add(BtnEqual);
        ControlCalc.add(BtnClear);
    }
}