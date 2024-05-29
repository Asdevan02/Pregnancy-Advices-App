package com.example.pregnancy_advise_app;

import java.util.ArrayList;

public class AdviseModel {
    public String title;
    ArrayList<AdviseActivity> adviseActivities;
    public AdviseModel(String name , ArrayList<AdviseActivity> adviseActivities) {
        this.title = name;
        this.adviseActivities = adviseActivities;
    }
    public static ArrayList<AdviseModel> getSampleData() {
        ArrayList<AdviseModel> adviseModels = new ArrayList<>();
        ArrayList<AdviseActivity> adviseActivity = new ArrayList<>();

        ArrayList<String> advises1 = new ArrayList<>();
        
        advises1.add("Focus on nutrient-dense whole foods(green vegetables,fruits)");
        advises1.add("Ensure adequate intake of (Calcium,Vitamin D)");
        advises1.add("Stay hydrated with water, herbal tea, 100% fruit juice");
        
        ArrayList<String> advises2 = new ArrayList<>();
        
        advises2.add("Light, low-impact exercises( Walking, Swimming, Prenatal yoga)");
        advises2.add("Avoid activities with high fall risk");
        advises2.add("Gradually increase intensity and duration");
        advises2.add("Listen to your body and rest when needed");
        advises2.add("Consult healthcare provider before starting/continuing");
        
        ArrayList<String> advises3 = new ArrayList<>();
        
        advises3.add("Acknowledge and validate your emotions");
        advises3.add("Reach out to supportive family and friends");
        advises3.add("Practice relaxation techniques(Deep breathing,Meditation,Gentle yoga)");
        advises3.add("Keep a pregnancy journal");
        advises3.add("Limit exposure to stressful situations");
        adviseActivity.add(new AdviseActivity("Food", advises1, R.drawable.f1, R.drawable.f2, R.drawable.f3));
        adviseActivity.add(new AdviseActivity("Sports/Physical Activity", advises2, R.drawable.s1, R.drawable.s2, R.drawable.s3));
        adviseActivity.add(new AdviseActivity("Emotional Management", advises3, R.drawable.em1, R.drawable.em2, R.drawable.em3));

        adviseModels.add(new AdviseModel("1-4 weeks", adviseActivity));
        adviseModels.add(new AdviseModel("1-3 month", adviseActivity));
        adviseModels.add(new AdviseModel("3-5 month", adviseActivity));
        adviseModels.add(new AdviseModel("5-7 month", adviseActivity));
        adviseModels.add(new AdviseModel("7-8 month", adviseActivity));
        adviseModels.add(new AdviseModel("9+ month", adviseActivity));

        return adviseModels;
    }
    public static AdviseModel findAdviseInformation(String name, ArrayList<AdviseModel> data) {
        for (AdviseModel datum : data) {
            if (datum.title.equalsIgnoreCase(name)) {
                return datum;
            }
        }
        return null;
    }
}
