import java.util.Scanner;

class Main{
    public static void main(String[] dany){
        Jogo.iniciar_jogo();
    }
}


class Jogo {

    public static void iniciar_jogo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome da Vitima ->");
        Jogador.set_nome(scanner.nextLine());
        Menu.exibir_menu();


    }
}

class Menu{

    public static void exibir_menu(){
        Scanner scanner = new Scanner(System.in);
        String [] cenario = Cenarios.get_jason_freddy();
        System.out.printf("%s\n%s",cenario[0],cenario[1]);
        String resposta = scanner.nextLine();
        Cenarios.set_cenario(resposta);
    }
}

class Jogador{
    static String nome;
    
    public static void set_nome(String nome_vem){
        nome = nome_vem;
    } 
}

class Assasino{
    String [] assasinos = {"freddy krueger","Chuck","Jason","Michael Myers"};
    float chance_jason, chance_freddy, chance_michael, chance_chuck;
}

class Cenarios{

    //String [] cenarios = {"floresta","sonho","cidade","acampamento"};

    public static String[] get_jason_freddy(){
        String historia = "\n\nDia: 25/05/2005\nHora:07:45\n\nUm belo dia para dormir o dia todo, mas não esqueça que sua familia planejou ir ao acampamento hoje!\n";
        String perguntas = "\n[1]Ir ao acampamento\n[2]Continuar dormindo\n\nIae? ->";
        String cenario [] = {historia,perguntas};
        return cenario;
    }

    public static void set_cenario(String resposta){
        //System.out.println(resposta);
    }

}