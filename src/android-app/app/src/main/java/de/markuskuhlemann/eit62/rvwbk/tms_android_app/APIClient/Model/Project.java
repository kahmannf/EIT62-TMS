package de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient.Model;

public class Project {
    Integer Id;
    String Timestamp;
    String Description;
    User[] Members;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTimeStamp() {
        return Timestamp;
    }

    public void setTimeStamp(String timeStamp) {
        Timestamp = timeStamp;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public User[] getMembers() {
        return Members;
    }

    public void setMembers(User[] members) {
        Members = members;
    }
}
