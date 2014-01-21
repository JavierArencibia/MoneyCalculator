package moneycalculator.UI;

import moneycalculator.Model.Money;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class PanelMoneyViewer extends JPanel implements MoneyViewer{
    private JLabel label;

    public PanelMoneyViewer() {
        super(new FlowLayout(FlowLayout.LEFT));
        this.createComponents();
    }
    
    @Override
    public void show(Money money) {
        label.setText(money.toString());
    }

    private void createComponents() {
        this.add(createMoneyDisplay());
    }

    private JLabel createMoneyDisplay() {
        label = new JLabel();
        return label;
    }
}
