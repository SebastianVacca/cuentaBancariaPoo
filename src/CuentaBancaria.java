public class CuentaBancaria {
    //Atributos
    private String idAccount;
    private String accountHolderName;
    private Double balance;

    //Constructores
    public CuentaBancaria (String idAccount, String accountHolderName){
        this(idAccount, accountHolderName, 0.0);
    }
    public CuentaBancaria (String idAccount, String accountHolderName, Double balance){
        this.idAccount = idAccount;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getIdAccount(){
        return this.idAccount;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public Double getBalance (){
        return this.balance;
    }

    //Setters
    public void setDeposit(Double amount){
        if (amount > 0 ) {
            this.balance = this.balance + amount;
            System.out.println("Depósito realizado con éxito");
        } else {
            System.out.println(".: Error :.");
        }
    }
    public void setWithDraw(Double amount){
        if (amount <= 0) {
            do {
                System.out.println("La cantidad a retirar debe ser mayor a 0");
                break;
            } while (amount <= 0);       
        } else if (amount > this.balance) {
            System.out.println("Saldo insuficiente");
        } else {
            this.balance = this.balance - amount;
        }
    }
    public String showInfoAccount(){
        return String.format("Número de cuenta: %s%nTitular de la cuenta: %s%nSaldo: %,.3f%n",
                getIdAccount(), getAccountHolderName(), getBalance());
    }
}
