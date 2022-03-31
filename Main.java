import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Produto produto1 = new Produto(1, 2, 150);
    Produto produto2 = new Produto(2, 4, 100);
    Produto produto3 = new Produto(3, 1, 228);
    int carrinho = 0;

    ArrayList<Produto> produtos = new ArrayList<Produto>();
    produtos.add(produto1);
    produtos.add(produto2);
    produtos.add(produto3);

    for(Produto produto : produtos){
      carrinho+=produto.calcular();
    }

    for(Produto produto : produtos){
      if(produto.id == 1) {
        carrinho+= 15; 
        break;
      }else {
        carrinho+= 5;
      }
    }

    System.out.println(carrinho);

   //DANIEL ROCHA XAVIER 
  }
}