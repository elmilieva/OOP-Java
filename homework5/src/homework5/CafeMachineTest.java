package homework5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import homework5.CafeMachine;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CafeMachineTest {

	public static void main(String[] args) {

		CafeMachine m1 = new CafeMachine();


		JFrame f = new JFrame("Cafe Machine");

		JButton btnCheckTotal = new JButton("Check Total");
		btnCheckTotal.setBounds(10, 100, 140, 40);
		
		JTextField textFieldMoneyIn = new JTextField("");
		
		JTextArea textAreaResto = new JTextArea("", 0, 0);
		textAreaResto.setBounds(450, 260, 350, 200);
		textAreaResto.setVisible(false);
		textAreaResto.setEditable(false);

		JButton btnCheckCoins = new JButton("Check Coins");
		btnCheckCoins.setBounds(10, 200, 140, 40);

		JButton btnBuyCoffee = new JButton("Buy Coffee (100)");
		btnBuyCoffee.setBounds(630, 100, 200, 40);
		btnBuyCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res = m1.buyBeverage(m1.getBeverages()[0], Integer.parseInt(textFieldMoneyIn.getText()));
				textAreaResto.setVisible(true);
				textAreaResto.setText(res);
				
			}
		});

		JButton btnBuyHotChocolate = new JButton("Buy Hot Chocolate (140)");
		btnBuyHotChocolate.setBounds(630, 200, 200, 40);
		btnBuyHotChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res = m1.buyBeverage(m1.getBeverages()[1], Integer.parseInt(textFieldMoneyIn.getText()));
				textAreaResto.setVisible(true);
				textAreaResto.setText(res);
				
			}
		});
		
		JButton btnReloadCoins = new JButton("Reload Coins");
		btnReloadCoins.setBounds(370, 100, 120, 40);
		btnReloadCoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m1.reloadCoins();
			}
		});

		JLabel labelMoneyIn = new JLabel("Enter money in");
		labelMoneyIn.setBounds(600, 150, 140, 40);

		
		textFieldMoneyIn.setBounds(700, 150, 140, 40);
		textFieldMoneyIn.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				btnBuyCoffee.setEnabled(true);
				btnBuyHotChocolate.setEnabled(true);
			}

			public void removeUpdate(DocumentEvent e) {
				btnBuyCoffee.setEnabled(true);
				btnBuyHotChocolate.setEnabled(true);
			}

			public void insertUpdate(DocumentEvent e) {
				btnBuyCoffee.setEnabled(true);
				btnBuyHotChocolate.setEnabled(true);
			}
		});

		JLabel labelCheckTotal = new JLabel();
		labelCheckTotal.setBounds(10, 110, 200, 100);
		
		JTextArea textAreaCheckCoins = new JTextArea("", 0, 0);
		textAreaCheckCoins.setBounds(10, 260, 200, 200);
		textAreaCheckCoins.setVisible(false);
		textAreaCheckCoins.setEditable(false);

		f.add(labelCheckTotal);
		f.add(labelMoneyIn);
		f.add(btnCheckTotal);
		f.add(btnCheckCoins);
		f.add(btnBuyCoffee);
		btnBuyCoffee.setEnabled(false);
		btnBuyHotChocolate.setEnabled(false);
		f.add(btnBuyHotChocolate);
		f.add(btnReloadCoins);
		f.add(textFieldMoneyIn);
		f.add(textAreaCheckCoins);
		f.add(textAreaResto);
		f.setSize(860, 640);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnCheckTotal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				labelCheckTotal.setText(Integer.toString(m1.checkTotal()));
			}
		});

		btnCheckCoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaCheckCoins.setText(m1.toString());
				textAreaCheckCoins.setVisible(true);
			}
		});
	}
}
