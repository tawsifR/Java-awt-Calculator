/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author tawsi
 */
public class Calculator implements ActionListener{

    /**
     * @param args the command line arguments
     */
    String s1="";
    String temp,temp2,temp1="";
    double a=0.0,b=0.0,result=0.0,pi_value=3.14159265359;
    int op=0;
    boolean flag=false,calc_flag=false,ans_flag=false;
    TextField t1;
    Button b1,b2,b3,b4;
    Button num_0,num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8,num_9,decimal,calc_equal,ac,sqrt,
            delete,ans,factorial,power,percentage,pi;
    Calculator(){
        Frame f=new Frame();
        f.setSize(450,550);
        f.setTitle("Calculator");
        f.setBackground(Color.GRAY);
        t1=new TextField();
        t1.setBounds(100,50,260,40);
        t1.setEditable(false);
        Font font = new Font("Verdana", Font.BOLD, 20);
        t1.setFont(font);
        f.add(t1);
        Font font_button = new Font("Verdana", Font.BOLD, 16);
        num_1=new Button("1");
        num_1.setBounds(100,120,50,50);
        num_1.setFont(font_button);
        num_1.setBackground(Color.BLACK);
        num_1.setForeground(Color.white);
        f.add(num_1);
        num_2=new Button("2");
        num_2.setBounds(170,120,50,50);
        num_2.setFont(font_button);
        num_2.setBackground(Color.BLACK);
        num_2.setForeground(Color.white);
        f.add(num_2);
        num_3=new Button("3");
        num_3.setBounds(240,120,50,50);
        num_3.setFont(font_button);
        num_3.setBackground(Color.BLACK);
        num_3.setForeground(Color.white);
        f.add(num_3);
        num_4=new Button("4");
        num_4.setBounds(100,180,50,50);
        num_4.setFont(font_button);
        num_4.setBackground(Color.BLACK);
        num_4.setForeground(Color.white);
        f.add(num_4);
        num_5=new Button("5");
        num_5.setBounds(170,180,50,50);
        num_5.setFont(font_button);
        num_5.setBackground(Color.BLACK);
        num_5.setForeground(Color.white);
        f.add(num_5);
        num_6=new Button("6");
        num_6.setBounds(240,180,50,50);
        num_6.setFont(font_button);
        num_6.setBackground(Color.BLACK);
        num_6.setForeground(Color.white);
        f.add(num_6);
        num_7=new Button("7");
        num_7.setBounds(100,240,50,50);
        num_7.setFont(font_button);
        num_7.setBackground(Color.BLACK);
        num_7.setForeground(Color.white);
        f.add(num_7);
        num_8=new Button("8");
        num_8.setBounds(170,240,50,50);
        num_8.setFont(font_button);
        num_8.setBackground(Color.BLACK);
        num_8.setForeground(Color.white);
        f.add(num_8);
        num_9=new Button("9");
        num_9.setBounds(240,240,50,50);
        num_9.setFont(font_button);
        num_9.setBackground(Color.BLACK);
        num_9.setForeground(Color.white);
        f.add(num_9);
        num_0=new Button("0");
        num_0.setBounds(100,300,50,50);
        num_0.setFont(font_button);
        num_0.setBackground(Color.BLACK);
        num_0.setForeground(Color.white);
        f.add(num_0);
        decimal=new Button(".");
        decimal.setBounds(100,360,50,50);
        decimal.setFont(font_button);
        decimal.setBackground(Color.BLACK);
        decimal.setForeground(Color.white);
        f.add(decimal);
        b1=new Button("+");
        b1.setBounds(170,300,50,50);
        b1.setFont(font_button);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        f.add(b1);
        b2=new Button("-");
        b2.setBounds(240,300,50,50);
        b2.setFont(font_button);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        f.add(b2);
        b3=new Button("*");
        b3.setBounds(170,360,50,50);
        b3.setFont(font_button);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.white);
        f.add(b3);
        b4=new Button("/");
        b4.setBounds(240,360,50,50);
        b4.setFont(font_button);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.white);
        f.add(b4);
        calc_equal=new Button("=");
        calc_equal.setBounds(170,420,50,50);
        calc_equal.setFont(font_button);
        calc_equal.setBackground(Color.BLACK);
        calc_equal.setForeground(Color.white);
        f.add(calc_equal);
        ac=new Button("AC");
        ac.setBounds(310,420,50,50);
        ac.setFont(font_button);
        ac.setBackground(Color.BLACK);
        ac.setForeground(Color.white);
        f.add(ac);
        pi=new Button("π");
        pi.setBounds(310,300,50,50);
        pi.setFont(font_button);
        pi.setBackground(Color.BLACK);
        pi.setForeground(Color.white);
        f.add(pi);
        sqrt=new Button("√");
        sqrt.setBounds(100,420,50,50);
        sqrt.setFont(font_button);
        sqrt.setBackground(Color.BLACK);
        sqrt.setForeground(Color.white);
        f.add(sqrt);
        factorial=new Button("x!");
        factorial.setBounds(310,120,50,50);
        factorial.setFont(font_button);
        factorial.setBackground(Color.BLACK);
        factorial.setForeground(Color.white);
        f.add(factorial);
        power=new Button("^");
        power.setBounds(310,180,50,50);
        power.setFont(font_button);
        power.setBackground(Color.BLACK);
        power.setForeground(Color.white);
        f.add(power);
        percentage=new Button("%");
        percentage.setBounds(310,240,50,50);
        percentage.setFont(font_button);
        percentage.setBackground(Color.BLACK);
        percentage.setForeground(Color.white);
        f.add(percentage);
        delete=new Button("DEL");
        delete.setBounds(240,420,50,50);
        delete.setFont(font_button);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.white);
        f.add(delete);
        ans= new Button("ANS");
        ans.setBounds(310,360,50,50);
        ans.setFont(font_button);
        ans.setBackground(Color.BLACK);
        ans.setForeground(Color.white);
        f.add(ans);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        num_0.addActionListener(this);
        num_1.addActionListener(this);
        num_2.addActionListener(this);
        num_3.addActionListener(this);
        num_4.addActionListener(this);
        num_5.addActionListener(this);
        num_6.addActionListener(this);
        num_7.addActionListener(this);
        num_8.addActionListener(this);
        num_9.addActionListener(this);
        decimal.addActionListener(this);
        calc_equal.addActionListener(this);
        sqrt.addActionListener(this);
        ac.addActionListener(this);
        factorial.addActionListener(this);
        power.addActionListener(this);
        delete.addActionListener(this);
        percentage.addActionListener(this);
        ans.addActionListener(this);
        pi.addActionListener(this);
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        f.setLayout(new FlowLayout());
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator c=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        
        
        if(e.getSource()==num_0){
            if("".equals(t1.getText())){
                t1.setText("0");
            }else if(calc_flag){
                t1.setText("0");
                calc_flag=false;
            }else{
                s1=t1.getText()+"0";
                t1.setText(s1);
            }
        }else if(e.getSource()==num_1){
            if("".equals(t1.getText())){
                t1.setText("1");
            }else if(calc_flag){
                t1.setText("1");
                calc_flag=false; 
            }else{
                s1=t1.getText()+"1";
                t1.setText(s1);
            }
        }else if(e.getSource()==num_2){
            if("".equals(t1.getText())){
                t1.setText("2");
            }else if(calc_flag){
                t1.setText("2");
                calc_flag=false;
            }else{
                s1=t1.getText()+"2";
                t1.setText(s1);
            }
        }else if(e.getSource()==num_3){
            if("".equals(t1.getText())){
                t1.setText("3");
            }else if(calc_flag){
                t1.setText("3");
                calc_flag=false;
            }else{
                s1=t1.getText()+"3";
                t1.setText(s1);
            }
        }else if(e.getSource()==num_4){
            if("".equals(t1.getText())){
                t1.setText("4");
            }else if(calc_flag){
                t1.setText("4");
                calc_flag=false;
            }else{
                s1=t1.getText()+"4";
                t1.setText(s1);
            }
        }else if(e.getSource()==num_5){
            if("".equals(t1.getText())){
                t1.setText("5");
            }else if(calc_flag){
                t1.setText("5");
                calc_flag=false;
            }else{
                s1=t1.getText()+"5";
                t1.setText(s1);
            }
        }else if(e.getSource()==num_6){
            if("".equals(t1.getText())){
                t1.setText("6");
            }else if(calc_flag){
                t1.setText("6");
                calc_flag=false;
            }else{
                s1=t1.getText()+"6";
                t1.setText(s1);
            }
        }else if(e.getSource()==num_7){
            if("".equals(t1.getText())){
                t1.setText("7");
            }else if(calc_flag){
                t1.setText("7");
                calc_flag=false;
            }else{
                s1=t1.getText()+"7";
                t1.setText(s1);
            }
        }else if(e.getSource()==num_8){
            if("".equals(t1.getText())){
                t1.setText("8");
            }else if(calc_flag){
                t1.setText("8");
                calc_flag=false;
            }else{
                s1=t1.getText()+"8";
                t1.setText(s1);
            }
        }else if(e.getSource()==num_9){
            if("".equals(t1.getText())){
                t1.setText("9");
            }else if(calc_flag){
                t1.setText("9");
                calc_flag=false;
            }else{
                s1=t1.getText()+"9";
                t1.setText(s1);
            }
        }else if(e.getSource()==decimal){
            if("".equals(t1.getText())){
                t1.setText(".");
            }else if(calc_flag){
                t1.setText(".");
                calc_flag=false;
            }else{
                s1=t1.getText()+".";
                t1.setText(s1);
            }
        }
        if(e.getSource()==b1){
            if(flag){
            }else if(ans_flag){
                flag=true;
            }else{
                flag=true;
                temp=t1.getText();
                a=Double.parseDouble(temp);
                t1.setText("");
            }
            op=1;
            
        }else if(e.getSource()==b2){
            if(flag){
            }else if(ans_flag){
                flag=true;
            }else{
                flag=true;
                temp=t1.getText();
                a=Double.parseDouble(temp);
                t1.setText("");
            }
            op=2;
        }else if(e.getSource()==b3){
            if(flag){
            }else if(ans_flag){
                flag=true;
            }else{
                flag=true;
                temp=t1.getText();
                a=Double.parseDouble(temp);
                t1.setText("");
            }
            op=3;
        }else if(e.getSource()==b4){
            if(flag){
            }else if(ans_flag){
                flag=true;
            }else{
                flag=true;
                temp=t1.getText();
                a=Double.parseDouble(temp);
            }
            op=4;
        }else if(e.getSource()==sqrt){
            if(flag){
            }else{
                flag=true;
            }
            op=5;
        }else if(e.getSource()==factorial){
            if(flag){
            }else{
                flag=true;
                temp=t1.getText();
                a=Integer.parseInt(temp);
            }
            op=6;
        }else if(e.getSource()==power){
            if(flag){
            }else if(ans_flag){
                flag=true;
            }else{
                flag=true;
                temp=t1.getText();
                a=Double.parseDouble(temp);
                t1.setText("");
            }
            op=7;
        }else if(e.getSource()==percentage){
            if(flag){
            }else if(ans_flag){
                flag=true;
            }else{
                flag=true;
                temp=t1.getText();
                a=Double.parseDouble(temp);
            }
            op=8;
        }else if(e.getSource()==ans){
            ans_flag=true;
            a=result;
            //calc_flag=false;
            //t1.setText("");
        }else if(e.getSource()==pi){
            if("".equals(t1.getText())){
            }else if(calc_flag){
                calc_flag=false;
                t1.setText("");
            }else{
                temp=t1.getText();
                a=Double.parseDouble(temp);
                t1.setText("");
            }
            flag=true;
            op=9;
        }
        if(e.getSource()==calc_equal){
            if("".equals(t1.getText())){
            }else{
                temp=t1.getText();
                b=Double.parseDouble(temp);
            }
            s1="";
            calc_flag=true;
            if(flag){
                switch (op) {
                    case 1:
                        result=a+b;
                        s1=s1+result;
                        flag=false;
                        t1.setText(s1);
                        break;
                    case 2:
                        result=a-b;
                        s1=s1+result;
                        flag=false;
                        t1.setText(s1);
                        break;
                    case 3:
                        result=a*b;
                        s1=s1+result;
                        flag=false;
                        t1.setText(s1);
                        break;
                    case 4:
                        result=a/b;
                        s1=s1+result;
                        flag=false;
                        t1.setText(s1);
                        break;
                    case 5:
                        if(ans_flag){
                            result=Math.sqrt(a);
                            s1=s1+result;
                            flag=false;
                            t1.setText(s1);
                        }else{
                            result=Math.sqrt(b);
                            s1=s1+result;
                            flag=false;
                            t1.setText(s1);
                        }
                        break;
                    case 6:
                        result=1;
                        for(int i=1;i<=a;i++){
                            result=result*i;                     
                        }
                        s1=s1+result;
                        flag=false;
                        t1.setText(s1);
                        break;
                    case 7:
                        result=1;
                        for(int i=1;i<=b;i++){
                            result=result*a;
                        }
                        s1=s1+result;
                        flag=false;
                        t1.setText(s1);
                        break;
                    case 8:
                        result=a/100;
                        s1=s1+result;
                        flag=false;
                        t1.setText(s1);
                        break;
                    case 9:
                        if(a==0.0 && b==0.0){
                            s1=s1+pi_value;
                            flag=false;
                            t1.setText(s1);
                        }else if(b==0.0){
                            result=a*pi_value;
                            s1=s1+result;
                            flag=false;
                            t1.setText(s1);
                        }else{
                            result=b*pi_value;
                            s1=s1+result;
                            flag=false;
                            t1.setText(s1);
                        }
                        break;
                    default:
                        break;
                }
            }else{
                result=b;
                s1=t1.getText();
                t1.setText(s1);
            }
            ans_flag=false;
        }
        if(e.getSource()==ac){
            t1.setText("");
            flag=false;
            calc_flag=false;
            ans_flag=false;
            result=0.0;
            a=0.0;
            b=0.0;
            temp="";
            temp2="";
        }
        if(e.getSource()==delete){
            if(calc_flag){
                
            }else{
                temp2=t1.getText();
                temp2=temp2.substring(0,temp2.length()-1);
                t1.setText(temp2);
            }
        }
    }
}
