package conceitos_basicos;
public class operadores_logicos {
    public static void main(String[] args) {
        /*
         * Operadores Lógicos
         * && = e
         * || = ou
         */
        boolean resultado;
        int a = 10;
        int b = 10;
        
        if (a == b && 10<20) {
            resultado = true;
        }else{
            resultado = false;
        }

        System.out.println(resultado);
    }
}
