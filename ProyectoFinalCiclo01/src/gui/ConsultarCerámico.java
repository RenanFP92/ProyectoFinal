package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;



public class ConsultarCerámico extends JFrame implements ActionListener, ItemListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JTextArea txtPrecio;
	private JTextArea txtAncho;
	private JTextArea txtLargo;
	private JTextArea txtEspesor;
	private JTextArea txtContenido;
	private Choice opciones;
	private JButton btnCerrar;
	private JLabel lblContenido;
	private JLabel lblEspesor;
	private JLabel lblLargo;
	private JLabel lblAncho;
	private JLabel lblPrecios;
	private JLabel lblModelo;
	
	

	//Crea la GUI
	public ConsultarCerámico() {
		
		setTitle("Consultar cerámico");
		setSize(564, 199);
		setLocationRelativeTo(null);//Para que quede en el medio
		setResizable(false);//para que no se pueda agrandar
		getContentPane().setLayout(null);
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
				
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 83, 14);
		getContentPane().add(lblModelo);
		
		lblPrecios = new JLabel("Precio (S/.)");
		lblPrecios.setBounds(10, 36, 83, 14);
		getContentPane().add(lblPrecios);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 61, 83, 14);
		getContentPane().add(lblAncho);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(10, 86, 83, 14);
		getContentPane().add(lblLargo);
		
		lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(10, 111, 83, 14);
		getContentPane().add(lblEspesor);
		
		lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 136, 83, 14);
		getContentPane().add(lblContenido);
		
		txtPrecio = new JTextArea();
		txtPrecio.setColumns(10);
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(116, 33, 292, 20);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextArea();
		txtAncho.setColumns(10);
		txtAncho.setEditable(false);
		txtAncho.setBounds(116, 58, 292, 20);
		getContentPane().add(txtAncho);
		
		txtLargo = new JTextArea();
		txtLargo.setColumns(10);
		txtLargo.setEditable(false);
		txtLargo.setBounds(116, 83, 292, 20);
		getContentPane().add(txtLargo);
		
		txtEspesor = new JTextArea();
		txtEspesor.setColumns(10);
		txtEspesor.setEditable(false);
		txtEspesor.setBounds(116, 108, 292, 20);
		getContentPane().add(txtEspesor);
		
		txtContenido = new JTextArea();
		txtContenido.setColumns(10);
		txtContenido.setEditable(false);
		txtContenido.setBounds(116, 133, 292, 20);
		getContentPane().add(txtContenido);
		
		opciones = new Choice();
		opciones.setBounds(116, 7, 292, 20);
		opciones.add("Cinza Plus");
		opciones.add("Luxury");
		opciones.add("Austria"); 
		opciones.add("Yungay Mix");
		opciones.add("Thalia");
		getContentPane().add(opciones);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(449, 7, 89, 23);
		btnCerrar.addActionListener(this);
		getContentPane().add(btnCerrar);
	}

	
	//Direcciona el botón
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	//Acción del botón Cerrar
	public void actionPerformedBtnCerrar (ActionEvent e ) {
		dispose();
	}
	
	//Listando los tipos
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getSource()==opciones) {
			itemStateChangedOpciones(ie);
		}	
	}		
			
	
	public void itemStateChangedOpciones(ItemEvent ie) {
		if (opciones.getSelectedItem().equals("Cinza Plus")) {
				
				txtPrecio.setText("92.56");
				txtAncho.setText("62.0");
				txtLargo.setText("62.0");
				txtEspesor.setText("8.0");
				txtContenido.setText("6");
			}
		
	}
}
