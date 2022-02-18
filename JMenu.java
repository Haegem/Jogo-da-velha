import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txtNick;
	private JTextField txtInsiraAqui;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenu frame = new JMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JMenu() throws HeadlessException, FileNotFoundException, IOException {
		Base dataBase = new Base();
		metaData player = new metaData();
		
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//OPÇÕES DE DIFICULDADE
		JComboBox comboBoxDiff = new JComboBox();
		comboBoxDiff.setMaximumRowCount(2);
		comboBoxDiff.setBounds(5, 104, 74, 31);
		comboBoxDiff.setModel(new DefaultComboBoxModel(new String[] {"EASY", "HARD"}));
		comboBoxDiff.setFont(new Font("Txt_IV50", Font.BOLD, 15));
		comboBoxDiff.setSelectedIndex(comboBoxDiff.getSelectedIndex());
		comboBoxDiff.setToolTipText("DIFF");
		
		JLabel lblSelectDiff = new JLabel("Selecione a dificuldade:");
		lblSelectDiff.setFont(new Font("Txt_IV50", Font.PLAIN, 11));
		lblSelectDiff.setToolTipText("SELECTDIFF");
		lblSelectDiff.setBounds(5, 79, 172, 14);
		contentPane.add(lblSelectDiff);
		
		//TÍTULO
		JLabel lblTitle = new JLabel("JOGO DA VELHA");
		lblTitle.setBounds(5, 11, 674, 56);
		lblTitle.setBackground(Color.ORANGE);
		lblTitle.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setFont(new Font("Txt_IV50", Font.BOLD, 40));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setToolTipText("TITLE");
		
		//TÍTULO PARA DIGITAR NICK
		JLabel lblTitleNick = new JLabel("Digite seu nick:");
		lblTitleNick.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleNick.setFont(new Font("Txt_IV50", Font.PLAIN, 25));
		lblTitleNick.setBounds(262, 94, 278, 41);
		lblTitleNick.setToolTipText("TITLENICK");
		contentPane.setLayout(null);
		
		//ÁREA PARA DIGITAR O NICK
		txtNick = new JTextField();
		txtNick.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
		txtNick.setForeground(Color.BLACK);
		txtNick.setBounds(196, 146, 429, 56);
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
		txtInsiraAqui.setBounds(196, 146, 429, 56);
		contentPane.add(txtInsiraAqui);
				
		//BOTÃO PARA CONFIRMAR NICK
		JButton btnConfirm = new JButton("CONFIRMAR");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] encontrado = null;
					try {
						encontrado = player.carregar().split(" = 0 V;");
					} catch (IOException e2) {
						e2.printStackTrace();
					}
				int auxEmerg = 0;
				for(int i=0;i<encontrado.length;i++) {
					if(encontrado[i] == txtNick.getText()) {
						JGameEasy screenEasy = null;
						auxEmerg = 1;
						try {
							screenEasy = new JGameEasy();
							screenEasy.setVisible(true);
							dispose();
							screenEasy.setResizable(false);
							screenEasy.setLocationRelativeTo(null);
						} catch (HeadlessException | IOException e1) {
							e1.printStackTrace();
						}
					}
				}
					if(auxEmerg != 1) {
				try {
					player.salvar(txtNick.getText()+" = 0 V;", true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				dataBase.setDataBase(comboBoxDiff.getSelectedIndex());
				if(comboBoxDiff.getSelectedIndex() == 0) {
					JGameEasy screenEasy = null;
					try {
						screenEasy = new JGameEasy();
						screenEasy.setVisible(true);
						dispose();
						screenEasy.setResizable(false);
						screenEasy.setLocationRelativeTo(null);
					} catch (HeadlessException | IOException e1) {
						e1.printStackTrace();
					}
				}
				else {
					JGameHard screenHard = null;
					try {
						screenHard = new JGameHard();
						screenHard.setVisible(true);
						dispose();
						screenHard.setResizable(false);
						screenHard.setLocationRelativeTo(null);
					} catch (HeadlessException | IOException e1) {
						e1.printStackTrace();
					}
				}
				}
			}
		});
		
		btnConfirm.setBackground(new Color(154, 205, 50));
		btnConfirm.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnConfirm.setToolTipText("CONFIRM");
		btnConfirm.setBounds(364, 213, 128, 23);
		contentPane.add(btnConfirm);
		
		String[] auxiliar = new String[50];
		auxiliar = player.carregar().split(";");
		
		//LISTA DO RANKING
		JList listRanking = new JList(auxiliar);
		listRanking.setFont(new Font("Txt_IV50", Font.PLAIN, 11));
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
