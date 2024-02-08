package com.example.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    public Integer[] mThumbIds = new Integer[4];
    // mThumbIds ที่เก็บ Image
    private Context ctx;
    //เป็นเหมือนสภาพแวดล้อม ที่ถูกา่งมาจาก Activity ต้องส่งตัว
    //context มาด้วย ใช้ทำงาน โชว์รูป แสดงรูป

    public ImageAdapter(Context ctx) {
        this.ctx = ctx;
        initMThumbIds();
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return mThumbIds[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView iv = new ImageView(ctx);//สร้าง instant ของ ImageView ขึ้นมา
            iv.setImageResource(mThumbIds[i]);//ไอดีของรูปที่เราต้องการโชว์
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);//แสดงด้วยเสกลอะไร ถ้าเกินsize จะครอบรูปตรงกลาง
            iv.setLayoutParams(new ViewGroup.LayoutParams(300, 300));
            return iv;
        }


    public void initMThumbIds(){
        //รูปทั้งหมดจะโหลดเข้ามาใน gridview จะใส่เข้ามาในนี้
        mThumbIds[0]=R.drawable.pubg;
        mThumbIds[1]=R.drawable.naraka;
        mThumbIds[2]=R.drawable.hunt;
        mThumbIds[3]=R.drawable.val;

    }
}
