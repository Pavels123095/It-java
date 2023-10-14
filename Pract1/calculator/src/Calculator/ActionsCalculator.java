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
    float displayResult = 0;
    this.CurrentResult = displayResult;
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    JButton ClickedButton = (JButton) e.getSource();
    String displayText = Parent.InputCalc.getText();
    String ClickedButtonLabel = ClickedButton.getText();
    float displayResult = 0;
      if (!"".equals(displayText)) {
        displayResult = Float.parseFloat(displayText);
      }

    if (ClickedButton == Parent.BtnPlus) {

      SelectedMethod = '+';
      if (!emptyString(displayText)) {
        displayResult = Float.parseFloat(displayText);
      }
      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

    } else if (ClickedButton == Parent.BtnMinus) {

      SelectedMethod = '-';

      if (!emptyString(displayText)) {
        displayResult = Float.parseFloat(displayText);
      }

      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

    } else if (ClickedButton == Parent.BtnPoint) {

      SelectedMethod = '*';
      if (!emptyString(displayText)) {
        displayResult = Float.parseFloat(displayText);
      }
      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

    } else if (ClickedButton == Parent.BtnClear) {

      SelectedMethod = 'C';
      this.ClearAction(this.Parent);

    } else if (ClickedButton == Parent.BtnDel) {

      SelectedMethod = '/';
      if (!emptyString(displayText)) {
        displayResult = Float.parseFloat(displayText);
      }
      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

     } else if (ClickedButton == Parent.BtnProcent) {

      SelectedMethod = '%';
      if (!emptyString(displayText)) {
        displayResult = Float.parseFloat(displayText);
      }
      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

    } else if (ClickedButton == Parent.BtnStep) {

      SelectedMethod = '^';
      if (!emptyString(displayText)) {
        displayResult = Float.parseFloat(displayText);
      }
      CurrentResult = displayResult;
      Parent.InputCalc.setText("");

    } else if (ClickedButton == Parent.BtnEqual) {

      if (!emptyString(displayText)) {
        displayResult = Float.parseFloat(displayText);
      }
      CurrentResult = this.ResultAction(Parent, displayResult ,SelectedMethod, CurrentResult);
      Parent.InputCalc.setText(String.valueOf(CurrentResult));

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
      } else if (Method == '%') {
        Result %= Value;
      } else if (Method == '^') {
        Result = pow(Result,Value);
      }

      return Result;

  }

  public static int pow(double value, double powValue) {
    int result = 1;
    for (int i = 1; i <= powValue; i++) {
      result = (int) (result * value);
    }
    return  result;
  }

  private boolean emptyDouble(double result) {
    if (result == 0) {
      return true;
    }  else {
      return false;
    }
  }

  private boolean emptyString(String result) {
    if ("".equals(result)) {
      return true;
    }
    return false;
  }

  public void ClearAction(App parent) {
    parent.InputCalc.setText("");
    CurrentResult = 0;
  }

}
