class CartaoService implements ServiceInterface {
    private Compra compra;
    private Integer parcelas;
    private String cartao;
    private Double valorFinal;

    public CartaoService(Compra compra, Integer parcelas, Integer bandeira) {
        this.compra = compra;
        this.criarCartao(bandeira);
        this.validarParcelas(parcelas);
        this.parcelas = parcelas;
    }

    private void validarParcelas(Integer parcelas) {
        if (this.cartao.equals("visa")
                && parcelas > 0
                && parcelas <= 5) {
            this.parcelas = parcelas;
        } else if (this.cartao.equals("outros")
                && parcelas > 0
                && parcelas <= 3) {
            this.parcelas = parcelas;
        } else {
            System.err.println("Número de parcelas inválido!");
            System.exit(-1);
        }
    }

    private void criarCartao(Integer bandeira) {
        if (bandeira == 1) {
            this.cartao = "visa";
        } else {
            this.cartao = "outros";
        }
    }

    public void processar() {
        this.valorFinal = this.compra.getValor() / this.parcelas;
    }

    public Integer getParcelas() {
        return this.parcelas;
    }

    public Double getValorFinal() {
        return this.valorFinal;
    }
}