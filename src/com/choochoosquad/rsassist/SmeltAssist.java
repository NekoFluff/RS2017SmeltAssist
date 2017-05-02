package com.choochoosquad.rsassist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SmeltAssist
{

	private JFrame frmRunescapeSmelt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() 
			{
				try 
				{
					SmeltAssist window = new SmeltAssist();
					window.frmRunescapeSmelt.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SmeltAssist() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmRunescapeSmelt = new JFrame();
		frmRunescapeSmelt.setTitle("Runescape 2017 Smelt Assist");
		frmRunescapeSmelt.setBounds(100, 100, 620, 390);
		//When exit is clicked, close everything/
		frmRunescapeSmelt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRunescapeSmelt.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(377, 11, 11, 329);
		frmRunescapeSmelt.getContentPane().add(separator);
		
		JLabel lblStats = new JLabel("What to Buy");
		lblStats.setBounds(459, 11, 87, 14);
		frmRunescapeSmelt.getContentPane().add(lblStats);
		
		JLabel lblNatureRunes = new JLabel("Nature Runes:");
		lblNatureRunes.setBounds(398, 85, 87, 14);
		frmRunescapeSmelt.getContentPane().add(lblNatureRunes);
		
		JLabel lblNewLabel = new JLabel("Coal:");
		lblNewLabel.setBounds(398, 110, 35, 14);
		frmRunescapeSmelt.getContentPane().add(lblNewLabel);
		
		JLabel lblOre = new JLabel("Ore Type:");
		lblOre.setBounds(398, 35, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lblOre);
		
		JLabel lblOres = new JLabel("# Ores:");
		lblOres.setBounds(398, 60, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lblOres);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(398, 135, 196, 14);
		frmRunescapeSmelt.getContentPane().add(separator_1);
		
		JLabel lblEconomics = new JLabel("Economics");
		lblEconomics.setBounds(457, 150, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lblEconomics);
		
		JLabel lbltcosttxt = new JLabel("Total Cost:");
		lbltcosttxt.setBounds(398, 200, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lbltcosttxt);
		
		JLabel lbl_oreType = new JLabel("None");
		lbl_oreType.setBounds(459, 35, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_oreType);
		
		JLabel lbl_oreCount = new JLabel("0");
		lbl_oreCount.setBounds(449, 60, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_oreCount);
		
		JLabel lbl_natCount = new JLabel("0");
		lbl_natCount.setBounds(495, 85, 51, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_natCount);
		
		JLabel lbl_coalCount = new JLabel("0");
		lbl_coalCount.setBounds(438, 110, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_coalCount);
		
		JLabel lblGoldBudget = new JLabel("Gold Budget:");
		lblGoldBudget.setBounds(398, 175, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lblGoldBudget);
		
		JLabel lblNewLabel_1 = new JLabel("GP Left:");
		lblNewLabel_1.setBounds(398, 225, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lblNewLabel_1);
		
		JLabel lblBarPrice = new JLabel("Bar Price:");
		lblBarPrice.setBounds(398, 250, 87, 14);
		frmRunescapeSmelt.getContentPane().add(lblBarPrice);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Select One", "Mithril", "Adamant", "Runite"}));
		comboBox.setBounds(10, 32, 98, 20);
		frmRunescapeSmelt.getContentPane().add(comboBox);
		
		JLabel lblSelectOreType = new JLabel("Ore Type");
		lblSelectOreType.setBounds(10, 11, 98, 14);
		frmRunescapeSmelt.getContentPane().add(lblSelectOreType);
		
		JLabel lblRunitePrice = new JLabel("Ore Price");
		lblRunitePrice.setBounds(10, 63, 98, 14);
		frmRunescapeSmelt.getContentPane().add(lblRunitePrice);
		
		textField = new JTextField();
		textField.setBounds(10, 82, 127, 20);
		frmRunescapeSmelt.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblGoldToSpend = new JLabel("Gold to Spend");
		lblGoldToSpend.setBounds(147, 11, 103, 14);
		frmRunescapeSmelt.getContentPane().add(lblGoldToSpend);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 32, 132, 20);
		frmRunescapeSmelt.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCoalPrice = new JLabel("Coal Price");
		lblCoalPrice.setBounds(10, 113, 98, 14);
		frmRunescapeSmelt.getContentPane().add(lblCoalPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 129, 127, 20);
		frmRunescapeSmelt.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton p5_orePrice = new JButton("+5%");
		
		p5_orePrice.setBounds(147, 81, 62, 23);
		frmRunescapeSmelt.getContentPane().add(p5_orePrice);
		
		JButton m5_orePrice = new JButton("-5%");
		m5_orePrice.setBounds(217, 81, 62, 23);
		frmRunescapeSmelt.getContentPane().add(m5_orePrice);
		
		JButton p5_coalPrice = new JButton("+5%");
		p5_coalPrice.setBounds(147, 126, 62, 23);
		frmRunescapeSmelt.getContentPane().add(p5_coalPrice);
		
		JButton m5_coalPrice = new JButton("-5%");
		m5_coalPrice.setBounds(217, 126, 62, 23);
		frmRunescapeSmelt.getContentPane().add(m5_coalPrice);
		
		JLabel lblNatureRunePrice = new JLabel("Nature Rune Price");
		lblNatureRunePrice.setBounds(10, 157, 127, 14);
		frmRunescapeSmelt.getContentPane().add(lblNatureRunePrice);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 172, 127, 20);
		frmRunescapeSmelt.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton m5_natPrice = new JButton("-5%");
		m5_natPrice.setBounds(217, 171, 62, 23);
		frmRunescapeSmelt.getContentPane().add(m5_natPrice);
		
		JButton p5_natPrice = new JButton("+5%");
		p5_natPrice.setBounds(147, 171, 62, 23);
		frmRunescapeSmelt.getContentPane().add(p5_natPrice);
		
		JLabel lblNetIncome = new JLabel("Net Income:");
		lblNetIncome.setBounds(398, 275, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lblNetIncome);
		
		JLabel lblNetBarIncome = new JLabel("Net ");
		lblNetBarIncome.setBounds(398, 275, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lblNetBarIncome);
		
		JLabel lblBarPrice_1 = new JLabel("Bar Price");
		lblBarPrice_1.setBounds(10, 203, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lblBarPrice_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 222, 127, 20);
		frmRunescapeSmelt.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("+5%");
		button.setBounds(147, 221, 62, 23);
		frmRunescapeSmelt.getContentPane().add(button);
		
		JButton button_1 = new JButton("-5%");
		button_1.setBounds(217, 221, 62, 23);
		frmRunescapeSmelt.getContentPane().add(button_1);
		
		JLabel lblProfit = new JLabel("Profit:");
		lblProfit.setBounds(398, 300, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lblProfit);
		
		JLabel lblgoldBudget = new JLabel("0");
		lblgoldBudget.setBounds(483, 175, 111, 14);
		frmRunescapeSmelt.getContentPane().add(lblgoldBudget);
		
		JLabel lbl_totalCost = new JLabel("0");
		lbl_totalCost.setBounds(469, 200, 111, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_totalCost);
		
		JLabel lbl_gpRemain = new JLabel("0");
		lbl_gpRemain.setBounds(449, 225, 111, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_gpRemain);
		
		JLabel lbl_barPrice = new JLabel("0");
		lbl_barPrice.setBounds(459, 250, 111, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_barPrice);
		
		JLabel lbl_netInco = new JLabel("0");
		lbl_netInco.setBounds(480, 275, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_netInco);
		
		JLabel lbl_profit = new JLabel("0");
		lbl_profit.setBounds(449, 300, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_profit);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(147, 317, 89, 23);
		frmRunescapeSmelt.getContentPane().add(btnCalculate);
	}
}
