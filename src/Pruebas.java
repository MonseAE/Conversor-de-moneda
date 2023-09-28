import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pruebas extends JFrame {

	private JTextField textField;
	
	public static void main(String[] args) {
		
		Pruebas marco = new Pruebas();
		marco.setSize(300, 200);
		marco.crearGUI();
		marco.setVisible(true);
		
	
		
		
		//String entradaCantidad;
		//entradaCantidad = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
	
	}
	
	private void crearGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		textField = new JTextField("Hola mundo");
		window.add(textField);
		
	}

}
