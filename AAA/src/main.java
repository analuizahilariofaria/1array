import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:");
            numeros[i] = Integer.parseInt(input);
        }

        String resultado = "Conteúdo do Array:\n";
        
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}