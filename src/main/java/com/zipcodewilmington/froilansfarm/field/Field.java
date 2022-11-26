package com.zipcodewilmington.froilansfarm.field;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.interfaces.Storage;
import com.zipcodewilmington.froilansfarm.produce.Corn;
import com.zipcodewilmington.froilansfarm.produce.Tomato;

import java.util.ArrayList;
import java.util.List;

public final class Field  {


    public List<CropRow>  createField(){

        List<CropRow> lstCropRows=new ArrayList<>();
        lstCropRows.add(new CropRow(createTomatoCrop()));
        lstCropRows.add(new CropRow(createCornStalkCrop()));
        lstCropRows.add(new CropRow(createTomatoCrop()));
        lstCropRows.add(new CropRow(createCornStalkCrop()));
        lstCropRows.add(new CropRow(createTomatoCrop()));
        return lstCropRows;
    }
    public List<Crop> createTomatoCrop(){
        List<Crop>  lstTomatoPlants=new ArrayList<>();
        List<Tomato> lstTomato;
        TomatoPlant objTomatoCrop;
        for(int i=0;i<10;i++) {
           lstTomato=new ArrayList<>();
           objTomatoCrop=new TomatoPlant(true,lstTomato);
            for(int j=0;j<10;j++) objTomatoCrop.yield();
            lstTomatoPlants.add(new TomatoPlant(true,lstTomato));
        }
        return lstTomatoPlants;
    }
    public List<Crop> createCornStalkCrop(){
        List<Crop>  lstCornStalk=new ArrayList<>();
        List<Corn> lstCorn;
        CornStalk objCornStalk;
        for(int i=0;i<10;i++) {
            lstCorn=new ArrayList<>();
            objCornStalk=new CornStalk(true,lstCorn);
            for(int j=0;j<10;j++) objCornStalk.yield();
            lstCornStalk.add(new CornStalk(true,lstCorn));
        }
        return lstCornStalk;
    }

}
