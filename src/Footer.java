import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Footer extends JFrame{
	
	public static void main(String args[]) {
		try {
			Footer frame = new Footer();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
public Footer() {
	super();
	setTitle(" T 科技");
	setResizable(false);
	setBounds(0, 0, 1024, 768);	
	
	final JTextArea t1 = new JTextArea();
	t1.setPreferredSize(new Dimension(0, 230));
	t1.setLayout(new BorderLayout());
	getContentPane().add(t1, BorderLayout.NORTH);
	
	final JButton b = new JButton();
	b.setText("Add");
	b.setPreferredSize(new Dimension(0, 230));
	b.setLayout(new BorderLayout());
	getContentPane().add(b, BorderLayout.CENTER);
	
	final JTextArea t2 = new JTextArea();
	t2.setPreferredSize(new Dimension(0, 200));
	t2.setLayout(new BorderLayout());
	getContentPane().add(t2, BorderLayout.SOUTH);
	
	final JTextArea t3 = new JTextArea();
	t3.setText("由 x 和 y 指定左上角的新位置");
	Font font=new Font("Serief",Font.BOLD,15);
	t3.setFont(font);
	String s1=t3.getText();
		
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	String s=t1.getText();
	s+="\n"+s1;
	t2.setText(s);
	
		}
	});
}
	}


