package com.example.myweatherapiroom.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/example/myweatherapiroom/adapter/WeatherAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myweatherapiroom/adapter/WeatherAdapter$ViewHolder;", "list", "", "Lcom/example/myweatherapiroom/data/entity/Weather;", "(Ljava/util/List;)V", "dialog", "Lcom/example/myweatherapiroom/adapter/WeatherAdapter$Dialog;", "getList", "()Ljava/util/List;", "setList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDialog", "Dialog", "ViewHolder", "app_debug"})
public final class WeatherAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myweatherapiroom.adapter.WeatherAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.myweatherapiroom.data.entity.Weather> list;
    private com.example.myweatherapiroom.adapter.WeatherAdapter.Dialog dialog;
    
    public WeatherAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myweatherapiroom.data.entity.Weather> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.myweatherapiroom.data.entity.Weather> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myweatherapiroom.data.entity.Weather> p0) {
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull
    com.example.myweatherapiroom.adapter.WeatherAdapter.Dialog dialog) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.myweatherapiroom.adapter.WeatherAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.myweatherapiroom.adapter.WeatherAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/myweatherapiroom/adapter/WeatherAdapter$Dialog;", "", "onClick", "", "position", "", "app_debug"})
    public static abstract interface Dialog {
        
        public abstract void onClick(int position);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/example/myweatherapiroom/adapter/WeatherAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/myweatherapiroom/adapter/WeatherAdapter;Landroid/view/View;)V", "cityFullName", "Landroid/widget/TextView;", "getCityFullName", "()Landroid/widget/TextView;", "setCityFullName", "(Landroid/widget/TextView;)V", "cityHumidity", "getCityHumidity", "setCityHumidity", "cityPressure", "getCityPressure", "setCityPressure", "cityTemperature", "getCityTemperature", "setCityTemperature", "cityWindySpeed", "getCityWindySpeed", "setCityWindySpeed", "time", "getTime", "setTime", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView cityFullName;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView cityTemperature;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView cityWindySpeed;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView cityPressure;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView cityHumidity;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView time;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getCityFullName() {
            return null;
        }
        
        public final void setCityFullName(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getCityTemperature() {
            return null;
        }
        
        public final void setCityTemperature(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getCityWindySpeed() {
            return null;
        }
        
        public final void setCityWindySpeed(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getCityPressure() {
            return null;
        }
        
        public final void setCityPressure(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getCityHumidity() {
            return null;
        }
        
        public final void setCityHumidity(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTime() {
            return null;
        }
        
        public final void setTime(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
    }
}