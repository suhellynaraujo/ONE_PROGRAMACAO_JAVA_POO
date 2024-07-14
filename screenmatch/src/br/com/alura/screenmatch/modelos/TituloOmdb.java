package br.com.alura.screenmatch.modelos;
// claase especial para tratar as serialização e deserialização
// já vem com um construtor padrão, getter e setter, toString já como padrão
public record TituloOmdb(String title, String year, String runtime) {
}
