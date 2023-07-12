package primeiraaula;

public class PrimeiraAula {

    public static void main(String[] args) {
        // TIPOS DE DADO
        String nome = "Gustavo Roberto"; 
        int dataNascimento = 1997;   
        double altura = 1.76;        
        boolean eProfessor = true;  
        char genero = 'M';
        
        System.out.println("Oi "+ nome + " você tem " + qualIdade(1997) +" anos de idade");
        
        //ESTRUTURA DE CONTROLE
        
        
        if(qualIdade(dataNascimento) >= 18){
            System.out.println(" Você é maior de idade, pode ser preso!");
        }else {
            System.out.println(" Você ainda não pode ser preso, mas pode apanhar!");
        }
        
        // VETORES
        String[] frutas = new String[5];
        frutas[0] = "LARANJA";
        frutas[1] = "MAÇA";
        frutas[2] = "PERA";
        
        String[] frutasDois = {"LARANJA", "MAÇA"};
        int[] numeros = {1,2,3,4,5,6,7,8};
        int[] numerosDois = new int[8];
        numerosDois[0] = 0;
        numerosDois[1] = 1;
        
        // ESTRUTURA DE REPETIÇÃO
        for(int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }
        
        for(String fruta: frutas){
            System.out.println(fruta);
        }
        
        int i = 0;
        while(i < frutas.length){
            System.out.println(frutas[i]);
            i++;
        }
        
        i = 0;
        do{
            System.out.println(frutas[i]);
            i++;
        }while(i < frutas.length);
        
        // CLASSES WRAPPER(INVOLUCRO)
        int variavelPrimitiva = 10;
        Integer variavelEnvolucra = 10;
        
        double valor = 2.10;
        Double valorEnvolucro = 2.10;
        
        boolean valorBool = false;
        Boolean valorBool2 = false;
        
    }
    
    static int qualIdade(int anoNascimento){
        return 2023 - anoNascimento;
    }
    
}
