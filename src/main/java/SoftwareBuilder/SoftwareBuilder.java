package SoftwareBuilder;
import java.util.Date;

public class SoftwareBuilder {
    private Software software;

    public SoftwareBuilder() {
        software = new Software();
    }

    public Software build() {
        if (software.getRef() == 0) {
            throw new IllegalArgumentException("Referência inválida");
        }
        if (software.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return software;
    }

    public SoftwareBuilder setRef(int ref) {
        software.setRef(ref);
        return this;
    }

    public SoftwareBuilder setNome(String nome) {
        software.setNome(nome);
        return this;
    }

    public SoftwareBuilder setFabricante(String fabricante) {
        software.setFabricante(fabricante);
        return this;
    }

    public SoftwareBuilder setDataAquisicao(Date dataAquisicao) {
        software.setDataAquisicao(dataAquisicao);
        return this;
    }

    public SoftwareBuilder setDataVencimento(Date dataVencimento) {
        software.setDataVencimento(dataVencimento);
        return this;
    }

    public SoftwareBuilder setVendedor(String vendedor) {
        software.setVendedor(vendedor);
        return this;
    }
}
