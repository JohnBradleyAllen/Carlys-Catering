/*
 * @author John B. Allen
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Class will make the user input frame.
public class JCarlysCatering extends JFrame implements ItemListener, ActionListener
{
	public static void main(String[] args)
	{
		JCarlysCatering frame = new JCarlysCatering();
		frame.setSize(1000,200);
		frame.setVisible(true);
	}
	
	FlowLayout flow =new FlowLayout();
	//Details based on user input.
		JLabel mainLabel = new JLabel("Carly's Cattering");
		Font font = new Font("Times New Roman", Font.BOLD, 22);
		JLabel label1 = new JLabel("Select The Main Course Options:");
		JLabel label2 = new JLabel(" ");
		JLabel tprice= new JLabel(" ");
		
	//These are the check boxes that the user will select.
	JTextField guestsText = new JTextField(20);
	JLabel guestsLabel = new JLabel("Please Enter number of guests");
	
	//Main courses
	JCheckBox beef = new JCheckBox("Beef ",false);
	JCheckBox chicken = new JCheckBox("Chicken ",false);
	JCheckBox seafood = new JCheckBox("Seafood ",false);
	JCheckBox vegetarian = new JCheckBox("Vegetarian ",false);
	
	//Sides
	JCheckBox mashedPotatoesAndGravy = new JCheckBox("Mashed Potatoes & Gravy ",false);
	JCheckBox houseSaladWithDressing = new JCheckBox("House Salad with Dressing ",false);
	JCheckBox vegetableMedley = new JCheckBox("Vegetable Medley ",false);
	JCheckBox coffeeWithBaileys = new JCheckBox("Coffee with Baileys ",false);
	
	//Desserts
	JCheckBox cake = new JCheckBox("Cake ",false);
	JCheckBox milkShake = new JCheckBox("Milk Shake ",false);
	JCheckBox appleAndCheeseBoard = new JCheckBox("Apple & Cheese Board ",false);
	
	//Details about the event.
		double price = 0;
		String mainCourse = " ";
		String sides = " ";
		String dessert = " ";
		String output;
		int numSelected = 0;
		final int PRICE_PER_GUEST = 35;

		//Method to ask for user selection.
		public JCarlysCatering()
		{
			super("Carly's - Makin' The Food The Makes It A Party!");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(flow);


			ButtonGroup entreegrp = new ButtonGroup();
				add(new JLabel("Select One (1) Entree: "));
				entreegrp.add(beef);
				entreegrp.add(chicken);
				entreegrp.add(seafood);
				entreegrp.add(vegetarian);


			ButtonGroup dessertgrp = new ButtonGroup();
				add(new JLabel("Select Dessert: "));
				dessertgrp.add(cake);
				dessertgrp.add(milkShake);
				dessertgrp.add(appleAndCheeseBoard);
				add(label2);


			mainLabel.setFont(font);
				add(guestsLabel);
				add(guestsText);
				add(label1);
				add(beef);
				add(chicken);
				add(seafood);
				add(vegetarian);
				add(new JLabel("Select Up To Two (2) Sides: "));
				add(mashedPotatoesAndGravy);
				add(houseSaladWithDressing);
				add(vegetableMedley);
				add(coffeeWithBaileys); 
				add(new JLabel("Select dessert: "));
				add(cake);
				add(milkShake);
				add(appleAndCheeseBoard);
				add(label2);
				add(tprice);
				
				tprice.setText("Total = $0 ");
				guestsText.addActionListener(this);
				
				beef.addItemListener(this);
				chicken.addItemListener(this);
				seafood.addItemListener(this);
				vegetarian.addItemListener(this);
	
				mashedPotatoesAndGravy.addItemListener(this);
				houseSaladWithDressing.addItemListener(this);
				vegetableMedley.addItemListener(this);
				coffeeWithBaileys.addItemListener(this);
	
				cake.addItemListener(this);
				milkShake.addItemListener(this);
				appleAndCheeseBoard.addItemListener(this);
		}
		
		//Sets the price to $0 if the input from the user is not numerical.
		public void actionPerformed(ActionEvent e)
		{
			Object source = e.getSource();
			if(source == guestsText)
			{
				try
				{
					price = Integer.parseInt(guestsText.getText())*PRICE_PER_GUEST;
				}

				catch(Exception exc)
				{
					price = 0;
					guestsText.setText("0");
				}	
					
				output = "Your Menu Is: " + mainCourse + " " + sides + " " + dessert + " " + "For A Total Price Of: $ " + price + " ";
				tprice.setText(output);
			}

		}
				
		//Assigns values.
		public void itemStateChanged(ItemEvent check)
		{
			Object source = check.getSource();
			int select = check.getStateChange();
			
			if(select == ItemEvent.SELECTED)
				if(source == beef)
				mainCourse = "BEEF";
					else if(source == chicken)
					mainCourse = "CHICKEN";				
						else if(source == seafood)
						mainCourse = "SEAFOOD";
							else if(source == vegetarian)
							mainCourse = "VEGETARIAN";

			if(select == ItemEvent.SELECTED)
				if(source == cake)
				dessert = "CAKE";
					else if(source == milkShake)
					dessert = "MILKSHAKE";
						else if(source == appleAndCheeseBoard)
						dessert = "APPLE & CHEESE BOARD";

			if(source == mashedPotatoesAndGravy || source == houseSaladWithDressing || source == seafood || source == vegetarian)
			{
				if(select == ItemEvent.SELECTED)
					++numSelected;
				else
					--numSelected;
					sides = "";
				if(numSelected <= 2)
				{	
					if(mashedPotatoesAndGravy.isSelected())
						sides += "MASHED POTATOES";
					if(houseSaladWithDressing.isSelected())
						sides += "HOUSE SALAD WITH DRESSING";
					if(vegetableMedley.isSelected())
						sides += "VEGETABLE MEDLEY";
					if(coffeeWithBaileys.isSelected())
						sides += "COFFEE WITH BAILEYS";
				}

				else	
				{
					mashedPotatoesAndGravy.setSelected(false);
					houseSaladWithDressing.setSelected(false);
					vegetableMedley.setSelected(false);
					coffeeWithBaileys.setSelected(false);
				}

				try
				{
					price = Integer.parseInt(guestsText.getText()) * PRICE_PER_GUEST;
				}
				
				catch(Exception e)
				{
					price = 0;
					guestsText.setText("0");
				}

				//Output the final details of the order.
				output = "Your Menu Is: " + mainCourse + sides + dessert + "" + "For A Total Price Of: $" + price + " ";
				tprice.setText(output);
			}
		}

}