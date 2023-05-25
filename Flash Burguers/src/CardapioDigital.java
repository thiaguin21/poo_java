public class CardapioDigital{

    /// ATRIBUTOS CARDAPIO ///
    private int Hamburguer, bebida, acompanhamento, sobremesa, adicionais;
    private float precoTotal, precoBebida, precoHamburguer, precoAcompanhamento, precoSobremesa, precoAdicionais;
    private boolean aberto;

    /// METODOS GET-SET CARDAPIO ///

    protected int getAdicionais() {
        return adicionais;
    }
    protected void setAdicionais(int adicionais) {
        this.adicionais = adicionais;
    }
    protected float getPrecoAdicionais() {
        return precoAdicionais;
    }
    protected void setPrecoAdicionais(float precoAdicionais) {
        this.precoAdicionais = precoAdicionais;
    }
    protected float getPrecoSobremesa() {
        return precoSobremesa;
    }
    protected void setPrecoSobremesa(float precoSobremesa) {
        this.precoSobremesa = precoSobremesa;
    }
    protected int getSobremesa() {
        return sobremesa;
    }
    protected void setSobremesa(int sobremesa) {
        this.sobremesa = sobremesa;
    }
    protected int getAcompanhamento() {
        return acompanhamento;
    }
    protected void setAcompanhamento(int acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
    protected float getPrecoTotal() {
        return precoTotal;
    }
    protected void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }
    protected float getPrecoBebida() {
        return precoBebida;
    }
    protected void setPrecoBebida(float precoBebida) {
        this.precoBebida = precoBebida;
    }
    protected float getPrecoHamburguer() {
        return precoHamburguer;
    }
    protected void setPrecoHamburguer(float precoHamburguer) {
        this.precoHamburguer = precoHamburguer;
    }
    protected float getPrecoAcompanhamento() {
        return precoAcompanhamento;
    }
    protected void setPrecoAcompanhamento(float precoAcompanhamento) {
        this.precoAcompanhamento = precoAcompanhamento;
    }
    protected boolean getAberto() {
        return aberto;
    }
    protected void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    protected int getHamburguer() {
        return Hamburguer;
    }
    protected void setHamburguer(int hamburguer) {
        Hamburguer = hamburguer;
    }
    protected int getBebida() {
        return bebida;
    }
    protected void setBebida(int bebida) {
        this.bebida = bebida;
    }

    /// METODOS PERSONALIZADOS CARDAPIO ///
    protected void abrirCardapio(){
        this.setAberto(true);
    }
    protected void mostrarHamburguer(){
        if(getAberto()){
            System.out.println("====== HAMBURGUERES ======");
            System.out.println("1- Cheeseburguer - R$20\n" +
                               "Ingredientes: Pão com gergelim, 1 hambúrguer de carne bovina,\n" +
                               "2 fatias de queijo muçarela derretido e picles.");
            System.out.println("=========================");
            System.out.println("2- Duplo Bacon - R$28\n" +
                               "Ingredientes: Pão com gergelim, 2 hambúrgueres de carne bovina,\n" +
                               "3 fatias de bacon crocante, 2 fatias de queijo muçarela derretido,\n" +
                               "ketchup e mostarda.");
            System.out.println("=========================");
            System.out.println("3- Flashs King - R$30\n" +
                               "Ingredientes: 2 hambúrgueres de carne bovina, molho especial do restaurante,\n" +
                               "picles, cebola, pão com gergelim, alface, 2 fatias de queijo muçarela derretido\n" +
                               "e ketchup");
            System.out.println("=========================");
            System.out.println("4- Choripan da casa - R$26\n" +
                               "Ingredientes: Pão com gergelim, 1 hambúrguer de linguiça, \n" +
                               "molho especial do restaurante, 1 fatia de queijo cheddar derretido,\n" +
                               "alface, tomate e cebola.");
            System.out.println("=========================");
            System.out.println("5- Hambúrguer Vegetariano - R$32\n" +
                               "Ingredientes: 1 hambúrguer de proteína de soja, 1 ovo frito,\n" +
                               "2 fatias de queijo muçarela derretido, alface, tomate, cebola,\n" +
                               "picles e ketchup.");
            System.out.println("=========================");
            System.out.println("6- Chicken Burguer - R$28\n" +
                               "Ingredientes: Pão com gergelim, 2 hambúrgueres de frango empanado,\n" +
                               "2 fatias de queijo muçarela derretido, ketchup e mostarda");
            System.out.println("=========================");
            System.out.println("7- X-Salada - R$28\n" +
                               "Ingredientes: Pão com gergelim, 1 hambúrguer de carne bovina,\n" +
                               "1 fatia de queijo cheddar derretido, alface, tomate, cebola em rodelas,\n" +
                               "pepino e maionese.");
            System.out.println("=========================");
            System.out.println("8- Artesanal - R$32\n" +
                               "Ingredientes: Pão sem gergelim, 2 hambúrgueres especial grelhado artesanal,\n" +
                               "molho especial do restaurante, 2 fatias de queijo cheddar derretido,\n" +
                               "cebola em rodelas e tomate.");
            System.out.println("=========================");
            System.out.println("9- Chicken Burguer Jr - R$20\n" +
                               "Ingredientes: Pão pequeno sem gergelim, 1 hambúrguer de frango empanado,\n" +
                               "1 fatia de queijo derretida com ketchup.");
            System.out.println("=========================");
            System.out.println("10- Cheeseburger Jr - R$16\n" +
                               "Ingredientes: Pão pequeno sem gergelim, 1 hambúrguer bovino,\n" +
                               "1 fatia de queijo mussarela derretido com ketchup.");
        } else{
            System.out.println("=== ABRA O CARDÁPIO PRIMEIRO ===");
        }
    }
    protected void escolherHamburguer(int ham){
        if(this.getAberto()){
            this.setHamburguer(ham);
            switch (ham){
                case 1:
                    System.out.println("Escolheu o Cheeseburguer!");
                    this.setPrecoHamburguer(20.0f);
                    break;
                case 2:
                    System.out.println("Escolheu o Duplo Bacon!");
                    this.setPrecoHamburguer(28.0f);
                    break;
                case 3:
                    System.out.println("Escolheu o Flashs King!");
                    this.setPrecoHamburguer(30.0f);
                    break;
                case 4:
                    System.out.println("Escolheu o Choripan da casa!");
                    this.setPrecoHamburguer(26.0f);
                    break;
                case 5:
                    System.out.println("Escolheu o Hambúrguer Vegetariano!");
                    this.setPrecoHamburguer(32.0f);
                    break;
                case 6:
                    System.out.println("Escolheu o Chicken Burguer!");
                    this.setPrecoHamburguer(28.0f);
                    break;
                case 7:
                    System.out.println("Escolheu o X-Salada!");
                    this.setPrecoHamburguer(28.0f);
                    break;
                case 8:
                    System.out.println("Escolheu o Artesanal!");
                    this.setPrecoHamburguer(32.0f);
                    break;
                case 9:
                    System.out.println("Escolheu o Chicken Burguer Jr!");
                    this.setPrecoHamburguer(20.0f);
                    break;
                case 10:
                    System.out.println("Escolheu o Cheeseburger Jr!");
                    this.setPrecoHamburguer(16.0f);
                    break;
                default:
                    System.out.println("Não trabalhamos com este Hamburguer.\n" +
                                       "Escolha o que está no cardápio.");
            }
        } else {
            System.out.println("=== ABRA O CARDÁPIO PRIMEIRO ===");
        }
    }
    protected void mostrarBebida(){
        if (this.getAberto()){
            System.out.println("====== BEBIDAS ======");
            System.out.println("1- Suco de abacaxi com hortelã 500ml - R$10\n" +
                               "Ingredientes: polpa de abacaxi, folha de hortelã,\n" +
                               "açúcar e gelo.");
            System.out.println("=========================");
            System.out.println("2- Suco de Morango com Acerola 500ml - R$10\n" +
                               "Ingredientes: polpa de morango, polpa de acerola,\n" +
                               "açúcar e gelo. ");
            System.out.println("=========================");
            System.out.println("3- Suco de Manga 500ml - R$10\n" +
                               "Ingredientes: Polpa de manga, açúcar e gelo.");
            System.out.println("=========================");
            System.out.println("4- Coca-Cola Lata 350ml - R$7");
            System.out.println("=========================");
            System.out.println("5- Guaraná Antarctica Lata 350ml - R$6");
            System.out.println("=========================");
            System.out.println("6- H2O de Limão 500ml - R$9");
            System.out.println("=========================");
            System.out.println("7- Cerveja Heineken lata 350ml - R$5");
            System.out.println("=========================");
            System.out.println("8- Cerveja Brahma duplo malte Lata 350ml - R$7");
            System.out.println("=========================");
            System.out.println("9- Skol Beats Lata 269ml - R$9");
            System.out.println("=========================");
            System.out.println("10- Red Bull Energy Drink Lata 250ml - R$8");
            System.out.println("=========================");
        } else {
            System.out.println("=== ABRA O CARDÁPIO PRIMEIRO ===");
        }
    }
    protected void escolherBebida(int beb){
        if(this.getAberto()){
            this.setBebida(beb);
            switch (beb){
                    case 1:
                        System.out.println("Escolheu o Suco de abacaxi com hortelã 500ml!");
                        this.setPrecoBebida(10.0f);
                        break;
                    case 2:
                        System.out.println("Escolheu o Suco de Morango com Acerola 500ml!");
                        this.setPrecoBebida(10.0f);
                        break;
                    case 3:
                        System.out.println("Escolheu o Suco de Manga 500ml!");
                        this.setPrecoBebida(10.0f);
                        break;
                    case 4:
                        System.out.println("Escolheu a Coca-Cola Lata 350ml!");
                        this.setPrecoBebida(7.0f);
                        break;
                    case 5:
                        System.out.println("Escolheu a Guaraná Antarctica Lata 350ml!");
                        this.setPrecoBebida(6.0f);
                        break;
                    case 6:
                        System.out.println("Escolheu a H2O de limão 500ml!");
                        this.setPrecoBebida(9.0f);
                        break;
                    case 7:
                        System.out.println("Escolheu a Cerveja Heineken lata 350ml!");
                        this.setPrecoBebida(5.0f);
                        break;
                    case 8:
                        System.out.println("Escolheu a Cerveja Brahma duplo malte Lata 350ml!");
                        this.setPrecoBebida(7.0f);
                        break;
                    case 9:
                        System.out.println("Escolheu a Skol Beats Lata 269ml!");
                        this.setPrecoBebida(9.0f);
                        break;
                    case 10:
                        System.out.println("Escolheu a Red Bull Energy Drink Lata 250ml!");
                        this.setPrecoBebida(8.0f);
                        break;
                    default:
                        System.out.println("Não trabalhamos com esta bebida.\n" +
                                           "Escolha o que está no cardápio.");
                }
            } else {
                System.out.println("=== ABRA O CARDÁPIO PRIMEIRO ===");
            }
    }
    protected void mostrarAcompanhamento(){
        if (getAberto()){
            System.out.println("====== ACOMPANHAMENTOS ======");
            System.out.println("1- Batata Flash - R$10\n" +
                               "Ingredientes: Batata frita em tiras, sal e orégano.");
            System.out.println("=========================");
            System.out.println("2- Onion Rings - R$20\n" +
                               "Ingredientes: Rodela de cebolas, farinha de trigo temperada e leite. ");
            System.out.println("=========================");
            System.out.println("3- Porção de Nachos Sour Cream - R$28\n" +
                               "Ingredientes: Tortilhas, Cream cheese, limão, Creme de leite e Sal. ");
            System.out.println("=========================");
            System.out.println("4- Porção Sticks de Queijo - R$15\n" +
                               "Ingredientes: Tiras de queijo muçarela, Ovos, Farinha de trigo,\n" +
                               "Farinha de rosca e óleo pra fritar por imersão.\n");
            System.out.println("=========================");
            System.out.println("5- Flash nuggets- R$20\n" +
                               "Ingredientes: Filé de frango, Cebola ralada, alho, salsinha,\n" +
                               "Cream cheese, ovo, creme de leite, sal e pimenta do reino.");
            System.out.println("=========================");
        } else {
            System.out.println("=== ABRA O CARDÁPIO PRIMEIRO ===");
        }
    }
    protected void escolherAcompanhamento(int acomp){
        if (getAberto()){
            this.setAcompanhamento(acomp);
            switch (acomp){
                case 1:
                    System.out.println("Escolheu a Batata Flash");
                    this.setPrecoAcompanhamento(10.0f);
                    break;
                case 2:
                    System.out.println("Escolheu a Onion Rings");
                    this.setPrecoAcompanhamento(20.0f);
                    break;
                case 3:
                    System.out.println("Escolheu a Porção de Nachos Sour Cream");
                    this.setPrecoAcompanhamento(28.0f);
                    break;
                case 4:
                    System.out.println("Escolheu a Porção Sticks de Queijo");
                    this.setPrecoAcompanhamento(15.0f);
                    break;
                case 5:
                    System.out.println("Escolheu o Flash nuggets");
                    this.setPrecoAcompanhamento(20.0f);
                    break;
                default:
                    System.out.println("Não trabalhamos com este acompanhamento.\n" +
                                       "Escolha o que está no cardápio.");
            }
        } else {
            System.out.println("=== ABRA O CARDÁPIO PRIMEIRO ===");
        }
    }
    protected void mostrarSobremesa(){
        if (getAberto()){
            System.out.println("====== SOBREMESAS ======");
            System.out.println("1- Petit Gateau com sorvete de pistache - R$25\n" +
                               "Ingredientes: Petit Gateau sabor chocolate,\n" +
                               "1 bola de sorvete sabor pistache com calda de chocolate.");
            System.out.println("=========================");
            System.out.println("2- Brownie com sorvete de creme - R$25\n" +
                               "Ingredientes: Brownie, 1 bola de sorvete sabor creme\n" +
                               "com calda de chocolate.");
            System.out.println("=========================");
            System.out.println("3- Sorvete na taça napolitano - R$17\n" +
                               "Ingredientes: 3 bolas de sorvete napolitano\n" +
                               "com calda de chocolate.");
            System.out.println("=========================");
            System.out.println("4- Mousse de maracujá - R$22\n" +
                               "Ingredientes: Mousse de maracujá da casa, polpa de maracujá\n" +
                               "e folha de hortelã.");
            System.out.println("=========================");
        } else {
            System.out.println("=== ABRA O CARDÁPIO PRIMEIRO ===");
        }
    }
    protected void escolherSobremesa(int sobre){
        if (getAberto()){
            this.setSobremesa(sobre);
            switch (sobre){
                case 1:
                    System.out.println("Escolheu o Petit Gateau com sorvete de pistache");
                    this.setPrecoSobremesa(25.0f);
                    break;
                case 2:
                    System.out.println("Escolheu o Brownie com sorvete de creme");
                    this.setPrecoSobremesa(25.0f);
                    break;
                case 3:
                    System.out.println("Escolheu o Sorvete na taça napolitano");
                    this.setPrecoSobremesa(17.0f);
                    break;
                case 4:
                    System.out.println("Escolheu o Mousse de maracujá");
                    this.setPrecoSobremesa(22.0f);
                    break;
                default:
                    System.out.println("Não trabalhamos com este acompanhamento.\n" +
                                       "Escolha o que está no cardápio.");
            }
        } else {
            System.out.println("=== ABRA O CARDÁPIO PRIMEIRO ===");
        }
    }
    protected void fecharCardapio(){
        this.setAberto(false);
    }

}
