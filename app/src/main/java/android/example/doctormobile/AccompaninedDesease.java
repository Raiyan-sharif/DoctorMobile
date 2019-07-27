package android.example.doctormobile;

public class AccompaninedDesease {
    int isChecked;
    String titleOfSymptom;

    public AccompaninedDesease(int isChecked, String titleOfSymptom) {
        this.isChecked = isChecked;
        this.titleOfSymptom = titleOfSymptom;
    }

    public int getIsChecked() {
        return isChecked;
    }

    public String getTitleOfSymptom() {
        return titleOfSymptom;
    }

    public void setIsChecked(int isChecked) {
        this.isChecked = isChecked;
    }

    public void setTitleOfSymptom(String titleOfSymptom) {
        this.titleOfSymptom = titleOfSymptom;
    }
}
