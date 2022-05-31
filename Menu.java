import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;
import java.util.regex.*;

import javax.lang.model.util.ElementScanner6;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public Menu(){
        leCSV2();
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



    private void leCSV2() {
      String line = "";
      String splitBy = ";";
      try {
        BufferedReader br = new BufferedReader(new FileReader("D:/Irmandade/Medicamentos/bin/TA_PRECO_MEDICAMENTO.csv"));
        while ((line = br.readLine()) != null)
        {
          converter(line);
        }
        br.close();
      }
      catch(IOException e) {
        e.printStackTrace();
      }
  }

  public static List<String> split(String str){
    return Stream.of(str.split("[;]"))
      .map (elem -> new String(elem))
      .collect(Collectors.toList());
  }

  public static List<Object> toObjectList(List<String> list){
          boolean aspasAbertas =false;
          List<String> lista = new ArrayList<String>();
          List<Object> listaFinal = new ArrayList<Object>();
          for(String s: list){
            if(s.contains("\"")){
              s.replace('"',' ');
              if(aspasAbertas){
                aspasAbertas=false;
                lista.add(s);
                listaFinal.add(lista);
                lista.clear();
              }
              else aspasAbertas=true;
            }
            if(aspasAbertas){
              lista.add(s);
            }else
            listaFinal.add(s);
          }
          return listaFinal;
  }
  public static Map<Colunas,Object> converter(String str){
    List<Object> list = toObjectList((split(str)));
    Map<Colunas, Object> map = new HashMap<>();
    IntStream.range(0,list.size())
      .forEach(index -> map.put(Colunas.values()[index],list.get(index)));
    return map;
  }
}


