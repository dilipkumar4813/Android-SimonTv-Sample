package simontv.iamdilipkumar.com.simontvtest;

import net.simonvt.schematic.annotation.AutoIncrement;
import net.simonvt.schematic.annotation.DataType;
import net.simonvt.schematic.annotation.NotNull;
import net.simonvt.schematic.annotation.PrimaryKey;

/**
 * Created on 04/05/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public interface TestColumns {

    @DataType(DataType.Type.INTEGER)
    @PrimaryKey
    @AutoIncrement
    String _ID = "_id";

    @DataType(DataType.Type.TEXT)
    @NotNull
    String NAME = "name";

    @DataType(DataType.Type.TEXT)
    @NotNull
    String NUMBER = "number";
}
