public class Tarjeta
{
    private float saldo;
    public Tarjeta()
    {
        saldo = 0;
    } 
    
    /**
     * Metodo para depositar el saldo
     * @param recibe la cantidad
     * @return nos dice si pudo ser depositada la cantidad 
     */
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
    
    /**
     * Metodo para poder retirar una cantidad
     * @param dinero es  la cantidad deseada por el usuario
     * @return nos indica si pudo ser retirada la cantidad deseada
     */
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
    
    /**
     * Metodo encargado de mostrar nuestro saldo
     */
    public void consultar()
    {
        System.out.println(saldo);
    } 
} 