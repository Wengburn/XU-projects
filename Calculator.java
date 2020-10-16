import javax.swing.*;
import java.awt.event.*;
 
 class Calculator implements ActionListener
{
	JTextField t;
	JFrame f;
	JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,bdivide,bmultiply,bsubtract,badd,bdecimal,bequal,bdelete,bclr;
 
	static double a=0,b=0,result=0;
	static int operator=0;
 
	Calculator()
	{
		f=new JFrame("Calculator");
		t=new JTextField();
		button1=new JButton("1");
		button2=new JButton("2");
		button3=new JButton("3");
		button4=new JButton("4");
		button5=new JButton("5");
		button6=new JButton("6");
		button7=new JButton("7");
		button8=new JButton("8");
		button9=new JButton("9");
		button0=new JButton("0");
		bdivide=new JButton("/");
		bmultiply=new JButton("*");
		bsubtract=new JButton("-");
		badd=new JButton("+");
		bdecimal=new JButton(".");
		bequal=new JButton("=");
		bdelete=new JButton("Delete");
		bclr=new JButton("Clear");
		
		t.setBounds(30,40,280,30);
		button1.setBounds(40,240,50,40);
		button2.setBounds(110,240,50,40);
		button3.setBounds(180,240,50,40);
		button4.setBounds(40,170,50,40);
		button5.setBounds(110,170,50,40);
		button6.setBounds(180,170,50,40);
		button7.setBounds(40,100,50,40);
		button8.setBounds(110,100,50,40);
		button9.setBounds(180,100,50,40);
		button0.setBounds(110,310,50,40);
		
		bdivide.setBounds(250,100,50,40);
		bsubtract.setBounds(250,240,50,40);
		bmultiply.setBounds(250,170,50,40);
		bdecimal.setBounds(40,310,50,40);
		bequal.setBounds(180,310,50,40);
		badd.setBounds(250,310,50,40);
		bdelete.setBounds(60,380,110,40);
		bclr.setBounds(180,380,110,40);
		
		f.add(t);
		f.add(button7);
		f.add(button8);
		f.add(button9);
		f.add(bdivide);
		f.add(button4);
		f.add(button5);
		f.add(button6);
		f.add(bmultiply);
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.add(bsubtract);
		f.add(bdecimal);
		f.add(button0);
		f.add(bequal);
		f.add(badd);
		f.add(bdelete);
		f.add(bclr);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(350,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		badd.addActionListener(this);
		bdivide.addActionListener(this);
		bmultiply.addActionListener(this);
		bsubtract.addActionListener(this);
		bdecimal.addActionListener(this);
		bequal.addActionListener(this);
		bdelete.addActionListener(this);
		bclr.addActionListener(this);
	}
 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
			t.setText(t.getText().concat("1"));
		
		if(e.getSource()==button2)
			t.setText(t.getText().concat("2"));
		
		if(e.getSource()==button3)
			t.setText(t.getText().concat("3"));
		
		if(e.getSource()==button4)
			t.setText(t.getText().concat("4"));
		
		if(e.getSource()==button5)
			t.setText(t.getText().concat("5"));
		
		if(e.getSource()==button6)
			t.setText(t.getText().concat("6"));
		
		if(e.getSource()==button7)
			t.setText(t.getText().concat("7"));
		
		if(e.getSource()==button8)
			t.setText(t.getText().concat("8"));
		
		if(e.getSource()==button9)
			t.setText(t.getText().concat("9"));
		
		if(e.getSource()==button0)
			t.setText(t.getText().concat("0"));
		
		if(e.getSource()==bdecimal)
			t.setText(t.getText().concat("."));
		
		if(e.getSource()==badd)
		{
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		} 
		
		if(e.getSource()==bsubtract)
		{
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}
		
		if(e.getSource()==bmultiply)
		{
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}
		
		if(e.getSource()==bdivide)
		{
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}
		
		if(e.getSource()==bequal)
		{
			b=Double.parseDouble(t.getText());
		
			switch(operator)
			{
				case 1: result=a+b;
					break;
		
				case 2: result=a-b;
					break;
		
				case 3: result=a*b;
					break;
		
				case 4: result=a/b;
					break;
		
				default: result=0;
			}
		
			t.setText(""+result);
		}
		
		if(e.getSource()==bclr)
			t.setText("");
		
		if(e.getSource()==bdelete)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
		}		
	}
 
	public static void main(String[] args)
	{
		new Calculator();
	}
}