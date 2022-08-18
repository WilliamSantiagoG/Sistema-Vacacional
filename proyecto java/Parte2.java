import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Parte2 extends JFrame implements ActionListener, ChangeListener {

	private JLabel terminos, coca2; 
	private JButton bacepto, bnoacepto; 
	private JCheckBox cbacepto;
	private JTextArea taliencia;
	public static String name = ""; 

	public Parte2 (){

		setLayout(null);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(245,245,245)); 
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		Bienvenida bv = new Bienvenida (); 
		name = bv.texto; 

		ImageIcon imagen2 = new ImageIcon("images/coca-cola.png");
		coca2 = new JLabel(imagen2);
		coca2.setBounds(315,135,300,300);
		add(coca2);

		terminos = new JLabel("Terminos y Condiciones");
		terminos.setFont(new Font ("Andale Mono", 3, 14));
		terminos.setBounds(215,5,200,30);
		add(terminos);

		taliencia = new JTextArea ("\n\n\n        PROHIBIDO SU DISTRIBUCION");
		taliencia.setFont(new Font ("Andale Mono", 3, 20));
		taliencia.setBounds(10,40,560,200);
		taliencia.setEditable(false);
		taliencia.setBackground(new Color (220,220,220));
		add(taliencia);

		cbacepto = new JCheckBox ("Yo acepto " + name); 
		cbacepto.setFont(new Font ("Andale Mono", 3,13));
		cbacepto.setBounds(10,250,300,30); 
		cbacepto.setBackground(new Color (245,245,245));
		cbacepto.addChangeListener(this);
		add(cbacepto);

		bacepto = new JButton ("Acepto");
		bacepto.setFont(new Font ("Andale Mono", 3, 11));
		bacepto.setBackground(new Color (200,200,200));
		bacepto.setBounds(10,290,100,30);
		bacepto.addActionListener(this);
		bacepto.setEnabled(false); 
		add(bacepto);

		bnoacepto = new JButton("No Acepto");
		bnoacepto.setFont(new Font ("Andale Mono", 3, 11));
		bnoacepto.setBackground(new Color (200,200,200));
		bnoacepto.setBounds(120,290,100,30);
		bnoacepto.addActionListener(this);
		bnoacepto.setEnabled(true);
		add(bnoacepto);

	}	

	public void actionPerformed(ActionEvent e ){
			if (e.getSource() == bnoacepto){

				Bienvenida bienvenida = new Bienvenida();
				bienvenida.setBounds(0,0,370,460);
				bienvenida.setVisible(true);
				bienvenida.setResizable(false);
				bienvenida.setLocationRelativeTo(null);
				this.setVisible(false);
			}
	
			if(e.getSource() == bacepto){
				Infinal final1 = new Infinal(); 
				final1.setBounds(0,0,750,600);
				final1.setVisible(true);
				final1.setResizable(false); 
				final1.setLocationRelativeTo(null);
				this.setVisible(false);
			}

	}
	public void stateChanged(ChangeEvent i){

			if (cbacepto.isSelected() == true){
				bacepto.setEnabled(true);
				bnoacepto.setEnabled(false);
			}else{
				bacepto.setEnabled(false);
				bnoacepto.setEnabled(true);
			}
	}

	public static void main (String args []){

		Parte2 parte2 = new Parte2();

		parte2.setBounds(0,0,600,365);
		parte2.setVisible(true);
		parte2.setResizable(false);
		parte2.setLocationRelativeTo(null); 
	}
}