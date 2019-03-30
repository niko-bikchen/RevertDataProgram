package revert_program;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import program.DataHandler;

/**
 * Initializes GUI. </br>
 * Calls <code>write()</code> and <code>read()</code> methods of
 * <b>DataHandler</b> class after pressing the "SEND" button.
 * 
 * @author Nikolay Bikchentaev
 * @since 30.03.2019
 * @version 1.0
 */

public class MainWindow {

	private JFrame frmMainWindow;
	private JTextField text_field_data;
	private JTextField text_field_result;
	private JButton btn_send;

	/**
	 * Create the window.
	 */
	public MainWindow() {
		initialize();
		frmMainWindow.setVisible(true);
	}

	/**
	 * Initialize the contents of the window.
	 */
	private void initialize() {
		frmMainWindow = new JFrame();
		frmMainWindow.setTitle("Revert Data");
		frmMainWindow.setBounds(100, 100, 400, 150);
		frmMainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainWindow.getContentPane().setLayout(new BoxLayout(frmMainWindow.getContentPane(), BoxLayout.Y_AXIS));

		JPanel input_panel = new JPanel();
		frmMainWindow.getContentPane().add(input_panel);

		JLabel lbl_input = new JLabel("Data:");
		lbl_input.setHorizontalAlignment(SwingConstants.CENTER);
		input_panel.add(lbl_input);

		Component horizontalStrut = Box.createHorizontalStrut(6);
		input_panel.add(horizontalStrut);

		text_field_data = new JTextField();
		text_field_data.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_send.requestFocus();
			}
		});
		text_field_data.setToolTipText("Enter your data here");
		lbl_input.setLabelFor(text_field_data);
		input_panel.add(text_field_data);
		text_field_data.setColumns(30);

		JPanel output_panel = new JPanel();
		frmMainWindow.getContentPane().add(output_panel);

		JLabel lbl_output = new JLabel("Result:");
		output_panel.add(lbl_output);

		text_field_result = new JTextField();
		lbl_output.setLabelFor(text_field_result);
		text_field_result.setEditable(false);
		output_panel.add(text_field_result);
		text_field_result.setColumns(30);

		JPanel button_panel = new JPanel();
		frmMainWindow.getContentPane().add(button_panel);

		btn_send = new JButton("SEND");
		btn_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status = DataHandler.write(text_field_data.getText());
				if (status == 1) {
					text_field_result.setText(DataHandler.read());
				} else {
					text_field_result.setText("Failed to revert the given data");
				}
			}
		});
		button_panel.add(btn_send);
	}

}
