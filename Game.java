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
		
		for(int i=0;i<9;i++) {
			meta.local[i] = 3;
		}
		
		for(int i=0;i<9;i++) {
			meta.btn[i] = new JButton();
		}
		
		meta.btn[0].setForeground(Color.BLACK);
		meta.btn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(meta.btn[0], meta.pick);
				
				//Desabilitar o botão
				meta.btn[0].setEnabled(false);
				
				//Preencher para avisar se não tem mais jogadas à se fazer
				meta.ativo[0] = true;
				
				//É determinado qual jogador clicou em qual botão
				meta.local[0] = meta.transpick();
				
				//Determinar quem ganhou
				try {
					if(meta.whoWinMP() == 1) {
						dispose();
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		meta.btn[0].setToolTipText("NOROESTE");
		meta.btn[0].setBounds(10, 11, 121, 113);
		contentPane.add(meta.btn[0]);
		
		meta.btn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(meta.btn[1], meta.pick);
				
				//Desabilitar o botão
				meta.btn[1].setEnabled(false);
				
				//Preencher para avisar se não tem mais jogadas à se fazer
				meta.ativo[1] = true;
				
				//É determinado qual jogador clicou em qual botão
				meta.local[1] = meta.transpick();
				
				//Determinar quem ganhou
				try {
					if(meta.whoWinMP() == 1) {
						dispose();
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		meta.btn[1].setToolTipText("NORDESTE");
		meta.btn[1].setBounds(252, 11, 121, 113);
		contentPane.add(meta.btn[1]);
		
		meta.btn[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(meta.btn[2], meta.pick);
				
				//Desabilitar o botão
				meta.btn[2].setEnabled(false);
				
				//Preencher para avisar se não tem mais jogadas à se fazer
				meta.ativo[2] = true;
				
				//É determinado qual jogador clicou em qual botão
				meta.local[2] = meta.transpick();
				
				//Determinar quem ganhou
				try {
					if(meta.whoWinMP() == 1) {
						dispose();
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		meta.btn[2].setToolTipText("SUDOESTE");
		meta.btn[2].setBounds(10, 237, 121, 113);
		contentPane.add(meta.btn[2]);
		
		meta.btn[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(meta.btn[3], meta.pick);
				
				//Desabilitar o botão
				meta.btn[3].setEnabled(false);
				
				//Preencher para avisar se não tem mais jogadas à se fazer
				meta.ativo[3] = true;
				
				//É determinado qual jogador clicou em qual botão
				meta.local[3] = meta.transpick();
				
				//Determinar quem ganhou
				try {
					if(meta.whoWinMP() == 1) {
						dispose();
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		meta.btn[3].setToolTipText("SUDESTE");
		meta.btn[3].setBounds(252, 237, 121, 113);
		contentPane.add(meta.btn[3]);
		
		meta.btn[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(meta.btn[4], meta.pick);
				
				//Desabilitar o botão
				meta.btn[4].setEnabled(false);
				
				//Preencher para avisar se não tem mais jogadas à se fazer
				meta.ativo[4] = true;
				
				//É determinado qual jogador clicou em qual botão
				meta.local[4] = meta.transpick();
				
				//Determinar quem ganhou
				try {
					if(meta.whoWinMP() == 1) {
						dispose();
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		meta.btn[4].setToolTipText("NORTE");
		meta.btn[4].setBounds(131, 11, 121, 113);
		contentPane.add(meta.btn[4]);
		
		meta.btn[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(meta.btn[5], meta.pick);
				
				//Desabilitar o botão
				meta.btn[5].setEnabled(false);
				
				//Preencher para avisar se não tem mais jogadas à se fazer
				meta.ativo[5] = true;
				
				//É determinado qual jogador clicou em qual botão
				meta.local[5] = meta.transpick();
				
				//Determinar quem ganhou
				try {
					if(meta.whoWinMP() == 1) {
						dispose();
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		meta.btn[5].setToolTipText("OESTE");
		meta.btn[5].setBounds(10, 124, 121, 113);
		contentPane.add(meta.btn[5]);
		
		meta.btn[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(meta.btn[6], meta.pick);
				
				//Desabilitar o botão
				meta.btn[6].setEnabled(false);
				
				//Preencher para avisar se não tem mais jogadas à se fazer
				meta.ativo[6] = true;
				
				//É determinado qual jogador clicou em qual botão
				meta.local[6] = meta.transpick();
				
				//Determinar quem ganhou
				try {
					if(meta.whoWinMP() == 1) {
						dispose();
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		meta.btn[6].setToolTipText("CENTRO");
		meta.btn[6].setBounds(131, 124, 121, 113);
		contentPane.add(meta.btn[6]);
		
		meta.btn[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(meta.btn[7], meta.pick);
				
				//Desabilitar o botão
				meta.btn[7].setEnabled(false);
				
				//Preencher para avisar se não tem mais jogadas à se fazer
				meta.ativo[7] = true;
				
				//É determinado qual jogador clicou em qual botão
				meta.local[7] = meta.transpick();
				
				//Determinar quem ganhou
				try {
					if(meta.whoWinMP() == 1) {
						dispose();
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		meta.btn[7].setToolTipText("LESTE");
		meta.btn[7].setBounds(252, 124, 121, 113);
		contentPane.add(meta.btn[7]);
		
		meta.btn[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Determinar cor de fundo
				meta.VerifyBackground(meta.btn[8], meta.pick);
				
				//Desabilitar o botão
				meta.btn[8].setEnabled(false);
				
				//Preencher para avisar se não tem mais jogadas à se fazer
				meta.ativo[8] = true;
				
				//É determinado qual jogador clicou em qual botão
				meta.local[8] = meta.transpick();
				
				//Determinar quem ganhou
				try {
					if(meta.whoWinMP() == 1) {
						dispose();
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		meta.btn[8].setToolTipText("SUL");
		meta.btn[8].setBounds(131, 237, 121, 113);
		contentPane.add(meta.btn[8]);
		
	}
}