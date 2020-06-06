                                           /* SWING DEMO AND EVENT HANDLING*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sandeep implements ActionListener
{
       JFrame f;
       JPanel p;
       JLabel l1,l2,l3;
       JTextField t1;
       JPasswordField t2;
       JComboBox cb;
       JButton b1;
       JRadioButton r1,r2,r3,r4,r5;
       ButtonGroup bg;


                                  sandeep()
                                              {                                                          
                                                   f=new JFrame("SNAK industries");
                                                   p=new JPanel();  
                                                   t1=new  JTextField(20);

                                                  t2=new JPasswordField(20);       
                                                  l1=new JLabel("Email");
                                                  l2=new JLabel("PASSWORD");
                                                  String h[]={"red","blue","yellow"};
                                                  l3=new JLabel("FAVOURITE COLOR");

                                                 cb=new JComboBox(h);
                                                 r1=new JRadioButton("gen");
                                                 r2=new JRadioButton("obc");
                                                 r3=new JRadioButton("sc"); 
                                                 r4=new JRadioButton("st"); 
                                                 r5=new JRadioButton("others"); 
                                                 bg=new ButtonGroup();
                                                 b1=new JButton("LOg In");

                                                        f.add(p);
                                                        p.add(l1);
                                                        p.add(t1);
                                                        p.add(l2);
                                                        p.add(t2); 
                                                        p.add(l3);
                                                        p.add(cb); 
                                                        bg.add(r1);
                                                        bg.add(r2); 
                                                        bg.add(r3); 
                                                       bg.add(r4); 
                                                       bg.add(r5); 
                                                        p.add(r1);
                                                        p.add(r2);
                                                        p.add(r3);
                                                        p.add(r4);
                                                        p.add(r5);
                                                        p.add(b1);

                                              p.setBackground(Color.gray);
                                             f.pack();
                                             f.setVisible(true);
                                             f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                             cb.addActionListener(this);
                                        }
                                          public void actionPerformed(ActionEvent ae)
                                        {
                                         String s=(String)cb.getSelectedItem();                          
                                           if(s.equals("red"))
                                                {
                                                   p.setBackground(Color.red);
                                                }
                                           if(s.equals("blue"))
                                                {
                                                   p.setBackground(Color.blue);
                                                 }
                                          if(s.equals("yellow"))
                                                {
                                                   p.setBackground(Color.yellow);
                                                }
                                       }
                               public static void main(String ar[])
                                                 {
                                                      sandeep a=new sandeep();
                                                  }
 }                                                                                                             

















                                                                                                                        
