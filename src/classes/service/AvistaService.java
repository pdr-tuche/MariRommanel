class AvistaService implements ServiceInterface {
    private Compra compra;
    private Double valorFinal;

    public AvistaService(Compra compra) {
        this.compra = compra;
    }

    public void processar() {
        this.valorFinal = this.compra.getValor() - (this.compra.getValor() * 0.05);
    }

    public Double getValorFinal() {
        return this.valorFinal;
    }
}
