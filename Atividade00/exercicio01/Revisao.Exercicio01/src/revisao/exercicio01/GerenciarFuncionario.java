/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao.exercicio01;
import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public class GerenciarFuncionario { 
    static int TAM = 3;

    public static void main(String[] args) {
        // TODO code application logic here
        int posicao=0;
        boolean t;
        
        Funcionario func = new Funcionario(1, "João", "Recursos Humanos", LocalDate.now(), 3000d, "029874793", true); 
        func.atualizarSalario(100d);
        func.imprimir();
        func.demitirFuncionario();
        func.imprimir();
        
        Funcionario f1 = new Funcionario(1, "Pedro", "Recursos Humanos", LocalDate.now(), 3000d, "029874793", true);
        Funcionario f2 = new Funcionario(2, "Mario", "Diretoria", LocalDate.now(), 5000d, "9284328657", true);
        Funcionario f3 = new Funcionario(3, "Ana", "TI", LocalDate.now(), 3500d, "4535436578", true);
        Funcionario f4 = new Funcionario(3, "Andre", "TI", LocalDate.now(), 3500d, "3584973489", true);
        
        Empresa emp = new Empresa();
        emp.setEmpregados(new Funcionario[TAM]);
 
        emp.adicionarEmpregados(f1, posicao);
        posicao++;
        
        emp.adicionarEmpregados(f2, posicao);
        posicao++;
        
        emp.adicionarEmpregados(f3, posicao);
        posicao++;
        
        //emp.adicionarEmpregados(f4, posicao);
     
        t = emp.contemEmpregados(f1);
        
        if (t == true) {
            System.out.println("Funcionário pertencente ao quadro da empresa\n");
        } else {
            System.out.println("Funcionário não pertencente ao quadro da empresa\n");
        }    
        
        //emp.mostrarEmpregados();
    }    
}
