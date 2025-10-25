/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electricity;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Sample1 extends JFrame implements ActionListener{
    JPanel p1;
    String meter;
    JLabel E;
    Sample1(String meter,String person){
        setTitle("ADMIN");
        setSize(1550,870);
        
        
        
        JButton l1 = new JButton("New Customer");
        l1.setForeground(Color.BLACK);  
        l1.setBackground(Color.WHITE);
        l1.setBounds(200, 200, 250, 30);
        add(l1);
        l1.setFont(new Font("monospaced",Font.BOLD,16));
        
       
        
        JButton l2 = new JButton("Customer Details");
        l2.setForeground(Color.BLACK);
        l2.setBackground(Color.WHITE);
        l2.setFont(new Font("monospaced",Font.BOLD,16));
        l2.setBounds(200, 260, 250, 30);
        add(l2);
        
        
        
        
        JButton l3 = new JButton("Deposit Details");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("monospaced",Font.BOLD,16));
        l3.setBounds(200, 320, 250, 30);
        add(l3);
        l3.setBackground(Color.WHITE);
        
            
        
        JButton l4 = new JButton("Calculate Bill");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("monospaced",Font.BOLD,16));       
        l4.setBounds(200, 380, 250, 30);
        add(l4);
        l4.setBackground(Color.WHITE);
        
        l1.addActionListener(this);
        l2.addActionListener(this);
        l3.addActionListener(this);
        l4.addActionListener(this);
        
        
       /* JButton l5 = new JButton("UTILITY");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("monospaced",Font.BOLD,16));
        l5.setBounds(200, 540, 250, 30);
        l5.setVisible(true);
        add(l5);
        l5.setBackground(Color.WHITE);
        l5.addActionListener(this);
        */
        JButton l6= new JButton("Notepad");
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("monospaced",Font.BOLD,16));       
        l6.setBounds(200, 440, 250, 30);
        add(l6);
        l6.setBackground(Color.WHITE);
        l6.addActionListener(this);
        
        JButton l9= new JButton("Calculator");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("monospaced",Font.BOLD,16));       
        l9.setBounds(200, 500, 250, 30);
        add(l9);
        l9.setBackground(Color.WHITE);
        l9.addActionListener(this);
        
        JButton l10= new JButton("Web Browser");
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("monospaced",Font.BOLD,16));       
        l10.setBounds(200, 560, 250, 30);
        add(l10);
        l10.setBackground(Color.WHITE);
        l10.addActionListener(this);
        
        JButton l11= new JButton("Logout");
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("monospaced",Font.BOLD,16));       
        l11.setBounds(200, 620, 250, 30);
        add(l11);
        l11.setBackground(Color.WHITE);
        l11.addActionListener(this);
        
        JLabel l7 = new JLabel("ADMIN");
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("monospaced",Font.BOLD,30));
        l7.setBounds(250, 200, 150, 30);
        add(l7);
        l7.setBackground(Color.WHITE);
        
       JMenuBar mb  = new JMenuBar();
       JMenu exit = new JMenu("Logout");
       JMenuItem ex = new JMenuItem("Logout");
       exit.setForeground(Color.BLUE);
        
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("icon2/17.jpeg"));
        Image i5 = ic.getImage().getScaledInstance(1550, 850,Image.SCALE_DEFAULT);
        ImageIcon icc5 = new ImageIcon(i5);
        E = new JLabel(icc5);
        E.setBounds(1550, 800, Image.SCALE_DEFAULT, Image.SCALE_DEFAULT);
        add(E);
        
        
        
        
        setLayout(new BorderLayout());
        getContentPane().add(E);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Customer Details")){
            new CustomerDetails().setVisible(true);
            
        }else if(msg.equals("New Customer")){
            new NewCustomer().setVisible(true);
            
        }else if(msg.equals("Calculate Bill")){
            new CalculateBill().setVisible(true);
            
        }else if(msg.equals("Pay Bill")){
            new PayBill(meter).setVisible(true);
           
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Logout")){
            this.setVisible(false);
            new Login().setVisible(true);
        }else if(msg.equals("Generate Bill")){
            new GenerateBill(meter).setVisible(true);
            
        }else if(msg.equals("Deposit Details")){
            new DepositDetails().setVisible(true);
        }else if(msg.equals("View Information")){
            new ViewInformation(meter).setVisible(true);
        }else if(msg.equals("Update Information")){
            new UpdateInformation(meter).setVisible(true);
        }else if(msg.equals("Bill Details")){
            new BillDetails(meter).setVisible(true);
        }
        
        
    }
    
    
    public static void main(String[] args){
        new Sample1("", "Admin").setVisible(true);
    }
}