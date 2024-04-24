public class notReverse {
    public static void main(String[] args) {
        String palavra = "Abobora Vermelha";
        String resultado="";

        for(int x = palavra.length() -1;x>=0;x--){
            resultado = resultado + palavra.charAt(x);
        }
        System.out.println(resultado);
    }
}