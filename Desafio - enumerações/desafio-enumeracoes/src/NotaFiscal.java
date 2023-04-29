public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusNotaFiscal status = StatusNotaFiscal.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNotaFiscal getStatus() {
        return status;
    }

    public void cancelar() {
        if (getStatus().podeCancelar(getValor())) {
            status = StatusNotaFiscal.CANCELADA;
        } else {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }
    }

    public void emitir() {
        if (getStatus().podeEmitir(getValor())) {
            status = StatusNotaFiscal.EMITIDA;
        } else {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }


    }

    public String getDescricaoCompleta() {
        return String.format("#%d Nota fiscal (%s) valor de R$%.2f esta %s",
                getNumero(), getDescricao(),getValor(),getStatus().getDescricao());
    }

}
