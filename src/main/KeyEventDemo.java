package main;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame{

    private TextField tfInput;
    private TextArea taDisplay;

    public KeyEventDemo() {
        setLayout(new FlowLayout());

        add(new Label("Enter Text: "));
        tfInput = new TextField(10);
        add(tfInput);
        taDisplay = new TextArea(5, 40);
        add(taDisplay);

        tfInput.addKeyListener(new MyKeyListener());

        setTitle("KeyEvent Demo");
        setSize(400, 200);
        setVisible(true);
    }


public static void main(String[] args) {
    new KeyEventDemo();
}

private class MyKeyListener implements KeyListener {

    public void keyTyped(KeyEvent evt){
        taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
}

	public void keyPressed(KeyEvent e) {	
	}
	public void keyReleased(KeyEvent e) {
	
	}

}

}

