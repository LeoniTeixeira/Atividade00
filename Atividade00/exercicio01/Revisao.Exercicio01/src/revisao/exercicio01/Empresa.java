/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao.exercicio01;

/**
 *
 * @author aluno
 */
public class Empresa {
    private int idEmpresa;
    private String razaoSocial;
    private String cnpj;
    private Funcionario[] empregados;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario[] getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
    }

    public Empresa(int idEmpresa, String razaoSocial, String cnpj, Funcionario[] empregados) {
        this.idEmpresa = idEmpresa;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.empregados = empregados;
    }
    
    public Empresa(){
    }
    
    public void adicionarEmpregados(Funcionario f, int posicao){
        if (posicao <= this.empregados.length){
        this.empregados[posicao] = f;     
        } else {
            System.out.println("vetor cheio");
        }
    }


    public void mostrarEmpregados(){
        for(int i=0; i < this.empregados.length; i++){
            this.empregados[i].imprimir(); 
        }
    }
    
    public boolean contemEmpregados(Funcionario f){
        boolean haFunc = false;
        for(int i=0; i < empregados.length; i++){
            if (this.empregados[i] == f){
                haFunc = f.estaAtivo;
            }             
        }
        return haFunc;
    }
    
}
