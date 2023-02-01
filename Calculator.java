import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;



class Calculator implements ActionListener
{
	JTextField text;
	static double a=0,b=0,result=0;
	static int operator=0,nextTime=0;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,div,mul,clr,eql;
	JFrame myframe;
	Container c;
	JPanel pnl1;
	JLabel toplbl;
	Icon photo;
	Calculator()
	{
	
		myframe=new JFrame("Calculator By SZAKIR");
		c=myframe.getContentPane();
		myframe.getContentPane().setBackground(Color.ORANGE);
		myframe.setLayout(new BorderLayout());  // Border layout contains 5 regions i,e. NORTH,SOUTH,EAST,WEST & CENTER.
		myframe.setSize(260,400);
		

		pnl1=new JPanel();
		pnl1.setLayout(new GridLayout(4,4,5,5));   //4 rows and columns and 5 spacing's Vertical and horizontal...or can be like new GridLayoyt(4,4)  instead...

		
		try{
		photo=new ImageIcon("zakir.gif");
		toplbl=new JLabel("SZAKIR",photo,SwingConstants.LEFT);
		}catch(Exception ob)
		{
		toplbl.setText("Icon not Found");
		}
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");

		add=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("x");
		div=new JButton("/");
		clr=new JButton("Clr");
		eql=new JButton("=");
		add.setBackground(Color.GREEN);
		sub.setBackground(Color.GREEN);
		mul.setBackground(Color.GREEN);
		div.setBackground(Color.GREEN);
		eql.setBackground(Color.YELLOW);
		eql.setForeground(Color.RED);
		eql.setSize(200,300);
		clr.setForeground(Color.YELLOW);
		clr.setBackground(Color.WHITE);


		Font f1_9=new Font("New Times Roman",1,35);
		Font ops=new Font("Sans Serif",0,37);
		Font cl=new Font("Sans Serif",4,20);

		

		add.setFont(ops);
		sub.setFont(ops);
		mul.setFont(ops);
		div.setFont(ops);
		eql.setFont(ops);

		clr.setFont(cl);


		b0.setFont(f1_9);
		b1.setFont(f1_9);
		b2.setFont(f1_9);
		b3.setFont(f1_9);
		b4.setFont(f1_9);
		b5.setFont(f1_9);
		b6.setFont(f1_9);
		b7.setFont(f1_9);
		b8.setFont(f1_9);
		b9.setFont(f1_9);

		b0.setForeground(Color.BLUE);
		b1.setForeground(Color.BLUE);
		b2.setForeground(Color.BLUE);
		b3.setForeground(Color.BLUE);
		b4.setForeground(Color.BLUE);
		b5.setForeground(Color.BLUE);
		b6.setForeground(Color.BLUE);
		b7.setForeground(Color.BLUE);
		b8.setForeground(Color.BLUE);
		b9.setForeground(Color.BLUE);


		pnl1.add(b9);
		pnl1.add(b8);	
		pnl1.add(b7);
		pnl1.add(add);

		pnl1.add(b6);
		pnl1.add(b5);
		pnl1.add(b4);
		pnl1.add(sub);


		pnl1.add(b3);
		pnl1.add(b2);
		pnl1.add(b1);
		pnl1.add(mul);


		pnl1.add(clr);
		pnl1.add(b0);
		pnl1.add(eql);
		pnl1.add(div);
		
		text=new JTextField("0");
		text.setForeground(Color.GREEN);
		text.setBackground(Color.YELLOW);
		JLabel lbl=new JLabel("SZAKIR'S CALCULATOR LAYOUT");
		lbl.setForeground(Color.RED);

		// now add pnl1 ,textfield and label on the main content frame which has Border Layout used...
		//c.add(toplbl,BorderLayout.NORTH);
		c.add(text,BorderLayout.NORTH);
		c.add(pnl1,BorderLayout.CENTER);
		c.add(lbl,BorderLayout.SOUTH);

		
		myframe.setVisible(true);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setResizable(false);

		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);

		b8.addActionListener(this);
		b9.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);

		mul.addActionListener(this);
		div.addActionListener(this);
		clr.addActionListener(this);
		eql.addActionListener(this);
		
	}


	public void actionPerformed(ActionEvent obj)       //Overridden (implemented) method of ActionListener Interface..... 
	{

	
	     if(nextTime==0)
	     {
		if(obj.getSource()==b0)
		text.setText(text.getText().concat("0"));

		if(obj.getSource()==b1)
		text.setText(text.getText().concat("1"));

		if(obj.getSource()==b2)
		text.setText(text.getText().concat("2"));

		if(obj.getSource()==b3)
		text.setText(text.getText().concat("3"));

		if(obj.getSource()==b4)
		text.setText(text.getText().concat("4"));

		if(obj.getSource()==b5)
		text.setText(text.getText().concat("5"));

		if(obj.getSource()==b6)
		text.setText(text.getText().concat("6"));

		if(obj.getSource()==b7)
		text.setText(text.getText().concat("7"));

		if(obj.getSource()==b8)
		text.setText(text.getText().concat("8"));

		if(obj.getSource()==b9)
		text.setText(text.getText().concat("9"));

		if(obj.getSource()==add)
		{
			a=Double.parseDouble(text.getText());
			text.setText("");
			//text.setText(text.getText().concat(" + "));
			operator=1;
		}

		if(obj.getSource()==sub)
		{
			a=Double.parseDouble(text.getText());
			text.setText("");
			//text.setText(text.getText().concat(" - "));
			operator=2;
		}
		
		if(obj.getSource()==mul)
		{
			a=Double.parseDouble(text.getText());
			text.setText("");
			//text.setText(text.getText().concat(" * "));
			operator=3;
		}

		if(obj.getSource()==div)
		{
			a=Double.parseDouble(text.getText());
			text.setText("");
			//text.setText(text.getText().concat(" / "));
			operator=4;
		}

		if(obj.getSource()==clr)
		{
			text.setText("");
			text.setBackground(Color.YELLOW);
		}

		if(obj.getSource()==eql)
		{
			b=Double.parseDouble(text.getText());
			Font res=new Font("New Times Roman",1,19);
			text.setFont(res);
			text.setBackground(Color.RED);
			nextTime=1;
			
			switch(operator)
			{
			case 1:result=a+b;
			text.setText(a+ " + "+b+"  = "+result);
			break;
			case 2:result=a-b;
			text.setText(a+ " - "+b+"  = "+result);
			break;

			case 3:result=a*b;
			text.setText(a+ " * "+b+"  = "+result);
			break;
			case 4:result=a/b;
			text.setText(a+ " / "+b+"  = "+result);
			break;
			default:result=0;
			text.setText("invalid operation");
			}
			
			
			a=0;
			b=0;
		     }
	             
		
	        }
	      else
	       {
		text.setText("");
		text.setBackground(Color.YELLOW);
		nextTime=0;
	
	        }
	}

	

	public static void main(String aa[])
	{
		new Calculator();
	}
}