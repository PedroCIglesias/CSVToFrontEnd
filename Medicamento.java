import java.util.Map;
import java.util.HashMap;

public class Medicamento {
    private String substancia, cnpj, laboratorio, codigoGgrem, registro, EAN1,
            EAN2, EAN3, produto, apresentacao, classeTerapeutica, tipoDeProduto, regimeDePreco, pfSemImposto, pf0,
            pf12, pf17, pf17ALC, pf17h, pf17hALC, pf18, pf18ALC, pf20, pmc0, pmc12, pmc17, pmc17ALC, pmc17h, pmc17hALC,
            pmc18, pmc18ALC, restricao, cap, confaz, icms, analiseRecursal, listaConcessao, comercializacao2020, tarja;

    private Map<Menu.Colunas, Object> colunas = new HashMap<Menu.Colunas, Object>();

    public Medicamento(Map<Menu.Colunas,Object> colunas) {
        this.colunas = colunas;
    }

    public void setSubstancia(String substancia) {
        this.substancia = substancia;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

}
