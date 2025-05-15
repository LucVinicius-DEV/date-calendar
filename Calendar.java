// manipulando um Date com Calendar

// importando as classes necessárias;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.Instant;
import java.util.Calendar;


public class Main {

    public static void main(String[] args) throws ParseException { // lançando a exceção

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // criando o objeto para formatar a data e hora;
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        // somando uma unidade de tempo a data;

        Calendar cal = Calendar.getInstance(); // instanciando o objeto Calendar;
        cal.setTime(d); // associando a data do objeto Date ao objeto Calendar;
        cal.add(Calendar.HOUR_OF_DAY, 4); // adicionando 4 horas a data do objeto Calendar;
        d = cal.getTime(); // atualizando a data do objeto Date;
        System.out.println(sdf.format(d));

        // obtendo uma unidade de tempo da data;

        int minutes = cal.get(Calendar.MINUTE); // obtendo os minutos da data do objeto Calendar;
        int month = 1 + cal.get(Calendar.MONTH); // obtendo o mês da data do objeto Calendar;
        
        // imprimindo os valores obtidos;
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
        // o mês é obtido com um valor a menos, então é necessário somar 1 ao valor obtido;
        
     
    }
}
