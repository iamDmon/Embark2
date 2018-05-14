package Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by vedant on 4/22/2018.
 */

@Dao
public interface AlarmDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addAlarm(Alarm alarm);

    @Query("SELECT alarmtime from Alarm where id = :id")
    long getTime(long id);

    @Query("select * from Alarm")
    List<Alarm> getAllAlarm();

    @Query("select * from Alarm where id = :id")
    List<Alarm> getAlarm(long id);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateAlarm(Alarm alarm);

    @Query("delete from Alarm")
    void removeAllAlarm();

}
