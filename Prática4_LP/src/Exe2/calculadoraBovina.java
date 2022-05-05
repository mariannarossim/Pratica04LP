package Exe2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadoraBovina extends JFrame {

	private JPanel contentPane;
	private JTextField txtvalor;
	private JTextField txtquantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraBovina frame = new calculadoraBovina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculadoraBovina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel quantidade = new JLabel("Quantidade de Arrobas");
		quantidade.setBounds(31, 127, 155, 22);
		contentPane.add(quantidade);
		
		JLabel lblNewLabel_2 = new JLabel("Calculadora Bovina ");
		lblNewLabel_2.setBounds(62, 29, 155, 22);
		contentPane.add(lblNewLabel_2);
		
		txtvalor = new JTextField();
		txtvalor.setBounds(149, 77, 86, 20);
		contentPane.add(txtvalor);
		txtvalor.setColumns(10);
		
		txtquantidade = new JTextField();
		txtquantidade.setBounds(177, 129, 86, 20);
		contentPane.add(txtquantidade);
		txtquantidade.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Valor da Arroba");
		lblNewLabel.setBounds(31, 73, 108, 24);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calcular Total a Pagar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int valor = Integer.parseInt(txtvalor.getText());
			int quantidade = Integer.parseInt(txtquantidade.getText());
			int multiplicacao = valor*quantidade;
		
			JOptionPane.showMessageDialog(null, " O valor a pagar é:  " +multiplicacao);
				
				
			}
		});
		btnNewButton.setBounds(80, 175, 137, 22);
		contentPane.add(btnNewButton);
	}
}
