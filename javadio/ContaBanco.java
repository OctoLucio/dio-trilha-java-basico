import java.util.Scanner;

public class ContaBanco{
    public int numConta;
    protected String tipo;
    private boolean status;
    private float saldo;
    private String dono;
    
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Tipo da conta: " +  this.tipo);
        System.out.println("Status: " + this.status);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Dono da conta: " + this.dono);


    }
    
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
    
    public void abrirConta(){
        Scanner tec = new Scanner(System.in);
        this.status = true;
        System.out.print("O tipo da conta é: ");
        String accounttype = tec.nextLine();
        this.tipo = accounttype;
        if (this.tipo.equals("CC")){
            this.saldo += 50;}
        else if(this.tipo.equals("CP")){
            this.saldo += 150;}
            
        }
    public void fecharConta(){
        if(this.saldo>0){
            System.out.println("Para fechar a conta, é preciso que você saque R$ " + this.saldo);}
        else if(this.saldo<0){
            System.out.println("Não é possivel fechar a conta com saldo devedor!");}
        else{
            this.status = false;}
        }
    public void depositar(float valor){
        if (this.status = true){
            this.saldo += valor;}
        else{
            System.out.println("Impossível depositar!");
        }
        }
    public void sacar(float valor){
        if (this.status = true && valor<=saldo){
            this.saldo -= valor;}
        else{
            System.out.println("Impossível sacar!");
        }
        }
    public void pagarMensal(){
        if (this.status = true){
            if(this.tipo == "CC"){
                this.saldo -= 12;}
            else{
                this.saldo -= 20;}
            }    }
    }
    
    

        

        
    
    


