package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecoes.ErroDeConversaoAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        String busca = "";
        //vai criar a lista de titulos
        List<Titulo> titulos = new ArrayList<>();

        // biblioteca do google para criar textos JSON e transformar em objetos
        //Gson gson = new Gson();

        // deserialização
        // pegar o json e tranformar na classe titulo
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        //System.out.println(meuTitulo);RECORD

        //padão de nomeclatura, para pegar com letra maiuscula que vem da api
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                //formata no formato JSON
                .setPrettyPrinting()
                .create();

        // enquanto eu digitar os nomes do filme
        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um nome de um filme para a busca: ");
            busca = leitura.nextLine();
            // vai parar a busca se eu digitar sair
            if (busca.equalsIgnoreCase("sair")){
                break;
            }
            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=513daa7b";

            try {
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

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                //tratamento de exceções quando ocorre erro na formatação da data
                // o erro ocorre mas é tratado para não mostrar o erro e seguir com a axecução do programa

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Título já convertido: ");
                System.out.println(meuTitulo);

               titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Ocorreu um erro de NumberFormatException: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("O um erro de IllegalArgumentException: ");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoAnoException e) {
                System.out.println("Exceção personalizada: ");
                System.out.println(e.getMensagem());
            }
        }
        System.out.println(titulos);

        //gerar arquivos, convertendo os dados em formato JSON
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println( "O programa finalizou corretmanete!");

    }
}

