package invoker;

import command.ICommand;

public class Invoker
{
    ICommand command;

    public Invoker(ICommand commandObjesi)
    {
        this.command=commandObjesi;
    }

    public void ConnectionOlusturIstegi()//Buton gibi düşünülebilir
    {
        this.command.execute();
    }

    public void ConnectionKapatIstegi()//Buton gibi düşünülebilir
    {
        this.command.unexecute();
    }
}
