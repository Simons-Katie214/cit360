package mvcexample;

/**
 *
 * @author klsim
 */
public class Model {
    private String name;
    private String song;
    private String comp;
    private int level;

    // This model used for sets and gets.

    // SETS
    public void setBandName(String name) {
        this.name = name;
    }

    public void setMembersNum(int level) {
        this.level = level;
    }

    public void setCompanyName(String comp) {
        this.comp = comp;
    }  
    
    public void setSongName(String song) {
        this.song = song;
    }    

    // GETS
    public int getMembersNum() {
        return level;
    }

    public String getBandName() {
        return name;
    }
    
    public String getCompanyName() {
        return comp;
    }
    
    public String getSongName() {
        return song;
    }    
}
