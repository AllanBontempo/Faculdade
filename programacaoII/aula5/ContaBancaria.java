// Figura 3.1: ContaBancaria.java
// Classe ContaBancaria que contém uma variável de instância name
// e métodos para configurar e obter seu valor.

public class ContaBancaria
{
    private String name; // variável de instância
    private double saldo;
    // o construtor inicializa name com nome do parâmetro
    public ContaBancaria(String name, double saldo) // o nome do construtor é nome da classe
    {
        this.name = name;
        //checa se o saldo é maior que Zero
        if (saldo > 0.0)
            this.saldo = saldo;
    }
    public void deposito(double valorDeposito){
        if(valorDeposito > 0.0)
            saldo = saldo + valorDeposito;
    }
    // retorna o saldo da conta
    public double getSaldo(){
        return saldo;
    }
    // método para recuperar o nome do objeto
    public String getName()
    {
        return name; // retorna valor do nome para o chamador
    }
    // método para definir o nome no objeto
    public void setName(String name)
    {
        this.name = name; // armazena o nome
    }



 } // fim da classe ContaBancaria