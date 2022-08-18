import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	public class Infinal extends JFrame implements ActionListener{

	private JMenuBar bar;
	private JMenu opciones, colo,  calcular, acerca;
	private JMenuItem negro, morado, calvacaciones, nuevo, salir, salir2, creador;
	private JLabel coca3, lbienvenido, ldatos, lnombre, lapellidop, lapellidom, ldepartamento, lantiguedad, lresultado,company;
	private JTextField tnombre, tapellidop, tapellidom;
	private JComboBox cdepartamento, cantiguedad;
	private JTextArea aresultado; 
	private JScrollPane sp; 
	public static String namber = ""; 


	public Infinal (){

		setLayout(null);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		Bienvenida bv = new Bienvenida (); 
		namber = bv.texto; 


		bar = new JMenuBar();
		bar.setBackground(new Color (0,0,0));
		bar.setForeground(new Color(255,255,255));
		setJMenuBar(bar);

		opciones = new JMenu("opciones");
		opciones.setBackground(new Color (0,0,0));
		opciones.setForeground(new Color(255,255,255));
		bar.add(opciones);

		colo = new JMenu ("Color de fondo");
		colo.setForeground(new Color(255,255,255));
		colo.setBackground(new Color(0,0,0));
		bar.add(colo);

		negro = new JMenuItem ("Negro");
		negro.setBackground(new Color (0,0,0));
		negro.setForeground(new Color (255,255,255));
		negro.addActionListener(this);
		colo.add(negro);

		morado = new JMenuItem ("Morado");
		morado.setBackground(new Color (163,73,164));
		morado.setForeground(new Color (255,255,255));
		morado.addActionListener(this);
		colo.add(morado);

		nuevo = new JMenuItem ("Nuevo");
		nuevo.addActionListener(this);
		nuevo.setBackground(new Color (0,0,0));
		nuevo.setForeground(new Color(255,255,255));
		opciones.add(nuevo);

		salir = new JMenuItem("ir a Inicio de Sesion");
		salir.setBackground(new Color (0,0,0));
		salir.setForeground(new Color(255,255,255));
		salir.addActionListener(this);
		opciones.add(salir);

		salir2 = new JMenuItem("Salir");
		salir2.setBackground(new Color (0,0,0));
		salir2.setForeground(new Color(255,255,255));
		salir2.addActionListener(this);
		opciones.add(salir2);


		calcular = new JMenu("calcular");
		calcular.setBackground(new Color (0,0,0));
		calcular.setForeground(new Color(255,255,255));
		bar.add(calcular);

		calvacaciones = new JMenuItem ("Vacaciones");
		calvacaciones.setBackground(new Color (0,0,0));
		calvacaciones.setForeground(new Color(255,255,255));
		calvacaciones.addActionListener(this);
		calcular.add(calvacaciones);

		acerca = new JMenu ("Acerca de");
		acerca.setBackground(new Color (0,0,0));
		acerca.setForeground(new Color(255,255,255));
		bar.add(acerca);

		creador = new JMenuItem("Creador");
		creador.setBackground(new Color (0,0,0));
		creador.setForeground(new Color(255,255,255));
		creador.addActionListener(this);
		acerca.add(creador);

		ImageIcon im3 = new ImageIcon ("images/logo-coca.png");
		coca3 = new JLabel(im3);
		coca3.setBounds(5,5,230,100); 
		add(coca3);

		lbienvenido = new JLabel ("Bienvenido " + namber );
		lbienvenido.setBounds(280,5,400,100);
		lbienvenido.setFont(new Font ("Calibri",1,30));
		lbienvenido.setForeground(new Color(255,255,255));
		lbienvenido.setBackground(new Color (255,0,0));
		add(lbienvenido);


		ldatos = new JLabel ("Datos del Trabajador para Calcular las Vacaciones");
		ldatos.setBounds(7,120,750,40);
		ldatos.setForeground (new Color (255,255,255));
		ldatos.setFont(new Font ("Calibri",1,35));
		ldatos.setBackground(new Color(255,0,0));
		add(ldatos);

		lnombre = new JLabel ("Nombre Completo"); 
		lnombre.setBounds(10,180,150,10);
		lnombre.setForeground (new Color (255,255,255));
		lnombre.setFont(new Font ("Calibri",1,14));
		lnombre.setBackground(new Color(255,0,0));
		add(lnombre);

		tnombre = new JTextField (); 
		tnombre.setBounds(10,195,140,20);
		tnombre.setForeground (new Color (255,0,0));
		tnombre.setFont(new Font ("Calibri",1,14));
		tnombre.setBackground(new Color(255,255,255));
		add(tnombre);

		lapellidop = new JLabel ("Apellido Paterno"); 
		lapellidop.setBounds(10,245,150,10);
		lapellidop.setForeground (new Color (255,255,255));
		lapellidop.setFont(new Font ("Calibri",1,14));
		lapellidop.setBackground(new Color(255,0,0));
		add(lapellidop);

		tapellidop = new JTextField (); 
		tapellidop.setBounds(10,265,140,20);
		tapellidop.setForeground (new Color (255,0,0));
		tapellidop.setFont(new Font ("Calibri",1,14));
		tapellidop.setBackground(new Color(255,255,255));
		add(tapellidop);

		lapellidom = new JLabel ("Apellido Materno"); 
		lapellidom.setBounds(10,305,150,10);
		lapellidom.setForeground (new Color (255,255,255));
		lapellidom.setFont(new Font ("Calibri",1,14));
		lapellidom.setBackground(new Color(255,0,0));
		add(lapellidom);


		tapellidom = new JTextField (); 
		tapellidom.setBounds(10,325,140,20);
		tapellidom.setForeground (new Color (255,0,0));
		tapellidom.setFont(new Font ("Calibri",1,14));
		tapellidom.setBackground(new Color(255,255,255));
		add(tapellidom);


		ldepartamento = new JLabel("Selecciona el Departamento");
		ldepartamento.setBounds(180,180,180,10);
		ldepartamento.setForeground (new Color (255,255,255));
		ldepartamento.setFont(new Font ("Calibri",1,14));
		add(ldepartamento);


		cdepartamento = new JComboBox(); 
		cdepartamento.setBounds(180,200,200,20);
	    cdepartamento.setForeground(new Color(255,0,0));
	    cdepartamento.setBackground(new Color (255,255,255));
	    cdepartamento.setFont(new Font("Calibri",1,14));
		add(cdepartamento); 
		cdepartamento.addItem("");
		cdepartamento.addItem("Atencion al cliente");
		cdepartamento.addItem("Departamento de logistica");
		cdepartamento.addItem("Departamento de Gerencia");

		lantiguedad = new JLabel("Selecciona la antiguedad");
		lantiguedad.setBounds(180,240,180,12);
		lantiguedad.setForeground (new Color (255,255,255));
		lantiguedad.setFont(new Font ("Calibri",1,14));
		add(lantiguedad);

		cantiguedad = new JComboBox(); 
		cantiguedad.setBounds(180,260,200,20);
	    cantiguedad.setForeground(new Color(255,0,0));
	    cantiguedad.setBackground(new Color (255,255,255));
	    cantiguedad.setFont(new Font("Calibri",1,14));
		add(cantiguedad); 
		cantiguedad.addItem("");
		cantiguedad.addItem("1 a\u00f1o de servicio");
		cantiguedad.addItem("2 a 6 a\u00f1os de servicio");
		cantiguedad.addItem("7 o mas a\u00f1os de servicio");

		lresultado = new JLabel("Resultado del calculo");
		lresultado.setBounds(180,300,180,10);
		lresultado.setForeground (new Color (255,255,255));
		lresultado.setBackground(new Color (0,0,0));
		lresultado.setFont(new Font ("Calibri",1,14));
		add(lresultado);

		aresultado = new JTextArea("Resultado del numero de dias de vacaciones");
		aresultado.setForeground (new Color (255,255,255));
		aresultado.setFont(new Font ("Calibri",1,14));
		aresultado.setBackground(new Color (0,0,0));
		aresultado.setEditable(false);
		sp = new JScrollPane(aresultado);
        sp.setBounds(180,320,385,90);
        add(sp); 


        company = new JLabel("2020|Coca-Cola Company");
		company.setBounds(180,450,240,20);
		company.setForeground (new Color (255,255,255));
		company.setBackground(new Color (255,0,0));
		company.setFont(new Font ("Calibri",1,20));
		add(company);
	}

	public void actionPerformed (ActionEvent e){

		if (e.getSource() == negro){
			getContentPane().setBackground(new Color (0,0,0));

		}if (e.getSource() == morado){
			getContentPane().setBackground(new Color (163,73,164));
		}if (e.getSource() == salir){

			Bienvenida bienvenida = new Bienvenida();
			bienvenida.setBounds(0,0,370,460);
			bienvenida.setVisible(true);
			bienvenida.setResizable(false);
			bienvenida.setLocationRelativeTo(null);
			this.setVisible(false); 

		}if (e.getSource() == salir2){

			System.exit(0);

		}if (e.getSource() == nuevo){
			
			tnombre.setText("");
			tapellidom.setText("");
			tapellidop.setText("");
			cdepartamento.setSelectedIndex(0);		  
			cantiguedad.setSelectedIndex(0);


		}if(e.getSource() == creador){

			JOptionPane.showMessageDialog(null, "William Santiago Guerrero Fernandez");

		}if (e.getSource() == calvacaciones ){

			String nombre = tnombre.getText(); 
			String ap = tapellidop.getText();
			String am = tapellidom.getText();
			String departamento = cdepartamento.getSelectedItem().toString();
			String antiguedad = cantiguedad.getSelectedItem().toString();
			aresultado.setText(""); 

			if(nombre.equals("") || ap.equals("") || am.equals("") || departamento.equals("") || antiguedad.equals("") ){

				JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");

			}else if (departamento.equals("Atencion al cliente") && antiguedad.equals ("1 a\u00f1o de servicio")){

				aresultado.setText("El Trabajador " + nombre + " " +ap +" " + am +" tiene derecho a 5 dias de Vacaciones");

			}else if (departamento.equals("Atencion al cliente") && antiguedad.equals ("2 a 6 a\u00f1os de servicio")){

				aresultado.setText("El Trabajador " + nombre + " " +ap  +" " + am + " tiene derecho a 7 dias de Vacaciones");

			}else if (departamento.equals("Atencion al cliente") && antiguedad.equals ("7 o mas a\u00f1os de servicio")){

				aresultado.setText("El Trabajador " + nombre + " " +ap  + " " +am + " tiene derecho a 8 dias de Vacaciones");

			}else if (departamento.equals("Departamento de logistica") && antiguedad.equals ("1 a\u00f1o de servicio")){
 
				aresultado.setText("El Trabajador " + nombre + " " +ap  + " " + am + " tiene derecho a 9 dias de Vacaciones");

			}else if (departamento.equals("Departamento de logistica") && antiguedad.equals ("2 a 6 a\u00f1os de servicio")){

				aresultado.setText("El Trabajador " + nombre + " " +ap  + " " +am +" tiene derecho a 10 dias de Vacaciones");

			}else if (departamento.equals("Departamento de logistica") && antiguedad.equals ("7 o mas a\u00f1os de servicio")){

				aresultado.setText("El Trabajador " + nombre + " " +ap  + " " +am + " tiene derecho a 11 dias de Vacaciones");

			}else if (departamento.equals("Departamento de Gerencia") && antiguedad.equals ("1 a\u00f1o de servicio")){

				aresultado.setText("El Trabajador " + nombre + " " +ap  + " " + am + " tiene derecho a 12 dias de Vacaciones");

			}else if (departamento.equals("Departamento de Gerencia") && antiguedad.equals ("2 a 6 a\u00f1os de servicio")){

				aresultado.setText("El Trabajador " + nombre + " " +ap  + " " + am + " tiene derecho a 13 dias de Vacaciones");

			}else if(departamento.equals("Departamento de Gerencia") && antiguedad.equals ("7 o mas a\u00f1os de servicio")){

				aresultado.setText("El Trabajador " + nombre + " " + ap  + " " +am + " tiene derecho a 14 dias de Vacaciones");
			}


		}

	}
	

	public static void main (String args []){

		Infinal final1 = new Infinal(); 
		final1.setBounds(0,0,750,600);
		final1.setVisible(true);
		final1.setResizable(false); 
		final1.setLocationRelativeTo(null);
	}

}	