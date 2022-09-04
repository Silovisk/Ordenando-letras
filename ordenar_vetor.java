import java.util.Scanner;

public class ordenar_vetor 
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Iforme a quantidade de letras: ");
        int qtd_letras = input.nextInt();

        //Vetor que armazena as letras 
        char letras[] = new char[qtd_letras];
        char aux = 0;

        for(int i = 0; i < letras.length;i++)
        {   
            System.out.print("Informe a " + i + "° letra:");
            letras[i] = input.next().charAt(0);
        }

        //trocando letras e colocando em ordem crescente
        for (int i = 0; i < letras.length; i++)
        {
            for (int j = 0; j < letras.length; j++)
            {
                if (letras[i] < letras[j])
                {
                    aux = letras[i];
                    letras[i] = letras[j];
                    letras[j] = aux;
                }
            }
        }
        
        //Imprimindo na tela letra por letra
        for (char letra:letras)
        {
            System.out.print(letra + " ");
        }
        input.close();
    }
}
