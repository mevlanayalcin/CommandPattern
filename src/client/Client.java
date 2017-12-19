package client;

import command.DatabaseConnectionCommand;
import invoker.Invoker;
import receiver.Database;

public class Client
{
    public static void main(String[] args)
    {
        Database databaseObjesi=new Database();//receiver objesi
        DatabaseConnectionCommand databaseConnectionCommandObjesi=new DatabaseConnectionCommand(databaseObjesi);//command objesi
        Invoker invokerObjesi=new Invoker(databaseConnectionCommandObjesi);  //invoker kumanda gibi düşünülebilir
        invokerObjesi.ConnectionOlusturIstegi();
        invokerObjesi.ConnectionKapatIstegi();
    }
}
