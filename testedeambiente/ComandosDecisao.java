package cursjava.testedeambiente;

public class ComandosDecisao {
    public static void main(String[] args) {
//IF...IF_ELSE...?...SWITCH
// ==  >= <=  !=  >  <  !  (TRUE OR FALSE)

//tabela and &&
/*
 V V = V
 V F = F
 F V = F
 F F = F
*/

//tabela or ||
/*
 V V = V
 V F = V
 F V = V
 F F = F
*/
int idade = 17;
int idadeMinima = 18;
int idadeMaxima = 65;
String res;
    int pos = 1;
//ternaria

res=(
idade >= idadeMinima ? " Aprovado" : "Reprovado"

);
System.out.printf("%nResultado" + res);



switch (pos) {
    case 1:
    System.out.printf("%nprimeiro lugar");
    break;
};

if (idade >= idadeMinima) {
    System.out.printf("%nAluno cadastrado");

}else if(idade >= idadeMaxima){

    System.out.printf("%nO aluno ultrapassa a idade máxima");

}
else{
    System.out.printf("%nO aluno não tem a idade necessaria");

}

System.out.printf("%nFim programa");

    }



 
}
