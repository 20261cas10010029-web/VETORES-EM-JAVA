

public class exvetores {
    

    public static void  mostrarVetor(int []v){
        int i; 
        for(i =0; i < v.length;i++){
            System.out.print(v [i]+ " ");
        }
        System.out.println();

    }
    public static void alterarvetor(int [] v){
        System.out.println(v);
        v [5] = 0;
    }    

    public static void alterarvalorlocal(int x){
        x = 100;
    }

    public static  int somarvetor(int[]v ){
        int soma = 0;
        int i;
        for(i=0;i<v.length;i++){
             soma = soma = v[i];
        }
           return soma;
        
    }

   
    public static void definirvalorvetor(int []v , int valor){
        for(int i=0; i< v.length; i++){
          v[i]= valor; 
        }
    }

    public static int obterposicao(int [] v, int valor){
         int posicao;


         for( int i= 0; i< v.length; i++){
            
            if(v[i]==valor){
                return i;
            }

         }
         return -1;


         
    } 


    
    public static void main(String[] args) {
        
        int [] numeros = {5,8,3,2,8,2,9,3,4,9,2};
        int i;
        int valor_buscar;
        int valor_posicao;


        mostrarVetor(numeros);
        valor_buscar = 9;

        valor_posicao = obterposicao(numeros, valor_buscar);
        System.out.println("o valor" + valor_buscar + "esta posicao " + valor_posicao );
        
        numeros = new int[10];

        for(i=0; i <numeros.length;i++)
        {
            numeros[i] = 20+i;

        }

        System.out.println(numeros);
        mostrarVetor(numeros);
        alterarvetor(numeros);
        mostrarVetor(numeros);

        int var_local = 50;
        System.out.println(var_local);
        alterarvalorlocal(i);
        System.out.println(var_local);



    }
}