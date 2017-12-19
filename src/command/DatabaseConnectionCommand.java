package command;

import receiver.Database;

public class DatabaseConnectionCommand implements ICommand
{

    Database database;

    public DatabaseConnectionCommand(Database databaseObjesi)
    {
        this.database=databaseObjesi;
    }

    @Override
    public void execute()
    {
        this.database.ConnectionBaslat();

    }

    @Override
    public void unexecute()
    {

        this.database.ConnectionSonlandir();
    }
}
