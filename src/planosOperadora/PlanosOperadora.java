package planosOperadora;

public class PlanosOperadora {
    public static void main(String[] args) {
        //tipos: Basic, Midia e Turbo
        String plano = "M";

        //-----------------------------------------------------------------------

        //com o if, é necessário repetir as vantagens já existentes nos planos menores e
        // adicionar as vantagens adicionais

//        if (plano == "B"){
//            System.out.println("100 minutos de ligação");
//        } else if (plano == "M"){
//            System.out.println("100 minutos de ligação");
//            System.out.println("Whats e Instagram gratuitos");
//        } else if (plano == "T") {
//            System.out.println("100 minutos de ligação");
//            System.out.println("Whats e Instagram gratuitos");
//            System.out.println("5GB no Youtube");
//        }

        //-----------------------------------------------------------------------

        //com o switch-case, podemos utilizar a nosso favor o fato de ele continuar rodando
        //as condições caso não adicionarmos o break para não tornar repetitivo o código

        //para fazer isso, foi necessário apenas inverter a ordem dos case, deixando-os de
        //modo decrescente

        switch (plano){
            case "T": {
                System.out.println("5GB no Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram gratuitos");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
