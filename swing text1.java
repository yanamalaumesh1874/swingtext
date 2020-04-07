import javax.swing.*;
class swingtext 
{
public static void main(String args[])
	{
	JFrame f=new JFrame("text frame");
	JTextField t1,t2;
	t1=new JTextField("welcome to java text");
	t1.setBounds(100,100,150,40);
	t2=new JTextField("welcome to swing concept");
	t2.setBounds(100,100,200,40);
	f.add(t1);
	f.add(t2);
	f.setSize(400,500);
	f.setLayout(null);
	f.setVisible(true);
	}
}
