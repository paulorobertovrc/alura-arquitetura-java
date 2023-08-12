package loja.http;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
        } catch (IOException e) {
//            Provavelmente a requisição seria enviada, porém a URL informada não existe, então é lançada a exceção
//            throw new RuntimeException("Erro ao enviar requisição HTTP", e);
        }

        System.out.println("Dados enviados para a API externa!");
    }

}
