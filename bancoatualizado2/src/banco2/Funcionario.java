package banco2;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean situacao = true;

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    
    void bonifica(double aumento) {
        
        this.salario = this.salario +aumento;
        System.out.println("Bonificado ");
        
    }
    void demite() {
        if(situacao == true){
            setSituacao(false);
            System.out.println(" demitido");
        }
        else
            System.out.println("Este usuario não esta no sistema");
    }
    
    
  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
      void mostraDados(){
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nome: "+this.nome);
        
        System.out.println("Rg: "+this.rg);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Salario: "+this.salario);
        System.out.println("Entrada: "+this.dataEntrada);
        if(situacao == true)
            System.out.println("Situacao: vigente");
        else
            System.out.println("Situacao: nao ha registros no banco de dados desde usuario");
    }
}
