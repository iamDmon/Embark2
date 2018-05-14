package Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by vedant on 4/22/2018.
 */

@Database(entities = {Alarm.class}, version = 16, exportSchema = false)
public abstract class AlarmDatabase extends RoomDatabase {

    public static AlarmDatabase INSTANCE;

    public static AlarmDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context, AlarmDatabase.class, "alarmdb")
                            .allowMainThreadQueries()//remove this line in production
                            .fallbackToDestructiveMigration()
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    public abstract AlarmDAO AlarmDAO();
}
