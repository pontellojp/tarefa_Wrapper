

public class NumeroWrapperSimples {
    public static void main(String[] args) {
        // Valor primitivo definido diretamente
        int numeroPrimitivo = 42;

        // Conversão para tipo wrapper
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Impressão no console
        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor wrapper: " + numeroWrapper);
    }
}