package com.example.myapplication.data.cache.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.myapplication.data.cache.models.DataModelDb;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CoreDao_Impl implements CoreDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DataModelDb> __insertionAdapterOfDataModelDb;

  private final SharedSQLiteStatement __preparedStmtOfClearCache;

  public CoreDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataModelDb = new EntityInsertionAdapter<DataModelDb>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `cache` (`__v`,`_id`,`name`,`trips`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataModelDb value) {
        stmt.bindLong(1, value.get__v());
        if (value.get_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.get_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        stmt.bindLong(4, value.getTrips());
      }
    };
    this.__preparedStmtOfClearCache = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM cache";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<DataModelDb> list,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDataModelDb.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void clearCache() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearCache.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearCache.release(_stmt);
    }
  }

  @Override
  public Object fetchAllTypes(final Continuation<? super List<DataModelDb>> continuation) {
    final String _sql = "SELECT * FROM cache";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DataModelDb>>() {
      @Override
      public List<DataModelDb> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfV = CursorUtil.getColumnIndexOrThrow(_cursor, "__v");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTrips = CursorUtil.getColumnIndexOrThrow(_cursor, "trips");
          final List<DataModelDb> _result = new ArrayList<DataModelDb>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DataModelDb _item;
            final int _tmp__v;
            _tmp__v = _cursor.getInt(_cursorIndexOfV);
            final String _tmp_id;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmp_id = null;
            } else {
              _tmp_id = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpTrips;
            _tmpTrips = _cursor.getInt(_cursorIndexOfTrips);
            _item = new DataModelDb(_tmp__v,_tmp_id,_tmpName,_tmpTrips);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
