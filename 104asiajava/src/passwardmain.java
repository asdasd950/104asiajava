import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFormattedTextField;

public class passwardmain extends JFrame {

	/**
	 * @param args
	 */

	// TODO Auto-generated method stub
	private JButton jbtnGuess = new JButton("Guess");
	private JTextArea answer = new JTextArea();
	private JLabel jlb1 = new JLabel();
	private TextField number = new TextField();
	private Container cp;
	private char a = 'A';
	private char b = 'B';

	public passwardmain() {
		initComp();
	}

	private void initComp() {
		cp = this.getContentPane();
		this.setBounds(500, 150, 400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);
		cp.add(jlb1);
		cp.add(number);
		cp.add(jbtnGuess);
		cp.add(answer);
		cp.add(jlb1);
		jlb1.setBounds(50, 125, 300, 25);
		jlb1.setText("���A���P�Ӧ�ƬۦP,���B�����P��ƬۦP");
		number.setBounds(30, 100, 150, 25);
		jbtnGuess.setBounds(250, 100, 100, 25);
		answer.setBounds(30, 150, 320, 380);

		number.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent a) {
				int keyChar = a.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9||keyChar == KeyEvent.VK_Backspace) {
				} else {
					a.consume();
				}
			}
		});
		jbtnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				float c = Float.parseFloat(number.getText());
			}
		});

	}
}