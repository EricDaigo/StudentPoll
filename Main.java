class Main {

  //Criar uma função que calcula a frequência e transcreve em asterisco
  public static String returnAsterisco(int num){
    String asterisco = "";

    for(int i = 0; i < num; i ++){
      asterisco += "*"; 
    }

    return asterisco;
  }

  
  public static void main(String[] args) {
    int[] respostas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

    int[] freq = new int[6];
    
    for(int i = 0; i < respostas.length; i++){
      
      try{
        freq[respostas[i]]++;
      }catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
        System.out.printf("respostas(%d) = %d%n%n", i, respostas[i]);
      }

      //try{}catch{} => testa o sistema o try, quando falha o programa segue para o catch: nesse caso o 14 da erro pois a frequ[] vai até no maximo 6
    }

    //Modo simples
    System.out.printf("%s%15s%n", "Resposta", "Frequência");
    for(int j = 1; j < freq.length; j++){

      System.out.printf("%8d%15d%n", j, freq[j]);
      
    }

    System.out.println();

    //Modo com asteriscos
    System.out.printf("%s%15s%n", "Resposta", "Frequência");
    for(int m = 1; m < freq.length; m++){
      System.out.printf("%8d", m);
    
      for(int n = 0; n < freq[m]; n++){
        System.out.printf("%6s", "*");
      }
      
      System.out.println();
    }

    System.out.println();

    //Modo com asteriscos através de função
    System.out.printf("%s%15s%n", "Resposta", "Frequência");
    for(int x = 1; x < freq.length; x++){
      System.out.printf("%8d%15s%n", x, returnAsterisco(freq[x]));
    }
    
  }
}