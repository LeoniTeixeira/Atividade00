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
public class Funcionario {
    public int idFunc;
    public String nomeFunc;
    public String departamento;
    public LocalDate dataContratacao;
    public double salario;
    public String documento;
    public boolean estaAtivo;

    
    
    public Funcionario(int idFunc, String nomeFunc, String departamento, LocalDate dataContratacao, double salario, String documento, boolean estaAtivo) {
        this.idFunc = idFunc;
        this.nomeFunc = nomeFunc;
        this.departamento = departamento;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
        this.documento = documento;
        this.estaAtivo = estaAtivo;
    }

    public Funcionario() {
    }

    public void atualizarSalario(double aumento){
        this.salario += aumento;
    }
    
    public void demitirFuncionario(){
        this.estaAtivo = false;
    }
    
    @Override
     public String toString() {
        return "Funcionario" + "\nidFunc = " + idFunc + ", \nnomeFunc = " + nomeFunc +
                ", \ndepartamento = " + departamento + ", \ndataContratacao = " + dataContratacao +
                ", \nsalario = " + salario + ", \ndocumento = " + documento + ", \nestaAtivo = " + estaAtivo + "\n";
    }  
     
    public void imprimir(){
        System.out.println(this.toString());
    }
    
    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }
}
