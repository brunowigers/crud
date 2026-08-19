import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        Conexao.inicializarBanco();

        SwingUtilities.invokeLater(() ->{
            PessoaView tela = new PessoaView();
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        });

    }
}