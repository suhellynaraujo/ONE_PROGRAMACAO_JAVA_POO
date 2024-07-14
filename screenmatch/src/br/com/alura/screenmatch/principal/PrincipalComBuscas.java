package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um nome de um filme para a busca: ");
        var busca = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t="+ busca + "&apikey=513daa7b";
        HttpClient client = HttpClient.newHttpClient();
        // requisição para a api
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        // resposta da api
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        // biblioteca do google para criar textos JSON e transformar em objetos
        //Gson gson = new Gson();

        // deserialização
        // pegar o json e tranformar na classe titulo
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        //System.out.println(meuTitulo);RECORD

        //padão de nomeclatura, para pegar com letra maiuscula que vem da api
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Título já convertido: ");
        System.out.println(meuTitulo);


    }
}

