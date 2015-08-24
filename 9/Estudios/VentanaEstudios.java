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

  	Connection con;
  	Statement stmt;

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

    		this.conectarBD();
    		this.cargarListas();
	}

  	public static void main(String[] args) {
    		VentanaEstudios ventana = new VentanaEstudios();
   	 	ventana.setSize(600,575);
    		ventana.setVisible(true);
  	}

	public void actionPerformed(ActionEvent e){
		JButton target = (JButton)e.getSource();
		if (target == botonAlta){
	   		try{
        			String DNI = dni.getText().trim();
        			String nom = nombre.getText().trim();
        			String pob = poblacion.getText().trim();
        			String telf = telefono.getText().trim();
        			String fecha = fechaNato.getText().trim();
        			String carrera = (String)carreras1.getSelectedItem();
        			// Comprobamos que no exista ya un alumno con ese DNI
        			ResultSet rs = stmt.executeQuery("SELECT * FROM ALUMNOS WHERE DNI='" + DNI + "'");
        			if (rs.next()){
          				mensaje.setText("Error: DNI ya existente");
        			}else{
        				rs = stmt.executeQuery("SELECT CodCarrera FROM CARRERAS WHERE Titulacion='" + carrera + "'");
          				rs.next();
          				int codCarrera = rs.getInt("CodCarrera");
          				String insercion = "INSERT INTO ALUMNOS VALUES ('" + DNI + "','" + nom + "','" + pob + "','" + telf + "','" + fecha + "'," + codCarrera + ")";
          				stmt.executeUpdate(insercion);
          				this.limpiarTodo();
          				mensaje.setText("Alumno insertado con exito");
        			}
	   		}catch(SQLException se){
			  	System.out.println("SQL Exception: " + se.getMessage());
			  	se.printStackTrace(System.out);
	   		}
		}
		if (target == botonBorrar){
	   		try{
        			String DNI = dni.getText().trim();
        			String borrado = "DELETE FROM ALUMNOS WHERE DNI = '" + DNI + "'";
        			int resultado = stmt.executeUpdate(borrado);
        			if (resultado == 0){
          				mensaje.setText("Error: No existe ningún alumno con ese DNI");
        			}else{
          				mensaje.setText("Alumno borrado con exito");
        			}
        			this.limpiarTodo();
	   		}catch(SQLException se){
			  	System.out.println("SQL Exception: " + se.getMessage());
			  	se.printStackTrace(System.out);
	   		}
		}
		if (target == botonBuscar){
	   		try{
        			String DNI = dni.getText().trim();
        			ResultSet rs = stmt.executeQuery("SELECT * FROM ALUMNOS WHERE DNI='" + DNI + "'");
        			if (!rs.next()){
          				mensaje.setText("Error: El alumno no existe.");
        			}else{
          				nombre.setText(rs.getString("Nombre"));
          				poblacion.setText(rs.getString("Poblacion"));
          				telefono.setText(rs.getString("Telefono"));
          				fechaNato.setText(rs.getString("FechaNato"));
          				rs = stmt.executeQuery("SELECT Titulacion FROM CARRERAS WHERE CodCarrera=" + rs.getInt("CodCarrera"));
          				rs.next();
          				String carrera = rs.getString("Titulacion");
          				carreras1.setSelectedItem(carrera);
          				mensaje.setText("");
        			}
	   		}catch(SQLException se){
				System.out.println("SQL Exception: " + se.getMessage());
				se.printStackTrace(System.out);
	   		}
		}
		if (target == botonModificar){
	   		try{
        			String DNI = dni.getText().trim();
        			String nom = nombre.getText().trim();
        			String pob = poblacion.getText().trim();
        			String telf = telefono.getText().trim();
        			String fecha = fechaNato.getText().trim();
        			String carrera = (String)carreras1.getSelectedItem();
        			// Comprobamos que exista un alumno con ese DNI
        			ResultSet rs = stmt.executeQuery("SELECT * FROM ALUMNOS WHERE DNI='" + DNI + "'");
        			if (!rs.next()){
        		  		mensaje.setText("Error: No existe ningún alumno con ese DNI");
        			}else{
          				rs = stmt.executeQuery("SELECT CodCarrera FROM CARRERAS WHERE Titulacion='" + carrera + "'");
          				rs.next();
          				int codCarrera = rs.getInt("CodCarrera");
          				String modificacion = "UPDATE ALUMNOS SET NOMBRE = '" + nom + "', POBLACION ='" + pob + "', TELEFONO = '" + telf + "', FECHANATO = '" + fecha + "', CODCARRERA = " + codCarrera + " WHERE DNI = '" + DNI + "'";
          				stmt.executeUpdate(modificacion);
          				this.limpiarTodo();
          				mensaje.setText("Alumno modificado con exito");
        			}
	   		}catch(SQLException se){
				System.out.println("SQL Exception: " + se.getMessage());
				se.printStackTrace(System.out);
	   		}
		}
		if (target == botonVer){
	   		try{
        			String carrera = (String)carreras2.getSelectedItem();
        			String busqueda = "SELECT * FROM ALUMNOS, CARRERAS WHERE ALUMNOS.CODCARRERA = CARRERAS.CODCARRERA AND TITULACION='" + carrera + "'";
        			ResultSet rs = stmt.executeQuery(busqueda);
        			listado.setText("");
        			boolean entra = false;
        			while (rs.next()){
        				entra = true;
          				String DNI = rs.getString("DNI");
          				String nom = rs.getString("Nombre");
          				String telf = rs.getString("Telefono");
          				listado.append(DNI + "\t\t" + nom + "\t\t" + telf + "\n");
        			}
        			if (!entra){
          				listado.setText("No existe ningún alumno que curse esa carrera");
        			}
	   		}catch(SQLException se){
			  	System.out.println("SQL Exception: " + se.getMessage());
			  	se.printStackTrace(System.out);
	   		}
		}
		if (target == botonLimpiar){
      		this.limpiarTodo();
      		mensaje.setText("");
		}
		if (target == botonSalir){
      		this.cerrarRecursos();
			System.exit(0);
		}
  	}

  	private void conectarBD(){
		try{
			// Cargamos el driver JDBC que vayamos a usar
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   	}catch(ClassNotFoundException e){
			System.out.println("Unable to load Driver Class");
	   	}
	   	try{
  			// Establecemos una conexión con nuestra base de datos
	  		String url = "jdbc:odbc:EstudiosBD";
		  	con = DriverManager.getConnection(url,"","");

			// Creamos y ejecutamos una sentencia SQL
			stmt = con.createStatement();
	   	}catch(SQLException se){
  			System.out.println("SQL Exception: " + se.getMessage());
	  		se.printStackTrace(System.out);
	   	}
	}

  	private void cerrarRecursos(){
      	try{
	  		stmt.close();
		  	con.close();
   	  	}catch(SQLException se){
 			System.out.println("SQL Exception: " + se.getMessage());
  			se.printStackTrace(System.out);
   	  	}
  	}

  	private void cargarListas(){
		try{
        		ResultSet rs = stmt.executeQuery("SELECT Titulacion FROM Carreras");

			while(rs.next()){
				String titulacion = rs.getString("TITULACION");
          			carreras1.addItem(titulacion);
          			carreras2.addItem(titulacion);
			}
		}catch(SQLException se){
			System.out.println("SQL Exception: " + se.getMessage());
			se.printStackTrace(System.out);
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
