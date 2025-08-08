public class Teste {
    public static void main(String[] args) {
        System.out.println("olá java no vs code");
        System.out.println(222); //testando comentário
        String name="cr7";
        String qualidade="melhor do mundo";
        System.out.println("Olá "+ name+ " " + qualidade);

        int largura=60;
        int comprimento=20;
        int area;

        area=largura*comprimento;

        System.out.println("Largura é: " +largura+ " e comprimento é: "+ comprimento);
        System.out.println(area);

        int x=70;
        x+=10;
        int y=30;
        System.out.println(x);
        System.out.println(x>y);

        String nome= "matheus";

        System.out.println(nome.length()+" "+ nome.toUpperCase());

        String txt= "Estará em \"aspas\" \nnova linha";

        System.out.println(txt);

        float a  = (float) Math.sqrt(125);
        System.out.println(a);

        int minhaIdade=25;
        int idadeMinimaDeVoto=18;

        //if, else e switch

        if (minhaIdade>=idadeMinimaDeVoto){
            System.out.println("voce pode votar");
        }else{
            System.out.println("não pode votar");
        }
         int day=3;
         switch (day){
            case 1 -> System.out.println("segunda");

            case 2 -> System.out.println("terça");

            case 3 -> System.out.println("quarta");
         }

         int n=13;

         //for

         for (int i = 0 ; i <= 4; i++){
             System.out.println(i);
         }
        
         for (int i = 0 ; i <= 4; i++){
             n+=i;
            System.out.println(n);
         }

         for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(j*i);
                
            }  
         }

         // arrays:

         String[] players= {"cr7", "messi", "kj"};
         System.out.println(players[0]);
         System.out.println(players.length);

         int idades[]= {10,40,49,50,65,89};
         float media, soma=0;
         int tamanho=idades.length;

         for (int i = 0; i < idades.length; i++) {
            soma+=idades[i];
         }
         System.out.println("A soma das idades é: "+soma);

         media=soma/tamanho;

         System.out.println("A media das idades é: "+ media);

        // matriz

        int exemploMatriz[][]= {{10,20,30}, {40,80}};
        System.out.println(exemploMatriz[1][1]);
        exemploMatriz[1][1]=190;
        System.out.println(exemploMatriz[1][1]);

        







        



         


    













        





    }

}
