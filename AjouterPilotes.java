import javax.swing.*;

import java.awt.*;
import java.awt.event.* ;
import java.sql.*;


public class AjouterPilotes extends JFrame implements ActionListener{

	private JPanel pan = new JPanel();
	private JPanel pan2 = new JPanel();
	
	private JButton btn = new JButton("Insérer");
	private JButton btn2 = new JButton("Nan ?");
	private JButton btn3 = new JButton("Oui ?");
	
	private JLabel lab = new JLabel("Saisir un nouveau pilote");
	private JLabel lab2 = new JLabel("Bienvenue");
	private JLabel lab3 = new JLabel("Bienvenue");
	
	private JTextField jtf2 = new JTextField("Nom");
	private JTextField jtf3 = new JTextField("Prenom");
	
	private JComboBox liste = new JComboBox();
	private JComboBox  listeProduit = new JComboBox();
	
	JRadioButton jr1 = new JRadioButton("Radio 1");
	JRadioButton jr2 = new JRadioButton("Radio 2");
	private ButtonGroup groupeBouton= new ButtonGroup();
	
	JMenuBar menu;
	
	
	public AjouterPilotes(){
		
		this.menu = new JMenuBar();
		
		this.setTitle("Premiere Fenetre");
		this.setSize(400,300);					//Taille avant la location pour qu'elle 
												//soit réellement centrée
		this.setLocationRelativeTo(null);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(pan);
		pan.setBackground(Color.gray);
	
		
		JMenu menuPg = new JMenu("Fichier");
		JMenuItem aPropos = new JMenuItem("A propos");
		menuPg.add(aPropos);
		// Ajout d'un listener appelant la classe menuAction lorsque l'on clique sur Quitter
		JMenuItem quitter =  new JMenuItem("Quitter");
		menuPg.add(quitter);
		quitter.addActionListener(new menuAction());
		// Ajout du "bouton" menuPg à la barre de menu
		menu.add(menuPg);
		
		//Par défaut le 1er bouton radio est sélectionné
		jr1.setSelected(true);
		//On ajoute un listener aux deux boutons
		jr1.addActionListener(new StateListener());
		jr2.addActionListener(new StateListener());
		groupeBouton.add(jr1);
		groupeBouton.add(jr2);

		// Permet de définir le menu utilisé dans la JFrame
		this.setJMenuBar(menu);
		    
		pan.setLayout(new GridLayout(5, 1));
		this.pan.add(pan2);
		this.pan.add(jtf2);
		this.pan.add(jtf3);
		this.pan.add(btn);
		
		pan2.setLayout(new BorderLayout());
		this.pan2.add(lab, BorderLayout.CENTER);

	
		this.setResizable(false);
	
		this.setVisible(true);	
	}


	class menuAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane jopj = new JOptionPane(); 
			int option2 = jopj.showConfirmDialog(null, "Voulez-vous arrêter l'animation ?", "Arrêt de l'animation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(option2 != JOptionPane.NO_OPTION && option2 != JOptionPane.CANCEL_OPTION && option2 != JOptionPane.CLOSED_OPTION){
				System.exit(0);
			}
			else{
				boolean animated = false; 
				btn.setEnabled(true);
				btn2.setEnabled(false);
			}
		} 
	}

	class StateListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		System.out.println("source : " + jr1.getText() + " - état : " + jr1.isSelected());
		System.out.println("source : " + jr2.getText() + " - état : " + jr2.isSelected());
		}
	}

	public void actionPerformed(ActionEvent e) {
		//FonctionBDD() = new FonctionBDD();

		
	}
		
	
	
}