package pojos;
// Generated Dec 10, 2017 4:49:14 PM by Hibernate Tools 4.3.1



/**
 * Dogs generated by hbm2java
 */
public class Dogs  implements java.io.Serializable {


     private int id;
     private String breed;
     private String size;
     private int lifespan;

    public Dogs() {
    }

    public Dogs(int id, String breed, String size, int lifespan) {
       this.id = id;
       this.breed = breed;
       this.size = size;
       this.lifespan = lifespan;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getBreed() {
        return this.breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    public int getLifespan() {
        return this.lifespan;
    }
    
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }




}


