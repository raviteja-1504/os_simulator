package simulation;
import java.util.*;
import simulation.Graph;
import simulation.clook;
import simulation.cpufcfs;
import simulation.cscan;
import simulation.fcfs;
import simulation.fifo;
import simulation.look;
import simulation.lru;
import simulation.optimal;
import simulation.pageconvert;
import simulation.priority;
import simulation.random;
import simulation.roundrobin;
import simulation.scan;
import simulation.secondchance;
import simulation.sjf;
import simulation.sjfnonpreempt;
import simulation.sstf;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
public class gui1
extends JFrame {
    private JPanel contentPane;
    JPanel panelmenu;
    JPanel panelpagerep;
    JPanel paneldisc;
    JPanel panelcpusched;
    public JTextField textField;
    public JTextField inputarray;
    public JTextField textField_2;
    String val;
    String h;
    int n;
    int[] h1;
    String arr;
    String burst;
    String prio;
    public double ans;
    private JTextField textField_1;
    private JTextField textField_3;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                try {
                    gui1 frame = new gui1();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public gui1() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 670, 451);
        this.contentPane = new JPanel();
        contentPane.setForeground(new Color(0, 0, 0));
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(new CardLayout(0, 0));
        final JPanel panelpagerep = new JPanel();
        
        panelpagerep.setBackground(Color.BLUE);
        this.contentPane.add((Component)panelpagerep, "name_777864128493815");
        panelpagerep.setLayout(null);
        panelpagerep.setVisible(false);
        final JPanel paneldisc = new JPanel();
        
        paneldisc.setBackground(Color.blue);
        this.contentPane.add((Component)paneldisc, "name_777868681237060");
        paneldisc.setLayout(null);
        paneldisc.setVisible(false);
        final JPanel panelcpusched = new JPanel();
        //panelcpusched.setBackground(new Color(245, 222, 179));
        panelcpusched.setBackground(Color.blue);
        this.contentPane.add((Component)panelcpusched, "name_777888057353116");
        panelcpusched.setLayout(null);
        panelcpusched.setVisible(false);
        
        final JPanel panelmenu = new JPanel();
       //panelmenu.setBackground(new Color(0, 0, 205));
        panelmenu.setBackground(Color.black);  
        this.contentPane.add((Component)panelmenu, "name_777858054128357");
        panelmenu.setLayout(null);
        panelmenu.setVisible(true);
        JButton btnPagereplacement = new JButton("Page replacement");
        //btnPagereplacement.setBackground(new Color(240, 230, 140));
        btnPagereplacement.setBackground(Color.RED);
        btnPagereplacement.setForeground(new Color(255, 0, 255));
        btnPagereplacement.setFont(new Font("Comic Sans MS", 3, 17));
        btnPagereplacement.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                panelpagerep.setVisible(true);
                panelmenu.setVisible(false);
            }
        });
        btnPagereplacement.setBounds(68, 25, 227, 138);
        panelmenu.add(btnPagereplacement);
        JButton btnDiscscheduling = new JButton("Disc Scheduling");
        btnDiscscheduling.setForeground(new Color(255, 0, 255));
       // btnDiscscheduling.setBackground(new Color(240, 230, 140));
        btnDiscscheduling.setBackground(Color.green);
        btnDiscscheduling.setFont(new Font("Comic Sans MS", 3, 17));
        btnDiscscheduling.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                paneldisc.setVisible(true);
                panelmenu.setVisible(false);
            
            }
        });
        btnDiscscheduling.setBounds(351, 25, 238, 138);
        panelmenu.add(btnDiscscheduling);
        JButton btnNewButton = new JButton("Cpu  Scheduling");
        //btnNewButton.setBackground(new Color(240, 230, 140));
        btnNewButton.setBackground(Color.CYAN);
        btnNewButton.setForeground(new Color(255, 0, 255));
        btnNewButton.setFont(new Font("Comic Sans MS", 3, 17));
        btnNewButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                panelmenu.setVisible(false);
                panelcpusched.setVisible(true);
            }
        });
		btnNewButton.setBounds(68, 233, 227, 138);
        panelmenu.add(btnNewButton);
        JButton btnNewButton_1 = new JButton("Dinning Philosopher ");
        btnNewButton_1.setForeground(new Color(255, 0, 255));
        btnNewButton_1.setFont(new Font("Comic Sans MS", 3, 17));
       // btnNewButton_1.setBackground(new Color(240, 230, 140));
        btnNewButton_1.setBackground(Color.YELLOW);
        btnNewButton_1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
          
            	App.main(new String[0]);
            	
            }
        });
        btnNewButton_1.setBounds(351, 233, 238, 138);
        panelmenu.add(btnNewButton_1);
        JLabel lblNewLabel_3 = new JLabel("OS  Simulator");
        lblNewLabel_3.setFont(new Font("Times New Roman", 3, 25));
        //lblNewLabel_3.setForeground(new Color(0, 255, 0));
        lblNewLabel_3.setForeground(Color.white);
        lblNewLabel_3.setBounds(206, 184, 238, 35);
        panelmenu.add(lblNewLabel_3);
        JButton btnTest = new JButton("Back");
        btnTest.setBackground(Color.MAGENTA);
        btnTest.setFont(new Font("Comic Sans MS", 1, 14));
        btnTest.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                gui1.this.textField_1.setText("");
                gui1.this.textField_3.setText("");
               // gui1.this.textField_4.setText("");
                panelpagerep.setVisible(false);
                panelmenu.setVisible(true);
            }
        });
        btnTest.setBounds(33, 340, 89, 23);
        panelpagerep.add(btnTest);
        JLabel lblPageReplacement = new JLabel("Page Replacement");
        lblPageReplacement.setForeground(Color.ORANGE);
        lblPageReplacement.setFont(new Font("Times New Roman", 3, 24));
        lblPageReplacement.setBounds(212, 21, 246, 23);
        panelpagerep.add(lblPageReplacement);
        JButton btnFifo = new JButton("F.I.F.O.");
        btnFifo.setBackground(Color.YELLOW);
        btnFifo.setFont(new Font("Times New Roman", 1, 12));
       /* btnFifo.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String v = "";
                String Val = gui1.this.textField_1.getText();
                pageconvert z = new pageconvert(Val);
                int[] L = z.method1();
                int h = Integer.parseInt(gui1.this.textField_3.getText());
                fifo a1 = new fifo(h, L);
                int r = a1.method();
                v = String.valueOf(v) + r;
                gui1.this.textField_4.setText(v);
            }
        });*/
        btnFifo.setBounds(33, 60, 142, 23);
        panelpagerep.add(btnFifo);
        JButton btnLru = new JButton("L.R.U.");
        btnLru.setFont(new Font("Times New Roman", 1, 12));
        btnLru.setBackground(Color.YELLOW);
        /*btnLru.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String v = "";
                String Val = gui1.this.textField_1.getText();
                pageconvert z = new pageconvert(Val);
                int[] L = z.method1();
                int h = Integer.parseInt(gui1.this.textField_3.getText());
                lru a1 = new lru(h, L);
                int r = a1.method();
                v = String.valueOf(v) + r;
                gui1.this.textField_4.setText(v);
            }
        });*/
        btnLru.setBounds(33, 118, 142, 23);
        panelpagerep.add(btnLru);
        JButton btnOptimal = new JButton("Optimal");
        btnOptimal.setBackground(Color.YELLOW);
        btnOptimal.setFont(new Font("Times New Roman", 1, 12));
        /*btnOptimal.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String v = "";
                String Val = gui1.this.textField_1.getText();
                pageconvert z = new pageconvert(Val);
                int[] L = z.method1();
                int h = Integer.parseInt(gui1.this.textField_3.getText());
                optimal a1 = new optimal(h, L);
                int r = a1.method();
                v = String.valueOf(v) + r;
                gui1.this.textField_4.setText(v);
            }
        });*/
        final  JLabel lblOutput_1 = new JLabel("");
        lblOutput_1.setForeground(Color.YELLOW);
        lblOutput_1.setBackground(Color.WHITE);
        lblOutput_1.setBounds(197, 64, 46, 14);
        panelpagerep.add(lblOutput_1);
        
        final JLabel lblLru = new JLabel("");
        lblLru.setForeground(Color.YELLOW);
        lblLru.setBackground(Color.WHITE);
        lblLru.setBounds(197, 122, 46, 14);
        panelpagerep.add(lblLru);
        
        final JLabel lblOptimal = new JLabel("");
        lblOptimal.setForeground(Color.YELLOW);
        lblOptimal.setBackground(Color.WHITE);
        lblOptimal.setBounds(197, 179, 46, 14);
        panelpagerep.add(lblOptimal);
        
        final JLabel lblSc = new JLabel("");
        lblSc.setForeground(Color.YELLOW);
        lblSc.setBackground(Color.WHITE);
        lblSc.setBounds(197, 236, 46, 14);
        panelpagerep.add(lblSc);
        
        JLabel hai = new JLabel("");
        hai.setBackground(Color.WHITE);
        hai.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        hai.setForeground(Color.YELLOW);
        hai.setBounds(379, 288, 184, 33);
        panelpagerep.add(hai);
        
        /////////////////////////////////
        JButton btnSolve=new JButton("Solve");
		btnSolve.setBounds(369, 194, 134, 33);
        panelpagerep.add(btnSolve);//
       
        btnSolve.setFont(new Font("Times New Roman", 1, 12));
        btnSolve.setBackground(Color.YELLOW);
        btnSolve.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String v = "";
                
                String Val = gui1.this.textField_1.getText();
                pageconvert z = new pageconvert(Val);
                int[] L = z.method1();
                int h = Integer.parseInt(gui1.this.textField_3.getText());
                fifo a1 = new fifo(h, L);
                int [] p=new int[4];
                int r0 = a1.method();
                v = String.valueOf(v) + r0;
                p[0]=Integer.parseInt(v);
                lblOutput_1 .setText(v);
                ////////////////////////////////////
                 v = "";
                Val = gui1.this.textField_1.getText();
                 z = new pageconvert(Val);
                 L = z.method1();
                h = Integer.parseInt(gui1.this.textField_3.getText());
                lru a2 = new lru(h, L);
                 int r1 = a2.method();
                v = String.valueOf(v) + r1;
               p[1]=Integer.parseInt(v);
                lblLru.setText(v);
                ///////////////////////////////////
                 v = "";
                 Val = gui1.this.textField_1.getText();
                 z = new pageconvert(Val);
                 L = z.method1();
                 h = Integer.parseInt(gui1.this.textField_3.getText());
                optimal a3 = new optimal(h, L);
                 int r2 = a3.method();
                v = String.valueOf(v) + r2;
                p[2]=Integer.parseInt(v);
                lblOptimal.setText(v);
                /////////////////////////////////////
                 v = "";
                 Val = gui1.this.textField_1.getText();
                z = new pageconvert(Val);
                 L = z.method1();
                 h = Integer.parseInt(gui1.this.textField_3.getText());
                secondchance a4 = new secondchance(h, L);
                 int r3 = a4.method();
                v = String.valueOf(v) + r3;
                p[3]=Integer.parseInt(v);
                lblSc.setText(v);
                ///////////////////////////////////
                int min=10000;int ind=0;
                for(int i=0;i<4;i++){
                	if(min>p[i]){
                		min=p[i];
                		
                		ind=i;
                	}
                }
                if(ind==0){
                	hai.setText("FIFO");
                }
                if(ind==1){
                	hai.setText("LRU");
                }
                if(ind==2){
                	hai.setText("OPTIMAL");
                }
                if(ind==3){
                	hai.setText("SECOND CHANCE");
                }
            }
        });
        ///////////////////////////
        btnOptimal.setBounds(33, 175, 142, 23);
        panelpagerep.add(btnOptimal);
        JButton btnSecondChance = new JButton("Second Chance");
        btnSecondChance.setFont(new Font("Times New Roman", 1, 12));
        btnSecondChance.setBackground(Color.YELLOW);
       /* btnSecondChance.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String v = "";
                String Val = gui1.this.textField_1.getText();
                pageconvert z = new pageconvert(Val);
                int[] L = z.method1();
                int h = Integer.parseInt(gui1.this.textField_3.getText());
                secondchance a1 = new secondchance(h, L);
                int r = a1.method();
                v = String.valueOf(v) + r;
                gui1.this.textField_4.setText(v);
            }
        });*/
        btnSecondChance.setBounds(33, 232, 142, 23);
        panelpagerep.add(btnSecondChance);
        this.textField_1 = new JTextField();
        this.textField_1.setBounds(369, 73, 194, 20);
        panelpagerep.add(this.textField_1);
        this.textField_1.setColumns(10);
        JLabel lblInput_1 = new JLabel("Input");
        lblInput_1.setForeground(Color.YELLOW);
        lblInput_1.setFont(new Font("Times New Roman", 3, 15));
        lblInput_1.setBounds(304, 66, 52, 33);
        panelpagerep.add(lblInput_1);
        this.textField_3 = new JTextField();
        this.textField_3.setBounds(369, 132, 46, 20);
        panelpagerep.add(this.textField_3);
        this.textField_3.setColumns(10);
        JLabel lblNewLabel = new JLabel("No of Frames");
        lblNewLabel.setForeground(Color.YELLOW);
        lblNewLabel.setFont(new Font("Times New Roman", 3, 15));
        lblNewLabel.setBounds(266, 134, 93, 18);
        panelpagerep.add(lblNewLabel);
        
        JLabel Best = new JLabel("    Best");
        Best.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        Best.setForeground(Color.YELLOW);
        Best.setBounds(282, 288, 74, 33);
        panelpagerep.add(Best);
        
       
        JLabel out = new JLabel("");
        out.setForeground(Color.YELLOW);
        out.setBackground(Color.WHITE);
        out.setBounds(159, 52, 64, 19);
        paneldisc.add(out);
        JLabel out1 = new JLabel("");
        out1.setForeground(Color.YELLOW);
        out1.setBounds(159, 90, 64, 19);
        paneldisc.add(out1);
        
        JLabel out2 = new JLabel("");
        out2.setForeground(Color.YELLOW);
        out2.setBounds(159, 131, 75, 19);
        paneldisc.add(out2);
        
        JLabel out3 = new JLabel("");
        out3.setForeground(Color.YELLOW);
        out3.setBounds(159, 176, 64, 19);
        paneldisc.add(out3);
        
        JLabel out4 = new JLabel("");
        out4.setForeground(Color.YELLOW);
        out4.setBounds(159, 224, 75, 19);
        paneldisc.add(out4);
        
        
        
        JLabel out5 = new JLabel("");
        out5.setForeground(Color.YELLOW);
        out5.setBounds(159, 276, 75, 19);
        paneldisc.add(out5);
      
        JLabel high = new JLabel("");
        high.setForeground(Color.YELLOW);
        high.setBounds(433, 296, 96, 42);
        paneldisc.add(high);
        int [] z=new int[6];
        panelpagerep.setVisible(false);
        JButton btnFcfs_1 = new JButton("FCFS");
        btnFcfs_1.setFont(new Font("Times New Roman", 1, 12));
        btnFcfs_1.setBackground(Color.yellow);
        btnFcfs_1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String S = "";
                String v = "";
                gui1.this.val = gui1.this.inputarray.getText();
                String[] ele = gui1.this.val.split("\\s+");
                gui1.this.n = ele.length;
                gui1.this.h1 = new int[gui1.this.n];
                int i = 0;
                while (i < gui1.this.n) {
                    gui1.this.h1[i] = Integer.parseInt(ele[i].trim());
                    ++i;
                }
                int h = Integer.parseInt(gui1.this.textField.getText());
                fcfs a1 = new fcfs(h, gui1.this.h1);
                int[] r = a1.method();
                int y = a1.method3();
                String m0="";
                v = String.valueOf(v) + y;
                m0=m0+""+v;
                Graph G = new Graph(r, r.length);
                Graph.test(r, r.length);
                int i2 = 0;
                while (i2 < r.length) {
                    S = String.valueOf(S) + " " + r[i2];
                    ++i2;
                }
                z[0]=Integer.parseInt(m0);
                gui1.this.textField_2.setText(S);
                out.setText(m0);
            }
        });
        btnFcfs_1.setBounds(36, 46, 89, 23);
        paneldisc.add(btnFcfs_1);
        JButton button_1 = new JButton("SSTF");
        button_1.setFont(new Font("Times New Roman", 1, 12));
        button_1.setBackground(Color.yellow);
        button_1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String S = "";
                String v = "";
                gui1.this.val = gui1.this.inputarray.getText();
                String[] ele = gui1.this.val.split("\\s+");
                gui1.this.n = ele.length;
                gui1.this.h1 = new int[gui1.this.n];
                int i = 0;
                while (i < gui1.this.n) {
                    gui1.this.h1[i] = Integer.parseInt(ele[i].trim());
                    ++i;
                }
                int h = Integer.parseInt(gui1.this.textField.getText());
                sstf a1 = new sstf(h, gui1.this.h1);
                int[] r = a1.method();
                int y = a1.method3();
                String m1="";
                v = String.valueOf(v) + y;
                m1=m1+""+v;
                Graph G = new Graph(r, r.length);
                Graph.test(r, r.length);
                int i2 = 0;
                while (i2 < r.length) {
                    S = String.valueOf(S) + " " + r[i2];
                    ++i2;
                }
                z[1]=Integer.parseInt(m1);
                gui1.this.textField_2.setText(S);
                out1.setText(m1);
            }
        });
        button_1.setBounds(36, 86, 89, 23);
        paneldisc.add(button_1);
        JButton btnScan = new JButton("SCAN");
        btnScan.setFont(new Font("Times New Roman", 1, 12));
        btnScan.setBackground(Color.yellow);
        btnScan.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String S = "";
                String v = "";
                gui1.this.val = gui1.this.inputarray.getText();
                String[] ele = gui1.this.val.split("\\s+");
                gui1.this.n = ele.length;
                gui1.this.h1 = new int[gui1.this.n];
                int i = 0;
                while (i < gui1.this.n) {
                    gui1.this.h1[i] = Integer.parseInt(ele[i].trim());
                    ++i;
                }
                int h = Integer.parseInt(gui1.this.textField.getText());
                scan a1 = new scan(h, gui1.this.h1);
                int[] r = a1.method();
                String m2="";
                int y = a1.method3();
                v = String.valueOf(v) + y;
                m2=m2+""+v;
                Graph G = new Graph(r, r.length);
                Graph.test(r, r.length);
                int i2 = 0;
                while (i2 < r.length) {
                    S = String.valueOf(S) + " " + r[i2];
                    ++i2;
                }
                z[2]=Integer.parseInt(m2);
                gui1.this.textField_2.setText(S);
                out2.setText(m2);
            }
        });
        btnScan.setBounds(36, 127, 89, 23);
        paneldisc.add(btnScan);
        JButton btnCscan = new JButton("C-SCAN");
        btnCscan.setFont(new Font("Times New Roman", 1, 12));
        btnCscan.setBackground(Color.yellow);
        btnCscan.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String S = "";
                String v = "";
                gui1.this.val = gui1.this.inputarray.getText();
                String[] ele = gui1.this.val.split("\\s+");
                gui1.this.n = ele.length;
                gui1.this.h1 = new int[gui1.this.n];
                int i = 0;
                while (i < gui1.this.n) {
                    gui1.this.h1[i] = Integer.parseInt(ele[i].trim());
                    ++i;
                }
                int h = Integer.parseInt(gui1.this.textField.getText());
                cscan a1 = new cscan(h, gui1.this.h1);
                int[] r = a1.method();
                int y = a1.method3();
                String m3="";
                v = String.valueOf(v) + y;
                m3=m3+""+v;
                Graph G = new Graph(r, r.length);
                Graph.test(r, r.length);
                int i2 = 0;
                while (i2 < r.length) {
                    S = String.valueOf(S) + " " + r[i2];
                    ++i2;
                }
                z[3]=Integer.parseInt(m3);
                gui1.this.textField_2.setText(S);
                out3.setText(m3);
            }
        });
        btnCscan.setBounds(36, 172, 89, 23);
        paneldisc.add(btnCscan);
        JButton btnClook = new JButton("C-LOOK");
        btnClook.setFont(new Font("Times New Roman", 1, 12));
        btnClook.setBackground(Color.yellow);
        btnClook.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String S = "";
                String v = "";
                gui1.this.val = gui1.this.inputarray.getText();
                String[] ele = gui1.this.val.split("\\s+");
                gui1.this.n = ele.length;
                gui1.this.h1 = new int[gui1.this.n];
                int i = 0;
                while (i < gui1.this.n) {
                    gui1.this.h1[i] = Integer.parseInt(ele[i].trim());
                    ++i;
                }
                int h = Integer.parseInt(gui1.this.textField.getText());
                clook a1 = new clook(h, gui1.this.h1);
                int[] r = a1.method();
                String m5="";
                int y = a1.method3();
                v = String.valueOf(v) + y;
                m5=m5+""+v;
                Graph G = new Graph(r, r.length);
                Graph.test(r, r.length);
                int i2 = 0;
                while (i2 < r.length) {
                    S = String.valueOf(S) + " " + r[i2];
                    ++i2;
                }
                z[5]=Integer.parseInt(m5);
                gui1.this.textField_2.setText(S);
                out5.setText(m5);
                
                
                /////////////////////////////////////
                int min=10000;int ind=0;
                for( i=0;i<6;i++){
                	if(min>z[i]){
                		min=z[i];
                		
                		ind=i;
                	}
                }
                if(ind==0){
                	high.setText("FCFS");
                }
                if(ind==1){
                	high.setText("SSTF");
                }
                if(ind==2){
                	high.setText("SCAN");
                }
                if(ind==3){
                	high.setText("CSCAN");
                }
                if(ind==4){
                	high.setText("LOOK");
                }
                if(ind==5){
                	high.setText("CLOOK");
                }


          
                
                
                
            }
        });
        btnClook.setBounds(36, 272, 89, 23);
        paneldisc.add(btnClook);
        this.textField = new JTextField();
        this.textField.setBounds(422, 128, 86, 20);
        paneldisc.add(this.textField);
        this.textField.setColumns(10);
        JLabel lblHead = new JLabel("Head");
        //lblHead.setForeground(new Color(255, 165, 0));
        lblHead.setForeground(Color.orange);
        lblHead.setFont(new Font("Times New Roman", 3, 15));
        lblHead.setBounds(348, 130, 46, 14);
        paneldisc.add(lblHead);
        this.inputarray = new JTextField();
        this.inputarray.setBounds(422, 188, 154, 20);
        paneldisc.add(this.inputarray);
        this.inputarray.setColumns(10);
        JLabel lblInput = new JLabel("Input");
        //lblInput.setForeground(new Color(218, 165, 32));
        lblInput.setForeground(Color.ORANGE);
        lblInput.setFont(new Font("Times New Roman", 3, 15));
        lblInput.setBounds(348, 190, 46, 14);
        paneldisc.add(lblInput);
        this.textField_2 = new JTextField();
        this.textField_2.setBounds(422, 235, 154, 20);
        paneldisc.add(this.textField_2);
        this.textField_2.setColumns(10);
        JLabel lblOutput = new JLabel("Output");
        //lblOutput.setForeground(new Color(218, 165, 32));
        lblOutput.setForeground(Color.orange);
        lblOutput.setFont(new Font("Times New Roman", 3, 15));
        lblOutput.setBounds(348, 237, 46, 14);
        paneldisc.add(lblOutput);
        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.MAGENTA);
        btnBack.setFont(new Font("Comic Sans MS", 1, 14));
        btnBack.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                gui1.this.textField.setText("");
                gui1.this.inputarray.setText("");
                gui1.this.textField_2.setText("");
                paneldisc.setVisible(false);
                panelmenu.setVisible(true);
            }
        });
        btnBack.setBounds(36, 368, 89, 23);
        paneldisc.add(btnBack);
        JButton btnLook = new JButton("LOOK");
        btnLook.setFont(new Font("Times New Roman", 1, 12));
        btnLook.setBackground(Color.yellow);
        btnLook.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String S = "";
                String v = "";
                gui1.this.val = gui1.this.inputarray.getText();
                String[] ele = gui1.this.val.split("\\s+");
                gui1.this.n = ele.length;
                gui1.this.h1 = new int[gui1.this.n];
                int i = 0;
                while (i < gui1.this.n) {
                    gui1.this.h1[i] = Integer.parseInt(ele[i].trim());
                    ++i;
                }
                int h = Integer.parseInt(gui1.this.textField.getText());
                look a1 = new look(h, gui1.this.h1);
                int[] r = a1.method();
                String m4="";
                int y = a1.method3();
                v = String.valueOf(v) + y;
                m4=m4+""+v;
                Graph G = new Graph(r, r.length);
                Graph.test(r, r.length);
                int i2 = 0;
                while (i2 < r.length) {
                    S = String.valueOf(S) + " " + r[i2];
                    ++i2;
                }
                z[4]=Integer.parseInt(m4);
                gui1.this.textField_2.setText(S);
                out4.setText(m4);
                
                ///////////////////////////////////////////////
                 }
        });
        btnLook.setBounds(36, 220, 89, 23);
        paneldisc.add(btnLook);
        JLabel lblDiskScheduler = new JLabel("Disk Scheduler");
        lblDiskScheduler.setForeground(Color.RED);
        lblDiskScheduler.setFont(new Font("Times New Roman", 3, 24));
        lblDiskScheduler.setBounds(289, 11, 231, 65);
        paneldisc.add(lblDiskScheduler);
        
        JLabel lblThm = new JLabel("THM");
        lblThm.setForeground(Color.RED);
        lblThm.setBackground(Color.YELLOW);
        lblThm.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        lblThm.setBounds(162, 11, 46, 30);
        paneldisc.add(lblThm);
        
        JLabel lblBest = new JLabel("Best");
        lblBest.setForeground(Color.YELLOW);
        lblBest.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblBest.setBounds(348, 309, 46, 14);
        paneldisc.add(lblBest);
        
        
        
         
        
        paneldisc.setVisible(false);
        JButton btnTestcpu = new JButton("Back");
        btnTestcpu.setBackground(Color.magenta);
        btnTestcpu.setFont(new Font("Comic Sans MS", 1, 15));
        btnTestcpu.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                panelcpusched.setVisible(false);
                panelmenu.setVisible(true);
            }
        });
        btnTestcpu.setBounds(52, 314, 78, 23);
        panelcpusched.add(btnTestcpu);
        JButton btnFcfs = new JButton("Fcfs");
        
        btnFcfs.setFont(new Font("Times New Roman", 1, 12));
        btnFcfs.setBackground(Color.yellow);
        btnFcfs.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                random x = new random();
                x.generate();
                gui1.this.arr = "";
                int i = 0;
                while (i < x.n) {
                    gui1.this.arr = String.valueOf(gui1.this.arr) + x.a[i] + " ";
                    ++i;
                }
                gui1.this.textField_5.setText(gui1.this.arr);
                gui1.this.burst = "";
                i = 0;
                while (i < x.n) {
                    gui1.this.burst = String.valueOf(gui1.this.burst) + x.b[i] + " ";
                    ++i;
                }
                gui1.this.textField_6.setText(gui1.this.burst);
                gui1.this.textField_7.setText("");
                cpufcfs y = new cpufcfs(x.n, x.b);
                gui1.this.ans = y.averageWaitingTimeCalc();
                gui1.this.textField_8.setText(Double.toString(gui1.this.ans));
            }
        });
        btnFcfs.setBounds(32, 35, 137, 23);
        panelcpusched.add(btnFcfs);
        JButton btnSjfpreemptive = new JButton("SJF Preemptive");
        btnSjfpreemptive.setFont(new Font("Times New Roman", 1, 12));
        
        btnSjfpreemptive.setBackground(Color.yellow);
        btnSjfpreemptive.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                random x = new random();
                x.generate();
                gui1.this.arr = "";
                int i = 0;
                while (i < x.n) {
                    gui1.this.arr = String.valueOf(gui1.this.arr) + x.a[i] + " ";
                    ++i;
                }
                gui1.this.textField_5.setText(gui1.this.arr);
                gui1.this.burst = "";
                i = 0;
                while (i < x.n) {
                    gui1.this.burst = String.valueOf(gui1.this.burst) + x.b[i] + " ";
                    ++i;
                }
                gui1.this.textField_6.setText(gui1.this.burst);
                gui1.this.textField_7.setText("");
                sjf y = new sjf(x.n, x.a, x.b);
                y.averageWaitingTimeCalc();
                double ans2 = y.printWaitingTime();
                gui1.this.textField_8.setText(Double.toString(ans2));
            }
        });
        btnSjfpreemptive.setBounds(32, 181, 145, 23);
        panelcpusched.add(btnSjfpreemptive);
        JButton btnPriority = new JButton("Priority");
       
        btnPriority.setBackground(Color.yellow);
        btnPriority.setFont(new Font("Times New Roman", 1, 12));
        btnPriority.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                random xx = new random();
                xx.generate();
                gui1.this.arr = "";
                int i = 0;
                while (i < xx.n) {
                    gui1.this.arr = String.valueOf(gui1.this.arr) + xx.a[i] + " ";
                    ++i;
                }
                gui1.this.textField_5.setText(gui1.this.arr);
                gui1.this.burst = "";
                i = 0;
                while (i < xx.n) {
                    gui1.this.burst = String.valueOf(gui1.this.burst) + xx.b[i] + " ";
                    ++i;
                }
                gui1.this.textField_6.setText(gui1.this.burst);
                gui1.this.prio = "";
                i = 0;
                while (i < xx.n) {
                    gui1.this.prio = String.valueOf(gui1.this.prio) + xx.p[i] + " ";
                    ++i;
                }
                gui1.this.textField_7.setText(gui1.this.prio);
                priority y = new priority(xx.n, xx.p, xx.b);
                double ans3 = y.calcAverageWaitingTime();
                gui1.this.textField_8.setText(Double.toString(ans3));
            }
        });
        btnPriority.setBounds(32, 131, 145, 23);
        panelcpusched.add(btnPriority);
        JButton btnSjfnonpreemptive = new JButton("SJF NonPreemptive");
        btnSjfnonpreemptive.setFont(new Font("Times New Roman", 3, 13));
       
        btnSjfnonpreemptive.setBackground(Color.YELLOW);
        btnSjfnonpreemptive.setForeground(new Color(0, 0, 0));
        btnSjfnonpreemptive.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                random xx = new random();
                xx.generate();
                gui1.this.arr = "";
                int i = 0;
                while (i < xx.n) {
                    gui1.this.arr = String.valueOf(gui1.this.arr) + xx.a[i] + " ";
                    ++i;
                }
                gui1.this.textField_5.setText(gui1.this.arr);
                gui1.this.burst = "";
                i = 0;
                while (i < xx.n) {
                    gui1.this.burst = String.valueOf(gui1.this.burst) + xx.b[i] + " ";
                    ++i;
                }
                gui1.this.textField_6.setText(gui1.this.burst);
                gui1.this.textField_7.setText("");
                sjfnonpreempt y = new sjfnonpreempt(xx.n, xx.a, xx.b);
                y.averageWaitingTimeCalc();
                double ans2 = y.printWaitingTime();
                gui1.this.textField_8.setText(Double.toString(ans2));
            }
        });
        btnSjfnonpreemptive.setBounds(32, 240, 146, 23);
        panelcpusched.add(btnSjfnonpreemptive);
        JButton btnRoundrobin = new JButton("Round Robin");
      
        btnRoundrobin.setBackground(Color.yellow);
        btnRoundrobin.setFont(new Font("Times New Roman", 1, 12));
        btnRoundrobin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                random xx = new random();
                xx.generate();
                gui1.this.textField_5.setText("");
                gui1.this.burst = "";
                int i = 0;
                while (i < xx.n) {
                    gui1.this.burst = String.valueOf(gui1.this.burst) + xx.b[i] + " ";
                    ++i;
                }
                gui1.this.textField_6.setText(gui1.this.burst);
                gui1.this.textField_7.setText("");
                roundrobin y = new roundrobin(xx.n, xx.t, xx.b);
                double ans4 = y.calcAverageWaitingTime();
                gui1.this.textField_8.setText(Double.toString(ans4));
            }
        });
        btnRoundrobin.setBounds(32, 80, 145, 23);
        panelcpusched.add(btnRoundrobin);
        JLabel lblNewLabel_2 = new JLabel("Avg  Wait Time");
        //lblNewLabel_2.setForeground(new Color(128, 0, 128));
        lblNewLabel_2.setForeground(Color.orange);
        lblNewLabel_2.setFont(new Font("Times New Roman", 3, 14));
        lblNewLabel_2.setBounds(243, 160, 98, 14);
        panelcpusched.add(lblNewLabel_2);
        this.textField_5 = new JTextField();
        this.textField_5.setBounds(472, 107, 146, 20);
        panelcpusched.add(this.textField_5);
        this.textField_5.setColumns(10);
        this.textField_6 = new JTextField();
        this.textField_6.setColumns(10);
        this.textField_6.setBounds(472, 158, 146, 20);
        panelcpusched.add(this.textField_6);
        this.textField_7 = new JTextField();
        this.textField_7.setColumns(10);
        this.textField_7.setBounds(472, 221, 146, 20);
        panelcpusched.add(this.textField_7);
        JLabel lblArrivalTime = new JLabel("Arrival Times");
        //lblArrivalTime.setForeground(new Color(128, 0, 128));
        lblArrivalTime.setForeground(Color.orange);
        lblArrivalTime.setFont(new Font("Times New Roman", 3, 14));
        lblArrivalTime.setBounds(380, 109, 89, 14);
        panelcpusched.add(lblArrivalTime);
        JLabel lblBurstTimes = new JLabel("Burst Times");
        //lblBurstTimes.setForeground(new Color(128, 0, 128));
        lblBurstTimes.setForeground(Color.orange);
        lblBurstTimes.setFont(new Font("Times New Roman", 3, 14));
        lblBurstTimes.setBounds(380, 160, 91, 14);
        panelcpusched.add(lblBurstTimes);
        JLabel lblPriority = new JLabel("Priority");
        //lblPriority.setForeground(new Color(128, 0, 128));
        lblPriority.setForeground(Color.orange);
        lblPriority.setFont(new Font("Times New Roman", 3, 14));
        lblPriority.setBounds(404, 223, 44, 14);
        panelcpusched.add(lblPriority);
        this.textField_8 = new JTextField();
        this.textField_8.setBounds(240, 182, 101, 20);
        panelcpusched.add(this.textField_8);
        this.textField_8.setColumns(10);
        JLabel lblTimequantum = new JLabel("Time Quantum  =  4");
        lblTimequantum.setFont(new Font("Microsoft YaHei UI Light", 1, 11));
        lblTimequantum.setBounds(292, 289, 132, 20);
        lblTimequantum.setForeground(Color.orange);
        panelcpusched.add(lblTimequantum);
        JLabel lblCpuscheduling = new JLabel("CPU Scheduling");
        //lblCpuscheduling.setForeground(new Color(0, 0, 255));
        lblCpuscheduling.setForeground(Color.red);
        lblCpuscheduling.setFont(new Font("Times New Roman", 3, 24));
        lblCpuscheduling.setBounds(233, 11, 215, 30);
        panelcpusched.add(lblCpuscheduling);
        panelcpusched.setVisible(false);
    }
}