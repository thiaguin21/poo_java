public class Garcom extends Cliente implements Pedido{

    @Override
    public void anotar() {
        System.out.println("\n==== PEDIDO ====");
        System.out.println("Hamburguer: " + this.getHamburguer());
        System.out.println("Bebida: " + this.getBebida());
        System.out.println("Acompanhamento: " + this.getAcompanhamento());
        System.out.println("Sobremesa: " + this.getSobremesa());
        System.out.println("Adicional Hamburguer: " + this.getAdicHam());
        System.out.println("Adicional Bebida: " + this.getAdicBeb());
        System.out.println("Adicional Batata: " + this.getAdicBat());
        System.out.println("Adicional Sorvete: " + this.getAdicSorv());
        this.setPrecoTotalCombo(getPrecoAcompanhamento() + getPrecoSobremesa() + getPrecoBebida() + getPrecoHamburguer());
        this.setPrecoTotalAdicionais(getPrecoAdicHam() + getPrecoAdicBeb() + getPrecoAdicBat() + getPrecoAdicSorv());
        this.setPrecoTotalPedido(getPrecoTotalCombo() + getPrecoTotalAdicionais());
        System.out.println("==== PREÇO ====");
        System.out.println("Preço combo: " + this.getPrecoTotalCombo());
        System.out.println("Preço Adicionais: " + this.getPrecoTotalAdicionais());
        System.out.println("Preço Pedido: " + this.getPrecoTotalPedido());
    }
    @Override
    public void mostrar() {

    }
}
