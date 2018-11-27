/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Gustavo
 */
public class JPizza {

    /**
     * @param args the command line arguments
     */
    String recheio, temperatura, tempo, adicionais, tamanho, borda, corte, forno, preco;
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public JPizza(String recheio, String temperatura, String tempo, String adicionais, String tamanho, String borda, String corte, String forno, String preco){
        this.recheio = recheio;
        this.temperatura = temperatura;
        this.tempo = tempo;
        this.adicionais = adicionais;
        this.tamanho = tamanho;
        this.borda = borda;
        this.corte = corte;
        this.preco = preco;
        this.forno = forno;
    }

    public String getRecheio() {
        return recheio;
    }
    public String getTemperatura() {
        return temperatura;
    }
    public String getTempo() {
        return tempo;
    }
    public String getAdicionais() {
        return adicionais;
    }
    public String getTamanho() {
        return tamanho;
    }
    public String getBorda() {
        return borda;
    }
    public String getCorte() {
        return corte;
    }
    public String getForno() {
        return forno;
    }
    public String getPreco() {
        return preco;
    }
}
