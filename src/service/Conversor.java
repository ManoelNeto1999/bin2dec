package service;

public class Conversor {

    public int converte(String numero) {
        int contador = numero.length();
        int resultadoFinal = 0;
        for (int i = 0; i < numero.length(); i++) {
            contador--;
            int formula = 0;
            String numeroDaRodada = numero.substring(i, i + 1 );

            if (numeroDaRodada.equals("1")) {
                int numeroConvertido = Integer.parseInt(numeroDaRodada);
                formula = (int) (numeroConvertido * Math.pow(2, contador));
                resultadoFinal += formula;
            }
        }
        return resultadoFinal;
    }
}
