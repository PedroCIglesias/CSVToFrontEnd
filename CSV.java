import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class CSV {
  public static void main(String[] args) {
    String line = "";
    String splitBy = ";";
    Map<String,String> medicamentos = new HashMap<String,String>();

    try {
      //parsing a CSV file into BufferedReader class constructor  
      BufferedReader br = new BufferedReader(new FileReader("TA_PRECO_MEDICAMENTO.csv"));
      while ((line = br.readLine()) != null)
      //returns a Boolean value  
      {
        String[] employee = line.split(splitBy);
        //use comma as separator  
        System.out.println("Emp[First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Contact=" + employee[2] + ", City= " + employee[3] + "]");
      }
      br.close();
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }
}
