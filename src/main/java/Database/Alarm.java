package Database;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by vedant(iamDmon) on 4/21/2018.
 * AlarmDatabase : Manages the Database required for All Alarm
 */
@Entity
public class Alarm {

    @PrimaryKey
    public int id;
    public long alarmtime;
    public String title;
    public String desc;


    public Alarm(int id, long alarmtime) {
        this.id = id;
        this.alarmtime = alarmtime;
        this.title = title;
        this.desc = desc;
    }

}
