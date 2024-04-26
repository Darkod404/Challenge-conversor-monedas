import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Moneda;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {

        try{
            while (true) {

                Scanner consola = new Scanner(System.in);
                
                System.out.println("""
                    *****************************************************************************
                    *                BIENVENIDO AL CONVERSOR DE DIVISAS                         *
                    *****************************************************************************
                    * Mas Utilizadas:                                                           *
                    *                                                                           *
                    *   USD - Estados Unidos        CAD - Canada                                *
                    *   EUR - Union Europea         CHF - Suiza                                 *
                    *   GBP - Reino Unido           CNY - China                                 *
                    *   JPY - Japon                 SEK - Suecia                                *
                    *   AUD - Australia             NZD - Nueva Zelanda                         *
                    *                                                                           *
                    *****************************************************************************
                    *    1- Convertir                                                           *
                    *    2- Comparacion global                                                  *
                    *    0- Salir                                                               *
                    *****************************************************************************
                        """);
                System.out.println("Seleccione una opcion:");
                System.out.print(">> ");
                int menu = consola.nextInt();

                    String apiUlr = "https://v6.exchangerate-api.com/v6/" ;
                    String apiKey = "69383aea4b391eded23bc324";
                    String moneda1 = "",moneda2= "",monto= "";

                    HttpClient client =  HttpClient.newHttpClient();
                    
                if(menu == 1){
                    
                    System.out.println("Ingrese la moneda a convertir");
                    System.out.print(">> ");
                    moneda1 = consola.next();    
                
                    System.out.println("Ingrese la moneda a convertir");
                    System.out.print(">> ");
                    moneda2 = consola.next();

                    System.out.println("Ingrese el monto");
                    System.out.print(">> ");
                    monto = consola.next();

                    String conversorPath = "/pair/"+moneda1+"/"+moneda2+"/"+monto;
                    String baseUrl = apiUlr+apiKey+conversorPath;

                    if (monto == "0") {
                        monto = "1";
                    }

                    HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(baseUrl))
                        .build();
                    
                    HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
                    Moneda moneda = gson.fromJson(json, Moneda.class);

                    System.out.println("-----------------------------------------------------------------------------\n"
                    + "                         " + monto + " " + moneda1.toUpperCase() + " == " + moneda.getConversionResult()+ " " + moneda2.toUpperCase() );
                    System.out.println("-----------------------------------------------------------------------------");
                }

                if(menu == 2){
                    System.out.println("Ingrese la moneda o el pais para comparar");
                    System.out.print(">> ");
                    moneda1 = consola.next();

                    String compararPath = "/latest/"+moneda1;
                    String baseUrl = apiUlr + apiKey + compararPath;

                    
                    HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(baseUrl))
                        .build();
                    
                    HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();
                    Moneda moneda = gson.fromJson(json, Moneda.class);

                    System.out.println("----------------------------------------------------------------------------------------\n"
                    + "1 " + moneda1.toUpperCase() + " equivale a: \n" + moneda.getComparisonResults());
                    System.out.println("----------------------------------------------------------------------------------------");
                    
                    
                }

                if(menu == 0){
                    break;
                }else if(menu < 0 || menu > 2){
                    System.out.println("¡Opcion invalida!");
                }
            }
        } catch(Error e) {
            System.out.println(e.getMessage());
        }

    }
}
