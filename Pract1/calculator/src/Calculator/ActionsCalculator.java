package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.Cleaner.Cleanable;

import javax.swing.JButton;

public class ActionsCalculator implements ActionListener {

  App Parent;

  char SelectedMethod;
  double CurrentResult = 0;

  ActionsCalculator(App Parent) {
    this.Parent = Parent;
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    JButton ClickedButton = (JButton) e.getSource();
    String displayText = Parent.InputCalc.getText();
    String ClickedButtonLabel = ClickedButton.getText();
    double displayResult = 0;

    if (ClickedButton == Parent.BtnPlus) {
      SelectedMethod = '+';
      this.PlusAction();
    } else if (ClickedButton == Parent.BtnMinus) {
      SelectedMethod = '-';
      this.MinusAction();
    } else if (ClickedButton == Parent.BtnPoint) {
      SelectedMethod = '*';
      this.PointAction();
    } else if (ClickedButton == Parent.BtnClear) {
      SelectedMethod = 'C';
      this.ClearAction();
    } else if (ClickedButton == Parent.BtnEqual) {
      SelectedMethod = '=';
      this.ResultAction();
    } else if (ClickedButton == Parent.BtnDel) {
      SelectedMethod = '/';
      this.DelAction();
    } else {
      Parent.InputCalc.setText(displayText + ClickedButtonLabel);
    }

  }

  public void PlusAction() {

  }

  public void MinusAction() {

  }

  public void PointAction() {

  }

  public void ClearAction() {

  }

  public void ResultAction() {

  }

  public void DelAction() {

  }

}