import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Game extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Game() {
		metaData meta = new metaData();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNoroeste = new JButton("NOROESTE");
		btnNoroeste.setForeground(Color.BLACK);
		btnNoroeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(btnNoroeste, meta.pick);
				
				//Desabilitar o botão
				btnNoroeste.setEnabled(false);
				
				meta.ativo[0] = true;
				
				meta.local[0] = meta.local(meta.pick);
				
				//Determinar quem ganhou
				try {
					meta.whoWin(meta.local, meta.ativo);
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Determinar se o jogo finalizará
				if(meta.complete(meta.ativo) == true) {
					new Menu().setVisible(true);
					dispose();
				}
				
			}
		});
		btnNoroeste.setToolTipText("NOROESTE");
		btnNoroeste.setBounds(10, 11, 121, 113);
		contentPane.add(btnNoroeste);
		
		JButton btnNordeste = new JButton("NORDESTE");
		btnNordeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(btnNordeste, meta.pick);
				
				//Desabilitar o botão
				btnNordeste.setEnabled(false);
				
				meta.ativo[1] = true;
				
				meta.local[1] = meta.local(meta.pick);
				
				//Determinar quem ganhou
				try {
					meta.whoWin(meta.local, meta.ativo);
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Determinar se o jogo finalizará
				if(meta.complete(meta.ativo) == true) {
					new Menu().setVisible(true);
					dispose();
				}
				
			}
		});
		btnNordeste.setToolTipText("NORDESTE");
		btnNordeste.setBounds(252, 11, 121, 113);
		contentPane.add(btnNordeste);
		
		JButton btnSudoeste = new JButton("SUDOESTE");
		btnSudoeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(btnSudoeste, meta.pick);
				
				//Desabilitar o botão
				btnSudoeste.setEnabled(false);
				
				meta.ativo[2] = true;
				
				meta.local[2] = meta.local(meta.pick);
				
				//Determinar quem ganhou
				try {
					meta.whoWin(meta.local, meta.ativo);
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Determinar se o jogo finalizará
				if(meta.complete(meta.ativo) == true) {
					new Menu().setVisible(true);
					dispose();
				}
			}
		});
		btnSudoeste.setToolTipText("SUDOESTE");
		btnSudoeste.setBounds(10, 237, 121, 113);
		contentPane.add(btnSudoeste);
		
		JButton btnSudeste = new JButton("SUDESTE");
		btnSudeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(btnSudeste, meta.pick);
				
				//Desabilitar o botão
				btnSudeste.setEnabled(false);
				
				meta.ativo[3] = true;
				
				meta.local[3] = meta.local(meta.pick);
				
				//Determinar quem ganhou
				try {
					meta.whoWin(meta.local, meta.ativo);
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Determinar se o jogo finalizará
				if(meta.complete(meta.ativo) == true) {
					new Menu().setVisible(true);
					dispose();
				}
			}
		});
		btnSudeste.setToolTipText("SUDESTE");
		btnSudeste.setBounds(252, 237, 121, 113);
		contentPane.add(btnSudeste);
		
		JButton btnNorte = new JButton("NORTE");
		btnNorte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(btnNorte, meta.pick);
				
				//Desabilitar o botão
				btnNorte.setEnabled(false);
				
				meta.ativo[4] = true;
				
				meta.local[4] = meta.local(meta.pick);
				
				//Determinar quem ganhou
				try {
					meta.whoWin(meta.local, meta.ativo);
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Determinar se o jogo finalizará
				if(meta.complete(meta.ativo) == true) {
					new Menu().setVisible(true);
					dispose();
				}
			}
		});
		btnNorte.setToolTipText("NORTE");
		btnNorte.setBounds(131, 11, 121, 113);
		contentPane.add(btnNorte);
		
		JButton btnOeste = new JButton("OESTE");
		btnOeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(btnOeste, meta.pick);
				
				//Desabilitar o botão
				btnOeste.setEnabled(false);
				
				meta.ativo[5] = true;
				
				meta.local[5] = meta.local(meta.pick);
				
				//Determinar quem ganhou
				try {
					meta.whoWin(meta.local, meta.ativo);
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Determinar se o jogo finalizará
				if(meta.complete(meta.ativo) == true) {
					new Menu().setVisible(true);
					dispose();
				}
			}
		});
		btnOeste.setToolTipText("OESTE");
		btnOeste.setBounds(10, 124, 121, 113);
		contentPane.add(btnOeste);
		
		JButton btnCentro = new JButton("CENTRO");
		btnCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(btnCentro, meta.pick);
				
				//Desabilitar o botão
				btnCentro.setEnabled(false);
				
				meta.ativo[6] = true;
				
				meta.local[6] = meta.local(meta.pick);
				
				//Determinar quem ganhou
				try {
					meta.whoWin(meta.local, meta.ativo);
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Determinar se o jogo finalizará
				if(meta.complete(meta.ativo) == true) {
					new Menu().setVisible(true);
					dispose();
				}
			}
		});
		btnCentro.setToolTipText("CENTRO");
		btnCentro.setBounds(131, 124, 121, 113);
		contentPane.add(btnCentro);
		
		JButton btnLeste = new JButton("LESTE");
		btnLeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(btnLeste, meta.pick);
				
				//Desabilitar o botão
				btnLeste.setEnabled(false);
				
				meta.ativo[7] = true;
				
				meta.local[7] = meta.local(meta.pick);
				
				//Determinar quem ganhou
				try {
					meta.whoWin(meta.local, meta.ativo);
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Determinar se o jogo finalizará
				if(meta.complete(meta.ativo) == true) {
					new Menu().setVisible(true);
					dispose();
				}
			}
		});
		btnLeste.setToolTipText("LESTE");
		btnLeste.setBounds(252, 124, 121, 113);
		contentPane.add(btnLeste);
		
		JButton btnSul = new JButton("SUL");
		btnSul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(btnSul, meta.pick);
				
				//Desabilitar o botão
				btnSul.setEnabled(false);
				
				meta.ativo[8] = true;
				
				meta.local[8] = meta.local(meta.pick);
				
				//Determinar quem ganhou
				try {
					meta.whoWin(meta.local, meta.ativo);
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Determinar se o jogo finalizará
				if(meta.complete(meta.ativo) == true) {
					new Menu().setVisible(true);
					dispose();
				}
			}
		});
		btnSul.setToolTipText("SUL");
		btnSul.setBounds(131, 237, 121, 113);
		contentPane.add(btnSul);
		
	}
}