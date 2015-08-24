package Estudios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class VentanaEstudios extends JFrame implements ActionListener{
	
	JPanel panelSuperior = new JPanel();
  	JPanel panellnferior = new JPanel();
  	JPanel panelBotones1 = new JPanel();
	JPanel panelBotones2 = new JPanel();  	
	JPanel panelCentral1 = new JPanel();
  	JPanel panelCentral2 = new JPanel();
  	JPanel panelControles = new JPanel();
  	JPanel panel = new JPanel();
  	JPanel panel1 = new JPanel();
  	JPanel panel2 = new JPanel();
  	JPanel panel3 = new JPanel();
  	JPanel panel4 = new JPanel();
  	JPanel panel5 = new JPanel();
  	JPanel panel7 = new JPanel();
  	
	GridLayout gridLayoutPrincipal = new GridLayout();
  	GridLayout gridLayoutSuperior = new GridLayout();

	JButton botonAlta = new JButton();
  	JButton botonModificar = new JButton();
  	JButton botonBorrar = new JButton();
  	JButton botonBuscar = new JButton();
  	JButton botonVer = new JButton();
  	JButton botonLimpiar = new JButton();
  	JButton botonSalir = new JButton();

  	JComboBox carreras1 = new JComboBox();
  	JComboBox carreras2 = new JComboBox();
  	JTextArea listado = new JTextArea();

	JLabel labelCabecera1 = new JLabel();
	JLabel labelCabecera2 = new JLabel();
  	JLabel labelDNI = new JLabel();
  	JLabel labelNombre = new JLabel();
  	JLabel labelPoblacion = new JLabel();
  	JLabel labelTelefono = new JLabel();
  	JLabel labelFechaNato = new JLabel();
  	JLabel labelCarrera = new JLabel();
  	JLabel labelCarreras = new JLabel();
 	JLabel mensaje = new JLabel();

  	JTextField dni = new JTextField();
  	JTextField nombre = new JTextField();
  	JTextField poblacion = new JTextField();
  	JTextField telefono = new JTextField();
  	JTextField fechaNato = new JTextField();

	public VentanaEstudios() {
    		gridLayoutPrincipal.setRows(2);
    		gridLayoutSuperior.setColumns(1);
    		gridLayoutSuperior.setRows(7);

    		this.getContentPane().setLayout(gridLayoutPrincipal);
    		panelSuperior.setLayout(new BorderLayout());
    		panellnferior.setLayout(new BorderLayout());
		panelBotones1.setLayout(new FlowLayout());    		
    		panelCentral1.setLayout(gridLayoutSuperior);
    		panelCentral2.setLayout(new BorderLayout());
    		panelControles.setLayout(new FlowLayout());

    		panelSuperior.setBackground(Color.gray);
    		panellnferior.setBackground(Color.gray);
		this.setTitle("Gestión de Estudios");

		labelCabecera1.setForeground(Color.darkGray);
    		labelCabecera1.setHorizontalAlignment(SwingConstants.CENTER);
    		labelCabecera1.setText("GESTIÓN DE ALUMNOS");
    		labelCabecera2.setForeground(Color.darkGray);
    		labelCabecera2.setHorizontalAlignment(SwingConstants.CENTER);
    		labelCabecera2.setText("CONSULTAS DE CARRERAS");
    		labelCarreras.setText("Carreras: ");
    		labelDNI.setPreferredSize(new Dimension(125, 17));
    		labelDNI.setHorizontalAlignment(SwingConstants.RIGHT);
   		labelDNI.setText("DNI: ");
    		labelNombre.setPreferredSize(new Dimension(125, 17));
   	 	labelNombre.setHorizontalAlignment(SwingConstants.RIGHT);
   	 	labelNombre.setText("Nombre: ");
   	 	labelPoblacion.setPreferredSize(new Dimension(125, 17));
   	 	labelPoblacion.setHorizontalAlignment(SwingConstants.RIGHT);
   	 	labelPoblacion.setText("Población: ");
    		labelTelefono.setPreferredSize(new Dimension(125, 17));
    		labelTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
    		labelTelefono.setText("Teléfono: ");
    		labelFechaNato.setPreferredSize(new Dimension(125, 17));
    		labelFechaNato.setHorizontalAlignment(SwingConstants.RIGHT);
    		labelFechaNato.setText("Fecha Nacimiento: ");
    		labelCarrera.setPreferredSize(new Dimension(125, 17));
    		labelCarrera.setHorizontalAlignment(SwingConstants.RIGHT);
    		labelCarrera.setText("Carrera: ");
    		mensaje.setHorizontalAlignment(SwingConstants.CENTER);

   	 	nombre.setColumns(15);
   	 	poblacion.setColumns(15);
    		telefono.setColumns(15);
    		dni.setColumns(15);
    		fechaNato.setColumns(15);

    		listado.setPreferredSize(new Dimension(500, 200));
    		
    		botonAlta.setText("Insertar");
    		botonModificar.setText("Modificar Datos");
    		botonBorrar.setText("Eliminar");
    		botonBuscar.setText("Buscar");
    		botonSalir.setText("Salir");
    		botonLimpiar.setText("Limpiar");
    		botonVer.setText("Ver Alumnos");
    		
		this.getContentPane().add(panelSuperior, null);
    		panelSuperior.add(labelCabecera1, BorderLayout.NORTH);
    		panelSuperior.add(panelBotones1, BorderLayout.SOUTH);
    		panelBotones1.add(botonBuscar, null);
    		panelBotones1.add(botonAlta, null);
    		panelBotones1.add(botonModificar, null);
    		panelBotones1.add(botonBorrar, null);
    		panelSuperior.add(panelCentral1, BorderLayout.CENTER);
    		panelCentral1.add(panel1, null);
    		panel1.add(labelDNI, null);
    		panel1.add(dni, null);
    		panelCentral1.add(panel2, null);
    		panel2.add(labelNombre, null);
	    	panel2.add(nombre, null);	
   	 	panelCentral1.add(panel3, null);
    		panel3.add(labelPoblacion, null);
    		panel3.add(poblacion, null);
    		panelCentral1.add(panel4, null);
    		panel4.add(labelTelefono, null);
    		panel4.add(telefono, null);
    		panelCentral1.add(panel5, null);
    		panel5.add(labelFechaNato, null);
    		panel5.add(fechaNato, null);
    		panelCentral1.add(panel7, null);
    		panel7.add(labelCarrera, null);
    		panel7.add(carreras1, null);
    		panelCentral1.add(mensaje, null);
		
	    	this.getContentPane().add(panellnferior, null);
	    	panellnferior.add(labelCabecera2, BorderLayout.NORTH);
	    	panellnferior.add(panelBotones2, BorderLayout.SOUTH);
	    	panelBotones2.add(botonLimpiar, null);
	    	panelBotones2.add(botonSalir, null);
	    	panellnferior.add(panelCentral2, BorderLayout.CENTER);
	    	panelCentral2.add(panelControles, BorderLayout.NORTH);
	    	panelControles.add(labelCarreras, null);
	    	panelControles.add(carreras2, null);
	    	panelControles.add(botonVer, null);
	    	panelCentral2.add(panel, BorderLayout.CENTER);
	    	panel.add(listado, null);
	
    		botonAlta.addActionListener(this);
    		botonBorrar.addActionListener(this);
    		botonBuscar.addActionListener(this);
    		botonLimpiar.addActionListener(this);
    		botonModificar.addActionListener(this);
    		botonVer.addActionListener(this);
 	   	botonSalir.addActionListener(this);
	}

  	public static void main(String[] args) {
    		VentanaEstudios ventana = new VentanaEstudios();
   	 	ventana.setSize(600,575);
    		ventana.setVisible(true);
  	}

	public void actionPerformed(ActionEvent e){
		JButton target = (JButton)e.getSource();
		if (target == botonAlta){

		}
		if (target == botonBorrar){

		}
		if (target == botonBuscar){

		}
		if (target == botonModificar){

		}
		if (target == botonVer){

		}
		if (target == botonLimpiar){
      		this.limpiarTodo();
      		mensaje.setText("");
		}
		if (target == botonSalir){

			System.exit(0);
		}
  	}

  	private void limpiarTodo(){
    		dni.setText("");
    		nombre.setText("");
    		poblacion.setText("");
    		telefono.setText("");
    		fechaNato.setText("");
    		listado.setText("");
    		carreras1.setSelectedIndex(0);
    		carreras2.setSelectedIndex(0);
  	}
}
