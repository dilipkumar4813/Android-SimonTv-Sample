package simontv.iamdilipkumar.com.simontvtest;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;

/**
 * Created on 04/05/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

@Database(version = TestDatabase.VERSION)
public class TestDatabase {

    public static final int VERSION = 1;

    @Table(TestColumns.class) public static final String CONTACTS = "contacts";
}
