package u1c3_ej1;
import java.awt.event.*;
import javax.swing.*;
public class ejemplo1 {
	public ejemplo1() {
		//Crear un nuevo contenedor JFrame
		JFrame ventana=new JFrame("Ejemplo 2");
		//Asignar el tamaño inicial de la ventana
		ventana.setSize(250,100);
		//Terminar el programa cuando el usuario cierre la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Crear un boton usando el componente JButton
        JButton button = new JButton("Haz clic aquí"); 
        // Crear un nuevo oyente para el evento de clic
        ActionListener listener = new ActionListener() { 
         // Implementar el método actionPerformed usando una clase anónima
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// Mostrar  un cuadro de diálogo con un mensaje
                JOptionPane.showMessageDialog(null, "¡Has hecho clic en el botón!"); 
			}
        };
        // Registrar el oyente con la fuente del evento 
        button.addActionListener(listener); 
		//Añadir la etiqueta al panel de contenido
		ventana.add(button);
		//Mostrar la ventana
		ventana.setVisible(true);		
	}
	public static void main(String[] args) {
		//Crea la ventana en el subproceso de entrega de eventos
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ejemplo1();
			}		
		});

	}
	
  

	
}