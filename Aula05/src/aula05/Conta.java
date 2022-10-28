package aula05;
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private String banco;
    
    public Conta(String nome, int num){
        this.setDono(nome);
        this.setNumConta(num);
    }
    public void abrirConta(String t, String b){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "poup"){
            this.setSaldo(200);
            this.setTipo("Poupança");
        }else if(t == "cor"){
            this.setSaldo(100);
            this.setTipo("Conta Corrente");
        }else if (t == "sal"){
            this.setSaldo(85);
            this.setTipo("Conta salario");
        }
        this.setBanco(b);
    }
    public void pagarMensal(){
        float m = 0;
        if(this.getBanco() == "BB"){
            m = 100;
        }else if(this.getBanco() == "caixa"){
            m = 85;
        }else if(this.getBanco() == "banri"){
            m = 50;
        }
        if (this.getStatus() == true){
            if (this.getSaldo() >= m){
                this.setSaldo(this.getSaldo() - m);
                System.out.println("Mensalidade de " + m + "paga.");
            }else{
                System.out.println("Saldo insuficiente para pagar mensalidade.");
            }
        }else{
            System.out.println("Conta não encontrada");
        }
    }
    public void sacar(float v){
        if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque de " + v + "feito na conta de " + this.getDono());
        }else{
            System.out.println("Sem saldo para saque.");
        }
    }
    public void depositar(float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito de " + v + "feito na conta de " + this.getDono());
        }else{
            System.out.println("Conta inativa.");
        }
    }
    public void fecharConta(){
        if (this.getStatus() == true && this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso");
        }else{
            System.out.println("Precisa zerar o saldo e ter conta ativa para fechar a mesma.");
        }
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int num) {
       this.numConta = num;
    }
    public String getTipo(){
       return tipo;
    }
   public void setTipo(String tipo){
       this.tipo = tipo;
   }
   public String getDono(){
       return dono;
   }
   public void setDono(String dono){
       this.dono = dono;
   }
   public float getSaldo(){
       return saldo;
   }
   public void setSaldo(float saldo){
       this.saldo = saldo;
   }
   public boolean getStatus(){
       return status;
   }
   public void setStatus(boolean status){
       this.status = status;
   }
   public String getBanco(){
       return banco;
   }
   public void setBanco(String banco){
       this.banco = banco;
   }
   public void situacao(){
       System.out.println("****************************");
       System.out.println("Dono da conta: " + this.getDono());
       System.out.println("Numero da conta: " + this.getNumConta());
       System.out.println("Banco: " + this.getBanco());
       System.out.println("Saldo: " + this.getSaldo());
       System.out.println("Sua conta eh: " + this.getTipo());
       System.out.println("****************************");
   }
         
}