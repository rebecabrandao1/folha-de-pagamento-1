package empregado ;

public class Employee
{
  private String nome;
  private String endereco;
  private int id;
  private String formadepagamento;
  private boolean removed;

  public void setEndereco(String endereco)
  {
    this.endereco = endereco;
  }

  public String getEndereco()
  {
    return endereco;
  }

  public void setNome(String nome) 
  {
    this.nome = nome;
  }

  public String getNome()
  {
    return nome;
  }

  public void setid(int id) 
  {
    this.id = id;
  }

  public int getid() 
  {
    return id;
  }

  public void setFormadepagamento(String formadepagamento) 
  {
    this.formadepagamento = formadepagamento;
  }

  public String getFormadepagamento()
  {
      return formadepagamento;
  }


  public Empregado()
  {
      this.id = 0;
  }

  public String printInfoempregado ()
  {
    return "\nNome: " + this.nome +
      "\nEndereço: " + this.endereco +
      "\nTipo de pagamento: " + this.formadepagamento +
      "\nID: " + this.id;
  }
}