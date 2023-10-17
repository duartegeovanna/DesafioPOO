package aparelho;

public class Telefone implements AparelhoTelefonico {

    private String numero;
    private boolean emChamada;

    public Telefone(String numero) {
        this.numero = numero;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Após o sinal, deixe a sua mensagem no correio de voz");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isEmChamada() {
        return emChamada;
    }

    public void setEmChamada(boolean emChamada) {
        this.emChamada = emChamada;
    }


}
