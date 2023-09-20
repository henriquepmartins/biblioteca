import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int menu;
        try (Scanner sc = new Scanner(System.in)) {
            Biblioteca biblioteca = new Biblioteca();
            do {
                exibeMenu();
                menu = sc.nextInt();
                
                switch (menu) {
                    case 1:
                    biblioteca.addLivro();
                    System.out.println("\nLivro adicionado! \n" );
                    break;

                    case 2:
                    biblioteca.removeLivro();
                    break;      

                    case 3:
                    biblioteca.buscarLivros();
                    break;

                    case 4:
                    biblioteca.listarTodos();
                    
                    break;

                    case 5:
                    System.out.println("Volte sempre!");
                    System.exit(0);

                    default: 
                    System.out.println("Livro não encontrado");
                    break;
                }
                
            } while (menu !=5);
        }
        
        
    }
    static void exibeMenu(){
            System.out.println("------------------------------------------------");
            System.out.println("|------------Bem vindo a biblioteca!------------|");
            System.out.println("------------------------------------------------");
            System.out.println("|O que deseja?                                  |");
            System.out.println("|1 - Adicionar um livro à coleção da biblioteca.|");
            System.out.println("|2 - Remover livro da biblioteca.               |");
            System.out.println("|3 - Buscar livro                               |");
            System.out.println("|4 - Listar todos os livros                     |");
            System.out.println("|5 - Sair                                       |");
            System.out.println("------------------------------------------------");
    }
    
}
