package com.example.myweatherapiroom.data.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.myweatherapiroom.data.entity.Weather;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDao_Impl implements WeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Weather> __insertionAdapterOfWeather;

  private final EntityDeletionOrUpdateAdapter<Weather> __deletionAdapterOfWeather;

  private final EntityDeletionOrUpdateAdapter<Weather> __updateAdapterOfWeather;

  public WeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeather = new EntityInsertionAdapter<Weather>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Weather` (`uid`,`city_name`,`temperature`,`windy_speed`,`pressure`,`humidity`,`time`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Weather value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUid());
        }
        if (value.getCityName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCityName());
        }
        if (value.getTemp() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTemp());
        }
        if (value.getWindySpeed() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWindySpeed());
        }
        if (value.getPressure() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPressure());
        }
        if (value.getHumidity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getHumidity());
        }
        if (value.getTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTime());
        }
      }
    };
    this.__deletionAdapterOfWeather = new EntityDeletionOrUpdateAdapter<Weather>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Weather` WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Weather value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUid());
        }
      }
    };
    this.__updateAdapterOfWeather = new EntityDeletionOrUpdateAdapter<Weather>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Weather` SET `uid` = ?,`city_name` = ?,`temperature` = ?,`windy_speed` = ?,`pressure` = ?,`humidity` = ?,`time` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Weather value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUid());
        }
        if (value.getCityName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCityName());
        }
        if (value.getTemp() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTemp());
        }
        if (value.getWindySpeed() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWindySpeed());
        }
        if (value.getPressure() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPressure());
        }
        if (value.getHumidity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getHumidity());
        }
        if (value.getTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTime());
        }
        if (value.getUid() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getUid());
        }
      }
    };
  }

  @Override
  public void insertAll(final Weather... weather) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeather.insert(weather);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Weather weather) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfWeather.handle(weather);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Weather weather) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfWeather.handle(weather);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Weather> getAll() {
    final String _sql = "SELECT * FROM weather";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "city_name");
      final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
      final int _cursorIndexOfWindySpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windy_speed");
      final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
      final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final List<Weather> _result = new ArrayList<Weather>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Weather _item;
        final Integer _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        }
        final String _tmpCityName;
        if (_cursor.isNull(_cursorIndexOfCityName)) {
          _tmpCityName = null;
        } else {
          _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
        }
        final String _tmpTemp;
        if (_cursor.isNull(_cursorIndexOfTemp)) {
          _tmpTemp = null;
        } else {
          _tmpTemp = _cursor.getString(_cursorIndexOfTemp);
        }
        final String _tmpWindySpeed;
        if (_cursor.isNull(_cursorIndexOfWindySpeed)) {
          _tmpWindySpeed = null;
        } else {
          _tmpWindySpeed = _cursor.getString(_cursorIndexOfWindySpeed);
        }
        final String _tmpPressure;
        if (_cursor.isNull(_cursorIndexOfPressure)) {
          _tmpPressure = null;
        } else {
          _tmpPressure = _cursor.getString(_cursorIndexOfPressure);
        }
        final String _tmpHumidity;
        if (_cursor.isNull(_cursorIndexOfHumidity)) {
          _tmpHumidity = null;
        } else {
          _tmpHumidity = _cursor.getString(_cursorIndexOfHumidity);
        }
        final String _tmpTime;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmpTime = null;
        } else {
          _tmpTime = _cursor.getString(_cursorIndexOfTime);
        }
        _item = new Weather(_tmpUid,_tmpCityName,_tmpTemp,_tmpWindySpeed,_tmpPressure,_tmpHumidity,_tmpTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Weather> loadAllByIds(final int[] weatherIds) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM weather WHERE uid IN (");
    final int _inputSize = weatherIds.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int _item : weatherIds) {
      _statement.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "city_name");
      final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
      final int _cursorIndexOfWindySpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windy_speed");
      final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
      final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final List<Weather> _result = new ArrayList<Weather>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Weather _item_1;
        final Integer _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        }
        final String _tmpCityName;
        if (_cursor.isNull(_cursorIndexOfCityName)) {
          _tmpCityName = null;
        } else {
          _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
        }
        final String _tmpTemp;
        if (_cursor.isNull(_cursorIndexOfTemp)) {
          _tmpTemp = null;
        } else {
          _tmpTemp = _cursor.getString(_cursorIndexOfTemp);
        }
        final String _tmpWindySpeed;
        if (_cursor.isNull(_cursorIndexOfWindySpeed)) {
          _tmpWindySpeed = null;
        } else {
          _tmpWindySpeed = _cursor.getString(_cursorIndexOfWindySpeed);
        }
        final String _tmpPressure;
        if (_cursor.isNull(_cursorIndexOfPressure)) {
          _tmpPressure = null;
        } else {
          _tmpPressure = _cursor.getString(_cursorIndexOfPressure);
        }
        final String _tmpHumidity;
        if (_cursor.isNull(_cursorIndexOfHumidity)) {
          _tmpHumidity = null;
        } else {
          _tmpHumidity = _cursor.getString(_cursorIndexOfHumidity);
        }
        final String _tmpTime;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmpTime = null;
        } else {
          _tmpTime = _cursor.getString(_cursorIndexOfTime);
        }
        _item_1 = new Weather(_tmpUid,_tmpCityName,_tmpTemp,_tmpWindySpeed,_tmpPressure,_tmpHumidity,_tmpTime);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Weather get(final int uid) {
    final String _sql = "SELECT * FROM weather WHERE uid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, uid);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "city_name");
      final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
      final int _cursorIndexOfWindySpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windy_speed");
      final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
      final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final Weather _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        }
        final String _tmpCityName;
        if (_cursor.isNull(_cursorIndexOfCityName)) {
          _tmpCityName = null;
        } else {
          _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
        }
        final String _tmpTemp;
        if (_cursor.isNull(_cursorIndexOfTemp)) {
          _tmpTemp = null;
        } else {
          _tmpTemp = _cursor.getString(_cursorIndexOfTemp);
        }
        final String _tmpWindySpeed;
        if (_cursor.isNull(_cursorIndexOfWindySpeed)) {
          _tmpWindySpeed = null;
        } else {
          _tmpWindySpeed = _cursor.getString(_cursorIndexOfWindySpeed);
        }
        final String _tmpPressure;
        if (_cursor.isNull(_cursorIndexOfPressure)) {
          _tmpPressure = null;
        } else {
          _tmpPressure = _cursor.getString(_cursorIndexOfPressure);
        }
        final String _tmpHumidity;
        if (_cursor.isNull(_cursorIndexOfHumidity)) {
          _tmpHumidity = null;
        } else {
          _tmpHumidity = _cursor.getString(_cursorIndexOfHumidity);
        }
        final String _tmpTime;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmpTime = null;
        } else {
          _tmpTime = _cursor.getString(_cursorIndexOfTime);
        }
        _result = new Weather(_tmpUid,_tmpCityName,_tmpTemp,_tmpWindySpeed,_tmpPressure,_tmpHumidity,_tmpTime);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
