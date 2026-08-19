public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String genero;

    private String telefone;


    public Pessoa(int id, String nome, int idade, String genero, String telefone){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.telefone = telefone;
    }

    public Pessoa(String nome, int idade, String genero, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.telefone = telefone;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade (){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero (){
        return genero;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone (){
        return telefone;
    }
}

