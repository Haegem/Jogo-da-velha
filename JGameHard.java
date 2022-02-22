import java.util.Random;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.HeadlessException;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class JGameHard extends JFrame {
		
	private JPanel contentPane;

	public static void main(String[] args) {
		Base aux = new Base();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JGameHard frame = new JGameHard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int pick = 0;
    int[] cont = new int[9];
    int saveGen = 0;
    //int resultmeta.local;
	int firstActivated = 0;
	int dataBase = 2;
	int aux = 0;
	
	public JGameHard() throws HeadlessException, FileNotFoundException, IOException {
		metaData meta = new metaData();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		for(int i=0;i<9;i++) {
			meta.btn[i] = new JButton();
		}
		
			switch (meta.generateFirst()) {
			case 0:
				meta.local[0] = 1;
    				break;
			case 1:
				meta.local[1] = 1;
	   				break;
			case 2:
				meta.local[4] = 1;
	    			break;
			case 3:
				meta.local[5] = 1;
	   				break;
			}
			firstActivated += 1;
			
			meta.btn[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Determina que o botão da coordenada foi selecionado
					meta.ativo[0] = true;

					//Desabilitar o botão
					meta.btn[0].setEnabled(false);
					
					cont[0] = 1;
					
						if(meta.transpick() == 0) {
							meta.btn[0].setBackground(Color.green);
						
						//Determina que o botão foi clicado pelo jogador
							//, para que a IA selecione os próximos
						meta.local[0] = 0;
						}
					
					//Determina jogada da máquina
					else if(meta.whoFirst(firstActivated) == 1) {
						dispose();
					}
				}
			});
			meta.btn[0].setToolTipText("NOROESTE");
			meta.btn[0].setBounds(10, 11, 121, 113);
			contentPane.add(meta.btn[0]);
			
			meta.btn[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Determina que o botão da coordenada foi selecionado
					meta.ativo[1] = true;

					//Desabilitar o botão
					meta.btn[1].setEnabled(false);
					
					cont[1] = 1;
					
						if(meta.transpick() == 0) {
							meta.btn[1].setBackground(Color.green);
						
						//Determina que o botão foi clicado pelo jogador
							//, para que a IA selecione os próximos
						meta.local[1] = 0;
						}
						
						//Determina jogada da máquina
						else if(meta.whoFirst(firstActivated) == 1) {
							dispose();
						}
				}
			});
			meta.btn[1].setToolTipText("NORDESTE");
			meta.btn[1].setBounds(252, 11, 121, 113);
			contentPane.add(meta.btn[1]);
			
			meta.btn[2].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Determina que o botão da coordenada foi selecionado
					meta.ativo[2] = true;

					//Desabilitar o botão
					meta.btn[2].setEnabled(false);
					
					cont[2] = 1;
					
						if(meta.transpick() == 0) {
							meta.btn[2].setBackground(Color.green);
						
						//Determina que o botão foi clicado pelo jogador
							//, para que a IA selecione os próximos
						meta.local[2] = 0;
						}
					
					//Determina jogada da máquina
					else if(meta.whoFirst(firstActivated) == 1) {
						dispose();
					}
				}
			});
			meta.btn[2].setToolTipText("SUDOESTE");
			meta.btn[2].setBounds(10, 237, 121, 113);
			contentPane.add(meta.btn[2]);
			
			meta.btn[3].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Determina que o botão da coordenada foi selecionado
					meta.ativo[3] = true;

					//Desabilitar o botão
					meta.btn[3].setEnabled(false);
					
					cont[3] = 1;
					
						if(meta.transpick() == 0) {
							meta.btn[3].setBackground(Color.green);
						
						//Determina que o botão foi clicado pelo jogador
							//, para que a IA selecione os próximos
						meta.local[3] = 0;
						}
					
					//Determina jogada da máquina
					else if(meta.whoFirst(firstActivated) == 1) {
						dispose();
					}
				}
			});
			meta.btn[3].setToolTipText("SUDESTE");
			meta.btn[3].setBounds(252, 237, 121, 113);
			contentPane.add(meta.btn[3]);
			
			meta.btn[4].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Determina que o botão da coordenada foi selecionado
					meta.ativo[4] = true;

					//Desabilitar o botão
					meta.btn[4].setEnabled(false);
					
					cont[4] = 1;
					
						if(meta.transpick() == 0) {
							meta.btn[4].setBackground(Color.green);
						
						//Determina que o botão foi clicado pelo jogador
							//, para que a IA selecione os próximos
						meta.local[4] = 0;
						}
					
					//Determina jogada da máquina
					else if(meta.whoFirst(firstActivated) == 1) {
						dispose();
					}
				}
			});
			meta.btn[4].setToolTipText("NORTE");
			meta.btn[4].setBounds(131, 11, 121, 113);
			contentPane.add(meta.btn[4]);
			
			meta.btn[5].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Determina que o botão da coordenada foi selecionado
					meta.ativo[5] = true;

					//Desabilitar o botão
					meta.btn[5].setEnabled(false);
					
					cont[5] = 1;
					
						if(meta.transpick() == 0) {
							meta.btn[5].setBackground(Color.green);
						
						//Determina que o botão foi clicado pelo jogador
							//, para que a IA selecione os próximos
						meta.local[5] = 0;
						}
					
					//Determina jogada da máquina
					else if(meta.whoFirst(firstActivated) == 1) {
						dispose();
					}
				}
			});
			meta.btn[5].setToolTipText("OESTE");
			meta.btn[5].setBounds(10, 124, 121, 113);
			contentPane.add(meta.btn[5]);
			
			meta.btn[6].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Determina que o botão da coordenada foi selecionado
					meta.ativo[6] = true;

					//Desabilitar o botão
					meta.btn[6].setEnabled(false);
					
					cont[6] = 1;
					
						if(meta.transpick() == 0) {
							meta.btn[6].setBackground(Color.green);
						
						//Determina que o botão foi clicado pelo jogador
							//, para que a IA selecione os próximos
						meta.local[6] = 0;
						}
					
					//Determina jogada da máquina
					else if(meta.whoFirst(firstActivated) == 1) {
						dispose();
					}
				}
			});
			meta.btn[6].setToolTipText("CENTRO");
			meta.btn[6].setBounds(131, 124, 121, 113);
			contentPane.add(meta.btn[6]);
			
			meta.btn[7].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Determina que o botão da coordenada foi selecionado
					meta.ativo[7] = true;

					//Desabilitar o botão
					meta.btn[7].setEnabled(false);
					
					cont[7] = 1;
					
						if(meta.transpick() == 0) {
							meta.btn[7].setBackground(Color.green);
						
						//Determina que o botão foi clicado pelo jogador
							//, para que a IA selecione os próximos
						meta.local[7] = 0;
						}
					
					//Determina jogada da máquina
					else if(meta.whoFirst(firstActivated) == 1) {
						dispose();
					}
				}
			});
			meta.btn[7].setToolTipText("LESTE");
			meta.btn[7].setBounds(252, 124, 121, 113);
			contentPane.add(meta.btn[7]);
			
			meta.btn[8].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Determina que o botão da coordenada foi selecionado
					meta.ativo[8] = true;

					//Desabilitar o botão
					meta.btn[8].setEnabled(false);
					
					cont[8] = 1;
					
						if(meta.transpick() == 0) {
							meta.btn[8].setBackground(Color.green);
						
						//Determina que o botão foi clicado pelo jogador
							//, para que a IA selecione os próximos
						meta.local[8] = 0;
						}
						
						//Determina jogada da máquina
						else if(meta.whoFirst(firstActivated) == 1) {
							dispose();
						}
				}
			});
			meta.btn[8].setToolTipText("SUL");
			meta.btn[8].setBounds(131, 237, 121, 113);
			contentPane.add(meta.btn[8]);
			}
}
