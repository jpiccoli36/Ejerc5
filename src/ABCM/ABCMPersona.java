package ABCM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Persona.Persona;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Color;

public class ABCMPersona extends JInternalFrame {

	private Controlador ctrl = new Controlador();
	private JPanel contentPane;
	private JTextField tfDNI;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JCheckBox chkHabilitado;
	private JLabel lblMostrarApellido;
	private JLabel lblMNombre;
	private JLabel lblMostrarDNI;
	private JLabel lblDNI;
	private JLabel lblAp;
	private JLabel lblNom;
	private JLabel lblMHabilitado;
	private JCheckBox chkMHabilitado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABCMPersona frame = new ABCMPersona();
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
	public ABCMPersona() {
		setTitle("ABCM");
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 370, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblDni = new JLabel("DNI");

		tfDNI = new JTextField();
		tfDNI.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");

		tfNombre = new JTextField();
		tfNombre.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido");

		tfApellido = new JTextField();
		tfApellido.setColumns(10);

		chkHabilitado = new JCheckBox("Habilitado");
		chkHabilitado.setSelected(true);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				buscarClick();
			}
		});

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AgregarClick();
			}
		});
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				borrarClick();
			}
		});

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				modificarClick();
			}
		});

		lblNom = new JLabel("");

		lblAp = new JLabel("");

		lblDNI = new JLabel("");

		lblMostrarApellido = new JLabel(" ");

		lblMostrarDNI = new JLabel(" ");

		lblMNombre = new JLabel("");

		lblMHabilitado = new JLabel("");

		chkMHabilitado = new JCheckBox("Habilitado");
		chkMHabilitado.setVisible(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDni)
								.addComponent(lblNombre)
								.addComponent(lblApellido))
							.addGap(46)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tfDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBorrar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
									.addComponent(btnBuscar))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(27)
									.addComponent(btnModificar)))
							.addContainerGap(20, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(chkMHabilitado)
								.addComponent(chkHabilitado))
							.addContainerGap(270, Short.MAX_VALUE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNom, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAgregar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblAp, Alignment.LEADING)
						.addComponent(lblDNI, Alignment.LEADING))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMNombre, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblMostrarDNI, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
							.addComponent(lblMostrarApellido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(73)
							.addComponent(lblMHabilitado)))
					.addContainerGap(198, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDni)
						.addComponent(tfDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblApellido)
						.addComponent(tfApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(chkHabilitado)
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAgregar)
						.addComponent(btnBorrar)
						.addComponent(btnModificar))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNom)
						.addComponent(lblMNombre, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAp)
						.addComponent(lblMostrarApellido))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDNI)
						.addComponent(lblMostrarDNI))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMHabilitado)
						.addComponent(chkMHabilitado))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void modificarClick() {
		Persona p = new Persona();
		p.setDNI(tfDNI.getText());
		p.setNombre(tfNombre.getText());
		p.setApellido(tfApellido.getText());
		p.setHabilitado(chkHabilitado.isSelected());
		ctrl.Modifica(p);

	}

	protected void borrarClick() {
		Persona p = new Persona();
		String dni = tfDNI.getText();
		ctrl.Baja(dni);

	}

	protected void AgregarClick() {
		Persona p = new Persona();
		p.setApellido(this.tfApellido.getText());
		p.setDNI(this.tfDNI.getText());
		p.setNombre(this.tfNombre.getText());
		p.setHabilitado(this.chkHabilitado.isSelected());
		ctrl.Alta(p);

	}

	protected void buscarClick() {
		Persona p = new Persona();
		p.setDNI(this.tfDNI.getText());
		p = ctrl.PorDni(p);
		lblMNombre.setText(p.getNombre());
		lblMostrarApellido.setText(p.getApellido());
		lblNom.setText("Nombre:");
		lblMostrarDNI.setText(p.getDNI());
		lblAp.setText("Apellido:");
		lblDNI.setText("DNI:");
		if (p.isHabilitado()) {
			chkMHabilitado.setSelected(true);
		} else {
			chkMHabilitado.setSelected(false);
		}
		chkMHabilitado.setVisible(true);

	}
}