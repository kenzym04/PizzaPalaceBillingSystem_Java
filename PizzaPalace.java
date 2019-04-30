import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class PizzaCalculator extends JFrame implements ActionListener {
    JPanel westPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    // pizza size options
    JRadioButton Small = new JRadioButton("Small");
    JRadioButton Medium = new JRadioButton("Medium");
    JRadioButton Large = new JRadioButton("Large");
    // pizza topping selections
    JCheckBox Sausage = new JCheckBox("Sausage");
    JCheckBox Olives = new JCheckBox("Olives");
    JCheckBox Pepperoni = new JCheckBox("Pepperoni");
    JCheckBox Ham = new JCheckBox("Ham");
    JCheckBox Feta Cheese = new JCheckBox("Feta Cheese");
    JCheckBox Tomatoes = new JCheckBox("Tomatoes");
JCheckBox Pineapple = new JCheckBox("Pineapple");
JCheckBox Olives = new JCheckBox("Olives");
    // calculate, clear, and total buttons
    JButton Calculate = new JButton("Calculate");
    JButton Exit = new JButton("Exit");
    JLabel Total = new JLabel("Price: ");
    JTextField TotalResult = new JTextField(8);
    // variables used to calculate total
    int TopQty = 0;
    double Size = 0;
    double TopCost = 0;
    double TotalCost = 0;
    double GST = 0.05;
    double TaxedCost = 0;
   public PizzaCalculator() 
   {
       // layout north portion of frame
        northPanel.setLayout(new GridLayout());
        northPanel.setBorder(new TitledBorder("Size:"));
        // register listeners with buttons
        Small.addActionListener(this);
        Medium.addActionListener(this);
        Large.addActionListener(this);
        Calculate.addActionListener(this);
       ButtonGroup pizzaSize = new ButtonGroup();
       pizzaSize.add(Small);
       pizzaSize.add(Medium);
       pizzaSize.add(Large);
        // add buttons to north panel
        northPanel.add(Small);
        northPanel.add(Medium);
        northPanel.add(Large);
        centerPanel.setLayout(new GridLayout(5, 3));
        centerPanel.setBorder(new TitledBorder("Toppings:"));
        centerPanel.add(Sausage);
        centerPanel.add(Olives);
        centerPanel.add(Pepperoni);
        centerPanel.add(Ham);
        centerPanel.add(Tomatoes);
centerPanel.add(Olives);
centerPanel.add(Pineapple);
centerPanel.add(Fetacheese);
        
        southPanel.add(Total);
        southPanel.add(TotalResult);        
        southPanel.add(Calculate);
        southPanel.add(Exit);
        // add all portions of panel
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }
   // handle action event for each pizza option
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource() == Small)
            setSizeS();
        else if (e.getSource() == Medium)
            setSizeM();
        else if (e.getSource() == Large)
            setSizeL();
       setTopCost();
              if (e.getSource() == Calculate)
                calculate(Size, TopCost);
      }
    public double setSizeS() 
    {
        return Size = 12;
    }
    public double setSizeM() 
    {
        return Size = 14;
    }
    public double setSizeL() 
    {
       return Size = 16;
    }
    public double setTopCost()
    {               if ( Sausage.isSelected())
                        TopCost = 2;
                    else if ( Olives.isSelected())
                        TopCost = 2;
                    else if (Pepperoni.isSelected())
                        TopCost = 0.50;
                    else if (Cheese.isSelected())
                        TopCost = 0.50;
                    else if (Fetacheese.isSelected())
                        TopCost = 2;
                    else if (Ham.isSelected())
                        TopCost = 0.50;
		    else if (Tomatoes.isSelected())
                        TopCost = 2;
		    else if (Ham.isSelected())
                        TopCost = 0.50;
        return TopCost;
else if (Pineapple.isSelected())
                        TopCost = 0.50;
    }
    public void calculate(double Size, double TopCost) 
    {
        
 TotalCost = Size + TopCost
 TaxedCost = TotalCost*GST; 
 TotalCost += TaxedCost;
        TotalResult.setText(String.valueOf(TotalCost));
    }
    public static void main(String[] args) 
    {
       PizzaCalculator PizzaCalc = new PizzaCalculator();
        // set window title
        PizzaCalc.setTitle("Pizza Palace Billing System");
        // set window location
        PizzaCalc.setLocationRelativeTo(null);
        // specify window location
        PizzaCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set window size
        PizzaCalc.setSize(300, 350);
        // display window
        PizzaCalc.setVisible(true);
    }
}