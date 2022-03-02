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

public class JGameEasy extends JFrame {

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
	// int resultmeta.local;
	int dataBase = 2;
	int aux = 0;

	public JGameEasy() throws HeadlessException, FileNotFoundException, IOException {
		metaData meta = new metaData();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		for (int i = 0; i < 9; i++) {
			meta.btn[i] = new JButton();
		}

		for (int i = 0; i < 9; i++) {
			meta.local[i] = 2;
		}

		meta.btn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Determina que o botão da coordenada foi selecionado
				meta.ativo[0] = true;

				// Desabilitar o botão
				meta.btn[0].setEnabled(false);

				meta.btn[0].setBackground(Color.green);

				// Determina que o botão foi clicado pelo jogador
				// , para que a IA selecione os próximos
				meta.local[0] = 0;

				// Determinar quem ganhou ou iniciar jogada da IA
				try {
					if (meta.whoWinSP() == 1) {
						dispose();
					} else {
						meta.generate();
						if (meta.whoWinSP() == 1) {
							dispose();
						}
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

				// Determina que o botão da coordenada foi selecionado
				meta.ativo[1] = true;

				// Desabilitar o botão
				meta.btn[1].setEnabled(false);

				meta.btn[1].setBackground(Color.green);

				// Determina que o botão foi clicado pelo jogador
				// , para que a IA selecione os próximos
				meta.local[1] = 0;

				// Determinar quem ganhou ou iniciar jogada da IA
				try {
					if (meta.whoWinSP() == 1) {
						dispose();
					} else {
						meta.generate();
						if (meta.whoWinSP() == 1) {
							dispose();
						}
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

				// Determina que o botão da coordenada foi selecionado
				meta.ativo[2] = true;

				// Desabilitar o botão
				meta.btn[2].setEnabled(false);

				meta.btn[2].setBackground(Color.green);

				// Determina que o botão foi clicado pelo jogador
				// , para que a IA selecione os próximos
				meta.local[2] = 0;

				// Determinar quem ganhou ou iniciar jogada da IA
				try {
					if (meta.whoWinSP() == 1) {
						dispose();
					} else {
						meta.generate();
						if (meta.whoWinSP() == 1) {
							dispose();
						}
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

				// Determina que o botão da coordenada foi selecionado
				meta.ativo[3] = true;

				// Desabilitar o botão
				meta.btn[3].setEnabled(false);

				meta.btn[3].setBackground(Color.green);

				// Determina que o botão foi clicado pelo jogador
				// , para que a IA selecione os próximos
				meta.local[3] = 0;

				// Determinar quem ganhou ou iniciar jogada da IA
				try {
					if (meta.whoWinSP() == 1) {
						dispose();
					} else {
						meta.generate();
						if (meta.whoWinSP() == 1) {
							dispose();
						}
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

				// Determina que o botão da coordenada foi selecionado
				meta.ativo[4] = true;

				// Desabilitar o botão
				meta.btn[4].setEnabled(false);

				meta.btn[4].setBackground(Color.green);

				// Determina que o botão foi clicado pelo jogador
				// , para que a IA selecione os próximos
				meta.local[4] = 0;

				// Determinar quem ganhou ou iniciar jogada da IA
				try {
					if (meta.whoWinSP() == 1) {
						dispose();
					} else {
						meta.generate();
						if (meta.whoWinSP() == 1) {
							dispose();
						}
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

				// Determina que o botão da coordenada foi selecionado
				meta.ativo[5] = true;

				// Desabilitar o botão
				meta.btn[5].setEnabled(false);

				meta.btn[5].setBackground(Color.green);

				// Determina que o botão foi clicado pelo jogador
				// , para que a IA selecione os próximos
				meta.local[5] = 0;

				// Determinar quem ganhou ou iniciar jogada da IA
				try {
					if (meta.whoWinSP() == 1) {
						dispose();
					} else {
						meta.generate();
						if (meta.whoWinSP() == 1) {
							dispose();
						}
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

				// Determina que o botão da coordenada foi selecionado
				meta.ativo[6] = true;

				// Desabilitar o botão
				meta.btn[6].setEnabled(false);

				meta.btn[6].setBackground(Color.green);

				// Determina que o botão foi clicado pelo jogador
				// , para que a IA selecione os próximos
				meta.local[6] = 0;

				// Determinar quem ganhou ou iniciar jogada da IA
				try {
					if (meta.whoWinSP() == 1) {
						dispose();
					} else {
						meta.generate();
						if (meta.whoWinSP() == 1) {
							dispose();
						}
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

				// Determina que o botão da coordenada foi selecionado
				meta.ativo[7] = true;

				// Desabilitar o botão
				meta.btn[7].setEnabled(false);

				meta.btn[7].setBackground(Color.green);

				// Determina que o botão foi clicado pelo jogador
				// , para que a IA selecione os próximos
				meta.local[7] = 0;

				// Determinar quem ganhou ou iniciar jogada da IA
				try {
					if (meta.whoWinSP() == 1) {
						dispose();
					} else {
						meta.generate();
						if (meta.whoWinSP() == 1) {
							dispose();
						}
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

				// Determina que o botão da coordenada foi selecionado
				meta.ativo[8] = true;

				// Desabilitar o botão
				meta.btn[8].setEnabled(false);

				meta.btn[8].setBackground(Color.green);

				// Determina que o botão foi clicado pelo jogador
				// , para que a IA selecione os próximos
				meta.local[8] = 0;

				// Determinar quem ganhou ou iniciar jogada da IA
				try {
					if (meta.whoWinSP() == 1) {
						dispose();
					} else {
						meta.generate();
						if (meta.whoWinSP() == 1) {
							dispose();
						}
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
