class Compra {
    private Double valor;
    public Integer formaDePagamento;

    public Compra(Double valor, Integer formaDePagamento) {
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getFormaDePagamento() {
        return this.formaDePagamento;
    }

    public void setFormaDePagamento(Integer formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}