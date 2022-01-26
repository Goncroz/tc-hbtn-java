import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {

	public static void main(String[] args) {
		float taxa = 0.2456f;
        float valor = 7654.321f;
        
        Locale ptBr = new Locale("pt", "Br");
        String formatado = NumberFormat.getCurrencyInstance(ptBr).format(valor);
        
        System.out.printf("Valor: " + formatado + "\n" + "Taxa: " + "%.2f%%\n", taxa);
	}
}
