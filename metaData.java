import java.awt.Color;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class metaData {

	Random ran = new Random();

	// Escolha de jogador
	int pick = 0;
	// Variável para controlar as duas primeiras jogadas
	int firstActivated = 1;
	// Contador de cada coordenada
	int[] cont = new int[9];
	// Botões das coordenadas
	JButton[] btn = new JButton[9];
	// Determina os botões disponíveis para a IA ou jogador selecionar
	int local[] = new int[9];
	// Visualizador se todos os botões ja foram apertado
	boolean[] ativo = { false, false, false, false, false, false, false, false, false };

	// MÉTODOS COMUNS
	public int transpick() {
		int result;
		if (pick == 0) {
			pick = 1;
			result = 0;
		} else {
			pick = 0;
			result = 1;

		}
		return result;
	}

	public int whoWinMP() throws HeadlessException, FileNotFoundException, IOException {
		if (local[0] == 0 && local[6] == 0 && local[3] == 0) {
			JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 1 && local[6] == 1 && local[3] == 1) {
			JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 0 && local[4] == 0 && local[1] == 0) {
			JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 1 && local[4] == 1 && local[1] == 1) {
			JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 0 && local[5] == 0 && local[2] == 0) {
			JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 1 && local[5] == 1 && local[2] == 1) {
			JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[5] == 0 && local[6] == 0 && local[7] == 0) {
			JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[5] == 1 && local[6] == 1 && local[7] == 1) {
			JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[2] == 0 && local[8] == 0 && local[3] == 0) {
			JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[2] == 1 && local[8] == 1 && local[3] == 1) {
			JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[1] == 0 && local[6] == 0 && local[2] == 0) {
			JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[1] == 1 && local[6] == 1 && local[2] == 1) {
			JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[1] == 0 && local[7] == 0 && local[3] == 0) {
			JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[1] == 1 && local[7] == 1 && local[3] == 1) {
			JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[4] == 0 && local[6] == 0 && local[8] == 0) {
			JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[4] == 1 && local[6] == 1 && local[8] == 1) {
			JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
			new Menu().setVisible(true);
			return 1;
		}
		if (ativo[0] == true && ativo[1] == true && ativo[2] == true && ativo[3] == true && ativo[4] == true
				&& ativo[5] == true && ativo[6] == true && ativo[7] == true && ativo[8] == true) {
			JOptionPane.showMessageDialog(null, "Ninguém ganhou!");
			new Menu().setVisible(true);
			return 1;
		}
		return 0;
	}

	public int whoWinSP() throws HeadlessException, FileNotFoundException, IOException {
		if (local[0] == 0 && local[6] == 0 && local[3] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			// player.carregar().replaceAll(" = 0 V", " = 1 V ");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 1 && local[6] == 1 && local[3] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 0 && local[4] == 0 && local[1] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 1 && local[4] == 1 && local[1] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 0 && local[5] == 0 && local[2] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[0] == 1 && local[5] == 1 && local[2] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[5] == 0 && local[6] == 0 && local[7] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[5] == 1 && local[6] == 1 && local[7] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[2] == 0 && local[8] == 0 && local[3] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[2] == 1 && local[8] == 1 && local[3] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[1] == 0 && local[6] == 0 && local[2] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[1] == 1 && local[6] == 1 && local[2] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[1] == 0 && local[7] == 0 && local[3] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[1] == 1 && local[7] == 1 && local[3] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[4] == 0 && local[6] == 0 && local[8] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		} else if (local[4] == 1 && local[6] == 1 && local[8] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		}
		if (ativo[0] == true && ativo[1] == true && ativo[2] == true && ativo[3] == true && ativo[4] == true
				&& ativo[5] == true && ativo[6] == true && ativo[7] == true && ativo[8] == true) {
			JOptionPane.showMessageDialog(null, "Ninguém ganhou!");
			new Menu().setVisible(true);
			return 1;
		}
		return 0;
	}

	public void VerifyBackground(JButton btn, int pick) {
		if (pick == 0) {
			btn.setBackground(Color.GREEN);
		} else {
			btn.setBackground(Color.RED);
		}
	}

	// MÉTODOS GAME EASY
	public void generate() {
		int aux = 0;

		while (aux != 1) {
			switch (ran.nextInt(9)) {
			case 0:
				if (local[0] != 1 && local[0] != 0) {
					btn[0].setBackground(Color.red);
					aux = 1;
					local[0] = 1;

					// Desabilitar o botão
					btn[0].setEnabled(false);

					ativo[0] = true;
				}
				break;
			case 1:
				if (local[1] != 1 && local[1] != 0) {
					btn[1].setBackground(Color.red);
					aux = 1;
					local[1] = 1;

					// Desabilitar o botão
					btn[1].setEnabled(false);

					ativo[1] = true;
				}
				break;
			case 2:
				if (local[2] != 1 && local[2] != 0) {
					btn[2].setBackground(Color.red);
					aux = 1;
					local[2] = 1;

					// Desabilitar o botão
					btn[2].setEnabled(false);

					ativo[2] = true;
				}
				break;
			case 3:
				if (local[3] != 1 && local[3] != 0) {
					btn[3].setBackground(Color.red);
					aux = 1;
					local[3] = 1;

					// Desabilitar o botão
					btn[3].setEnabled(false);

					ativo[3] = true;
				}
				break;
			case 4:
				if (local[4] != 1 && local[4] != 0) {
					btn[4].setBackground(Color.red);
					aux = 1;
					local[4] = 1;

					// Desabilitar o botão
					btn[4].setEnabled(false);

					ativo[4] = true;
				}
				break;
			case 5:
				if (local[5] != 1 && local[5] != 0) {
					btn[5].setBackground(Color.red);
					aux = 1;
					local[5] = 1;

					// Desabilitar o botão
					btn[5].setEnabled(false);

					ativo[5] = true;
				}
				break;
			case 6:
				if (local[6] != 1 && local[6] != 0) {
					btn[6].setBackground(Color.red);
					aux = 1;
					local[6] = 1;

					// Desabilitar o botão
					btn[6].setEnabled(false);

					ativo[6] = true;
				}
				break;
			case 7:
				if (local[7] != 1 && local[7] != 0) {
					btn[7].setBackground(Color.red);
					aux = 1;
					local[7] = 1;

					// Desabilitar o botão
					btn[7].setEnabled(false);

					ativo[7] = true;
				}
				break;
			case 8:
				if (local[8] != 1 && local[8] != 0) {
					btn[8].setBackground(Color.red);
					aux = 1;
					local[8] = 1;

					// Desabilitar o botão
					btn[8].setEnabled(false);

					ativo[8] = true;
				}
				break;
			}
		}
	}

	// MÉTODOS GAME HARD

	public int whoFirst() {

		if (firstActivated < 2) {
			generateFirst();
			firstActivated += 1;
		} else {
			try {
				generate();
				if (whoWinSP() == 1) {
					return 1;
				}
			} catch (HeadlessException | IOException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
	}

	public void generateFirst() {
		int aux = 0;

		while (aux != 1) {
			switch (ran.nextInt(4)) {
			case 0:
				if (local[0] != 1 && local[0] != 0) {
					btn[0].setBackground(Color.red);

					// Desabilitar o botão
					btn[0].setEnabled(false);

					aux = 1;
					ativo[0] = true;
					local[0] = 1;
				}
				break;
			case 1:
				if (local[1] != 1 && local[1] != 0) {
					btn[1].setBackground(Color.red);

					// Desabilitar o botão
					btn[1].setEnabled(false);

					aux = 1;
					ativo[1] = true;
					local[1] = 1;
				}
				break;
			case 2:
				if (local[2] != 1 && local[2] != 0) {
					btn[2].setBackground(Color.red);

					// Desabilitar o botão
					btn[2].setEnabled(false);

					aux = 1;
					ativo[2] = true;
					local[2] = 1;
				}
				break;
			case 3:
				if (local[3] != 1 && local[3] != 0) {
					btn[3].setBackground(Color.red);

					// Desabilitar o botão
					btn[3].setEnabled(false);

					aux = 1;
					ativo[3] = true;
					local[3] = 1;
				}
				break;
			}
		}
	}

}
