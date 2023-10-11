package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionsCalculator implements ActionListener {

  App Parent;
  char SelectedMethod;
  double CurrentResult = 0;

  ActionsCalculator(App Parent) {
    this.Parent = Parent;
    double displayResult = 0;
    this.CurrentResult = displayResult;
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    JButton ClickedButton = (JButton) e.getSource();
    String displayText = Parent.InputCalc.getText();
    String ClickedButtonLabel = ClickedButton.getText();
    double displayResult = 0;
      if (!"".equals(displayText)) {
        displayResult = Double.parseDouble(displayText);
      }

    if (ClickedButton == Parent.BtnPlus) {

      SelectedMethod = '+';
      displayResult = Double.parseDouble(displayText);
      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

    } else if (ClickedButton == Parent.BtnMinus) {

      SelectedMethod = '-';
      displayResult = Double.parseDouble(displayText);
      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

    } else if (ClickedButton == Parent.BtnPoint) {

      SelectedMethod = '*';
      displayResult = Double.parseDouble(displayText);
      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

    } else if (ClickedButton == Parent.BtnClear) {

      SelectedMethod = 'C';
      this.ClearAction(this.Parent);

    } else if (ClickedButton == Parent.BtnDel) {

      SelectedMethod = '/';
      displayResult = Double.parseDouble(displayText);
      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

    } else if (ClickedButton == Parent.BtnEqual) {

      displayResult = Double.parseDouble(displayText);
      CurrentResult = this.ResultAction(Parent, displayResult ,SelectedMethod, CurrentResult);
      Parent.InputCalc.setText(String.valueOf(""+ CurrentResult));

    } else {
      Parent.InputCalc.setText(displayText + ClickedButtonLabel);
    }

  }

  public double ResultAction(App parent, double Value, char Method, double Result) {
    if (Method == '+') {
      Result += Value;
    } else if (Method == '-') {
      Result -= Value;
    } else if (Method == '/') {
      Result /= Value;
    } else if (Method == '*') {
      Result *= Value;
    }

    return Result;
  }

  public void ClearAction(App parent) {
    parent.InputCalc.setText("");
    CurrentResult = 0;
  }

}
