import java.util.Arrays;

public class ArraySimples {
    public static void main (String[] args) {
        String[] paises = {"BRASIL", "CHINA", "RUSSIA", "EUA"};
        
        System.out.println(paises[0]);
        System.out.println(Arrays.toString(paises));
        
        int posicao = Arrays.binarySearch(paises, "BRASIL"); //busca binaria da posicao de "BRASIL" no array
        System.out.println(posicao); //print da posicao

        Arrays.sort(paises, 0 , paises.length); //metodo sort para ordenar o array 'paises'
        System.out.println(Arrays.toString(paises)); //print do array 'paises' ordenado
    }

}