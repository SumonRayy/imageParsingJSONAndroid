package com.example.recyclerviewjson;

public class Items {
    private String mImageURL;
    private String mCreator;
    private int mLikes;

    public Items(String imageURL , String creator , int likes){
        mImageURL=imageURL;
        mCreator=creator;
        mLikes=likes;
    }

    public String getImageURL() {
        return mImageURL;
    }

    public String getCreator(){
        return mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }
}
