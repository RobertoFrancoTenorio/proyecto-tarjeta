public class Tarjeta
{
    private float saldo;
    public Tarjeta()
    {
        saldo = 0;
    } 
    public float depositar(float dinero)
    {
        if(dinero>0)
        {
            saldo=saldo+dinero;
            return(saldo);
        }
        else
            return(0);
    } 
    public float retirar(float dinero)
    {
        if(saldo>=dinero)
        {
            saldo=saldo-dinero;
            return(dinero);
        }
        else
            return(0);
    }
    public void consultar()
    {
        System.out.println(saldo);
    } 
} 