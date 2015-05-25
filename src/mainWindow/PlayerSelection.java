package mainWindow;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class PlayerSelection extends JPanel implements ActionListener{
	JLabel l1;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	JButton vermelho;
	JButton preto;
	JButton branco;
	JButton verde;
	JButton amarelo;
	JButton azul;
	
	JTextField input;
	
//	String[] Players = {"Player1","Player2","Player3",
//			            "Player4","Player5","Player6"};
//	Color[] pColors = {null,null,null,
//			           null,null,null};
	
	String[] Players;
	Color[] pColors;
	
	int qtd;
	int iter = 1;
	boolean qtdselection = false;
	boolean once = false;
	PlayerFrame parent;
	
	public PlayerSelection(PlayerFrame p){
		Dimension size;
		
		parent = p;
		
		l1 = new JLabel("Escolha a quantidade de jogadores:");
		this.add(l1);
		b1=new JButton("3");
		this.add(b1);
		b2=new JButton("4");
		this.add(b2);
		b3=new JButton("5");
		this.add(b3);
		b4=new JButton("6");
		this.add(b4);
		
		Insets in = this.getInsets();
		
		size = l1.getPreferredSize();
		l1.setBounds(90,5+in.top,size.width,size.height);
		size = b1.getPreferredSize();
		b1.setBounds(45+in.left,80+in.top,size.width,size.height); 
		size = b2.getPreferredSize(); 
		b2.setBounds(120+in.left,80+in.top,size.width,size.height); 
		size = b3.getPreferredSize(); 
		b3.setBounds(195+in.left,80+in.top,size.width,size.height);
		size = b4.getPreferredSize(); 
		b4.setBounds(270+in.left,80+in.top,size.width,size.height);
		this.setSize(this.getPreferredSize());
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(b1) && qtdselection == false){
			qtd = Integer.parseInt(b1.getText());
			qtdselection = true;
		}
		else if(e.getSource().equals(b2) && qtdselection == false){
			qtd = Integer.parseInt(b2.getText());
			qtdselection = true;
		}
		else if(e.getSource().equals(b3) && qtdselection == false){
			qtd = Integer.parseInt(b3.getText());
			qtdselection = true;
		}
		else if(e.getSource().equals(b4) && qtdselection == false){
			qtd = Integer.parseInt(b4.getText());
			qtdselection = true;
		}
		
		if(qtdselection == true && once == false){
			Dimension size;
			
			Players = new String[qtd];
			pColors = new Color[qtd];
			
			for(int i = 0; i < qtd; i++) {
				
				Players[i] = String.format("Player%d", i+1);
			}
			
			Insets in = this.getInsets();
			l1.setText("Jogador 1, informe seu nome e escolha sua cor.");
			
			size = l1.getPreferredSize();
			l1.setBounds(50,5+in.top,size.width,size.height);
			
			this.remove(b1);
			this.remove(b2);
			this.remove(b3);
			this.remove(b4);
			
			
			vermelho=new JButton();
			this.add(vermelho);
			preto=new JButton();
			this.add(preto);
			branco=new JButton();
			this.add(branco);
			verde=new JButton();
			this.add(verde);
			amarelo=new JButton();
			this.add(amarelo);
			azul=new JButton();
			this.add(azul);
			
			input = new JTextField();
			this.add(input);
			
			vermelho.setBorderPainted(false);
			preto.setBorderPainted(false);
			branco.setBorderPainted(false);
			verde.setBorderPainted(false);
			amarelo.setBorderPainted(false);
			azul.setBorderPainted(false);
			
			
			vermelho.setBackground(Color.RED);
			preto.setBackground(Color.BLACK);
			branco.setBackground(Color.WHITE);
			verde.setBackground(Color.GREEN);
			amarelo.setBackground(Color.YELLOW);
			azul.setBackground(Color.BLUE);
			
			vermelho.setOpaque(true);
			preto.setOpaque(true);
			branco.setOpaque(true);
			verde.setOpaque(true);
			amarelo.setOpaque(true);
			azul.setOpaque(true);
			
			vermelho.setBounds(65+in.left,81+in.top,25,25);  
			preto.setBounds(110+in.left,81+in.top,25,25); 
			branco.setBounds(155+in.left,81+in.top,25,25); 
			verde.setBounds(200+in.left,81+in.top,25,25);
			amarelo.setBounds(245+in.left,81+in.top,25,25);
			azul.setBounds(290+in.left,81+in.top,25,25);
			
			input.setBounds(100+in.left,36+in.top,200,30);
			
			vermelho.addActionListener(this);
			preto.addActionListener(this);
			branco.addActionListener(this);
			verde.addActionListener(this);
			amarelo.addActionListener(this);
			azul.addActionListener(this);
			
			this.repaint();
			once = true;
		}
		
		if(qtdselection == true && once == true){
			if(e.getSource().equals(vermelho)){
				iter++;
				l1.setText("Jogador "+iter+", informe seu nome e escolha sua cor.");
				if(input.getText() != ""){
					Players[iter-2] = input.getText();
					pColors[iter-2] = vermelho.getBackground();
					input.setText("");
				}
				this.remove(vermelho);
				this.repaint();
			}
			else if(e.getSource().equals(preto)){
				iter++;
				l1.setText("Jogador "+iter+", informe seu nome e escolha sua cor.");
				if(input.getText() != ""){
					Players[iter-2] = input.getText();
					pColors[iter-2] = preto.getBackground();
					input.setText("");
				}
				this.remove(preto);
				this.repaint();
			}
			else if(e.getSource().equals(branco)){
				iter++;
				l1.setText("Jogador "+iter+", informe seu nome e escolha sua cor.");
				if(input.getText() != ""){
					Players[iter-2] = input.getText();
					pColors[iter-2] = branco.getBackground();
					input.setText("");
				}
				this.remove(branco);
				this.repaint();
			}
			else if(e.getSource().equals(verde)){
				iter++;
				l1.setText("Jogador "+iter+", informe seu nome e escolha sua cor.");
				if(input.getText() != ""){
					Players[iter-2] = input.getText();
					pColors[iter-2] = verde.getBackground();
					input.setText("");
				}
				this.remove(verde);
				this.repaint();
			}
			else if(e.getSource().equals(amarelo)){
				iter++;
				l1.setText("Jogador "+iter+", informe seu nome e escolha sua cor.");
				if(input.getText() != ""){
					Players[iter-2] = input.getText();
					pColors[iter-2] = amarelo.getBackground();
					input.setText("");
				}
				this.remove(amarelo);
				this.repaint();
			}
			else if(e.getSource().equals(azul)){
				iter++;
				l1.setText("Jogador "+iter+", informe seu nome e escolha sua cor.");
				if(input.getText() != ""){
					Players[iter-2] = input.getText();
					pColors[iter-2] = azul.getBackground();
					input.setText("");
				}
				this.remove(azul);
				this.repaint();
			}
			
			if(iter > qtd){
				WarManager s = WarManager.getInstance();
				s.drawPlayers(Players, pColors);
				
				parent.dispose();
			}
		}
		
	}
}
