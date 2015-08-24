package estudios;

import java.awt.*;
import javax.swing.*;

public class VentanaEstudios extends JFrame
{
	
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
  	
	JButton botonAlta = new JButton();
  	JButton botonModificar = new JButton();
  	JButton botonBorrar = new JButton();
  	JButton botonBuscar = new JButton();
  	JButton botonVer = new JButton();
  	JButton botonLimpiar = new JButton();
  	JButton botonSalir = new JButton();

  	JComboBox carreras1 = new JComboBox();
  	JComboBox carreras2 = new JComboBox();

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

  	JTextField dni = new JTextField(15);
  	JTextField nombre = new JTextField(15);
  	JTextField poblacion = new JTextField(15);
  	JTextField telefono = new JTextField(15);
  	JTextField fechaNato = new JTextField(15);
	JTextArea listado = new JTextArea();

	public VentanaEstudios() {
		
		labelCabecera1.setForeground(Color.darkGray);
		labelCabecera1.setBackground(Color.gray);
		labelCabecera1.setOpaque(true);
   		labelCabecera1.setHorizontalAlignment(SwingConstants.CENTER);
   		labelCabecera1.setText("GESTIÓN DE ALUMNOS");
   		labelCabecera2.setForeground(Color.darkGray);
		labelCabecera2.setBackground(Color.gray);
		labelCabecera2.setOpaque(true);
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

    	listado.setPreferredSize(new Dimension(500, 200));
    		
    	botonAlta.setText("Insertar");
    	botonModificar.setText("Modificar Datos");
    	botonBorrar.setText("Eliminar");
    	botonBuscar.setText("Buscar");
    	botonSalir.setText("Salir");
    	botonLimpiar.setText("Limpiar");
    	botonVer.setText("Ver Alumnos");

		carreras1.addItem("Ingeniería Técnica en Informática de Gestión");
		carreras1.addItem("Ingeniería Informática");
		carreras1.addItem("Ingeniería Técnica Industrial");
		carreras1.addItem("Ingeniería de Telecomunicaciones");
		carreras1.addItem("Historia");
		carreras1.addItem("Administración y Dirección de Empresas");
		carreras1.addItem("Derecho");
		carreras1.addItem("Turismo");
	
		carreras2.addItem("Ingeniería Técnica en Informática de Gestión");
		carreras2.addItem("Ingeniería Informática");
		carreras2.addItem("Ingeniería Técnica Industrial");
		carreras2.addItem("Ingeniería de Telecomunicaciones");
		carreras2.addItem("Historia");
		carreras2.addItem("Administración y Dirección de Empresas");
		carreras2.addItem("Derecho");
		carreras2.addItem("Turismo");

    	panel1.add(labelDNI);
    	panel1.add(dni);
    	panel2.add(labelNombre);
	    panel2.add(nombre);	
    	panel3.add(labelPoblacion);
    	panel3.add(poblacion);
    	panel4.add(labelTelefono);
    	panel4.add(telefono);
    	panel5.add(labelFechaNato);
    	panel5.add(fechaNato);
    	panel7.add(labelCarrera);
    	panel7.add(carreras1);

		panelCentral1.setLayout(new GridLayout(7,1));
    	panelCentral1.add(panel1);
    	panelCentral1.add(panel2);
   	 	panelCentral1.add(panel3);
		panelCentral1.add(panel4);
   		panelCentral1.add(panel5);		
    	panelCentral1.add(panel7);	    	
    	panelCentral1.add(mensaje);
    			    
   		panelBotones1.setLayout(new FlowLayout());    		
   		panelBotones1.add(botonBuscar);
   		panelBotones1.add(botonAlta);
   		panelBotones1.add(botonModificar);
   		panelBotones1.add(botonBorrar);

   		panelSuperior.setLayout(new BorderLayout());
   		panelSuperior.add(labelCabecera1,"North");
   		panelSuperior.add(panelCentral1, "Center");
   		panelSuperior.add(panelBotones1,"South");
	    
	    panelControles.setLayout(new FlowLayout());
	    panelControles.add(labelCarreras);
	    panelControles.add(carreras2);
	    panelControles.add(botonVer);

	    panel.add(listado);
	    
		panelCentral2.setLayout(new BorderLayout());
	    panelCentral2.add(panelControles,"North");
	    panelCentral2.add(panel,"Center");
	    	    
	    panelBotones2.add(botonLimpiar);
	    panelBotones2.add(botonSalir);
	    
		panellnferior.setLayout(new BorderLayout());
		panellnferior.add(labelCabecera2,"North");
		panellnferior.add(panelCentral2,"Center");	    
	    panellnferior.add(panelBotones2,"South");
    				
		this.setTitle("Gestión de Estudios");
		this.getContentPane().add(panelSuperior);
		this.getContentPane().add(panellnferior);
		this.getContentPane().setLayout(new GridLayout(2,1));
	}

  	public static void main(String[] args) {
    	VentanaEstudios ventana = new VentanaEstudios();
   	 	ventana.setSize(600,575);
    	ventana.setVisible(true);
  	}
}
