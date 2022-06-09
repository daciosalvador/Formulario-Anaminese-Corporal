package View;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;


public class MainTela {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textPeso;
	private JTextField textAltura;
	private JLabel lblResultado;
	private JTextPane ResultPane;
	private JTextPane FinalPane;
	private JTextPane ResulPaneRadio;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainTela window = new MainTela();
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
	public MainTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.setBounds(100, 100, 754, 801);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ButtonGroup grupo = new ButtonGroup();
		ButtonGroup grupo1 = new ButtonGroup();
		ButtonGroup grupo2 = new ButtonGroup();
		ButtonGroup grupo3 = new ButtonGroup();
		ButtonGroup grupo4 = new ButtonGroup();
		ButtonGroup grupo5 = new ButtonGroup();
		ButtonGroup grupo6 = new ButtonGroup();
		ButtonGroup grupo7 = new ButtonGroup();
		ButtonGroup grupo8 = new ButtonGroup();
		
		// Buttons
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBackground(SystemColor.inactiveCaption);
		rdbtnFeminino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFeminino.setBounds(562, 20, 87, 21);
		frame.getContentPane().add(rdbtnFeminino);
	
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBackground(SystemColor.inactiveCaption);
		rdbtnMasculino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnMasculino.setBounds(651, 20, 96, 21);
		frame.getContentPane().add(rdbtnMasculino);
		
		grupo.add(rdbtnMasculino);
		grupo.add(rdbtnFeminino);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.inactiveCaption);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Solteiro", "Casado", "Divorciado", "Viuvo"}));
		comboBox.setBounds(613, 78, 103, 22);
		frame.getContentPane().add(comboBox);
		
		
		// Text Field --------
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("/   /");
		textField.setBounds(91, 24, 114, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(91, 51, 411, 22);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(91, 79, 199, 22);
		frame.getContentPane().add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(371, 79, 131, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(544, 51, 191, 22);
		frame.getContentPane().add(textField_4);
			
		textField_5 = new JTextField();
		textField_5.setBounds(91, 107, 199, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(91, 137, 644, 22);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(91, 167, 118, 22);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setText("(  )");
		textField_8.setBounds(371, 107, 131, 22);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setText("(  )");
		textField_9.setBounds(573, 106, 162, 22);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(276, 167, 109, 22);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(454, 167, 118, 22);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(620, 167, 115, 22);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(91, 235, 199, 22);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(380, 235, 96, 22);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(639, 236, 96, 22);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(555, 397, 180, 22);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(632, 610, 103, 22);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textPeso = new JTextField();
		textPeso.setHorizontalAlignment(SwingConstants.CENTER);
		textPeso.setText("0.0");
		textPeso.setBounds(639, 454, 96, 25);
		frame.getContentPane().add(textPeso);
		textPeso.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setHorizontalAlignment(SwingConstants.CENTER);
		textAltura.setText("0.0");
		textAltura.setBounds(639, 488, 96, 25);
		frame.getContentPane().add(textAltura);
		textAltura.setColumns(10);
		
		
		// TextAREA ---------------
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 314, 162, 46);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(198, 314, 162, 46);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(387, 314, 162, 46);
		frame.getContentPane().add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(573, 314, 162, 46);
		frame.getContentPane().add(textArea_3);
		
		
		// Label ----------		
		JLabel lblNewLabel = new JLabel("Data:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 24, 70, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 51, 60, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(512, 20, 60, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DataNasc:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(10, 79, 85, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Idade:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(300, 79, 54, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RG:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(512, 52, 45, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Estado Civil:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(512, 83, 103, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(10, 114, 70, 13);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Telefone:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(300, 114, 70, 13);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Celular:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_9.setBounds(512, 114, 60, 13);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Endereco:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_10.setBounds(10, 141, 85, 13);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Bairro:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(10, 169, 60, 13);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Estado:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_12.setBounds(219, 169, 60, 13);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Cidade:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_13.setBounds(395, 168, 60, 13);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("CEP:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_14.setBounds(583, 168, 45, 13);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Em caso de emergência avisar:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_15.setBounds(10, 203, 271, 22);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Anaminese Corporal");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel_16.setBounds(293, 10, 162, 21);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Nome:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_17.setBounds(10, 236, 74, 14);
		frame.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Telefone:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_18.setBounds(300, 236, 70, 13);
		frame.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Grau de Parentesco:");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_19.setBounds(486, 236, 153, 13);
		frame.getContentPane().add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Histórico do Paciente");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_20.setBounds(276, 267, 191, 13);
		frame.getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Motivo do Tratamento:");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_21.setBounds(10, 291, 170, 13);
		frame.getContentPane().add(lblNewLabel_21);
		
		JLabel lblNewLabel_23 = new JLabel("Cremes em uso:");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_23.setBounds(391, 294, 126, 13);
		frame.getContentPane().add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Medicamentos em uso:");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_24.setBounds(573, 295, 152, 13);
		frame.getContentPane().add(lblNewLabel_24);
		
		JLabel lblNewLabel_22 = new JLabel("Alergias:");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_22.setBounds(198, 287, 70, 21);
		frame.getContentPane().add(lblNewLabel_22);
		
		JLabel lblNewLabel_25 = new JLabel("Hábitos");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_25.setBounds(347, 370, 70, 13);
		frame.getContentPane().add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Pratica atividade fisica");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_26.setBounds(10, 397, 170, 13);
		frame.getContentPane().add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Qual? / Frequência:");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_27.setBounds(407, 397, 150, 22);
		frame.getContentPane().add(lblNewLabel_27);

		JLabel lblNewLabel_28 = new JLabel("Quantas horas?");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_28.setBounds(512, 613, 116, 13);
		frame.getContentPane().add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Fuma");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_29.setBounds(10, 431, 45, 13);
		frame.getContentPane().add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Ingere Bebidas alcoólicas");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_30.setBounds(10, 454, 195, 25);
		frame.getContentPane().add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Urina");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_31.setBounds(10, 488, 45, 13);
		frame.getContentPane().add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Exposição ao Sol");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_32.setBounds(10, 513, 153, 21);
		frame.getContentPane().add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("Apetite");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_33.setBounds(10, 550, 153, 22);
		frame.getContentPane().add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("Consumo de Água");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_34.setBounds(10, 584, 162, 19);
		frame.getContentPane().add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("Qualidade do Sono");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_35.setBounds(10, 613, 153, 13);
		frame.getContentPane().add(lblNewLabel_35);
		
		
		
		// Separador ----------------
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 192, 725, 12);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 260, 725, 12);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(10, 362, 725, 12);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBounds(10, 642, 725, 12);
		frame.getContentPane().add(separator_2_1);
		
		
		// Buttons Habito
		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSim.setBackground(SystemColor.inactiveCaption);
		rdbtnSim.setBounds(203, 396, 87, 21);
		frame.getContentPane().add(rdbtnSim);
		
		
		
		JRadioButton rdbtnNao = new JRadioButton("Nao");
		rdbtnNao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNao.setBackground(SystemColor.inactiveCaption);
		rdbtnNao.setBounds(310, 396, 54, 21);
		frame.getContentPane().add(rdbtnNao);
		
		JRadioButton rdbtnSimFuma = new JRadioButton("Sim");
		rdbtnSimFuma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSimFuma.setBackground(SystemColor.inactiveCaption);
		rdbtnSimFuma.setBounds(203, 427, 87, 21);
		frame.getContentPane().add(rdbtnSimFuma);
		
		JRadioButton rdbtnNaoFuma = new JRadioButton("Nao");
		rdbtnNaoFuma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNaoFuma.setBackground(SystemColor.inactiveCaption);
		rdbtnNaoFuma.setBounds(310, 427, 103, 21);
		frame.getContentPane().add(rdbtnNaoFuma);
		
		JRadioButton rdbtnMuito = new JRadioButton("Muito");
		rdbtnMuito.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnMuito.setBackground(SystemColor.inactiveCaption);
		rdbtnMuito.setBounds(203, 457, 87, 21);
		frame.getContentPane().add(rdbtnMuito);
		
		JRadioButton rdbtnModerado = new JRadioButton("Moderado");
		rdbtnModerado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnModerado.setBackground(SystemColor.inactiveCaption);
		rdbtnModerado.setBounds(310, 457, 103, 21);
		frame.getContentPane().add(rdbtnModerado);
		
		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNormal.setBackground(SystemColor.inactiveCaption);
		rdbtnNormal.setBounds(203, 484, 87, 21);
		frame.getContentPane().add(rdbtnNormal);
		
		JRadioButton rdbtnPouco = new JRadioButton("Pouco");
		rdbtnPouco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnPouco.setBackground(SystemColor.inactiveCaption);
		rdbtnPouco.setBounds(310, 484, 103, 21);
		frame.getContentPane().add(rdbtnPouco);
		
		JRadioButton rdbtnAsVezes = new JRadioButton("Ás Vezes");
		rdbtnAsVezes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAsVezes.setBackground(SystemColor.inactiveCaption);
		rdbtnAsVezes.setBounds(203, 516, 87, 21);
		frame.getContentPane().add(rdbtnAsVezes);
		
		JRadioButton rdbtnPoucoSol = new JRadioButton("Pouco");
		rdbtnPoucoSol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnPoucoSol.setBackground(SystemColor.inactiveCaption);
		rdbtnPoucoSol.setBounds(310, 516, 103, 21);
		frame.getContentPane().add(rdbtnPoucoSol);
		
		JRadioButton rdbtnMuitoApetite = new JRadioButton("Muito");
		rdbtnMuitoApetite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnMuitoApetite.setBackground(SystemColor.inactiveCaption);
		rdbtnMuitoApetite.setBounds(203, 548, 87, 21);
		frame.getContentPane().add(rdbtnMuitoApetite);
		
		JRadioButton rdbtnAbundate = new JRadioButton("Abundante");
		rdbtnAbundate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAbundate.setBackground(SystemColor.inactiveCaption);
		rdbtnAbundate.setBounds(203, 580, 109, 21);
		frame.getContentPane().add(rdbtnAbundate);
		
		JRadioButton rdbtnNormalSono = new JRadioButton("Normal");
		rdbtnNormalSono.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNormalSono.setBackground(SystemColor.inactiveCaption);
		rdbtnNormalSono.setBounds(203, 609, 87, 21);
		frame.getContentPane().add(rdbtnNormalSono);
		
		JRadioButton rdbtnModeradoApetite = new JRadioButton("Moderado");
		rdbtnModeradoApetite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnModeradoApetite.setBackground(SystemColor.inactiveCaption);
		rdbtnModeradoApetite.setBounds(310, 548, 103, 21);
		frame.getContentPane().add(rdbtnModeradoApetite);
		
		JRadioButton rdbtnModeradoAgua = new JRadioButton("Moderado");
		rdbtnModeradoAgua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnModeradoAgua.setBackground(SystemColor.inactiveCaption);
		rdbtnModeradoAgua.setBounds(310, 580, 103, 21);
		frame.getContentPane().add(rdbtnModeradoAgua);
		
		JRadioButton rdbtnModeradoSono = new JRadioButton("Moderado");
		rdbtnModeradoSono.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnModeradoSono.setBackground(SystemColor.inactiveCaption);
		rdbtnModeradoSono.setBounds(310, 609, 103, 21);
		frame.getContentPane().add(rdbtnModeradoSono);
		
		JRadioButton rdbtnNaoConsumoBebidas = new JRadioButton("Não consumo");
		rdbtnNaoConsumoBebidas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNaoConsumoBebidas.setBackground(SystemColor.inactiveCaption);
		rdbtnNaoConsumoBebidas.setBounds(410, 457, 139, 21);
		frame.getContentPane().add(rdbtnNaoConsumoBebidas);
		
		JRadioButton rdbtnMuitoUrina = new JRadioButton("Muito");
		rdbtnMuitoUrina.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnMuitoUrina.setBackground(SystemColor.inactiveCaption);
		rdbtnMuitoUrina.setBounds(410, 484, 103, 21);
		frame.getContentPane().add(rdbtnMuitoUrina);
		
		JRadioButton rdbtnDiariaSol = new JRadioButton("Diariamente");
		rdbtnDiariaSol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnDiariaSol.setBackground(SystemColor.inactiveCaption);
		rdbtnDiariaSol.setBounds(410, 516, 118, 21);
		frame.getContentPane().add(rdbtnDiariaSol);
		
		JRadioButton rdbtnPoucoApetite = new JRadioButton("Pouco");
		rdbtnPoucoApetite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnPoucoApetite.setBackground(SystemColor.inactiveCaption);
		rdbtnPoucoApetite.setBounds(410, 548, 103, 21);
		frame.getContentPane().add(rdbtnPoucoApetite);
		
		JRadioButton rdbtnNaoConsumoAgua = new JRadioButton("Não consumo");
		rdbtnNaoConsumoAgua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNaoConsumoAgua.setBackground(SystemColor.inactiveCaption);
		rdbtnNaoConsumoAgua.setBounds(410, 580, 118, 21);
		frame.getContentPane().add(rdbtnNaoConsumoAgua);
		
		JRadioButton rdbtnPoucoSono = new JRadioButton("Pouco");
		rdbtnPoucoSono.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnPoucoSono.setBackground(SystemColor.inactiveCaption);
		rdbtnPoucoSono.setBounds(410, 609, 103, 21);
		frame.getContentPane().add(rdbtnPoucoSono);		
		
		grupo1.add(rdbtnSim);
		grupo1.add(rdbtnNao);		
		grupo2.add(rdbtnSimFuma);
		grupo2.add(rdbtnNaoFuma);
		grupo3.add(rdbtnModeradoSono);
		grupo3.add(rdbtnNormalSono);
		grupo3.add(rdbtnPoucoSono);
		grupo4.add(rdbtnPoucoSol);
		grupo4.add(rdbtnDiariaSol);
		grupo4.add(rdbtnAsVezes);
		grupo5.add(rdbtnModeradoAgua);
		grupo5.add(rdbtnNaoConsumoAgua);
		grupo5.add(rdbtnAbundate);
		grupo6.add(rdbtnPoucoApetite);
		grupo6.add(rdbtnMuitoApetite);
		grupo6.add(rdbtnModeradoApetite);
		grupo7.add(rdbtnNaoConsumoBebidas);
		grupo7.add(rdbtnModerado);
		grupo7.add(rdbtnMuito);
		grupo8.add(rdbtnMuitoUrina);
		grupo8.add(rdbtnNormal);
		grupo8.add(rdbtnPouco);
		
		
		//Label -- IMC
		JLabel lblNewLabel_36 = new JLabel("Calculo IMC");
		lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_36.setBounds(596, 429, 96, 13);
		frame.getContentPane().add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("Peso");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_37.setBounds(583, 460, 45, 13);
		frame.getContentPane().add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("Altura");
		lblNewLabel_38.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_38.setBounds(583, 491, 55, 13);
		frame.getContentPane().add(lblNewLabel_38);
		
		// Button Salvar
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setForeground(SystemColor.textHighlight);
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSalvar.setBackground(SystemColor.activeCaption);
		btnSalvar.setBounds(311, 652, 106, 46);
		frame.getContentPane().add(btnSalvar);
		btnSalvar.addActionListener(new CalculaIMC(this));
		btnSalvar.addActionListener(new EventButton(this)); 
		btnSalvar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Enumeration<AbstractButton> bg2 = grupo2.getElements();
				Enumeration<AbstractButton> bg3 = grupo6.getElements();
				while (bg2.hasMoreElements() && bg3.hasMoreElements()) {
					JRadioButton jrd3 = (JRadioButton) bg3.nextElement();
					JRadioButton jrd2 = (JRadioButton) bg2.nextElement();					
					if(jrd2.isSelected() != jrd3.isSelected()) {
						ResulPaneRadio.setText("");					
						
					} else {
						ResulPaneRadio.setText("Hábito ruim procurar um médico");	
					}
				}

			}

		});

		//TextPane ---
		
		ResultPane = new JTextPane();
		ResultPane.setBackground(SystemColor.inactiveCaption);
		ResultPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ResultPane.setText("");
		ResultPane.setBounds(10, 697, 407, 25);
		frame.getContentPane().add(ResultPane);
		
		FinalPane = new JTextPane();
		FinalPane.setBackground(SystemColor.inactiveCaption);
		FinalPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
		FinalPane.setBounds(10, 665, 280, 33);
		FinalPane.setText("");
		frame.getContentPane().add(FinalPane);
		
		ResulPaneRadio = new JTextPane();
		ResulPaneRadio.setBackground(SystemColor.inactiveCaption);
		ResulPaneRadio.setBounds(10, 732, 230, 25);
		FinalPane.setText("");
		frame.getContentPane().add(ResulPaneRadio);

    }


	public JTextField getTextPeso() {
		return textPeso;
	}

	public void setTextPeso(JTextField textPeso) {
		this.textPeso = textPeso;
	}

	public JTextField getTextAltura() {
		return textAltura;
	}

	public void setTextAltura(JTextField textAltura) {
		this.textAltura = textAltura;
	}

	public JLabel getLblResultado() {
		return lblResultado;
	}

	public void setLblResultado(JLabel lblResultado) {
		this.lblResultado = lblResultado;
	}

	public JTextPane getResultPane() {
		return ResultPane;
	}

	public void setResultPane(JTextPane resultPane) {
		ResultPane = resultPane;
	}

	public JTextPane getFinalPane() {
		return FinalPane;
	}

	public void setFinalPane(JTextPane finalPane) {
		FinalPane = finalPane;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}
}
