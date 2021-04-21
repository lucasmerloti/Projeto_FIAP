import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class home {
public static void main(String[] args) {
	JFrame frame =  new JFrame("Fiap Movies");
	
	

	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(850, 550);
	frame.setVisible(true);
	
	JPanel cadastro =  new JPanel(new BorderLayout(20, 0));
	JPanel imagem =  new JPanel();
	JPanel caracteristicas = new JPanel(new GridLayout(0, 1));
	JPanel referencias = new JPanel(new GridLayout(0, 1));
	referencias.setPreferredSize(new Dimension(130, 400));
	JPanel botoes = new JPanel();
	
	cadastro.add(imagem, BorderLayout.WEST);
	cadastro.add(caracteristicas, BorderLayout.CENTER);
	cadastro.add(referencias, BorderLayout.EAST);
	cadastro.add(botoes, BorderLayout.SOUTH);
	
	JTabbedPane abas = new JTabbedPane();
	abas.add("Cadastro", cadastro);
	abas.add("Lista", new JPanel());
	frame.add(abas);
	
	
	imagem.add(new labImg(new ImageIcon("imagem/imagem.jpg")));
	
	//label titulo
	caracteristicas.add(new MeuLabel("Titulo"));

	
	//textfield titulo
	caracteristicas.add(new MeuTextField());

	
	//label sinopse
	caracteristicas.add(new MeuLabel("Sinopse"));

	
	//textfield sinopse
	caracteristicas.add(new MeuTextField());

	
	

	//label genero
		caracteristicas.add(new MeuLabel("Genero"));

		
	
	//Combo Box Genero
	String[] genero = {"", "Comédia", "Ação", "Drama"};
	caracteristicas.add(new JComboBox<String>(genero));
	

	
	
	//label onde assistir
	referencias.add(new MeuLabel("Onde assistir"));

	
	//Radio Group onde assistir
	List<String> listaDeOpcoes = List.of("Netflix", "Amazon", "Pirate Bay");
	MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes );
	referencias.add(group);
	
	//checkbox assistido
	referencias.add(new MeuCheckBox("Assistido"));
	
	//label genero
	referencias.add(new MeuLabel("Avaliações"));

	
	//starrater assistido
	referencias.add(new StarRater(5, 3.5f));
	
	JButton salvar =  new JButton("Salvar");
	botoes.add(salvar);
	
	JButton cancelar =  new JButton("Cancelar");
	botoes.add(cancelar);
	
	
	
	
	frame.setVisible(true);
	
	
}
}
