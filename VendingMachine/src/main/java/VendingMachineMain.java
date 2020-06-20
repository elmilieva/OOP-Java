
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JFrame;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class VendingMachineMain {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, IOException {

		String url_str = "https://prime.exchangerate-api.com/v5/2c688f48452448c8eccaa028/latest/BGN";
		URL url;
		HttpURLConnection request = null;
		try {
			url = new URL(url_str);
			request = (HttpURLConnection) url.openConnection();
			request.connect();
		} catch (Exception e) {
			System.out.println("Error Happened: ");
			System.out.println(e.getMessage());
		}

		JsonElement root = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent()));
		JsonObject jsonobj = root.getAsJsonObject();
		JsonObject rates = (JsonObject) jsonobj.get("conversion_rates");

		Double req_result = rates.get("EUR").getAsDouble();

		Money.setExchangeRate(req_result);

		Money moneyInMachine = new Money(5, 5, 5, 5, 5, 5, 5, 5);
		Product coffee = new Product("Coffee", 120, 5);
		Product sandwich = new Product("Sandwich", 530, 5);
		Product[] products = { coffee, sandwich };

		Products vendingMachineProducts = new Products(products);

		VendingMachine myMachine = new VendingMachine(moneyInMachine, vendingMachineProducts);

		JFrame f = new JFrame("Vending Machine");

		f.add(new TabbedPane(myMachine));
		f.pack();

		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
