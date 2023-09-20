import java.util.*;
public class Biblioteca {
    int codigoBusca;
    int contadorLivro;
    Scanner sc2 = new Scanner(System.in);
    Livro livro = new Livro();
    ArrayList<String> listaLivros = new ArrayList<String>();
    
    public void addLivro() {
        System.out.println("Insira o título do livro a ser adicionado: ");
        contadorLivro ++;
        listaLivros.add(sc2.nextLine());
        System.out.println("Código do livro: " + contadorLivro);
    }
    
    public void removeLivro() {
        System.out.println("Insira o código do livro a ser removido: ");
        int codigoRemover = sc2.nextInt();
        sc2.nextLine(); // Limpar o buffer do scanner

        if (codigoRemover >= 1 && codigoRemover <= contadorLivro) {
            String livroRemovido = listaLivros.remove(codigoRemover - 1);
            System.out.println("Livro \"" + livroRemovido + "\" removido com sucesso!");
            contadorLivro--;
        } else {
            System.out.println("Código de livro inválido. Livro não encontrado na lista.");
        }
        
    }
    
    public void buscarLivros() {
        boolean encontrado = false;

        System.out.println("Qual livro você procura? Insira o código dele:");
        int codigoProcurado = sc2.nextInt();
        sc2.nextLine();
    
        for (String livro : listaLivros) {
            int codigoLivro = listaLivros.indexOf(livro) + 1; // O código do livro é o índice + 1
            if (codigoProcurado == codigoLivro) {
                System.out.println("Livro encontrado: " + livro);
                encontrado = true;
                break; // Parar a busca após encontrar o livro
            }
        }
    
        if (!encontrado) {
            System.out.println("Livro não encontrado na lista.");
        }
     }

     public void listarTodos() {
        System.out.println("Lista de Livros:");
        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.println( " - Livro: " + listaLivros.get(i) + " [" + (i + 1)+"]" );
        }
    }
 
}
      

