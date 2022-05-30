import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public Menu(){
        leCSV();
    }

    private void leCSV() {
        String line = "";
        String splitBy = ";";
        int count = 0;
        try {
          BufferedReader br = new BufferedReader(new FileReader("TA_PRECO_MEDICAMENTO.csv"));
          while ((line = br.readLine()) != null)
          {
            count ++;
            Map<Colunas,Object> colunaMed = new HashMap<Colunas,Object>();
            ArrayList<String> substancias = new ArrayList<String>();
            String[] substancia = line.split("\"");
            String[] coluna;
            if(count == 4276){
              System.out.println(count);
            }
            if(substancia.length == 3){
              String[] auxSubs = substancia[1].split(splitBy);
              IntStream.range(0,auxSubs.length)
                .forEach(index -> substancias.add(auxSubs[index]));
              coluna = substancia[2].split(splitBy);
             
            }else{
              coluna = line.split(splitBy);
            }
            IntStream.range(0,coluna.length)
              .forEach(index -> {
                if(index == 0 && substancias.size()>0){
                  colunaMed.put(Colunas.values()[index],substancias);
                }else{
                  colunaMed.put(Colunas.values()[index],coluna[index]);
                }
              });
            medicamentos.add(new Medicamento(colunaMed));
          }
          br.close();
        }
        catch(IOException e) {
          e.printStackTrace();
        }
    }
}


