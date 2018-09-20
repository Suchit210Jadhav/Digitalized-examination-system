import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import java.sql.*;


class Proj1 extends JFrame implements ActionListener
{	
	int marks=0;
	JFrame f = new JFrame("OOPM Online Exam");
	JLabel logo = new JLabel();
	JLabel l = new JLabel("RAMRAO ADIK INSTITUTE OF TECHNOLOGY");
	JLabel l1 = new JLabel("OOPM ONLINE EXAMINATION");
	JLabel l2 = new JLabel("Enter Roll No:");
	JLabel l3 = new JLabel();
	JTextField t = new JTextField();
	JButton b1 = new JButton("NEXT");
	JButton b2 = new JButton("RESULT");

	JFrame f1 = new JFrame("OOPM Online Exam-Instructions");
	JLabel il = new JLabel("INSTRUCTIONS:");
	JLabel il1 = new JLabel("");
	JButton ib = new JButton("START");

	JFrame q1 = new JFrame("OOPM Online Exam-Question1 ");
	JLabel ql1 = new JLabel("");
	JTextField qt1 = new JTextField("");
	JButton qb1 = new JButton("NEXT");

	JFrame q2 = new JFrame("OOPM Online Exam-Question2 ");
	JLabel ql2 = new JLabel("");
	JTextField qt2 = new JTextField("");
	JButton qb2 = new JButton("NEXT");

	JFrame q3 = new JFrame("OOPM Online Exam-Question3 ");
	JLabel ql3 = new JLabel("");
	JTextField qt3 = new JTextField("");
	JButton qb3 = new JButton("NEXT");

	JFrame q4 = new JFrame("OOPM Online Exam-Question4 ");
	JLabel ql4 = new JLabel("");
	JTextField qt4 = new JTextField("");
	JButton qb4 = new JButton("NEXT");

	JFrame q5 = new JFrame("OOPM Online Exam-Question5 ");
	JLabel ql5 = new JLabel("");
	JTextField qt5 = new JTextField("");
	JButton qb5 = new JButton("SUBMIT");

	JFrame r1 = new JFrame("OOPM Online Exam-Results");
	JLabel rl = new JLabel();
	JButton rb = new JButton("EXIT");


	public void sj()
 	{
		f.setLayout(null);
		f.setBounds(300,100,600,600);
		logo.setBounds(150,20,300,200);
		logo.setIcon(new ImageIcon("logo2.jpg"));
		l.setBounds(75,250,450,21);
		l.setFont(new Font("Arial",Font.BOLD,21));
		l1.setBounds(200,275,450,20);
		l1.setFont(new Font("Serif",Font.BOLD,15));
		l2.setBounds(50,350,175,30);
		l2.setFont(new Font("Courier",Font.BOLD,18));
		l3.setBounds(50,400,500,150);
		l3.setText("<html>Click on next only if you are a new user orelse click result to check your marks in previously attempted exam.</html>");
		t.setBounds(270,350,200,30);
		b1.setBounds(150,400,100,35);
		b2.setBounds(290,400,100,35);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(logo);
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t);
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	public void Instruct(){
	
		f1.setLayout(null);
		f1.setBounds(300,100,600,500);
		il.setBounds(150,20,250,50);
		il.setFont(new Font("Serif",Font.BOLD,27));
		il1.setText("<html>1.Enter only option of the correct answer.(i.e. a/b/c/d)<br>Entering a answer is compulsory. <br>2.Click on next button for next question, you cannot answer the previous question after clicking next.<br>3.Click on submit button to submit your answers. <br>4.You can exit after clicking on exit in result. <br>6.Only attempted answers are considered. <br>5.There is NO negative marking.</html>");
		il1.setBounds(12,75,550,250);
		il1.setFont(new Font("Courier",Font.BOLD,18));
		ib.setBounds(240,325,100,35);
		ib.addActionListener(this);
		f1.add(il);
		f1.add(il1);
		f1.add(ib);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void ques1()
	{
		q1.setLayout(null);
		q1.setBounds(250,100,800,400);
		ql1.setBounds(100,25,600,150);
		ql1.setText("<html>Q1:Which data type value is returned by all transcendental math functions?<br><br>a.int		b.float		c.double	 d.long</html>");
		ql1.setFont(new Font("Courier",Font.BOLD,20));
		qt1.setBounds(100,225,200,50);
		qb1.setBounds(670,300,100,35);
		qb1.addActionListener(this);
		q1.add(ql1);
		q1.add(qt1);
		q1.add(qb1);
		q1.setVisible(true);
		q1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void ques2()
	{
		q2.setLayout(null);
		q2.setBounds(250,100,800,400);
		ql2.setBounds(100,25,600,150);
		ql2.setText("<html>Q2:Which of these keywords is used by a class to use a interface defined previously?<br><br>a.import		b.extends	  c.Import		d.implements</html>");
		ql2.setFont(new Font("Courier",Font.BOLD,20));
		qt2.setBounds(100,225,200,50);
		qb2.setBounds(670,300,100,35);
		qb2.addActionListener(this);
		q2.add(ql2);
		q2.add(qt2);
		q2.add(qb2);
		q2.setVisible(true);
		q2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void ques3()
	{
		q3.setLayout(null);
		q3.setBounds(250,100,800,400);
		ql3.setBounds(100,25,600,150);
		ql3.setText("<html>Q3:Which of these methods can be used to output a string in an applet?<br><br>a.display()	b.drawString()	 c.print()		d.transient()</html>");
		ql3.setFont(new Font("Courier",Font.BOLD,20));
		qt3.setBounds(100,225,200,50);
		qb3.setBounds(670,300,100,35);
		qb3.addActionListener(this);
		q3.add(ql3);
		q3.add(qt3);
		q3.add(qb3);
		q3.setVisible(true);
		q3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void ques4()
	{
		q4.setLayout(null);
		q4.setBounds(250,100,800,400);
		ql4.setBounds(100,25,600,150);
		ql4.setText("<html>Q4:Which of these keywords is not a part of exception handling?<br><br>a.thrown		b.finally	 c.try	 d.catch</html>");
		ql4.setFont(new Font("Courier",Font.BOLD,20));
		qt4.setBounds(100,225,200,50);
		qb4.setBounds(670,300,100,35);
		qb4.addActionListener(this);
		q4.add(ql4);
		q4.add(qt4);
		q4.add(qb4);
		q4.setVisible(true);
		q4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void ques5()
	{
		q5.setLayout(null);
		q5.setBounds(250,100,800,400);
		ql5.setBounds(100,25,600,150);
		ql5.setText("<html>Q5:Which of these operation is used toallocate memory to array in Java?<br><br>a.malloc		b.alloc		c.new	 d.new malloc</html>");
		ql5.setFont(new Font("Courier",Font.BOLD,20));
		qt5.setBounds(100,225,200,50);
		qb5.setBounds(670,300,100,35);
		qb5.addActionListener(this);
		q5.add(ql5);
		q5.add(qt5);
		q5.add(qb5);
		q5.setVisible(true);
		q5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void result1()
	{	

		if("c".equals(qt1.getText()))
			marks=marks+1;
		if("d".equals(qt2.getText()))
			marks=marks+1;
		if("b".equals(qt3.getText()))
			marks=marks+1;
		if("a".equals(qt4.getText()))
			marks=marks+1;
		if("c".equals(qt5.getText()))
			marks=marks+1;
		
		r1.setLayout(null);
		r1.setBounds(300,100,700,500);
		rl.setText("YOU SCORED " +marks+ " IN THIS EXAMINATION OUT OF 5.");
		rl.setBounds(100,25,680,300);
		rl.setFont(new Font("Courier",Font.BOLD,20));
		rb.setBounds(300,350,100,50);
		rb.addActionListener(this);
		r1.add(rl);
		r1.add(rb);
		r1.setVisible(true);
		r1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void result2()
	{
		
	}
	
	public void actionPerformed(ActionEvent a){
		if(a.getSource()==b1){
			if("".equals(t.getText()))
				t.setText("ENTER A ROLL NO.!");
			else{
				f.dispose();
				Instruct();
			}
		}
		if(a.getSource()==ib){
			f1.dispose();
			ques1();
		}
		if(a.getSource()==qb1){
			q1.dispose();
			ques2();
		}
		if(a.getSource()==qb2){
			q2.dispose();
			ques3();
		}
		if(a.getSource()==qb3){
			q3.dispose();
			ques4();
		}
		if(a.getSource()==qb4){
			q4.dispose();
			ques5();
		}
		if(a.getSource()==qb5){
			q5.dispose();
			result1();
			
			String ro = t.getText();
			
			try{
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				Connection conn =DriverManager.getConnection("jdbc:ucanaccess://F:\\Git\\Digitalized-examination-system\\Exam.accdb");
				Statement st = conn.createStatement();
				st.executeUpdate("INSERT INTO exam (Roll,M) VALUES ('"+ro+"','"+marks+"')");
			}
			catch(Exception ex1)
                    {
                        System.out.println(ex1.getMessage());
                    
                    }
			
		}
		if(a.getSource()==rb){
			r1.dispose();
			sj();
		}
		if(a.getSource()==b2){
			//f.dispose();
			
			//String ab = t.getText();
		try{
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				Connection con =DriverManager.getConnection("jdbc:ucanaccess://F:\\Git\\Digitalized-examination-system\\Exam.accdb");
				Statement s = con.createStatement();
				ResultSet rs=s.executeQuery("SELECT [M] FROM exam WHERE [Roll] = '"+t.getText()+"' ");
				rs.next();
				String cs = rs.getString(1);
				JOptionPane.showMessageDialog(f, "Marks of roll no:  " +t.getText()+"  is  "+cs);
			}
			
		catch(Exception ex1)
            {
                System.out.println(ex1.getMessage());
            }
		
			
		}
	}
}

public class PJ1{
	public static void main(String[] args){
		Proj1 p = new Proj1();
		p.sj();
	}
}