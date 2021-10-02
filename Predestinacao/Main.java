import java.util.Scanner;

public class Main {
Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("*****************");
  System.out.println("* Predestinação *");
  System.out.println("*****************");
  System.out.println();
  System.out.println("Você é Lucy, uma linda bebê que foi abandonada no\n"
    + "orfanato Berkely e sempre se sentiu diferente das outras pessoas.");
  System.out.println();
  System.out.println("Você decide seguir um caminho na sua vida:");
  System.out.println(resultados.caminho1_1());
  System.out.println(resultados.caminho2_1());
  int caminho = sc.nextInt();
  if (caminho == 1) {
   System.out.println(resultados.caminho1_2());
   caminho = sc.nextInt();
   if (caminho == 1 || caminho == 2) {
    System.out.println(resultados.resultado1());    
   }
  }
  else {
   System.out.println(resultados.caminho2_2());
   System.out.println();
   System.out.println(resultados.resultado1());
  }
  System.out.println();
  System.out.println(resultados.resultado2());
  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
  System.out.println(resultados.resultado3());
  System.out.println("------------------------------");
  System.out.println("Alguns dias depois, seu filho é\n"
    + "roubado do hospital por um homem.");
  System.out.println("Você deseja encontrá-lo?");
  System.out.println("[1]sim ou [2]não");
  int decisao1 = sc.nextInt();
  int decisao2;
  if (decisao1 == 1) {
   System.out.println(resultados.resultado4());
   decisao2 = sc.nextInt();
  
   if (decisao2 == 1) {
    System.out.println(resultados.resultado6());
   }
   if (decisao2 == 2) {
    System.out.println(resultados.resultado5());
    System.out.println("GAME OVER");
    System.exit(0);
   }
  }
  else {
   System.out.println(resultados.resultado6());
   System.out.println();
  }
  System.out.println("O homem do bar diz que pode colocar\n"
    + "você frente a frente com ele. Ele diz que\n"
    + "pode viajar no tempo e voltará ao passado no\n"
    + "exato momento em que você conheceu aquele\n"
    + "homem. Você aceita e vai para o passado\n "
    + "com ele.");
  System.out.println("Na viagem ao passado, você encontra Lucy\n"
    + "(você antes da transformação), e vocês começam a \n"
    + "conversar. \n"
    + "[1]Você deseja contar toda a verdade para ela?\n"
    + "[2] Continuar conversando para ver no que dá?");
  int caminho3 = sc.nextInt();
  if (caminho3 == 1) {
   System.out.println(resultados.caminho1_3());
   System.out.println(resultados.resultado8());
   System.out.println("GAME OVER");
   System.exit(0);
  }
  else {
   System.out.println(resultados.caminho3());
   int decisao3 = sc.nextInt();
   if (decisao3 ==1) {
    System.out.println(resultados.resultado7());
    System.out.println("GAME OVER");
    System.exit(0);
   }
   if (decisao3 ==2) {
    System.out.println(resultados.caminho1_4());
   }
  }
  System.out.println("[1]Mudar seu passado\n"
    + "[2]Realizar sua primeira missão");
   
	
  int decisao = sc.nextInt();
  
  if (decisao == 1) {
   System.out.println(resultados.resultado8());
   System.out.println("GAME OVER");
   System.exit(0);
  }
  if (decisao == 2) {
   System.out.println(resultados.caminho1_5());
  System.out.println("Assim aque você se recuperou.\n"
    + "Você tem outra missão.\n"
    + "[1]Eliminar um agente traidor.\n"
    + "[2]Recrutar um novo agente para\n"
    + "ajudar na caçada do terrorista.");
  }
  decisao = sc.nextInt();
  if (decisao == 1) {
   System.out.println(resultados.resultado9());
   System.out.println(resultados.resultado111());
   System.out.println("GAME OVER");
   System.exit(0);
  }
  if (decisao == 2) {
   System.out.println(resultados.resultado10());
   System.out.println();
   System.out.println("Após essa missão, a agência decide\n"
     + "aposentar você. Mas a máquina continua na sua posse.");
   System.out.println("[1]Você deseja concluir a buscar pelo terrorista?\n"
     + "[2]Possuir uma vida normal");
   decisao = sc.nextInt();
   if (decisao == 1) {
    System.out.println(resultados.resultado11());
    System.out.println(resultados.resultado111());
    System.out.println("********");
    System.out.println("*FIM*");
    System.out.println("********");
   }
   if (decisao == 2) {
    System.out.println(resultados.resultado12());
    System.out.println("********");
    System.out.println("*FIM*");
    System.out.println("********");
   }
  }
}
}