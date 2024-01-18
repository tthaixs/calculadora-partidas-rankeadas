public class CalculadoraPartidas{
    public static void main(String[] args)  {
       calcularSaldo (52, 20);
        
    }

    static int calcularSaldo(int vitorias, int derrotas){
        int saldo = vitorias - derrotas;
        String nivel = "";
            
            while (vitorias<=10){
                nivel = "Ferro";
                break;
            }

            while (vitorias>=11 && vitorias<=20){
                nivel = "Bronze";
                break;
            }

            while (vitorias>=21 && vitorias<=50){
                nivel = "Prata";
                break;
            }

            while (vitorias>=51 && vitorias<=80){
                nivel = "Ouro";
                break;
            }

            while (vitorias>=81 && vitorias<=90){
                nivel = "Diamante";
                break;
            }

            while (vitorias>=91 && vitorias<=100){
                nivel = "Lendário";
                break;
            }

            while (vitorias>=101){
                nivel = "Imortal";
                break;
            }
 
        System.out.println("O Herói de saldo " + saldo + " está no nível de "+ nivel);
        
        return saldo;
    }

}
