import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TabbedPane extends JPanel {
	private static final long serialVersionUID = 1L;
	private VendingMachine myMachine;

	public TabbedPane(VendingMachine myMachine) {
		super(new GridLayout(1, 1));
		this.myMachine = myMachine;

		JTabbedPane tabbedPane = new JTabbedPane();
		ImageIcon icon = null;

		JComponent panel1 = makeTextPanel1("Panel #1");
		tabbedPane.addTab("Machine Settings", icon, panel1, "");
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

		JComponent panel2 = makeTextPanel2("Panel #2");
		tabbedPane.addTab("Buying", icon, panel2, "");
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

		add(tabbedPane);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}

	protected JComponent makeTextPanel2(String text) {
		JPanel panel = new JPanel(true);

		String[] arr = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		JLabel labelEdnaStotinka = new JLabel("Moneti 1 st./cent");
		JComboBox<String> comboBoxEdnaStotinka = new JComboBox<>(arr);

		JLabel labelDveStotinki = new JLabel("Moneti 2 st./cents");
		JComboBox<String> comboBoxDveStotinki = new JComboBox<>(arr);

		JLabel labelPetStotinki = new JLabel("Moneti 5 st./cents");
		JComboBox<String> comboBoxPetStotinki = new JComboBox<>(arr);

		JLabel labelDesetStotinki = new JLabel("Moneti 10 st./cents");
		JComboBox<String> comboBoxDesetStotinki = new JComboBox<>(arr);

		JLabel labelDvadesetStotinki = new JLabel("Moneti 20 st./cents");
		JComboBox<String> comboBoxDvadesetStotinki = new JComboBox<>(arr);

		JLabel labelPetdesetStotinki = new JLabel("Moneti 50 st./cents");
		JComboBox<String> comboBoxPetdesetStotinki = new JComboBox<>(arr);

		JLabel labelEdinLev = new JLabel("Moneti 1 lv./euro");
		JComboBox<String> comboBoxEdinLev = new JComboBox<>(arr);

		JLabel labelDvaLeva = new JLabel("Moneti 2 lv./euros");
		JComboBox<String> comboBoxDvaLeva = new JComboBox<>(arr);

		JComboBox<Product> comboBoxProducts = new JComboBox<>(myMachine.getProducts().getProducts());
		JButton btnBuy = new JButton("Buy");

		JRadioButton radioBtnEuro = new JRadioButton("Euro?");

		JTextArea textAreaResto = new JTextArea("", 3, 50);
		textAreaResto.setVisible(false);
		textAreaResto.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(textAreaResto);

		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money moneyIn = new Money(Integer.parseInt(comboBoxEdnaStotinka.getSelectedItem().toString()),
						Integer.parseInt(comboBoxDveStotinki.getSelectedItem().toString()),
						Integer.parseInt(comboBoxPetStotinki.getSelectedItem().toString()),
						Integer.parseInt(comboBoxDesetStotinki.getSelectedItem().toString()),
						Integer.parseInt(comboBoxDvadesetStotinki.getSelectedItem().toString()),
						Integer.parseInt(comboBoxPetdesetStotinki.getSelectedItem().toString()),
						Integer.parseInt(comboBoxEdinLev.getSelectedItem().toString()),
						Integer.parseInt(comboBoxDvaLeva.getSelectedItem().toString()));

				Product product = (Product) comboBoxProducts.getSelectedItem();
				String resto = "";
				if (radioBtnEuro.isSelected()) {
					resto = myMachine
							.takeResto((int) (moneyIn.checkTotal() / Money.getExchangeRate()) - product.getPrice());
				} else {
					resto = myMachine.takeResto(moneyIn.checkTotal() - product.getPrice());
				}
				textAreaResto.setText(myMachine.buyProduct(product, moneyIn, radioBtnEuro.isSelected()) + "\n" + resto);
				textAreaResto.setVisible(true);

			}
		});

		panel.setLayout(new GridLayout(11, 2, 10, 10));
		panel.add(labelEdnaStotinka);
		panel.add(comboBoxEdnaStotinka);
		panel.add(labelDveStotinki);
		panel.add(comboBoxDveStotinki);
		panel.add(labelPetStotinki);
		panel.add(comboBoxPetStotinki);
		panel.add(labelDesetStotinki);
		panel.add(comboBoxDesetStotinki);
		panel.add(labelDvadesetStotinki);
		panel.add(comboBoxDvadesetStotinki);
		panel.add(labelPetdesetStotinki);
		panel.add(comboBoxPetdesetStotinki);
		panel.add(labelEdinLev);
		panel.add(comboBoxEdinLev);
		panel.add(labelDvaLeva);
		panel.add(comboBoxDvaLeva);
		panel.add(radioBtnEuro);
		panel.add(new JLabel());
		panel.add(comboBoxProducts);
		panel.add(btnBuy);
		panel.add(scrollPane);
		return panel;
	}

	protected JComponent makeTextPanel1(String text) {
		JPanel panel = new JPanel(false);
		JButton btnCheckTotal = new JButton("Check Total");

		JButton btnCheckCoins = new JButton("Check Coins");

		JButton btnReloadCoins = new JButton("Reload Coins");
		btnReloadCoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myMachine.reloadCoins();
			}
		});

		JButton btnExportLatex = new JButton("Export Tex");
		btnExportLatex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myMachine.exportReportInLatex();
			}
		});

		JTextField textFieldRefillQuantity = new JTextField("");

		JButton btnRefillProducts = new JButton("Refil Products");
		btnRefillProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myMachine.refillProducts(Integer.parseInt(textFieldRefillQuantity.getText()));
			}
		});

		JLabel labelCheckTotal = new JLabel();

		JTextArea textAreaCheckCoins = new JTextArea("", 8, 1);
		textAreaCheckCoins.setSize(200, 200);
		textAreaCheckCoins.setVisible(false);
		textAreaCheckCoins.setEditable(false);

		btnCheckCoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaCheckCoins.setText(myMachine.checkAmountOfCoinsInMachine());
				textAreaCheckCoins.setVisible(true);
			}
		});

		btnCheckTotal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				labelCheckTotal.setText(Integer.toString(myMachine.getMoneyInMachine().checkTotal()));
			}
		});

		panel.setLayout(new GridLayout(4, 2, 10, 10));

		panel.add(btnCheckTotal);
		panel.add(btnCheckCoins);
		panel.add(labelCheckTotal);
		panel.add(textAreaCheckCoins);
		panel.add(btnReloadCoins);
		panel.add(btnExportLatex);
		panel.add(btnRefillProducts);
		panel.add(textFieldRefillQuantity);
		return panel;
	}
}
