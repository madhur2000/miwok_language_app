package com.example.android.miwok;

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = -1;
    private int audioResourceId = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){

        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;

    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public int getAudioResourceId(){
        return audioResourceId;
    }

    public String toString(){

        return "Word{" +
                "defaultTranslation='" + defaultTranslation + '\'' +
                ", miwokTranslation='" + miwokTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResourceId=" + audioResourceId +
                '}';

    }

}
