package ru.pavlenty.surfacegame2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Boom {
    private Bitmap bitmap;
    private int x;
    private int y;
    public Boom(Context context, int screenX, int screenY){
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.boom);
        x = -200;
        y = -200;
    }
    public Bitmap getBitmap() {
        return bitmap;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
