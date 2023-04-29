public enum StatusNotaFiscal {

    NAO_EMITIDA ("Não Emitida") {
        @Override
        public boolean podeCancelar(double valorPedido) {
            return true;
        }
        @Override
        public boolean podeEmitir(double valorPedido) {
            return true;
        }

    }
    , EMITIDA("Emitida") {
        @Override
        public boolean podeCancelar(double valorPedido) {
            return valorPedido < 1_000;
        }
        @Override
        public boolean podeEmitir(double valorPedido) {
            return false;
        }
    }
    , CANCELADA ("Cancelada") {
        @Override
        public boolean podeCancelar(double valorPedido) {
            return true;
        }
        @Override
        public boolean podeEmitir(double valorPedido) {
            return false;
        }

    };
    private String descricao;

    StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract boolean podeCancelar(double valorPedido);

    public abstract boolean podeEmitir(double valorPedido);

}
