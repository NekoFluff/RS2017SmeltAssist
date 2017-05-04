package com.choochoosquad.rsassist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SmeltAssist
{

	private JFrame frmRunescapeSmelt;
	private JTextField inp_orePrice;
	private JTextField inp_gold;
	private JTextField inp_coalPrice;
	private JTextField inp_natPrice;
	private JTextField inp_barPrice;

	
	//ITEM IDS
	int runiteOreID = 451;
	int runiteBarID = 2363;
	int adamantOreID = 449;
	int adamantBarID = 2361;
	int mithrilOreID = 447;
	int mithrilBarID = 2359;
	int coalID = 453;
	int natID = 561;
	
	DataHandler dh = new DataHandler();
	
	
	
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
		frmRunescapeSmelt.setBounds(100, 100, 529, 390);
		//When exit is clicked, close everything/
		frmRunescapeSmelt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRunescapeSmelt.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(323, 11, 11, 329);
		frmRunescapeSmelt.getContentPane().add(separator);
		
		JLabel lblStats = new JLabel("What to Buy");
		lblStats.setBounds(384, 11, 87, 14);
		frmRunescapeSmelt.getContentPane().add(lblStats);
		
		JLabel lblNatureRunes = new JLabel("Nature Runes:");
		lblNatureRunes.setBounds(344, 72, 87, 14);
		frmRunescapeSmelt.getContentPane().add(lblNatureRunes);
		
		JLabel lblNewLabel = new JLabel("Coal:");
		lblNewLabel.setBounds(344, 97, 35, 14);
		frmRunescapeSmelt.getContentPane().add(lblNewLabel);
		
		JLabel lblOres = new JLabel("# Ores:");
		lblOres.setBounds(344, 47, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lblOres);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(330, 136, 176, 14);
		frmRunescapeSmelt.getContentPane().add(separator_1);
		
		JLabel lblEconomics = new JLabel("Economics");
		lblEconomics.setBounds(384, 151, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lblEconomics);
		
		JLabel lbltcosttxt = new JLabel("Total Cost:");
		lbltcosttxt.setBounds(344, 201, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lbltcosttxt);
		
		JLabel lbl_oreCount = new JLabel("0");
		lbl_oreCount.setBounds(395, 47, 111, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_oreCount);
		
		JLabel lbl_natCount = new JLabel("0");
		lbl_natCount.setBounds(431, 72, 75, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_natCount);
		
		JLabel lbl_coalCount = new JLabel("0");
		lbl_coalCount.setBounds(385, 97, 97, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_coalCount);
		
		JLabel lblGoldBudget = new JLabel("Gold Budget:");
		lblGoldBudget.setBounds(344, 176, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lblGoldBudget);
		
		JLabel lblNewLabel_1 = new JLabel("GP Left:");
		lblNewLabel_1.setBounds(344, 226, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lblNewLabel_1);
		
		JLabel lblBarPrice = new JLabel("Bar Price:");
		lblBarPrice.setBounds(344, 251, 87, 14);
		frmRunescapeSmelt.getContentPane().add(lblBarPrice);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getActionCommand().equals("comboBoxChanged"))
				{
					//if action performed ie someone changes the combo box value, set metal to the current selected value
					String metal = (String)comboBox.getSelectedItem();
					try
					{
						switch(metal)
						{
							case "Select One":
								inp_orePrice.setText("0");
								inp_coalPrice.setText("0");
								inp_natPrice.setText("0");
								inp_barPrice.setText("0");
								break;
							case "Mithril":
								inp_orePrice.setText(dh.getPrice(mithrilOreID)+"");
								inp_barPrice.setText(dh.getPrice(mithrilBarID)+"");
								inp_coalPrice.setText(dh.getPrice(coalID)+"");
								inp_natPrice.setText(dh.getPrice(natID)+"");
								break;
							case "Adamant":
								inp_orePrice.setText(dh.getPrice(adamantOreID)+"");
								inp_barPrice.setText(dh.getPrice(adamantBarID)+"");
								inp_coalPrice.setText(dh.getPrice(coalID)+"");
								inp_natPrice.setText(dh.getPrice(natID)+"");
								break;
							case "Runite":
								inp_orePrice.setText(dh.getPrice(runiteOreID)+"");
								inp_barPrice.setText(dh.getPrice(runiteBarID)+"");
								inp_coalPrice.setText(dh.getPrice(coalID)+"");
								inp_natPrice.setText(dh.getPrice(natID)+"");
								break;
						}
					} 
					catch (Exception Ex)
					{
						Ex.printStackTrace();
					}
				}
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Select One", "Mithril", "Adamant", "Runite"}));
		comboBox.setBounds(10, 32, 98, 20);
		frmRunescapeSmelt.getContentPane().add(comboBox);
		
		JLabel lblSelectOreType = new JLabel("Ore Type");
		lblSelectOreType.setBounds(10, 11, 98, 14);
		frmRunescapeSmelt.getContentPane().add(lblSelectOreType);
		
		JLabel lblRunitePrice = new JLabel("Ore Price");
		lblRunitePrice.setBounds(10, 63, 98, 14);
		frmRunescapeSmelt.getContentPane().add(lblRunitePrice);
		
		inp_orePrice = new JTextField();
		inp_orePrice.setText("0");
		inp_orePrice.setBounds(10, 82, 127, 20);
		frmRunescapeSmelt.getContentPane().add(inp_orePrice);
		inp_orePrice.setColumns(10);
		
		JLabel lblGoldToSpend = new JLabel("Gold to Spend");
		lblGoldToSpend.setBounds(147, 11, 103, 14);
		frmRunescapeSmelt.getContentPane().add(lblGoldToSpend);
		
		inp_gold = new JTextField();
		inp_gold.setText("0");
		inp_gold.setBounds(147, 32, 132, 20);
		frmRunescapeSmelt.getContentPane().add(inp_gold);
		inp_gold.setColumns(10);
		
		JLabel lblCoalPrice = new JLabel("Coal Price");
		lblCoalPrice.setBounds(10, 113, 98, 14);
		frmRunescapeSmelt.getContentPane().add(lblCoalPrice);
		
		inp_coalPrice = new JTextField();
		inp_coalPrice.setText("0");
		inp_coalPrice.setBounds(10, 129, 127, 20);
		frmRunescapeSmelt.getContentPane().add(inp_coalPrice);
		inp_coalPrice.setColumns(10);
		
		JButton p5_orePrice = new JButton("+5%");
		p5_orePrice.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String p = inp_orePrice.getText();
					int i = Integer.parseInt(p);
					if(i < 0){i=0;} //make sure things are always positive round here :)
					int temp = i;
					i = (int) Math.floor(i+(i*.05));
					if(i == temp){
						i++;
					}
					inp_orePrice.setText(i+"");
				} catch(Exception e){
					inp_orePrice.setText("0");
				}
				
			}
		});
		
		p5_orePrice.setBounds(219, 81, 62, 23);
		frmRunescapeSmelt.getContentPane().add(p5_orePrice);
		
		JButton m5_orePrice = new JButton("-5%");
		m5_orePrice.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String p = inp_orePrice.getText();
					int i = Integer.parseInt(p);
					if(i < 0){i=0;} //make sure things are always positive round here :)
					int temp = i;
					i = (int) Math.floor(i-(i*.05));
					if(i==temp && i > 0){
						i--;
					}
					inp_orePrice.setText(i+"");
				} catch(Exception e1){
					inp_orePrice.setText("0");
				}
			}
		});
		m5_orePrice.setBounds(147, 81, 62, 23);
		frmRunescapeSmelt.getContentPane().add(m5_orePrice);
		
		JButton p5_coalPrice = new JButton("+5%");
		p5_coalPrice.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String p = inp_coalPrice.getText();
					int i = Integer.parseInt(p);
					if(i < 0){i=0;} //make sure things are always positive round here :)
					int temp = i;
					i = (int) Math.floor(i+(i*.05));
					if(i == temp){
						i++;
					}
					inp_coalPrice.setText(i+"");
				} catch(Exception e2){
					inp_coalPrice.setText("0");
				}
			}
		});
		p5_coalPrice.setBounds(219, 126, 62, 23);
		frmRunescapeSmelt.getContentPane().add(p5_coalPrice);
		
		JButton m5_coalPrice = new JButton("-5%");
		m5_coalPrice.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String p = inp_coalPrice.getText();
					int i = Integer.parseInt(p);
					if(i < 0){i=0;} //make sure things are always positive round here :)
					int temp = i;
					i = (int) Math.floor(i-(i*.05));
					if(i==temp && i > 0){
						i--;
					}
					inp_coalPrice.setText(i+"");
				} catch(Exception e1){
					inp_coalPrice.setText("0");
				}
			}
		});
		m5_coalPrice.setBounds(147, 126, 62, 23);
		frmRunescapeSmelt.getContentPane().add(m5_coalPrice);
		
		JLabel lblNatureRunePrice = new JLabel("Nature Rune Price");
		lblNatureRunePrice.setBounds(10, 157, 127, 14);
		frmRunescapeSmelt.getContentPane().add(lblNatureRunePrice);
		
		inp_natPrice = new JTextField();
		inp_natPrice.setText("0");
		inp_natPrice.setBounds(10, 172, 127, 20);
		frmRunescapeSmelt.getContentPane().add(inp_natPrice);
		inp_natPrice.setColumns(10);
		
		JButton m5_natPrice = new JButton("-5%");
		m5_natPrice.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String p = inp_natPrice.getText();
					int i = Integer.parseInt(p);
					if(i < 0){i=0;} //make sure things are always positive round here :)
					int temp = i;
					i = (int) Math.floor(i-(i*.05));
					if(i==temp && i > 0){
						i--;
					}
					inp_natPrice.setText(i+"");
				} catch(Exception e1){
					inp_natPrice.setText("0");
				}
			}
		});
		m5_natPrice.setBounds(147, 171, 62, 23);
		frmRunescapeSmelt.getContentPane().add(m5_natPrice);
		
		JButton p5_natPrice = new JButton("+5%");
		p5_natPrice.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String p = inp_natPrice.getText();
					int i = Integer.parseInt(p);
					if(i < 0){i=0;} //make sure things are always positive round here :)
					int temp = i;
					i = (int) Math.floor(i+(i*.05));
					if(i == temp){
						i++;
					}
					inp_natPrice.setText(i+"");
				} catch(Exception e2){
					inp_natPrice.setText("0");
				}
			}
		});
		p5_natPrice.setBounds(219, 171, 62, 23);
		frmRunescapeSmelt.getContentPane().add(p5_natPrice);
		
		JLabel lblNetIncome = new JLabel("Net Income:");
		lblNetIncome.setBounds(344, 276, 72, 14);
		frmRunescapeSmelt.getContentPane().add(lblNetIncome);
		
		JLabel lblBarPrice_1 = new JLabel("Bar Price");
		lblBarPrice_1.setBounds(10, 203, 98, 14);
		frmRunescapeSmelt.getContentPane().add(lblBarPrice_1);
		
		inp_barPrice = new JTextField();
		inp_barPrice.setText("0");
		inp_barPrice.setBounds(10, 222, 127, 20);
		frmRunescapeSmelt.getContentPane().add(inp_barPrice);
		inp_barPrice.setColumns(10);
		
		JButton p5_barPrice = new JButton("+5%");
		p5_barPrice.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String p = inp_barPrice.getText();
					int i = Integer.parseInt(p);
					if(i < 0){i=0;} //make sure things are always positive round here :)
					int temp = i;
					i = (int) Math.floor(i+(i*.05));
					if(i == temp){
						i++;
					}
					inp_barPrice.setText(i+"");
				} catch(Exception e2){
					inp_barPrice.setText("0");
				}
			}
		});
		p5_barPrice.setBounds(219, 221, 62, 23);
		frmRunescapeSmelt.getContentPane().add(p5_barPrice);
		
		JButton m5_barPrice = new JButton("-5%");
		m5_barPrice.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String p = inp_barPrice.getText();
					int i = Integer.parseInt(p);
					if(i < 0){i=0;} //make sure things are always positive round here :)
					int temp = i;
					i = (int) Math.floor(i-(i*.05));
					if(i==temp && i > 0){
						i--;
					}
					inp_barPrice.setText(i+"");
				} catch(Exception e1){
					inp_barPrice.setText("0");
				}
			}
		});
		m5_barPrice.setBounds(147, 221, 62, 23);
		frmRunescapeSmelt.getContentPane().add(m5_barPrice);
		
		JLabel lblProfit = new JLabel("Profit:");
		lblProfit.setBounds(344, 301, 46, 14);
		frmRunescapeSmelt.getContentPane().add(lblProfit);
		
		JLabel lblgoldBudget = new JLabel("0");
		lblgoldBudget.setBounds(429, 176, 111, 14);
		frmRunescapeSmelt.getContentPane().add(lblgoldBudget);
		
		JLabel lbl_totalCost = new JLabel("0");
		lbl_totalCost.setBounds(415, 201, 111, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_totalCost);
		
		JLabel lbl_gpRemain = new JLabel("0");
		lbl_gpRemain.setBounds(395, 226, 111, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_gpRemain);
		
		JLabel lbl_barPrice = new JLabel("0");
		lbl_barPrice.setBounds(405, 251, 111, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_barPrice);
		
		JLabel lbl_netInco = new JLabel("0");
		lbl_netInco.setBounds(415, 276, 91, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_netInco);
		
		JLabel lbl_profit = new JLabel("0");
		lbl_profit.setBounds(384, 301, 119, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_profit);
		
		JLabel lblBaseXpGain = new JLabel("Base Xp gain:");
		lblBaseXpGain.setBounds(344, 326, 83, 14);
		frmRunescapeSmelt.getContentPane().add(lblBaseXpGain);
		
		JLabel lbl_xpGainz = new JLabel("0");
		lbl_xpGainz.setBounds(425, 326, 78, 14);
		frmRunescapeSmelt.getContentPane().add(lbl_xpGainz);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					int initgold = Integer.parseInt(inp_gold.getText());
					int currentGold = initgold;
					int ores = 0;
					int natrunes = 0;
					int totalcoal = 0;
					int t_orePrice = Integer.parseInt(inp_orePrice.getText());
					int t_natPrice = Integer.parseInt(inp_natPrice.getText());
					int t_coalPrice = Integer.parseInt(inp_coalPrice.getText());
					int t_barPrice = Integer.parseInt(inp_barPrice.getText());
					int setCost = 0;

					int n_coals = 0;
					int realCost = 0;
					String metal = (String)comboBox.getSelectedItem();
					switch(metal)
						{
							case "Select One":
								setCost = 1;
								n_coals = 0;
								break;
							case "Mithril":
								setCost = t_orePrice+t_natPrice+(t_coalPrice*4);
								n_coals = 4;
								break;
							case "Adamant":
								setCost = t_orePrice+t_natPrice+(t_coalPrice*6);
								n_coals = 6;
								break;
							case "Runite":
								setCost = t_orePrice+t_natPrice+(t_coalPrice*8);
								n_coals = 8;
								break;
						}
					if(setCost > initgold)
					{
						JOptionPane.showMessageDialog(null, "Not Enough Gold", "Notice", JOptionPane.ERROR_MESSAGE);
					} else
					{
						while(currentGold > setCost)
						{
							currentGold -= setCost;
							ores++;
							totalcoal += n_coals;
							natrunes++;
							realCost += setCost;
						}
						//Update Stats
						int netInco = t_barPrice*ores;
						lbl_oreCount.setText(ores+"");
						lbl_natCount.setText(natrunes+"");
						lbl_coalCount.setText(totalcoal+"");
						lblgoldBudget.setText(inp_gold.getText());
						lbl_totalCost.setText(realCost+"");
						lbl_gpRemain.setText((initgold-realCost)+"");
						lbl_barPrice.setText(inp_barPrice.getText());
						lbl_netInco.setText((t_barPrice*ores)+"");
						lbl_profit.setText((netInco-realCost)+"");
						lbl_xpGainz.setText((ores*50)+"");

					
					}
				} 
				catch (Exception e2){
					
				}
			}
		});
		btnCalculate.setBounds(110, 317, 89, 23);
		frmRunescapeSmelt.getContentPane().add(btnCalculate);
		
		
	}
}
