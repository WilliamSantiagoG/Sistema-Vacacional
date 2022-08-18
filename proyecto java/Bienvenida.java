import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 


public class Bienvenida extends JFrame implements ActionListener{

	private JLabel coca, piecoca, usuario, terminos; 
	private JButton bingresar;
	private JTextField jtusuario; 
	public static String texto;

	public Bienvenida (){

		setLayout(null);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255,0,0)); 
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		ImageIcon imagen = new ImageIcon ("images/logo-coca.png"); 
		coca = new JLabel(imagen);
		coca.setBounds(25,15,300,150); 
		add(coca);

		piecoca = new JLabel ("Sistema de Control vacacional"); 
		piecoca.setBounds(35,135,300,30);
		piecoca.setFont(new Font ("Andale Mono",3,18));
		piecoca.setForeground(new Color (255,255,255));
		add(piecoca);

		usuario = new JLabel("Ingrese su nombre:");
		usuario.setBounds(45,212,200,30);
		usuario.setFont(new Font ("Andale Mono",1,12));
		usuario.setForeground(new Color (255,255,255));
		add(usuario);

		terminos = new JLabel("2020 The Coca-Cola Company");
		terminos.setBounds(85,375,300,30);
		terminos.setFont(new Font("Andale Mono",1,12));
		terminos.setForeground(new Color(255,255,255));
		add(terminos);



		jtusuario = new JTextField();
		jtusuario.setBounds(45,240,255,25);
		jtusuario.setFont(new Font("Andale Mono",1,12));
		jtusuario.setForeground(new Color(255,0,0));
		jtusuario.setBackground(new Color (255,255,255));
		add(jtusuario);

		bingresar = new JButton ("Ingresar");
		bingresar.setBounds(125,280,100,30);
		bingresar.setFont(new Font("Andale Mono",1,12));
		bingresar.setForeground(new Color (255,0,0));
		bingresar.setBackground(new Color (255,255,255));
		bingresar.addActionListener(this);
		add(bingresar);


		}
		public void actionPerformed (ActionEvent e ){
			if (e.getSource() == bingresar){
				texto = jtusuario.getText().trim();
				if(texto.equals("")){
					JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
				}else{

					Parte2 parte2 = new Parte2();
					parte2.setBounds(0,0,600,365);
					parte2.setVisible(true);
					parte2.setResizable(false);
					parte2.setLocationRelativeTo(null);
					this.setVisible(false);

				}
			}
		}

	


	public static void main (String args []){

		Bienvenida bienvenida = new Bienvenida();

		bienvenida.setBounds(0,0,370,460);
		bienvenida.setVisible(true);
		bienvenida.setResizable(false);
		bienvenida.setLocationRelativeTo(null);

	}
	
}
