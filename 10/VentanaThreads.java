import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Luminoso extends Thread
{
	JLabel etiqueta;
   	int intervalo;
    Color color1;
    Color color2;

	public Luminoso(JLabel etiq, int intervalo, Color c1, Color c2)
	{
		etiqueta = etiq;
		this.intervalo = intervalo;
        color1 = c1;
        color2 = c2;
	}

	public void run()
	{
		int estado = 0; 
		while (true)
		{
			try
			{
				if (estado == 0)
				{ 
					etiqueta.setForeground(color1);
					estado = 1;
				}else{
					etiqueta.setForeground(color2);
					estado = 0;
				}		
				Thread.sleep(intervalo);
			}catch(InterruptedException e) {}
		}
	}
}

class Reloj implements Runnable
{
	JLabel etiqueta;
	boolean parado;
	int horas;
    int minutos;
    int segundos;

	public Reloj(JLabel etiq)
	{
		etiqueta = etiq;
		parado = true;
		horas = minutos = segundos = 0;
	}

	public void parar()
	{
		parado = true;
	}
        
	public void reiniciar()
	{
	    	horas = minutos = segundos = 0;
        	etiqueta.setText(horas + ":" + minutos + ":" + segundos);
	}

	public void run()
	{		
		parado = false;
		while (!parado)
		{
			try{
				segundos++;
                                if (segundos == 60)
                                {
                                    segundos = 0;
                                    minutos++;
                                    if (minutos == 60)
                                    {
                                        minutos = 0;
                                        horas++;
                                    }
                                }
				etiqueta.setText(horas + ":" + minutos + ":" + segundos);
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}


public class VentanaThreads extends JFrame implements ActionListener
{
	JLabel etiqueta1;
	JLabel etiqueta2;
	JLabel etiqueta3;
	JLabel etiquetaReloj;
        JPanel panelBotones;
        JPanel panelEtiquetas;        
	JButton botonIniciar;
	JButton botonParar;
	JButton botonReiniciar;
	JButton botonSalir;        
	
        Reloj reloj;
        Thread threadReloj;
        
	public VentanaThreads()
	{
		etiqueta1 = new JLabel("¡Feliz Navidad!",JLabel.CENTER);
		etiqueta2 = new JLabel("¡Feliz Navidad!",JLabel.CENTER);
		etiqueta3 = new JLabel("¡Feliz Navidad!",JLabel.CENTER);
		etiquetaReloj = new JLabel("00:00:00 ",JLabel.CENTER);
                
                panelEtiquetas = new JPanel();
                panelBotones = new JPanel();

                botonIniciar = new JButton("Iniciar");		
		botonParar = new JButton("Parar");		
		botonReiniciar = new JButton("Reiniciar");		
		botonSalir = new JButton("Salir");		                

		panelEtiquetas.setLayout(new GridLayout(1,4));
		panelEtiquetas.add(etiqueta1);
		panelEtiquetas.add(etiqueta2);
		panelEtiquetas.add(etiqueta3);
		panelEtiquetas.add(etiquetaReloj);  
                
                panelBotones.add(botonIniciar);
                panelBotones.add(botonParar);
                panelBotones.add(botonReiniciar);
                panelBotones.add(botonSalir);                

		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(panelEtiquetas);		
		this.getContentPane().add(panelBotones, "South");		

		botonIniciar.addActionListener(this);		
		botonParar.addActionListener(this);		
		botonReiniciar.addActionListener(this);		
		botonSalir.addActionListener(this);		                

		Luminoso l1 = new Luminoso(etiqueta1, 2000, Color.black, Color.white);
		Luminoso l2 = new Luminoso(etiqueta2, 1000, Color.blue, Color.red);
		Luminoso l3 = new Luminoso(etiqueta3, 500, Color.green, Color.yellow);
		l1.start();
		l2.start();                
		l3.start();
                
                reloj = new Reloj(etiquetaReloj);                
                
                setTitle("Ventana con Threads");
                setSize(400,100);
		setVisible(true);
                
	}

	public void actionPerformed(ActionEvent e)
	{
		JButton boton = (JButton)e.getSource();
		if (boton == botonIniciar)
		{                    
                    threadReloj = new Thread(reloj);
                    threadReloj.start();
                    botonIniciar.setEnabled(false);
                    botonParar.setEnabled(true);                    
                    //threadReloj.resume();
                }
		if (boton == botonParar)
		{
                    reloj.parar();
                    botonIniciar.setEnabled(true);
                    botonParar.setEnabled(false);                    
                    //threadReloj.suspend();                    
                }
		if (boton == botonReiniciar)
		{
                    reloj.parar();
                    //threadReloj.suspend();
                    reloj.reiniciar();
                    botonIniciar.setEnabled(true);
                    botonParar.setEnabled(false);                    
                }
		if (boton == botonSalir)
		{
                    System.exit(0);
                }
        }

	public static void main(String[] args)
	{
		new VentanaThreads();
	}
	}