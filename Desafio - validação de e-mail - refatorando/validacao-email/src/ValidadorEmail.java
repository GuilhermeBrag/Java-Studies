import java.util.Arrays;
import java.util.List;

public class ValidadorEmail {

    // nome_do_usuario@dominio.sufixodoDominio
    //
    public static boolean validar(String email) {
        int posicaoArroba = email.indexOf("@");
        int posicaoSufixo = email.lastIndexOf(".");

        if (posicaoArroba == -1) return false;
        if (posicaoSufixo <= posicaoArroba) return false;

        String nomeUsuario = email.substring(0, posicaoArroba);
        String nomeDominio = email.substring(posicaoArroba + 1, posicaoSufixo);
        String sufixoDominio = email.substring(posicaoSufixo + 1);

        if (!validarNomeUsuario(nomeUsuario)) return false;
        if (!validarNomeDominio(nomeDominio)) return false;

        return validarSufixoDominio(sufixoDominio);
    }

    public static boolean validarNomeUsuario(String nomeUsuario) {
        if (nomeUsuario.isEmpty()) {
            return false;
        }
        //aceita letras (maiuscula e minuscula),digitos e "_ . - ", mas nao aceita caracteres especiais
         return validarCaracteres(nomeUsuario,true, '_','-','.');
    }

    public static boolean validarNomeDominio (String nomeDominio) {
        if (nomeDominio.isEmpty()) {
            return false;
        }
        // letras mininsculas e digitos e "- ."
        return validarCaracteres(nomeDominio,false, '-','.');
    }

    public static boolean validarSufixoDominio(String nomeSufixo) {
        if (nomeSufixo.isEmpty()) {
            return false;
        }
        // pode ter 2 ou 3 caracteres, aceita apenas letras minusculas
        return validarCaracteresSufixo(nomeSufixo,2,3);
    }


    public static boolean validarCaracteres (String email, boolean aceitaMaiusculos, Character... caracteresAceitos) {
        for (int i = 0; i < email.length(); i++) {
            char caractere = email.charAt(i);
            if (!validarCaractere(caractere,aceitaMaiusculos,caracteresAceitos)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validarCaractere(Character caractere, boolean aceitaMaiusculo,
                                           Character... caracteresExtrasAceitos) {
        List<Character> caracteresExtras = Arrays.asList(caracteresExtrasAceitos);

        return (Character.isLetter(caractere) && (aceitaMaiusculo || Character.isLowerCase(caractere)))
                || Character.isDigit(caractere)
                || caracteresExtras.contains(caractere);
    }

    public static boolean validarCaracteresSufixo(String email, int quantMinCaracter, int quantMaxCaracter) {
        if (email.length() < quantMinCaracter || email.length() > quantMaxCaracter) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            if (!Character.isLetter(email.charAt(i)) || !Character.isLowerCase(email.charAt(i))) {
                return false;
            }
        }
        return true;
    }


}
