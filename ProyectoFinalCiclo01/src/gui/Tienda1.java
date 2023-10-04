package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tienda1 extends JFrame  implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JMenuItem mntmCceramico;
	private JMenuItem mntmSalir;
	private JMenuBar menuBar;
	private JMenu mnArchivos;
	private JMenu mnMantenimiento;
	private JMenuItem mntmMceramico;
	private JMenuItem mntmLceramico;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGreportes;
	private JMenu mnConfiguración;
	private JMenuItem mntmCdescuentos;
	private JMenuItem mntmCobsequios;
	private JMenuItem mntmCcoptimo;
	private JMenuItem mntmCcdiaria;
	private JMenu mnAyuda;
	private JMenuItem mntmAdlTienda;
	
	
	
	// Inicia la GUI
	public Tienda1() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(822, 554);
		setLocationRelativeTo(null);//Para que quede en el medio
		setResizable(false);//para que no se pueda agrandar
		getContentPane().setLayout(null);
		iniciarComponentes();
	}
	
	//Crea lo componentes
	private void iniciarComponentes() {
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivos = new JMenu("Archivos ");
		menuBar.add(mnArchivos);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivos.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmCceramico = new JMenuItem("Consultar cerámico");
		mntmCceramico.addActionListener(this);
		mnMantenimiento.add(mntmCceramico);
		
		mntmMceramico = new JMenuItem("Modificar cerámico");
		mntmMceramico.addActionListener(this);
		mnMantenimiento.add(mntmMceramico);
		
		mntmLceramico = new JMenuItem("Listar cerámico");
		mntmLceramico.addActionListener(this);
		mnMantenimiento.add(mntmLceramico);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGreportes = new JMenuItem("Generar reportes");
		mntmGreportes.addActionListener(this);
		mnVentas.add(mntmGreportes);
		
		mnConfiguración = new JMenu("Configuración");
		menuBar.add(mnConfiguración);
		
		mntmCdescuentos = new JMenuItem("Configurar descuentos");
		mntmCdescuentos.addActionListener(this);
		mnConfiguración.add(mntmCdescuentos);
		
		mntmCobsequios = new JMenuItem("Configurar obsequiios");
		mntmCobsequios.addActionListener(this);
		mnConfiguración.add(mntmCobsequios);
		
		mntmCcoptimo = new JMenuItem("Configurar cantidad óptimo");
		mntmCcoptimo.addActionListener(this);
		mnConfiguración.add(mntmCcoptimo);
		
		mntmCcdiaria = new JMenuItem("Configurar cuota diaria");
		mntmCcdiaria.addActionListener(this);
		mnConfiguración.add(mntmCcdiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAdlTienda = new JMenuItem("Acerca de la Tienda");
		mntmAdlTienda.addActionListener(this);
		mnAyuda.add(mntmAdlTienda);
	}
		
		
		//Direcciona los botones del menu	
		public void actionPerformed(ActionEvent e) {
			
			if  (mntmSalir==e.getSource()){
				actionPerfomedMntmSalir(e);
			}
			
			if (mntmCceramico==e.getSource()) {
				actionPerfomedMntmCceramico(e);
			}
			
			if (mntmMceramico==e.getSource()) {
				actionPerfomedMntmMceramico(e);
			}
			
			if (mntmVender==e.getSource()) {
				actionPerfomedMntmVender(e);
			}
			
			if (mntmGreportes==e.getSource()) {
				actionPerfomedMntmGreportes(e);
			}
			
			if (mntmCdescuentos==e.getSource()) {
				actionPerfomedMntmCdescuentos(e);
			}
			
			if (mntmCobsequios==e.getSource()) {
				actionPerfomedMntmCobsequio(e);
			}
			
			if(mntmCcoptimo==e.getSource()) {
				actionPerfomedMntmCcoptimo(e);
			}
			
			if(mntmCcdiaria==e.getSource()) {
				actionPerfomedMntmCcdiaria(e);
			}
			
			if(mntmAdlTienda==e.getSource()) {
				actionPerfomedMntmAdlTienda(e);
			}
		}	
		
		//Direcciona las acciones de los botones
		
		public void actionPerfomedMntmCceramico(ActionEvent e) {
			ConsultarCerámico ventana = new ConsultarCerámico ();
			ventana.setVisible(true);
		}
		
		
		public void actionPerfomedMntmSalir(ActionEvent e) {
			System.exit(0);
		}
		
		
		public void actionPerfomedMntmMceramico(ActionEvent e) {
			
		}
		
		
		public void actionPerfomedMntmVender(ActionEvent e) {
			
		}
		
		
		public void actionPerfomedMntmGreportes(ActionEvent e) {
			
		}
		
		
		public void actionPerfomedMntmCdescuentos(ActionEvent e) {
			
		}

		
		public void actionPerfomedMntmCobsequio(ActionEvent e) {
			
		}

		
		public void actionPerfomedMntmCcoptimo(ActionEvent e) {
			
		}
		
		
		public void actionPerfomedMntmCcdiaria(ActionEvent e) {
			
		}
		
		
		public void actionPerfomedMntmAdlTienda(ActionEvent e) {
			
		}
		
		
} 

	
	
	



