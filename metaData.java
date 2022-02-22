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
	
	/*localNoroeste = 0
	localNordeste = 1
	localSudoeste = 2
	localSudeste = 3
	localNorte = 4
	localOeste = 5
	localCentro = 6
	localLeste = 7
	localSul = 8*/
	
    Random ran = new Random();

    //Escolha de jogador
	int pick = 0;
	//Contador de cada coordenada
    int[] cont = new int[9];
    //Botões das coordenadas
    JButton[] btn = new JButton[9];
    //Determina os botões disponíveis para a IA selecionar
	int local[] = new int[9];
	//Visualizador se todos os botões ja foram apertado
	boolean[] ativo = {false, false, false, false, false, false, false, false, false};
	//Salvador player
	//private String dataNick;
	//private int setSave = 0;
	//Construtor do metaData player
	//metaData player = new metaData();

	//MÉTODOS COMUNS
	public int transpick() {
	int result;
	if(pick == 0) {
		pick = 1;
		result = 0;
	}
	else {
		pick = 0;
		result = 1;
		
	}
	return result;
}
	
	public int whoWin()
			throws HeadlessException, FileNotFoundException, IOException {
		if(local[0] == 0 && local[6] == 0 && local[3] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			//player.carregar().replaceAll(" = 0 V", " = 1 V ");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[0] == 1 && local[6] == 1 && local[3] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[0] == 0 && local[4] == 0 && local[1] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[0] == 1 && local[4] == 1 && local[1] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[0] == 0 && local[5] == 0 && local[2] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[0] == 1 && local[5] == 1 && local[2] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[5] == 0 && local[6] == 0 && local[7] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[5] == 1 && local[6] == 1 && local[7] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[2] == 0 && local[8] == 0 && local[3] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[2] == 1 && local[8] == 1 && local[3] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[1] == 0 && local[6] == 0 && local[2] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[1] == 1 && local[6] == 1 && local[2] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[1] == 0 && local[7] == 0 && local[3] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[1] == 1 && local[7] == 1 && local[3] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[4] == 0 && local[6] == 0 && local[8] == 0) {
			JOptionPane.showMessageDialog(null, "Você venceu!");
			new Menu().setVisible(true);
			return 1;
		}
		else if(local[4] == 1 && local[6] == 1 && local[8] == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			new Menu().setVisible(true);
			return 1;
		}
		if(ativo[0] == true && ativo[1] == true && ativo[2] == true && ativo[3] == true &&
				ativo[4] == true && ativo[5] == true && ativo[6] == true && ativo[7] == true
				&& ativo[8] == true) {
			JOptionPane.showMessageDialog(null, "Ninguém ganhou!");
			new Menu().setVisible(true);
			return 1;
		}
		return 0;
	}
	
	/*public boolean complete(boolean[] ativo) {
		if(ativo[0] == true && ativo[1] == true && ativo[2] == true && ativo[3] == true &&
				ativo[4] == true && ativo[5] == true && ativo[6] == true && ativo[7] == true
				&& ativo[8] == true) {
			JOptionPane.showMessageDialog(null, "Ninguém ganhou!");
			return true;
		}
		return false;
	}*/
	
	public void VerifyBackground(JButton btn, int pick) {
		if(pick == 0) {
		btn.setBackground(Color.GREEN);
		}
		else {
			btn.setBackground(Color.RED);
		}
	}

	//MÉTODOS MENU
	
	public void salvar(String conteudo, boolean adicionar)
			throws IOException {
				FileWriter fw = 
						new FileWriter("C:\\Users\\J_geb\\eclipse-workspace\\Jogo da Velha\\"
								+ "savedDataNicks.txt", adicionar);
				PrintWriter pw = new PrintWriter(fw);
				pw.println(conteudo);
				pw.flush();
				pw.close();
			}

			/*public String carregar()
			throws FileNotFoundException, IOException {

				File file = 
						new File("C:\\Users\\User1\\eclipse-workspace\\Jogo da Velha\\"
								+ "savedDataNicks.txt");

				if (! file.exists()) {
					return null;
				}

				BufferedReader br = 
						new BufferedReader(new FileReader("C:\\Users\\J_geb\\eclipse-workspace\\"
								+ "Jogo da Velha\\savedDataNicks.txt"));
				StringBuffer bufSaida = new StringBuffer();

				int c;
				while( (c = br.read()) > 1 ){
					bufSaida.append((char)c);
				}
				br.close();
				return bufSaida.toString();
			}*/
	
	public void Players() {
		//this.dataNick = "";
		//this.dataPoints = 0;
	}
	
		//MÉTODOS GAME EASY	
	public int generate () {
        int aux = 0;
        int save = 0;
        
        while(aux != 1) {

		switch (ran.nextInt(9)) {
			case 0:
				if(cont[0] != 1) {
					btn[0].setBackground(new Color(255, 69, 0));
	    			cont[0] = 1;
					aux = 1;
					
					//Desabilitar o botão
					btn[0].setEnabled(false);
					
					ativo[0] = true;
					
					save = 0;
					break;
				}
			case 4:
					if(cont[4] != 1) {
						btn[4].setBackground(new Color(255, 69, 0));
						aux = 1;
	    				cont[4] = 1;
					
					//Desabilitar o botão
					btn[4].setEnabled(false);
					
					ativo[4] = true;
					
					save = 4;
					break;
				}
			case 1:
				if(cont[1] != 1) {
					btn[1].setBackground(new Color(255, 69, 0));
					aux = 1;
	   				cont[1] = 1;
					
					//Desabilitar o botão
					btn[1].setEnabled(false);
					
					ativo[1] = true;
					
					save = 1;
					break;
				}
			case 5:
				if(cont[5] != 1) {
					btn[5].setBackground(new Color(255, 69, 0));
						aux = 1;
	    				cont[5] = 1;
					
					//Desabilitar o botão
					btn[5].setEnabled(false);
					
					ativo[5] = true;
					
					save = 5;
					break;
				}
			case 6:
					if(cont[6] != 1) {
					btn[6].setBackground(new Color(255, 69, 0));
					aux = 1;
	    			cont[6] = 1;
					
					//Desabilitar o botão
					btn[6].setEnabled(false);
					
					ativo[6] = true;
					
					save = 6;
					break;
				}
			case 7:
				if(cont[7] != 1) {
					btn[7].setBackground(new Color(255, 69, 0));
						aux = 1;
	    				cont[7] = 1;
					
					//Desabilitar o botão
					btn[7].setEnabled(false);
					
					ativo[7] = true;
					
					save = 7;
					break;
				}
			case 2:
					if(cont[2] != 1) {
						btn[2].setBackground(new Color(255, 69, 0));
					aux = 1;
	    			cont[2] = 1;
					
					//Desabilitar o botão
					btn[2].setEnabled(false);
					
					ativo[2] = true;
					
					save = 2;
					break;
				}
			case 8:
				if(cont[8] != 1) {
					btn[8].setBackground(new Color(255, 69, 0));
						aux = 1;
	    				cont[8] = 1;
					
					//Desabilitar o botão
					btn[8].setEnabled(false);
					
					ativo[8] = true;
					
					save = 8;
					break;
				}
			case 3:
				if(cont[3] != 1) {
					btn[3].setBackground(new Color(255, 69, 0));
					aux = 1;
	   				cont[3] = 1;
					
					//Desabilitar o botão
					btn[3].setEnabled(false);
					
					ativo[3] = true;
					
					save = 3;
					break;
				}
			}
        }
		return save;
    }
	
		//MÉTODOS GAME HARD
	
public int whoFirst(int firstActivated) {
	int aux = 0;

	if(firstActivated < 2) {
				switch (generateFirst()) {
				case 0:
					local[0] = 1;
					btn[0].setBackground(Color.red);
					
	    				break;
				case 1:
					local[1] = 1;
					btn[1].setBackground(Color.red);
		   				break;
				case 2:
					local[4] = 1;
					btn[4].setBackground(Color.red);
		    			break;
				case 3:
					local[5] = 1;
					btn[5].setBackground(Color.red);
		   				break;
				}
				firstActivated += 1;
	}else {
		try {
			aux = whoWin();
		} catch (HeadlessException | IOException e2) {
			e2.printStackTrace();
		}
		if(aux == 1) {
			try {
				new Menu().setVisible(true);
			} catch (HeadlessException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return 1;
		}
		else {
		try {
			switch (generate()) {
			case 0:
				local[0] = 1;
				btn[0].setBackground(Color.red);
    				break;
			case 4:
				local[2] = 1;
				btn[2].setBackground(Color.red);
	    			break;
			case 1:
				local[1] = 1;
				btn[1].setBackground(Color.red);
	   				break;
			case 5:
				local[3] = 1;
				btn[3].setBackground(Color.red);
	    			break;
			case 6:
				local[8] = 1;
				btn[8].setBackground(Color.red);
	    			break;
			case 7:
				local[6] = 1;
				btn[6].setBackground(Color.red);
	    			break;
			case 2:
				local[4] = 1;
				btn[4].setBackground(Color.red);
	    			break;
			case 8:
				local[7] = 1;
				btn[7].setBackground(Color.red);
	    			break;
			case 3:
				local[5] = 1;
				btn[5].setBackground(Color.red);
	   				break;
			}
			aux = whoWin();
			if(aux == 1) {
				new Menu().setVisible(true);
			}
		} catch (HeadlessException | IOException e1) {
			e1.printStackTrace();
		}
		}
	}
	return 0;
}
	
	public int generateFirst () {
		int save = 0;

	switch (ran.nextInt(4)) {
		case 0:
			if(cont[0] != 1) {
				btn[0].setBackground(new Color(255, 69, 0));
    			cont[0] = 1;
				
				//Desabilitar o botão
				btn[0].setEnabled(false);
				
				ativo[0] = true;
				
				save = 0;
				break;
			}
		case 1:
			if(cont[1] != 1) {
				btn[1].setBackground(new Color(255, 69, 0));
   				cont[1] = 1;
				
				//Desabilitar o botão
				btn[1].setEnabled(false);
				
				ativo[1] = true;
				
				save = 1;
   				break;
			}
		case 2:
			if(cont[2] != 1) {
				btn[2].setBackground(new Color(255, 69, 0));
				cont[2] = 1;
				
				//Desabilitar o botão
				btn[2].setEnabled(false);
				
				ativo[2] = true;
				
				save = 2;
				break;
			}
		case 3:
			if(cont[3] != 1) {
				btn[3].setBackground(new Color(255, 69, 0));
   				cont[3] = 1;
				
				//Desabilitar o botão
				btn[3].setEnabled(false);
				
				ativo[3] = true;
				
				save = 3;
   				break;
			}
	}
	return save;
	}
	
}
