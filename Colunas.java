public enum Colunas {
    SUBSTANCIA          ("SUBSTANCIA"                                            ,0),
    CNPJ                ("CNPJ"                                                  ,1),
    LABORATORIO         ("LABORATÓRIO"                                           ,2),
    COD_GGREM           ("CÓDIGO GGREM"                                          ,3),
    REGISTRO            ("REGISTRO"                                              ,4),
    EAN1                ("EAN 1"                                                 ,5),
    EAN2                ("EAN 2"                                                 ,6),
    EAN3                ("EAN 3"                                                 ,7),
    PRODUTO             ("PRODUTO"                                               ,8),
    APRESENTACAO        ("APRESENTAÇÃO"                                          ,9),
    CLASSE_TERAPEUTICA  ("CLASSE TERAPÊUTICA"                                    ,10),
    TIPO_PRODUTO        ("TIPO DE PRODUTO (STATUS DO PRODUTO)"                   ,11),
    REGIME_PRECO        ("REGIME DED PREÇO"                                      ,12),
    PF_S_IMPOSTO        ("PF SEM IMPOSTO"                                        ,13),
    PF_0                ("PF 0%"                                                 ,14),
    PF_12               ("PF 12%"                                                ,15),
    PF_17               ("PF 17%"                                                ,16),
    PF_17_ALC           ("PF 17% ALC"                                            ,17),
    PF_17_5             ("PF 17,5%"                                              ,18),
    PF_17_5_ALC         ("PF 17,5% ALC"                                          ,19),
    PF_18               ("PF 18%"                                                ,20),
    PF_18_ALC           ("PF 18% ALC"                                            ,21),
    PF_20               ("PF 20%"                                                ,22),
    PMC_0               ("PMC 0%"                                                ,23),
    PMC_12              ("PMC 12%"                                               ,24),
    PMC_17              ("PMC 17%"                                               ,25),
    PMC_17_ALC          ("PMC 17% ALC"                                           ,26),
    PMC_17_5            ("PMC 17,5%"                                             ,27),
    PMC_17_5_ALC        ("PMC 17,5% ALC"                                         ,28),
    PMC_18              ("PMC 18%"                                               ,29),
    PMC_18_ALC          ("PMC 18% ALC"                                           ,30),
    PMC_20              ("PMC 20%"                                               ,31),
    RESTRICAO_HOSPITALA ("RESTRIÇÃO HOSPITALAR"                                  ,32),
    CAP                 ("CAP"                                                   ,33),
    CANFAZ              ("CONFAZ 87"                                             ,34),
    ICMS                ("ICMS 0%"                                               ,35),
    ANALISE_RECURSAL    ("ANÁLISE RECURSAL"                                      ,36),
    PIS_COFINS          ("LISTA DE CONCESSÃO DE CRÉDITO TRIBUTÁRIO (PIS/COFINS)" ,37),
    COMERCIO_2020       ("COMERCIALIZAÇÃO 2020"                                  ,38),
    TARJA               ("TARJA"                                                 ,39);

        public final String nome_Coluna;
        public final int cod_Coluna;

        private Colunas(String nome_Coluna, int cod_Coluna){
            this.nome_Coluna = nome_Coluna;
            this.cod_Coluna = cod_Coluna;
        }
}
