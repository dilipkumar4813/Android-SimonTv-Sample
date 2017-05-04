package simontv.iamdilipkumar.com.simontvtest;

import android.net.Uri;

import net.simonvt.schematic.annotation.ContentProvider;
import net.simonvt.schematic.annotation.ContentUri;
import net.simonvt.schematic.annotation.InexactContentUri;
import net.simonvt.schematic.annotation.TableEndpoint;

/**
 * Created on 04/05/17.
 *
 * @author dilipkumar4813
 */

@ContentProvider(authority = TestProvider.AUTHORITY, database = TestDatabase.class)
public class TestProvider {

    public static final String AUTHORITY = "simontv.iamdilipkumar.com.simontvtest.provider";

    @TableEndpoint(table = TestDatabase.CONTACTS)
    public static class MainContacts {

        @ContentUri(path = "contacts", type = "vnd.android.cursor.dir/contacts", defaultSort = TestColumns._ID + " DESC")
        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/contacts");

        @InexactContentUri(
                path = "contacts/#",
                name = "LIST_ID",
                type = "vnd.android.cursor.item/contacts",
                whereColumn = TestColumns._ID,
                pathSegment = 1)
        public static Uri withId(long id) {
            return Uri.parse("content://" + AUTHORITY + "/contacts/" + id);
        }
    }
}
