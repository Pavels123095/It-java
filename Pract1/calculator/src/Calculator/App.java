package Calculator;

import javax.swing.*;
import java.awt.*;

public class App {

    /**
     * @param args
     * @throws Exception
     */
    JPanel CalculateContent, ControlCalc;
    FlowLayout ManagerCalculator;
    JLabel FirstLabel;
    JButton Btn1, Btn2, Btn3, Btn4, Btn5, Btn6, Btn7, Btn8, Btn9, Btn0, BtnPlus,
            BtnMinus, BtnPoint, BtnEqual, BtnClear, BtnDel, BtnProcent,BtnStep;
    JTextField InputCalc;
    JLabel SummLabel;
    ActionsCalculator ActionEvents;

    /**
     * 
     */
    App() {
        ActionEvents = new ActionsCalculator(this);
        CalculateContent = new JPanel();
        BorderLayout borderCalc = new BorderLayout();
        CalculateContent.setLayout(borderCalc);
        InputCalc = new JTextField(30);
        CalculateContent.add("North", InputCalc);

        InputCalc.setFont(Font.getFont(Font.SERIF));

        this.BtnNumberInit(ActionEvents); // initialize this button numbers
        this.BtnInitActions(ActionEvents); // initialize this button actions

        ControlCalc = new JPanel();
        GridLayout GridControl = new GridLayout(5, 3);
        ControlCalc.setLayout(GridControl);

        this.ControlAddBtn(ControlCalc); // add this buttons for control panel

        CalculateContent.add("Center", ControlCalc);

        JFrame CalculateFrame = new JFrame("Calculator");
        CalculateFrame.setContentPane(CalculateContent);
        CalculateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CalculateFrame.pack();

        CalculateFrame.setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        App CalculatorsApp = new App();
    }

    public void BtnNumberInit(ActionsCalculator Action) {
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

        Btn0.addActionListener(Action);
        Btn1.addActionListener(Action);
        Btn2.addActionListener(Action);
        Btn3.addActionListener(Action);
        Btn4.addActionListener(Action);
        Btn5.addActionListener(Action);
        Btn6.addActionListener(Action);
        Btn7.addActionListener(Action);
        Btn8.addActionListener(Action);
        Btn9.addActionListener(Action);
    }

    public void BtnInitActions(ActionsCalculator Action) {
        BtnMinus = new JButton("-");
        BtnPlus = new JButton("+");
        BtnPoint = new JButton("*");
        BtnDel = new JButton("/");
        BtnEqual = new JButton("=");
        BtnClear = new JButton("CE");
        BtnProcent = new JButton("%");
        BtnStep = new JButton("^");

        BtnMinus.addActionListener(Action);
        BtnPlus.addActionListener(Action);
        BtnPoint.addActionListener(Action);
        BtnDel.addActionListener(Action);
        BtnEqual.addActionListener(Action);
        BtnClear.addActionListener(Action);
        BtnProcent.addActionListener(Action);
        BtnStep.addActionListener(Action);
    }

    public void ControlAddBtn(JPanel ControlCalc) {
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
        ControlCalc.add(BtnProcent);
        ControlCalc.add(BtnStep);
    }
}