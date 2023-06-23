package edu.faluckes.segundasemana;
public class MinhaClasse {
    public static void main (String [] args){
        String primeiroNome = "Faluckes";
        String segundoNome = "Munhoz";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(primeiroNome);
        System.out.println(segundoNome);

        System.out.println(nomeCompleto);
        

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
