package com.choochoosquad.rsassist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class SmeltAssist
{

	private JFrame frmRunescapeSmelt;

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
		
		JLabel lblTotalCost = new JLabel("Total Cost:");
		lblTotalCost.setBounds(398, 200, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lblTotalCost);
		
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
		
		JLabel lblRuneBarPrice = new JLabel("Rune Bar Price:");
		lblRuneBarPrice.setBounds(398, 250, 87, 14);
		frmRunescapeSmelt.getContentPane().add(lblRuneBarPrice);
	}
}
