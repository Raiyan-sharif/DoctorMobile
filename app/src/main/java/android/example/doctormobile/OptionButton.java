package android.example.doctormobile;

public class OptionButton {
    private int mImageID;
    private String mName;

    public OptionButton(int imageID, String name){
        mImageID = imageID;
        mName = name;
    }

    public int getImageID(){
        return mImageID;
    }
    public String getName(){
        return mName;
    }
}
