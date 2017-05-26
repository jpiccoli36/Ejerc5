package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DesktopPaneUI;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import ABCM.ABCMPersona;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Color;

public class PrincipalEscritorio extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmAbmc;
	private JMenuBar menuBar;
	private JMenu mnAbmc;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalEscritorio frame = new PrincipalEscritorio();
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
	public PrincipalEscritorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 618);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAbmc = new JMenu("PERSONA");
		menuBar.add(mnAbmc);
		
		mntmAbmc = new JMenuItem("ABMC");
		mntmAbmc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showABCMPersona();
			}
		});
		mnAbmc.add(mntmAbmc);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}

	protected void showABCMPersona() {
		ABCMPersona frmper= new ABCMPersona();
		desktopPane.add(frmper);
		frmper.setVisible(true);
	}

}
