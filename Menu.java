import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Menu {

    public void Menu(){
        leCSV();
    }

    public enum Colunas{
        SUBSTANCIA("SUBSTANCIA");

        public final String label;

        private Colunas(String label){
            this.label = label;
        }
    }

    private void leCSV() {
        String line = "";
        String splitBy = ";";

        try {
          BufferedReader br = new BufferedReader(new FileReader("TA_PRECO_MEDICAMENTO.csv"));
          while ((line = br.readLine()) != null)
          {
            Map<Colunas,Object> colunaMed = new HashMap<Colunas,Object>();
            //Medicamento medicamento = new Medicamento();
            String[] coluna = line.split(splitBy);
            /*medicamento.setSubstancia(coluna[0]);
            medicamento.setCNPJ(coluna[1]);
            medicamento.setLaboratorio(coluna[2]);*/

            colunaMed.put(Colunas.SUBSTANCIA,coluna[0]);
            Medicamento medInsere = new Medicamento(colunaMed);
          }
          br.close();
        }
        catch(IOException e) {
          e.printStackTrace();
        }
    }
}


