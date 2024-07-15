package excecoes;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            //pelo método "formatarCep" ser uma exception, ele exige que seja feito um try-catch
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP deveria ter 8 dígitos.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        //definindo que o cep deverá ter 8 caracteres
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }

        //simulando um cep formatado
        return "23.765-064";
    }
}

