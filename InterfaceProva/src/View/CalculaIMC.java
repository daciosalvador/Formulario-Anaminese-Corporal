package View;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class CalculaIMC implements ActionListener {
	private MainTela context;

	public CalculaIMC(MainTela context) {
		// TODO Auto-generated constructor stub
		if(this.context == null) {
			this.context = context;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			double peso = Double.parseDouble(context.getTextPeso().getText());
			double altura = Double.parseDouble(context.getTextAltura().getText());
			double imc = peso/Math.pow(altura, 2);
			
			DecimalFormat df = new DecimalFormat("#0.0");
			
			String res = "Resultado IMC: " +df.format(imc);
			
			if(imc < 18.5) {
				res += " Peso ideal";
			} else if(imc < 24.9) {
				res += " Peso ideal";
			}else if(imc < 29.9) {
				res += " Levemente acima do peso";
			}else if(imc < 34.9) {
				res += " Primeiro grau de obesidade";
			}else if(imc < 39.9) {
				res += " Segundo grau de obesidade";
			} else {
				res += " Obesidade mórbida";
			}
			
			
			context.getResultPane().setText(res);
		}catch (ArithmeticException e1) {
			JOptionPane.showMessageDialog(null, "Er" +e1.getMessage());
		} 
	}
}
