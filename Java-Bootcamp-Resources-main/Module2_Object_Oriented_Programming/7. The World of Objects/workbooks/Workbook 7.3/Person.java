public class Person {
    
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }
    
    //Get/Set name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //Get/Set nationality
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    //Get/Set dateOfBirth
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    //Get/Set passport
    //Get/Set seatNumber
    public int getSeatNumber(){
        return seatNumber;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
}
