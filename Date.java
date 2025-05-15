// trabalhando com datas - Date

// importando as classes necessárias;
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.time.Instant; 
import java.util.TimeZone;


public class Main {

    public static void main(String[] args) throws ParseException { // lançando a exceção

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // criando o objeto para formatar a data;
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // criando outro objeto para formatar a data e a hora
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // criando o objeto para formatar a data e a hora no fuso horário GMT

        Date x1 = new Date(); // criando o objeto com a data atual
        Date x2 = new Date(System.currentTimeMillis()); // convertendo objeto para milissegundos
        Date x3 = new Date(0L); // criando o objeto zerando os milissegundos
        Date x4 = new Date(1000L * 60L * 60L * 5L); // criando o objeto com 5 horas de milissegundos
        
        Date y1 = sdf1.parse("25/06/2018"); // criando o objeto com a data formatada
        Date y2 = sdf2.parse("25/06/2018 15:42:07"); // criando outro objeto com a data e hora formatada
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // criando objeto no formato ISO 8601

        System.out.println("---------------------");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);  
        System.out.println("y3: " + y3);
        // imprimindo os objetos formatados;
        System.out.println("---------------------");
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));  
        System.out.println("y3: " + sdf2.format(y3));// horario do Brasil
        System.out.println("---------------------");
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3)); // horario de Londres
    
    }
}
