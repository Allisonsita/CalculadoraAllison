import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.Component;

public class CalculadoraBásica extends JFrame {
	
	ScriptEngineManager calculadora = new ScriptEngineManager();
	ScriptEngine calc = calculadora.getEngineByName("JavaScript");

	private JPanel contentPane;
	private JLabel Resultado;
	private JLabel Operacion;
	private JButton CE;
	private JButton porcentaje;
	private JButton siete;
	private JButton ocho;
	private JButton nueve;
	private JButton multiplicar;
	private JButton cuatro;
	private JButton cinco;
	private JButton seis;
	private JButton restar;
	private JButton uno;
	private JButton dos;
	private JButton tres;
	private JButton sumar;
	private JButton punto;
	private JButton cero;
	private JButton igual;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public void añadirNumero(String digito) {
		Operacion.setText(Operacion.getText()+digito);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBásica frame = new CalculadoraBásica();
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
	
	public CalculadoraBásica() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 537);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.setBackground(UIManager.getColor("controlLtHighlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton C = new JButton("C");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operacion.setText("");
				Resultado.setText("");
			}
		});
		C.setBorderPainted(false);
		C.setFocusPainted(false);
		C.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		C.setHorizontalTextPosition(SwingConstants.CENTER);
		C.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\sol.jpg"));
		C.setIconTextGap(1);
		C.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\Forma 2.jpg"));
		C.setBackground(new Color(245, 245, 245));
		C.setBounds(10, 174, 74, 54);
		contentPane.add(C);
		
		CE = new JButton("CE");
		CE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = Operacion.getText().substring(0,Operacion.getText().length()-1);
				Operacion.setText(texto);
				igual.doClick();
				
			}
		});
		CE.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\sol.jpg"));
		CE.setRolloverSelectedIcon(new ImageIcon("C:\\Users\\Usuario\\Pictures\\Eclipse im\u00E9genes Calculadora\\Forma 2.jpg"));
		CE.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\Forma 2.jpg"));
		CE.setIconTextGap(1);
		CE.setHorizontalTextPosition(SwingConstants.CENTER);
		CE.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		CE.setFocusPainted(false);
		CE.setBorderPainted(false);
		CE.setBackground(new Color(245, 245, 245));
		CE.setBounds(94, 173, 74, 54);
		contentPane.add(CE);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.control);
		panel.setBounds(10, 11, 326, 154);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Operacion = new JLabel("");
		Operacion.setHorizontalAlignment(SwingConstants.RIGHT);
		Operacion.setHorizontalTextPosition(SwingConstants.RIGHT);
		Operacion.setBounds(25, 45, 291, 30);
		Operacion.setFont(new Font("Gill Sans MT", Font.PLAIN, 25));
		panel.add(Operacion);
		
		Resultado = new JLabel("");
		Resultado.setBounds(25, 86, 291, 44);
		panel.add(Resultado);
		Resultado.setHorizontalTextPosition(SwingConstants.LEFT);
		Resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		Resultado.setFont(new Font("Gill Sans MT", Font.PLAIN, 50));
		
		JButton dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("/");
				igual.doClick();
			}
		});
		
		dividir.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\Forma 2.jpg"));
		dividir.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\sol.jpg"));
		dividir.setIconTextGap(1);
		dividir.setHorizontalTextPosition(SwingConstants.CENTER);
		dividir.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		dividir.setFocusPainted(false);
		dividir.setBorderPainted(false);
		dividir.setBackground(new Color(245, 245, 245));
		dividir.setBounds(262, 174, 74, 54);
		contentPane.add(dividir);
		
		siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("7");
				igual.doClick();
			}
		});
		
		siete.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		siete.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		siete.setIconTextGap(1);
		siete.setHorizontalTextPosition(SwingConstants.CENTER);
		siete.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		siete.setFocusPainted(false);
		siete.setBorderPainted(false);
		siete.setBackground(new Color(245, 245, 245));
		siete.setBounds(10, 238, 74, 54);
		contentPane.add(siete);
		
		ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("8");
				igual.doClick();
			}
		});
		
		ocho.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		ocho.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		ocho.setIconTextGap(1);
		ocho.setHorizontalTextPosition(SwingConstants.CENTER);
		ocho.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		ocho.setFocusPainted(false);
		ocho.setBorderPainted(false);
		ocho.setBackground(new Color(245, 245, 245));
		ocho.setBounds(94, 238, 74, 54);
		contentPane.add(ocho);
		
		nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("9");
				igual.doClick();
			}
		});
		
		nueve.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		nueve.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		nueve.setIconTextGap(1);
		nueve.setHorizontalTextPosition(SwingConstants.CENTER);
		nueve.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		nueve.setFocusPainted(false);
		nueve.setBorderPainted(false);
		nueve.setBackground(new Color(245, 245, 245));
		nueve.setBounds(178, 238, 74, 54);
		contentPane.add(nueve);
		
		multiplicar = new JButton("*");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("*");
				igual.doClick();
			}
		});
		
		multiplicar.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\Forma 2.jpg"));
		multiplicar.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\sol.jpg"));
		multiplicar.setIconTextGap(1);
		multiplicar.setHorizontalTextPosition(SwingConstants.CENTER);
		multiplicar.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		multiplicar.setFocusPainted(false);
		multiplicar.setBorderPainted(false);
		multiplicar.setBackground(new Color(245, 245, 245));
		multiplicar.setBounds(262, 238, 74, 54);
		contentPane.add(multiplicar);
		
		cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("4");
				igual.doClick();
			}
		});
		
		cuatro.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		cuatro.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		cuatro.setIconTextGap(1);
		cuatro.setHorizontalTextPosition(SwingConstants.CENTER);
		cuatro.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		cuatro.setFocusPainted(false);
		cuatro.setBorderPainted(false);
		cuatro.setBackground(new Color(245, 245, 245));
		cuatro.setBounds(10, 303, 74, 54);
		contentPane.add(cuatro);
		
		cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("5");
				igual.doClick();
			}
		});
		
		cinco.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		cinco.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		cinco.setIconTextGap(1);
		cinco.setHorizontalTextPosition(SwingConstants.CENTER);
		cinco.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		cinco.setFocusPainted(false);
		cinco.setBorderPainted(false);
		cinco.setBackground(new Color(245, 245, 245));
		cinco.setBounds(94, 303, 74, 54);
		contentPane.add(cinco);
		
		seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("6");
				igual.doClick();
			}
		});
		
		seis.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		seis.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		seis.setIconTextGap(1);
		seis.setHorizontalTextPosition(SwingConstants.CENTER);
		seis.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		seis.setFocusPainted(false);
		seis.setBorderPainted(false);
		seis.setBackground(new Color(245, 245, 245));
		seis.setBounds(178, 303, 74, 54);
		contentPane.add(seis);
		
		restar = new JButton("-");
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("-");
				igual.doClick();
			}
		});
		
		restar.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\Forma 2.jpg"));
		restar.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\sol.jpg"));
		restar.setIconTextGap(1);
		restar.setHorizontalTextPosition(SwingConstants.CENTER);
		restar.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		restar.setFocusPainted(false);
		restar.setBorderPainted(false);
		restar.setBackground(new Color(245, 245, 245));
		restar.setBounds(262, 303, 74, 54);
		contentPane.add(restar);
		
		uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("1");
				igual.doClick();
			}
		});
		
		uno.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		uno.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		uno.setIconTextGap(1);
		uno.setHorizontalTextPosition(SwingConstants.CENTER);
		uno.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		uno.setFocusPainted(false);
		uno.setBorderPainted(false);
		uno.setBackground(new Color(245, 245, 245));
		uno.setBounds(10, 368, 74, 54);
		contentPane.add(uno);
		
		igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String resultado = calc.eval(Operacion.getText()).toString();
					Resultado.setText(resultado);
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		igual.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\capa2.jpg"));
		igual.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\igual.jpg"));
		igual.setIconTextGap(1);
		igual.setHorizontalTextPosition(SwingConstants.CENTER);
		igual.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		igual.setFocusPainted(false);
		igual.setBorderPainted(false);
		igual.setBackground(new Color(245, 245, 245));
		igual.setBounds(178, 433, 157, 54);
		contentPane.add(igual);
		
		dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("2");
				igual.doClick();
			}
		});
		
		dos.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		dos.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		dos.setIconTextGap(1);
		dos.setHorizontalTextPosition(SwingConstants.CENTER);
		dos.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		dos.setFocusPainted(false);
		dos.setBorderPainted(false);
		dos.setBackground(new Color(245, 245, 245));
		dos.setBounds(94, 368, 74, 54);
		contentPane.add(dos);
		
		punto = new JButton(".");
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero(".");
				igual.doClick();
			}
		});
		
		punto.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		punto.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		punto.setIconTextGap(1);
		punto.setHorizontalTextPosition(SwingConstants.CENTER);
		punto.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		punto.setFocusPainted(false);
		punto.setBorderPainted(false);
		punto.setBackground(new Color(245, 245, 245));
		punto.setBounds(10, 433, 74, 54);
		contentPane.add(punto);
		
		cero = new JButton("0");
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("0");
				igual.doClick();
			}
		});
		
		cero.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\Pictures\\Eclipse im\u00E9genes Calculadora\\solMorado.jpg"));
		cero.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		cero.setIconTextGap(1);
		cero.setHorizontalTextPosition(SwingConstants.CENTER);
		cero.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		cero.setFocusPainted(false);
		cero.setBorderPainted(false);
		cero.setBackground(new Color(245, 245, 245));
		cero.setBounds(94, 433, 74, 54);
		contentPane.add(cero);
		
		tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("3");
				igual.doClick();
			}
		});
		
		tres.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\solMorado.jpg"));
		tres.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\boton.jpg"));
		tres.setIconTextGap(1);
		tres.setHorizontalTextPosition(SwingConstants.CENTER);
		tres.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		tres.setFocusPainted(false);
		tres.setBorderPainted(false);
		tres.setBackground(new Color(245, 245, 245));
		tres.setBounds(178, 368, 74, 54);
		contentPane.add(tres);
		
		sumar = new JButton("+");
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("+");
				igual.doClick();
			}
		});
		
		sumar.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\sol.jpg"));
		sumar.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\Forma 2.jpg"));
		sumar.setIconTextGap(1);
		sumar.setHorizontalTextPosition(SwingConstants.CENTER);
		sumar.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		sumar.setFocusPainted(false);
		sumar.setBorderPainted(false);
		sumar.setBackground(new Color(245, 245, 245));
		sumar.setBounds(262, 368, 74, 54);
		contentPane.add(sumar);
		
		porcentaje = new JButton("MOD");
		porcentaje.setBounds(178, 174, 74, 54);
		contentPane.add(porcentaje);
		porcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirNumero("%");
				igual.doClick();
			}
		});
		
		porcentaje.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\CalculadoraB\u00E1sica\\Im\u00E1genes\\Forma 2.jpg"));
		porcentaje.setRolloverIcon(new ImageIcon("C:\\Users\\Usuario\\Pictures\\Eclipse im\u00E9genes Calculadora\\sol.jpg"));
		porcentaje.setIconTextGap(1);
		porcentaje.setHorizontalTextPosition(SwingConstants.CENTER);
		porcentaje.setFont(new Font("Gill Sans MT", Font.PLAIN, 17));
		porcentaje.setFocusPainted(false);
		porcentaje.setBorderPainted(false);
		porcentaje.setBackground(new Color(245, 245, 245));
	}
	public JButton getCE() {
		return CE;
	}
	public JPanel getPanel() {
		return panel;
	}
}