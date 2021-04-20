package classes.inheritance;

public class CD extends Product {
    private String artist;
    private String album_title;

    public CD(String desc, double price, String art, String title) {
        super(desc, price);
        artist = art;   // No ambiguity, so this. can be omitted
        album_title = title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum_title() {
        return album_title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum_title(String album_title) {
        this.album_title = album_title;
    }

    @Override
    public double calcDiscount() {
        return (getPrice() * 20) / 100; // 20%
    }
}
