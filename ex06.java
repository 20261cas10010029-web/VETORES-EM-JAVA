    import java.util.Scanner;

    public class ex06 {
        
    public static Scanner leia = new Scanner (System.in);
    public static int lerinteiro(String msg){
        System.out.print(msg);
        return leia.nextInt();
    }
    public static void main(String[] args) {
        
        //variaveis//
        int[] valores;
        int n = 10;
        int idxpares, idximpares,i, valor;

        //alocação do vetor
        valores = new int[n];


        // valores iniciais
        idxpares = 0;
        idximpares = valores.length-1;
        for(i=0; i < valores.length;i++){
            valor = lerinteiro("");
            if(valor % 2 == 0)
            {valores [idxpares] = valor ;
            idxpares++;}

        else {valores[idximpares]= valor;
        idximpares--;}
        }
          for(i=0; i < 10;i++){
        System.out.print(valores[i]+ ", ");
    }



}


}