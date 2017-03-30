package rm77273.listview.exercicios.fiap.com.br.desafio;

/**
 * Created by logonrm on 30/03/2017.
 */

public class Pizza {

    private String nome;
    private String descricao;
    private String ingredientes;
    private String pontuacao;
    private String alergia;
    private int imgpizza;


    public Pizza(String nome, String descricao, String ingredientes, String pontuacao, String alergia, int imgpizza) {
        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
        this.pontuacao = pontuacao;
        this.alergia = alergia;
        this.imgpizza = imgpizza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public int getImgpizza() {
        return imgpizza;
    }

    public void setImgpizza(int imgpizza) {
        this.imgpizza = imgpizza;
    }
}
