package com.example.myweatherapiroom;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/myweatherapiroom/WeatherForecastActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/myweatherapiroom/databinding/ActivityWeatherForecastBinding;", "database", "Lcom/example/myweatherapiroom/data/AppDatabase;", "tvHumidity", "Landroid/widget/TextView;", "tvPressure", "tvTemp", "tvWindySpeed", "getWeather", "", "city", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class WeatherForecastActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.myweatherapiroom.databinding.ActivityWeatherForecastBinding binding;
    private android.widget.TextView tvTemp;
    private android.widget.TextView tvPressure;
    private android.widget.TextView tvWindySpeed;
    private android.widget.TextView tvHumidity;
    private com.example.myweatherapiroom.data.AppDatabase database;
    
    public WeatherForecastActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
}