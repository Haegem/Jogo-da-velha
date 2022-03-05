import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txtNick;
	private JTextField txtInsiraAqui;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws HeadlessException
	 */

	public static String carregar(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		linha = buffRead.readLine();
		buffRead.close();
		return linha;
	}

	public static void salvar(String path, String linha) throws IOException {
		FileWriter fw = new FileWriter(path, true);
		fw.write("1 WIN - " + linha + "]");
		fw.close();
	}

	public static void att(String[] rankingName, String path) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		String aux = "";
		for (int i = 0; i < rankingName.length; i++) {
			aux += rankingName[i] + "]";
		}
		bw.append(aux);
		bw.close();
	}

	String[] rankingName = new String[10];

	public Menu() throws HeadlessException, FileNotFoundException, IOException {

		// Salvador player
		String dataNick = "";
		int setSave = 0;

		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// INICIALIZAÇÃO DO BANCO FAKE(VETOR)

		// OPÇÕES DE DIFICULDADE
		JComboBox comboBoxDiff = new JComboBox();
		comboBoxDiff.setBounds(5, 104, 74, 31);
		comboBoxDiff.setModel(new DefaultComboBoxModel(new String[] { "EASY", "HARD" }));
		comboBoxDiff.setFont(new Font("Txt_IV50", Font.BOLD, 15));
		comboBoxDiff.setToolTipText("DIFF");

		JLabel lblSelectDiff = new JLabel("Selecione a dificuldade:");
		lblSelectDiff.setFont(new Font("Txt_IV50", Font.PLAIN, 11));
		lblSelectDiff.setToolTipText("SELECTDIFF");
		lblSelectDiff.setBounds(5, 79, 172, 14);
		contentPane.add(lblSelectDiff);
		// Desabilitar o botão dificuldade
		comboBoxDiff.setEnabled(false);

		// OPÇÕES MULTI-SINGLE PLAYERS
		JButton btnMultijogador = new JButton("MULTIJOGADOR");
		JButton btnUmJogador = new JButton("UM JOGADOR");

		btnMultijogador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Desabilitar o botão um jogador
				btnUmJogador.setEnabled(false);
			}
		});
		btnMultijogador.setToolTipText("MULTIJOGADOR");
		btnMultijogador.setFont(new Font("Dialog", Font.BOLD, 11));
		btnMultijogador.setBackground(new Color(154, 205, 50));
		btnMultijogador.setBounds(412, 109, 128, 23);
		contentPane.add(btnMultijogador);

		btnUmJogador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Desabilitar o botão multijogador
				btnMultijogador.setEnabled(false);
				// Habilitar o botão dificuldade
				comboBoxDiff.setEnabled(true);
			}
		});
		btnUmJogador.setToolTipText("UMJOGADOR");
		btnUmJogador.setFont(new Font("Dialog", Font.BOLD, 11));
		btnUmJogador.setBackground(new Color(154, 205, 50));
		btnUmJogador.setBounds(274, 109, 128, 23);
		contentPane.add(btnUmJogador);

		// TÍTULO
		JLabel lblTitle = new JLabel("JOGO DA VELHA");
		lblTitle.setBounds(5, 11, 674, 56);
		lblTitle.setBackground(Color.ORANGE);
		lblTitle.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setFont(new Font("Txt_IV50", Font.BOLD, 40));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setToolTipText("TITLE");

		// TÍTULO PARA DIGITAR NICK
		JLabel lblTitleNick = new JLabel("Digite seu nick:");
		lblTitleNick.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleNick.setFont(new Font("Txt_IV50", Font.PLAIN, 25));
		lblTitleNick.setBounds(262, 150, 278, 41);
		lblTitleNick.setToolTipText("TITLENICK");
		contentPane.setLayout(null);

		// ÁREA PARA DIGITAR O NICK
		txtNick = new JTextField();
		txtNick.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		txtNick.setForeground(Color.BLACK);
		txtNick.setBounds(196, 220, 429, 56);
		txtNick.setHorizontalAlignment(SwingConstants.CENTER);
		txtNick.setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtNick.setToolTipText("NICK");
		txtNick.setColumns(10);
		contentPane.add(txtNick);

		txtInsiraAqui = new JTextField();
		txtInsiraAqui.setEditable(false);
		txtInsiraAqui.setEnabled(false);
		txtInsiraAqui.setText("INSIRA AQUI");
		txtInsiraAqui.setToolTipText("INSIRAAQUI");
		txtInsiraAqui.setHorizontalAlignment(SwingConstants.CENTER);
		txtInsiraAqui.setForeground(Color.LIGHT_GRAY);
		txtInsiraAqui.setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtInsiraAqui.setColumns(10);
		txtInsiraAqui.setBounds(196, 220, 429, 56);
		contentPane.add(txtInsiraAqui);

		// LISTA DO RANKING
		String aux = carregar("C:\\Users\\J_geb\\eclipse-workspace\\SavedDataNicks.txt");
		if (carregar("C:\\Users\\J_geb\\eclipse-workspace\\SavedDataNicks.txt") != null) {
			rankingName = aux.split("]");
		}

		// BOTÃO PARA CONFIRMAR NICK
		JButton btnConfirm = new JButton("CONFIRMAR");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] auxiliar = new String[2];
				try {
					if (carregar("C:\\Users\\J_geb\\eclipse-workspace\\SavedDataNicks.txt") == null) {
						try {
							salvar("C:\\Users\\J_geb\\eclipse-workspace\\SavedDataNicks.txt", txtNick.getText());
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					} else {
						int cont = 0;
						for (int i = 0; i < rankingName.length; i++) {
							auxiliar = rankingName[i].split(" WIN - ");
							if (txtNick.getText().equalsIgnoreCase(auxiliar[1])) {
								int aux2 = Integer.parseInt(auxiliar[0]);
								aux2 += 1;
								rankingName[i] = String.valueOf(aux2) + " WIN - " + auxiliar[1];

								String[] auxiliar2 = new String[2];
								String temp = "";
								for (int h = 0; h < rankingName.length; h++) {
									auxiliar2 = rankingName[h].split(" WIN - ");
									if (Integer.parseInt(auxiliar[0]) >= Integer.parseInt(auxiliar2[0])) {
										temp = rankingName[h];
										System.out.println("temp: " + temp);
										rankingName[h] = rankingName[i];
										System.out.println("rankingName[h]: " + rankingName[h]);
										rankingName[i] = temp;
										System.out.println("rankingName[i]: " + rankingName[i]);
									}
								}

								att(rankingName, "C:\\Users\\J_geb\\eclipse-workspace\\SavedDataNicks.txt");
								cont = 1;
							}
						}
						if (cont == 0) {
							try {
								salvar("C:\\Users\\J_geb\\eclipse-workspace\\SavedDataNicks.txt", txtNick.getText());
							} catch (IOException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
						}
					}
				} catch (NumberFormatException | IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				if (btnUmJogador.isEnabled() == false) {
					Game screenGM = new Game();

					screenGM.setVisible(true);
					dispose();
					screenGM.setResizable(false);
					screenGM.setLocationRelativeTo(null);
				} else {
					if (comboBoxDiff.getSelectedItem() == "EASY") {
						JGameEasy screenE = null;
						try {
							screenE = new JGameEasy();
						} catch (HeadlessException | IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						screenE.setVisible(true);
						dispose();
						screenE.setResizable(false);
						screenE.setLocationRelativeTo(null);
					} else {
						JGameHard screenH = null;
						try {
							screenH = new JGameHard();
						} catch (HeadlessException | IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						screenH.setVisible(true);
						dispose();
						screenH.setResizable(false);
						screenH.setLocationRelativeTo(null);
					}
				}

			}
		});
		btnConfirm.setBackground(new Color(154, 205, 50));
		btnConfirm.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnConfirm.setToolTipText("CONFIRM");
		btnConfirm.setBounds(364, 300, 128, 23);
		contentPane.add(btnConfirm);

		JList listRanking = new JList();
		listRanking.setFont(new Font("Txt_IV50", Font.PLAIN, 11));
		final DefaultListModel dl = new DefaultListModel();
		listRanking.setModel(dl);
		for (int i = 0; i < rankingName.length; i++) {
			dl.addElement(rankingName[i]);
		}
		listRanking.setToolTipText("LISTRANKING");
		listRanking.setBounds(5, 146, 128, 204);
		contentPane.add(listRanking);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(116, 146, 17, 204);
		contentPane.add(scrollBar);
		contentPane.add(comboBoxDiff);
		contentPane.add(lblTitleNick);
		contentPane.add(lblTitle);

	}
}