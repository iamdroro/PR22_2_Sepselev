package com.example.myweatherapiroom.data.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J!\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/example/myweatherapiroom/data/dao/WeatherDao;", "", "delete", "", "weather", "Lcom/example/myweatherapiroom/data/entity/Weather;", "get", "uid", "", "getAll", "", "insertAll", "", "([Lcom/example/myweatherapiroom/data/entity/Weather;)V", "loadAllByIds", "weatherIds", "", "update", "app_debug"})
@androidx.room.Dao
public abstract interface WeatherDao {
    
    @androidx.room.Query(value = "SELECT * FROM weather")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.myweatherapiroom.data.entity.Weather> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM weather WHERE uid IN (:weatherIds)")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.myweatherapiroom.data.entity.Weather> loadAllByIds(@org.jetbrains.annotations.NotNull
    int[] weatherIds);
    
    @androidx.room.Insert
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    com.example.myweatherapiroom.data.entity.Weather... weather);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.example.myweatherapiroom.data.entity.Weather weather);
    
    @androidx.room.Query(value = "SELECT * FROM weather WHERE uid = :uid")
    @org.jetbrains.annotations.NotNull
    public abstract com.example.myweatherapiroom.data.entity.Weather get(int uid);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.example.myweatherapiroom.data.entity.Weather weather);
}