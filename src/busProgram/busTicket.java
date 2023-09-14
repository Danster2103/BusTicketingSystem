package busProgram;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

import javax.swing.JTextArea;

public class busTicket {

	private JFrame frame;
	private JTextField jtxtQuantity;
	private JTextField jtxtPayment;
	private JTextField jtxtLuggage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					busTicket window = new busTicket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public busTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.light"));
		frame.setBounds(100, 100, 970, 616);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Bus Ticketing System");
		lblNewLabel.setBounds(224, 28, 497, 49);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Quantity:");
		lblNewLabel_1.setBounds(22, 145, 103, 28);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1);

		jtxtQuantity = new JTextField();
		jtxtQuantity.setBounds(148, 148, 130, 29);
		jtxtQuantity.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(jtxtQuantity);
		jtxtQuantity.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(265, 125, -12, 151);
		separator.setForeground(Color.BLACK);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(124, 110, 1, 209);
		separator_1.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(252, 282, 11, -155);
		separator_2.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(254, 288, 9, -161);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(299, 125, 1, 442);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_4);

		JLabel lblNewLabel_2 = new JLabel("Departure:");
		lblNewLabel_2.setBounds(22, 194, 103, 22);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Destination:");
		lblNewLabel_2_1.setBounds(22, 241, 103, 22);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2_1);

		JComboBox jCmbDestination = new JComboBox();
		jCmbDestination.setBounds(148, 235, 130, 32);
		jCmbDestination.setModel(new DefaultComboBoxModel(
				new String[] { "", "Sauyo", "Sangandaan", "Balintawak", "Balon-Bato", "Blumentrit", "Ayala", "QCU" }));
		frame.getContentPane().add(jCmbDestination);

		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 288, 1, 2);
		frame.getContentPane().add(separator_5);

		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setBounds(30, 414, 233, 2);
		separator_4_1.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_4_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Miscellaneous:");
		lblNewLabel_2_1_1.setBounds(22, 467, 122, 22);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2_1_1);

		JLabel jlblMisc = new JLabel("");
		jlblMisc.setBounds(141, 467, 122, 22);
		jlblMisc.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblMisc.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblMisc.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jlblMisc);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Cost of Travel");
		lblNewLabel_2_1_1_1.setBounds(22, 434, 116, 22);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2_1_1_1);

		JLabel jlblCostofTravel = new JLabel("");
		jlblCostofTravel.setBounds(141, 434, 122, 22);
		jlblCostofTravel.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofTravel.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblCostofTravel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jlblCostofTravel);

		JSeparator separator_4_1_1 = new JSeparator();
		separator_4_1_1.setBounds(30, 515, 233, 2);
		separator_4_1_1.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_4_1_1);

		JComboBox jCmbBusType = new JComboBox();
		jCmbBusType.setBounds(148, 321, 130, 32);
		jCmbBusType.setModel(new DefaultComboBoxModel(new String[] { "", "With Aircon", "Without Aircon" }));
		frame.getContentPane().add(jCmbBusType);

		JLabel jlblTotalPrice = new JLabel("");
		jlblTotalPrice.setBounds(459, 155, 122, 22);
		jlblTotalPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotalPrice.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblTotalPrice.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jlblTotalPrice);

		JLabel jlblChange = new JLabel("");
		jlblChange.setBounds(459, 297, 122, 22);
		jlblChange.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblChange.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblChange.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jlblChange);

		JLabel lblNewLabel_1_2 = new JLabel("No. of Luggage");
		lblNewLabel_1_2.setBounds(22, 282, 130, 28);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_2);

		jtxtLuggage = new JTextField();
		jtxtLuggage.setBounds(148, 282, 130, 29);
		jtxtLuggage.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtLuggage.setColumns(10);
		frame.getContentPane().add(jtxtLuggage);

		JLabel lblNewLabel_1_2_1 = new JLabel("Type of Bus");
		lblNewLabel_1_2_1.setBounds(22, 321, 130, 28);
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("Seat Position:");
		lblNewLabel_1_2_1_1.setBounds(22, 360, 130, 28);
		lblNewLabel_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_2_1_1);

		JComboBox jCmbSeat = new JComboBox();
		jCmbSeat.setBounds(148, 364, 130, 32);
		jCmbSeat.setModel(new DefaultComboBoxModel(
				new String[] { "", "Near Door", "Middle Seat", "Beside Window", "Back Seat", "Near Driver" }));
		frame.getContentPane().add(jCmbSeat);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Total Price:");
		lblNewLabel_2_1_1_1_1.setBounds(327, 155, 103, 22);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);

		JLabel lblNewLabel_2_1_1_2_1_1_1 = new JLabel("Date:");
		lblNewLabel_2_1_1_2_1_1_1.setBounds(340, 331, 103, 22);
		lblNewLabel_2_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2_1_1_2_1_1_1);

		JLabel jlblDate = new JLabel("");
		jlblDate.setBounds(459, 331, 122, 22);
		jlblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblDate.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblDate.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jlblDate);

		JLabel lblNewLabel_2_1_1_2_1_1_1_1 = new JLabel("Time:");
		lblNewLabel_2_1_1_2_1_1_1_1.setBounds(340, 370, 103, 22);
		lblNewLabel_2_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2_1_1_2_1_1_1_1);

		JLabel jlblTime = new JLabel("");
		jlblTime.setBounds(459, 370, 122, 22);
		jlblTime.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTime.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblTime.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jlblTime);

		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1 = new JLabel("Ticket No.");
		lblNewLabel_2_1_1_2_1_1_1_1_1.setBounds(340, 414, 103, 22);
		lblNewLabel_2_1_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2_1_1_2_1_1_1_1_1);

		JLabel jlblTicketNo = new JLabel("");
		jlblTicketNo.setBounds(459, 414, 122, 22);
		jlblTicketNo.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTicketNo.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblTicketNo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jlblTicketNo);

		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1 = new JLabel("Route:");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1.setBounds(340, 447, 103, 22);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2_1_1_2_1_1_1_1_1_1);

		JLabel jlblRoute = new JLabel("");
		jlblRoute.setBounds(459, 454, 122, 22);
		jlblRoute.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblRoute.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblRoute.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jlblRoute);

		JButton btnTotal = new JButton("Total");
		btnTotal.setBounds(22, 528, 85, 23);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// -----------------------------QUANTITY, ORIGIN,
				// DESTINATION------------------------------/
				double Quantity = Double.parseDouble(jtxtQuantity.getText());
				double Origin = 10;
				double Sauyo = (2 + Origin) * Quantity;
				double Sangandaan = (4 + Origin) * Quantity;
				double Balintawak = (6 + Origin) * Quantity;
				double BalonBato = (8 + Origin) * Quantity;
				double Blumentrit = (10 + Origin) * Quantity;
				double Ayala = (9 + Origin) * Quantity;
				double QCU = (4 + Origin) * Quantity;

				if (jCmbDestination.getSelectedItem().equals("Sauyo")) {
					String cSauyo = String.format("%.2f", Sauyo);
					jlblCostofTravel.setText(cSauyo);
				}

				if (jCmbDestination.getSelectedItem().equals("Sangandaan")) {
					String cSanga = String.format("%.2f", Sangandaan);
					jlblCostofTravel.setText(cSanga);
				}

				if (jCmbDestination.getSelectedItem().equals("Balintawak")) {
					String cBalintawak = String.format("%.2f", Balintawak);
					jlblCostofTravel.setText(cBalintawak);
				}

				if (jCmbDestination.getSelectedItem().equals("Balon-Bato")) {
					String cBalonBato = String.format("%.2f", BalonBato);
					jlblCostofTravel.setText(cBalonBato);
				}

				if (jCmbDestination.getSelectedItem().equals("Blumentrit")) {
					String cBlumentrit = String.format("%.2f", Blumentrit);
					jlblCostofTravel.setText(cBlumentrit);
				}

				if (jCmbDestination.getSelectedItem().equals("Ayala")) {
					String cAyala = String.format("%.2f", Ayala);
					jlblCostofTravel.setText(cAyala);
				}

				if (jCmbDestination.getSelectedItem().equals("QCU")) {
					String cQCU = String.format("%.2f", QCU);
					jlblCostofTravel.setText(cQCU);
				}

				// -----------------------------NO. OF LUGGAGE------------------------------/
				double Luggage = Double.parseDouble(jtxtLuggage.getText());
				double LuggagePrice = 2;
				double iLuggage;

				iLuggage = (Luggage * LuggagePrice);
				String PriceOfLuggage = String.format("%.2f", iLuggage);

				// -----------------------------BUS TYPE AND
				// MISCELLANOUS------------------------------/

				double aircon = 5;
				double without = 0;
				double Aircon = (aircon * Quantity);
				double Without = (without * Quantity);

				if (jCmbBusType.getSelectedItem().equals("With Aircon")) {

					String cWithA = String.format(" %.2f", Aircon + iLuggage);
					jlblMisc.setText(cWithA);

				}

				if (jCmbBusType.getSelectedItem().equals("Without Aircon")) {

					String cWithO = String.format("%.2f", Without + iLuggage);
					jlblMisc.setText(cWithO);
				}
				// -----------------------------TOTAL PRICE------------------------------/

				double cTotal1 = Double.parseDouble(jlblCostofTravel.getText());
				double cTotal2 = Double.parseDouble(jlblMisc.getText());

				double alltotal = (cTotal1 + cTotal2);
				String iTotal = String.format(" %.2f", alltotal);
				jlblTotalPrice.setText(iTotal);

			}

		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(btnTotal);

		JLabel lblNewLabel_1_1 = new JLabel("Enter your Payment:");
		lblNewLabel_1_1.setBounds(361, 191, 174, 28);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_1);

		jtxtPayment = new JTextField();
		jtxtPayment.setBounds(385, 230, 130, 29);
		jtxtPayment.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtPayment.setColumns(10);
		frame.getContentPane().add(jtxtPayment);

		JButton btnPay = new JButton("Pay");
		btnPay.setBounds(402, 267, 85, 23);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double Pay = Double.parseDouble(jtxtPayment.getText());
				double Total = Double.parseDouble(jlblTotalPrice.getText());
				double Change;

				if (Pay > Total) {

					Change = (Pay - Total);

					String iChange = String.format("%.2f", Change);
					jlblChange.setText(iChange);

					// -----------------------------TICKET------------------------------/
					int num1;
					String q1 = "";
					num1 = 1325 + (int) (Math.random() * 4238);
					q1 += num1 + 1325;
					jlblTicketNo.setText(q1);
					// -----------------------------ROUTE------------------------------/
					String Route = String.format("Any Route");
					jlblRoute.setText(Route);

					// -----------------------------DATE------------------------------/

					// -----------------------------TIME------------------------------/
					Calendar Timer = Calendar.getInstance();
					Timer.getTime();
					SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
					jlblTime.setText(tTime.format(Timer.getTime()));

					// -----------------------------DATE------------------------------/
					SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
					jlblDate.setText(Tdate.format(Timer.getTime()));

				}

				else if (Pay == Total) {
					Change = (Pay - Total);

					String iChange = String.format("%.2f", Change);
					jlblChange.setText(iChange);

					// -----------------------------TICKET------------------------------/
					int num1;
					String q1 = "";
					num1 = 1325 + (int) (Math.random() * 4238);
					q1 += num1 + 1325;
					jlblTicketNo.setText(q1);
					// -----------------------------ROUTE------------------------------/
					String Route = String.format("Any Route");
					jlblRoute.setText(Route);

					// -----------------------------DATE------------------------------/

					// -----------------------------TIME------------------------------/
					Calendar Timer = Calendar.getInstance();
					Timer.getTime();
					SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
					jlblTime.setText(tTime.format(Timer.getTime()));

					// -----------------------------DATE------------------------------/
					SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
					jlblDate.setText(Tdate.format(Timer.getTime()));

				} else if (Pay < Total) {
					String INC = String.format("Not enough");
					jlblChange.setText(INC);
				}

			}
		});
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(btnPay);

		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("Change:");
		lblNewLabel_2_1_1_2_1_1.setBounds(340, 297, 103, 22);
		lblNewLabel_2_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2_1_1_2_1_1);

		JLabel jlblDeparture = new JLabel("Bayan, Novaliches");
		jlblDeparture.setBounds(148, 194, 130, 22);
		jlblDeparture.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblDeparture.setFont(new Font("Dialog", Font.PLAIN, 13));
		jlblDeparture.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jlblDeparture);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1.setBounds(612, 103, 316, 442);
		frame.getContentPane().add(panel_1_1);

		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		txtReceipt.setBounds(10, 11, 296, 420);
		panel_1_1.add(txtReceipt);

		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(109, 528, 85, 23);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * jtxtQty.setText(null);
				 * jCmbDrinks.setSelectedItem("Select a Drink");
				 */

				jtxtQuantity.setText(null);
				jtxtLuggage.setText(null);
				jtxtPayment.setText(null);

				jCmbDestination.setSelectedItem(null);
				jCmbBusType.setSelectedItem(null);
				jCmbSeat.setSelectedItem(null);

				jlblCostofTravel.setText(null);
				jlblMisc.setText(null);
				jlblTotalPrice.setText(null);
				jlblChange.setText(null);
				jlblTime.setText(null);
				jlblDate.setText(null);
				jlblTicketNo.setText(null);
				jlblTicketNo.setText(null);
				jlblRoute.setText(null);
				txtReceipt.setText(null);

			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(194, 528, 95, 23);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(btnExit);

		JSeparator separator_4_2 = new JSeparator();
		separator_4_2.setBounds(591, 125, 1, 438);
		separator_4_2.setOrientation(SwingConstants.VERTICAL);
		separator_4_2.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_4_2);

		JButton btnReceipt = new JButton("Show Receipt");
		btnReceipt.setBounds(375, 515, 160, 23);
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtReceipt.append("\t Receipt \n\n " +
						" Quantity: " + jtxtQuantity.getText() + "\n\n "
						+ " Departure: " + jlblDeparture.getText() + "\n\n "
						+ " Destination: " + jCmbDestination.getSelectedItem() + "\n\n "
						+ " Luggage: " + jtxtLuggage.getText() + "\n\n "
						+ " BusType: " + jCmbBusType.getSelectedItem() + "\n\n "
						+ " Seat: " + jCmbSeat.getSelectedItem() + "\n\n "
						+ " Cost of Travel: " + jlblCostofTravel.getText() + "\n\n "
						+ " Miscellaneous: " + jlblMisc.getText() + "\n\n "
						+ " Total Price: " + jlblTotalPrice.getText() + "\n\n "
						+ " Payment: " + jtxtPayment.getText() + "\n\n "
						+ " Change: " + jlblChange.getText() + "\n\n "
						+ " Date of Purchase: " + jlblDate.getText() + "\n\n "
						+ "Time of Purchase: " + jlblTime.getText() + "\n\n "
						+ "Ticket No: " + jlblTicketNo.getText() + "\n\n "

				);

			}
		});

		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(btnReceipt);

	}
}
